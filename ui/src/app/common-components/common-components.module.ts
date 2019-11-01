import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {TopbarComponent} from './topbar/topbar.component';
import {FooterComponent} from './footer/footer.component';
import {LogoComponent} from './logo/logo.component';
import {MaterialImportsModule} from '../material-imports/material-imports.module';

@NgModule({
  declarations: [
    TopbarComponent,
    FooterComponent,
    LogoComponent
  ],
  imports: [
    CommonModule,
    MaterialImportsModule,

  ],
  exports: [
    TopbarComponent,
    FooterComponent,
    LogoComponent
  ]
})
export class CommonComponentsModule {
}
