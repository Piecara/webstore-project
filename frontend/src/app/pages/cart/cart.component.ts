import { Component, OnInit } from '@angular/core';
import { DataService } from '../../service/data.service';
import { ChartProduct } from '../../models/product.model';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.scss']
})
export class CartComponent implements OnInit {
  cartProducts: ChartProduct[];
  constructor(private DataService:DataService) { }

  ngOnInit() {
    this.cartProducts = this.DataService.getCartProducts();
  }
  remove(id){
    this.cartProducts = this.cartProducts.filter(e => e.id != id);
    this.DataService.updateChart(this.cartProducts);
  }
}
