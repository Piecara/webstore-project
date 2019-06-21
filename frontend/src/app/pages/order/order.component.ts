import { Component, OnInit } from '@angular/core';
import { Adres } from '../../models/order.models';
import { HttpClient } from '@angular/common/http';
import { DataService } from '../../service/data.service';

@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.scss']
})
export class OrderComponent implements OnInit {

  constructor(private http: HttpClient, private DataService:DataService) { }
  model = new Adres(1,null,"","","");

  submitted = false;

  onSubmit() { 
    this.submitted = true;
    this.http.post(this.DataService.apiUrl+"addresses/",{
    	"id":77,
        "building_number": 3,
        "city": "city",
        "country": "country",
        "street": "street"
    });
    console.log("poszlo");
  }

  // Remove this 
  get diagnostic() { return JSON.stringify(this.model); }
  ngOnInit() {
  }

}
