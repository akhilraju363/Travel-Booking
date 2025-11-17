
import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  credentials = {
    email: '',
    password: ''
  };

  constructor(private http: HttpClient) { }

  login() {
    this.http.post('http://localhost:8080/api/login', this.credentials)
      .subscribe(response => {
        console.log('Login successful', response);
        alert('Login successful!');
        // You can add logic here to close the login form or navigate to another page
      }, error => {
        console.error('Login failed', error);
        alert('Login failed: ' + error.error);
      });
  }
}
