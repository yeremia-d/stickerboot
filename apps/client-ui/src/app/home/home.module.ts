import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {HomePageComponent} from './home-page/home-page.component';
import {MaterialImportsModule} from '../material-imports/material-imports.module';
import {MatGridListModule} from '@angular/material';


@NgModule({
  declarations: [HomePageComponent],
  imports: [
    CommonModule,
    MaterialImportsModule,
    MatGridListModule
  ]
})
export class HomeModule {
}
