import { Component, OnInit } from '@angular/core';
import { DataService } from './service/data.service';
import { Product } from './models/product.model';




@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements  OnInit{
  
  constructor(){

  }
 
  ngOnInit() {

  }
}
