import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-stbt-logo',
  templateUrl: './logo.component.html',
  styleUrls: ['./logo.component.scss'],
})
export class LogoComponent implements OnInit {

  @Input() height: number;
  @Input() width: number;
  @Input() logoStyle: string;
  calcFontSize;

  constructor() {
  }

  ngOnInit() {
    this.calcFontSize = this.height * 0.45;
  }
}
