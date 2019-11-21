import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {CommonComponentsModule} from './common-components/common-components.module';
import {HomeModule} from './home/home.module';
import {CheckoutModule} from './checkout/checkout.module';
import {CartModule} from './cart/cart.module';
import {MarketplaceModule} from './marketplace/marketplace.module';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    CommonComponentsModule,
    HomeModule,
    CheckoutModule,
    CartModule,
    MarketplaceModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
