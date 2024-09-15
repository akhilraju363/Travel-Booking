package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.Booking;
import com.service.BookingService;

@RestController
@RequestMapping("/api/bookings")

public class BookingController {
	
	 @Autowired
	    private BookingService bookingService;

	    // Create a new booking
	    @PostMapping
	    public ResponseEntity<Booking> createBooking(@RequestBody Booking booking) {
	        Booking createdBooking = bookingService.createBooking(booking);
	        return new ResponseEntity<>(createdBooking, HttpStatus.CREATED);
	    }

	    // Get a booking by ID
	    @GetMapping("/{id}")
	    public ResponseEntity<Booking> getBookingById(@PathVariable Long id) {
	        Booking booking = bookingService.getBookingById(id);
	        return booking != null ? new ResponseEntity<>(booking, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }

	    // Get all bookings
	    @GetMapping
	    public ResponseEntity<List<Booking>> getAllBookings() {
	        List<Booking> bookings = bookingService.getAllBookings();
	        return new ResponseEntity<>(bookings, HttpStatus.OK);
	    }

	    // Update an existing booking
	    @PutMapping("/{id}")
	    public ResponseEntity<Booking> updateBooking(@PathVariable Long id, @RequestBody Booking bookingDetails) {
	        Booking updatedBooking = bookingService.updateBooking(id, bookingDetails);
	        return updatedBooking != null ? new ResponseEntity<>(updatedBooking, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }

	    // Delete a booking by ID
	    @DeleteMapping("/{id}")
	    public ResponseEntity<HttpStatus> deleteBooking(@PathVariable Long id) {
	        boolean isDeleted = bookingService.deleteBooking(id);
	        return isDeleted ? new ResponseEntity<>(HttpStatus.NO_CONTENT) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }

}
