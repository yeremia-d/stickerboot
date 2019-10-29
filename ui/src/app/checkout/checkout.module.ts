import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CheckoutPageComponent } from './checkout-page/checkout-page.component';
import {
  MatButtonModule,
  MatCheckboxModule,
  MatFormFieldModule, MatIconModule,
  MatInputModule,
  MatRadioModule,
  MatSelectModule,
  MatStepperModule
} from '@angular/material';
import {ReactiveFormsModule} from '@angular/forms';
import { CheckoutFormComponent } from './checkout-form/checkout-form.component';
import { OrderSummaryComponent } from './order-summary/order-summary.component';



@NgModule({
  declarations: [CheckoutPageComponent, CheckoutFormComponent, OrderSummaryComponent],
  imports: [
    CommonModule,
    MatStepperModule,
    ReactiveFormsModule,
    MatFormFieldModule,
    MatInputModule,
    MatButtonModule,
    MatSelectModule,
    MatRadioModule,
    MatCheckboxModule,
    MatIconModule
  ]
})
export class CheckoutModule { }
