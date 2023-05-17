import { Component } from '@angular/core';
import { NgbDropdownConfig } from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css'],
})
export class NavbarComponent {

  images = [944, 1011, 984].map((n) => `https://picsum.photos/id/${n}/2040/750`);

  constructor(private dropdownConfig: NgbDropdownConfig) {
    dropdownConfig.autoClose = 'outside';
  }

}
