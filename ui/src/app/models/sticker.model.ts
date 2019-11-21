import {StickerSize} from './sticker-size.model';
import {StickerMaterial} from './sticker-material.model';

export interface Sticker {
  name: string;
  sizes: Array<StickerSize>;
  basePrice: number;
  materials: Array<StickerMaterial>;
}
