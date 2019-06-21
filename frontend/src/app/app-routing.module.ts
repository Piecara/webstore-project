import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { NavRoutes } from './models/NavRoutes.enum';
import { CartComponent } from './pages/cart/cart.component';
import { ItemListComponent } from './pages/item-list/item-list.component';
import { OrderComponent } from './pages/order/order.component';
import { ItemComponent } from './pages/item/item.component';
import { UserOrderComponent } from './components/user-order/user-order.component';
import { DeliveryComponent } from './components/delivery/delivery.component';

const routes: Routes = [
  {path:'cart', component:CartComponent},
  {path:'', component:ItemListComponent},
  {path:'order', component:OrderComponent},
  {path:'userOrder', component:UserOrderComponent},
  {path:'delivery', component:DeliveryComponent},
  {path:'item/:id', component:ItemComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
