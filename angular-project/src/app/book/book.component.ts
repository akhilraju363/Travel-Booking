
import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})
export class BookComponent {

  booking = {
    place: '',
    guests: 0,
    arrival: new Date(),
    leaving: new Date()
  };

  constructor(private http: HttpClient) { }

  book() {
    this.http.post('http://localhost:8080/api/bookings', this.booking)
      .subscribe(response => {
        console.log('Booking successful', response);
        alert('Your booking was successful!');
      }, error => {
        console.error('Booking failed', error);
        alert('Booking failed. Please try again later.');
      });
  }
}
