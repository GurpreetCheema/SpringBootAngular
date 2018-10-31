import { Component, OnInit } from '@angular/core';
import { OktaAuthService } from '@okta/okta-angular';
// here
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})



export class HomeComponent implements OnInit {
  isAuthenticated: boolean;

  constructor(private oktaAuth: OktaAuthService) {
  }
// okta
  async ngOnInit() {
    this.isAuthenticated = await this.oktaAuth.isAuthenticated();
    this.oktaAuth.$authenticationState.subscribe(
      (isAuthenticated: boolean)  => this.isAuthenticated = isAuthenticated
    );
  }
}
