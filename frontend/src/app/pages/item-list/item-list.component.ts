import { Component, OnInit } from '@angular/core';
import { DataService } from '../../service/data.service';
import { Product, ChartProduct } from '../../models/product.model';

@Component({
  selector: 'app-item-list',
  templateUrl: './item-list.component.html',
  styleUrls: ['./item-list.component.scss']
})
export class ItemListComponent implements OnInit {
  products$: Product[];
  chartProducts: ChartProduct[] = [];
  constructor(private DataService: DataService) { }

  ngOnInit() {
    this.DataService.getProducts().subscribe(data => {
      this.products$ = data;
    });   
    this.chartProducts = this.DataService.getCartProducts(); 
  }

  addToChart(id){
    for(let i=0;i<this.chartProducts.length;i++){
      if(this.chartProducts[i].id == id){
        this.chartProducts[i].amount++;
        return;
      }       
    }
    let item = Object.assign(this.products$[id-1],{amount:1});
    this.chartProducts.push(item);
    this.DataService.updateChart(this.chartProducts);
    
  }
}
