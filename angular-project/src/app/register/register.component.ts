
import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {
  user = {
    name: '',
    email: '',
    password: ''
  };

  constructor(private http: HttpClient) { }

  register() {
    this.http.post('http://localhost:8080/api/register', this.user)
      .subscribe(response => {
        console.log('Registration successful', response);
        alert('Registration successful!');
      }, error => {
        console.error('Registration failed', error);
        alert('Registration failed: ' + error.error);
      });
  }
}
