import { Component, OnInit } from '@angular/core';
import {Sticker} from '../../models/sticker.model';

@Component({
  selector: 'app-marketplace-page',
  templateUrl: './marketplace-page.component.html',
  styleUrls: ['./marketplace-page.component.scss']
})
export class MarketplacePageComponent implements OnInit {

  stickers: Array<Sticker>;
  numItems: number;
  pageSize: number;
  pageSizeOptions: Array<number>;

  constructor() {
  }

  ngOnInit() {
    this.stickers = [
      {name: 'sticker1', sizes: [{height: 1, width: 1}], basePrice: 5.99, materials: [{materialName: 'matte vinyl'}]},
      {name: 'sticker2', sizes: [{height: 1, width: 1}], basePrice: 5.99, materials: [{materialName: 'matte vinyl'}]},
      {name: 'sticker3', sizes: [{height: 1, width: 1}], basePrice: 5.99, materials: [{materialName: 'matte vinyl'}]},
      {name: 'sticker4', sizes: [{height: 1, width: 1}], basePrice: 5.99, materials: [{materialName: 'matte vinyl'}]},
      {name: 'sticker5', sizes: [{height: 1, width: 1}], basePrice: 5.99, materials: [{materialName: 'matte vinyl'}]},
      {name: 'sticker6', sizes: [{height: 1, width: 1}], basePrice: 5.99, materials: [{materialName: 'matte vinyl'}]},
      {name: 'sticker7', sizes: [{height: 1, width: 1}], basePrice: 5.99, materials: [{materialName: 'matte vinyl'}]},
      {name: 'sticker8', sizes: [{height: 1, width: 1}], basePrice: 5.99, materials: [{materialName: 'matte vinyl'}]}
    ];

    this.pageSize = 10;
    this.numItems = 100;
    this.pageSizeOptions = [5, 10, 15, 20, 25];

  }
}
