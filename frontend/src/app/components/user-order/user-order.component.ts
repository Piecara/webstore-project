import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { DataService } from '../../service/data.service';
import { User } from '../../models/user.model';

@Component({
  selector: 'app-user-order',
  templateUrl: './user-order.component.html',
  styleUrls: ['./user-order.component.scss']
})
export class UserOrderComponent implements OnInit {

  constructor(private http: HttpClient, private DataService:DataService) { }
  model = new User(1,"","","",1);

  submitted = false;

  onSubmit() { 
    this.submitted = true;
    this.http.post(this.DataService.apiUrl+"clients/",this.model);
  }

  // Remove this 
  get diagnostic() { return JSON.stringify(this.model); }
  ngOnInit() {
  }
}
