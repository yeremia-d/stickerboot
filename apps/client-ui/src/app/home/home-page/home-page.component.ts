import {Component, OnInit} from '@angular/core';
import {Sticker} from '../../models/sticker.model';

@Component({
  selector: 'app-homepage',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.scss']
})
export class HomePageComponent implements OnInit {

  featuredStickers: Array<Sticker>;

  constructor() {
  }

  ngOnInit() {
    this.featuredStickers = [
      {name: 'sticker1', sizes: [{height: 1, width: 1}], basePrice: 5.99, materials: [{materialName: 'matte vinyl'}]},
      {name: 'sticker2', sizes: [{height: 1, width: 1}], basePrice: 5.99, materials: [{materialName: 'matte vinyl'}]},
      {name: 'sticker3', sizes: [{height: 1, width: 1}], basePrice: 5.99, materials: [{materialName: 'matte vinyl'}]},
      {name: 'sticker4', sizes: [{height: 1, width: 1}], basePrice: 5.99, materials: [{materialName: 'matte vinyl'}]},
      {name: 'sticker5', sizes: [{height: 1, width: 1}], basePrice: 5.99, materials: [{materialName: 'matte vinyl'}]},
      {name: 'sticker6', sizes: [{height: 1, width: 1}], basePrice: 5.99, materials: [{materialName: 'matte vinyl'}]},
      {name: 'sticker7', sizes: [{height: 1, width: 1}], basePrice: 5.99, materials: [{materialName: 'matte vinyl'}]},
      {name: 'sticker8', sizes: [{height: 1, width: 1}], basePrice: 5.99, materials: [{materialName: 'matte vinyl'}]}
    ];
  }

}
