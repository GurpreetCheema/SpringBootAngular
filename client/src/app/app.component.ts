import { Component, OnInit } from '@angular/core';
import { OktaAuthService } from '@okta/okta-angular';

// here
@Component({
  selector: 'app-root',// tells where the component gonna be rendered, selector tells the name of the element
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})


export class AppComponent implements OnInit {
  //This is where the title is coming from
  title = 'app';
  isAuthenticated: boolean;

  constructor(private oktaAuth: OktaAuthService) {
  }

  async ngOnInit() {
    this.isAuthenticated = await this.oktaAuth.isAuthenticated();
    this.oktaAuth.$authenticationState.subscribe(
      (isAuthenticated: boolean)  => this.isAuthenticated = isAuthenticated
    );
  }
}
