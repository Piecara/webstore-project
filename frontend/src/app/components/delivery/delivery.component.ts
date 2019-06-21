import { Component, OnInit } from '@angular/core';
import { Deliver } from '../../models/deliver.model';
import { Payment } from '../../models/payment.model';
import { DataService } from '../../service/data.service';
import { HttpClient } from '@angular/common/http';
import { An_order } from '../../models/an_order.model';

@Component({
  selector: 'app-delivery',
  templateUrl: './delivery.component.html',
  styleUrls: ['./delivery.component.scss']
})
export class DeliveryComponent implements OnInit {
  deliveryType = ["cash on delivery","courier","post office"];
  paymentType = ["cash","card","bitcoin"];
  model = new Deliver(1,this.deliveryType[1]);
  payment = new Payment(1,this.paymentType[1]);
  order = new An_order(1,1,1,1);
  submitted = false;
  constructor(private DataService:DataService,private http:HttpClient) { }
  onSubmit() { 
    this.submitted = true;
    this.http.post(this.DataService.apiUrl+"deliveries/",this.model);
    this.http.post(this.DataService.apiUrl+"payments/",this.payment);
    this.http.post(this.DataService.apiUrl+"anorders/",this.order);
  }

  // Remove this 
  get diagnostic() { return JSON.stringify(this.model); }

  ngOnInit() {
  }

}
