import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Product, ChartProduct } from '../../models/product.model';
import { DataService } from '../../service/data.service';

@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.scss']
})
export class ItemComponent implements OnInit {
  id: number;
  private sub: any;
  item: Product;
  chartProducts: ChartProduct[] = []
  constructor(private route: ActivatedRoute, private DataService: DataService) { 
  }
  addItem(){
    for(let i=0;i<this.chartProducts.length;i++){
      if(this.chartProducts[i].id == this.id){
        this.chartProducts[i].amount++;
        return;
      }       
    }
    let item = Object.assign(this.item,{amount:1});
    this.chartProducts.push(item);
    this.DataService.updateChart(this.chartProducts);
  }
  ngOnInit() {
    this.sub = this.route.params.subscribe(params => {
    this.id = +params['id']; // (+) converts string 'id' to a number
    this.chartProducts = this.DataService.getCartProducts();
    return this.DataService.getProducts().subscribe(data =>this.item = data[this.id-1]);
      // In a real app: dispatch action to load the details here.
   });
  }

}
