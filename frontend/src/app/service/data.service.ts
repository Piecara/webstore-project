import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Product, ChartProduct } from '../models/product.model';

@Injectable({
  providedIn: 'root'
})
export class DataService {
  apiUrl = 'http://99.80.4.149:8080/';
  chartProducts: ChartProduct[] = [];
  constructor(private http: HttpClient) { }
  
  getProducts(){
    return this.http.get<Product[]>(this.apiUrl+"products/");
  }
  getProduct(id){
    return this.http.get<Product>(this.apiUrl+"products/"+id);
  }

  updateChart(chart:ChartProduct[]){
    this.chartProducts = chart;
  }
  getCartProducts(){
    return this.chartProducts;
  }

}
