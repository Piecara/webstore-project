import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DataService } from './service/data.service';
import { NavComponent } from './components/nav/nav.component';
import { FooterComponent } from './components/footer/footer.component';
import { CartComponent } from './pages/cart/cart.component';
import { ItemListComponent } from './pages/item-list/item-list.component';
import { OrderComponent } from './pages/order/order.component';
import { ItemComponent } from './pages/item/item.component';
import { FormsModule }   from '@angular/forms';
import { UserOrderComponent } from './components/user-order/user-order.component';
import { DeliveryComponent } from './components/delivery/delivery.component';




@NgModule({
  declarations: [
    AppComponent,
    NavComponent,
    FooterComponent,
    CartComponent,
    ItemListComponent,
    OrderComponent,
    ItemComponent,
    UserOrderComponent,
    DeliveryComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule

  ],
  providers: [ DataService ],
  bootstrap: [AppComponent]
})
export class AppModule { }
