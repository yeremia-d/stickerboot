import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CheckoutPageComponent } from './checkout-page/checkout-page.component';
import {MatStepperModule} from '@angular/material';



@NgModule({
  declarations: [CheckoutPageComponent],
  imports: [
    CommonModule,
    MatStepperModule
  ]
})
export class CheckoutModule { }
