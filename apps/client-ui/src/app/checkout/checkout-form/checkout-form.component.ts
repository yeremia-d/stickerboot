import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-checkout-form',
  templateUrl: './checkout-form.component.html',
  styleUrls: ['./checkout-form.component.scss']
})
export class CheckoutFormComponent implements OnInit {

  provinces: Array<Province>;
  shippingMethods: Array<ShippingMethod>;

  shippingAddressFormGroup: FormGroup;
  billingAddressFormGroup: FormGroup;
  shippingMethodFormGroup: FormGroup;
  paymentFormGroup: FormGroup;
  confirmFormGroup: FormGroup;

  constructor(private fb: FormBuilder) {
  }

  ngOnInit() {
    this.provinces = [
      {name: 'Alberta', abbrv: 'AB'},
      {name: 'British Columbia', abbrv: 'BC'},
      {name: 'Manitoba', abbrv: 'MB'},
      {name: 'New Brunswick', abbrv: 'NB'},
      {name: 'Newfoundland and Labrador', abbrv: 'NL'},
      {name: 'Northwest Territories', abbrv: 'NT'},
      {name: 'Nova Scotia', abbrv: 'NS'},
      {name: 'Nunavut', abbrv: 'NU'},
      {name: 'Ontario', abbrv: 'ON'},
      {name: 'Prince Edward Island', abbrv: 'PE'},
      {name: 'Quebec', abbrv: 'QC'},
      {name: 'Saskatchewan', abbrv: 'SK'},
      {name: 'Yukon', abbrv: 'YT'},
    ];

    this.shippingMethods = [
      {name: 'Next business day shipping', code: 'nds', price: 15.99},
      {name: '2 business days shipping', code: '2ds', price: 10.99},
      {name: '5 business days shipping', code: '5ds', price: 7.99},
      {name: 'regular parcel', code: 'rps', price: 5.99},
    ];

    this.shippingAddressFormGroup = this.fb.group({
      shippingStreetAddressCtrl: ['', Validators.required],
      shippingCityCtrl: ['', Validators.required],
      shippingProvinceCtrl: ['', Validators.required],
      shippingPostalCodeCtrl: ['', Validators.required]
    });

    this.billingAddressFormGroup = this.fb.group({
      billingStreetAddressCtrl: ['', Validators.required],
      billingCityCtrl: ['', Validators.required],
      billingProvinceCtrl: ['', Validators.required],
      billingPostalCodeCtrl: ['', Validators.required]
    });

    this.shippingMethodFormGroup = this.fb.group({});

    this.paymentFormGroup = this.fb.group({
      creditCardNumberCtrl: [''],
      creditCardExpiryDateCtrl: [''],
      creditCardCvvCtrl: [''],
      creditCardCardholderCtrl: ['']
    });

    this.confirmFormGroup = this.fb.group({});
  }
}

interface Province {
  name: string;
  abbrv: string;
}

interface ShippingMethod {
  name: string;
  code: string;
  price: number;
}
