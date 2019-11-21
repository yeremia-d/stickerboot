import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.scss']
})
export class FooterComponent implements OnInit {

  // Current year for copyright
  currentYear: number;

  constructor() {
  }

  ngOnInit() {

    // Init current year
    this.currentYear = new Date().getFullYear();
  }

}
