import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomePageComponent} from './home/home-page/home-page.component';
import {CheckoutPageComponent} from './checkout/checkout-page/checkout-page.component';
import {CartPageComponent} from './cart/cart-page/cart-page.component';


const routes: Routes = [
  {path: '', component: HomePageComponent, pathMatch: 'full'},
  {path: 'checkout', component: CheckoutPageComponent, pathMatch: 'full'},
  {path: 'cart', component: CartPageComponent, pathMatch: 'full'}
  ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
