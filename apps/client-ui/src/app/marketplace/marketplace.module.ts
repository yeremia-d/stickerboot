import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {MarketplacePageComponent} from './marketplace-page/marketplace-page.component';
import {MatGridListModule, MatPaginatorModule} from '@angular/material';


@NgModule({
  declarations: [MarketplacePageComponent],
  imports: [
    CommonModule,
    MatGridListModule,
    MatPaginatorModule
  ]
})
export class MarketplaceModule {
}
