package com.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.Booking;
import com.service.SearchService;

@RestController
@RequestMapping("/api/search")
public class SearchController {
	 @Autowired
	    private SearchService searchService;

	    // Search for bookings by date range
	    @GetMapping("/bookings")
	    public ResponseEntity<List<Booking>> searchBookings(
	            @RequestParam("checkInDate") LocalDate checkInDate,
	            @RequestParam("checkOutDate") LocalDate checkOutDate) {
	        List<Booking> bookings = searchService.searchBookingsByDateRange(checkInDate, checkOutDate);
	        return new ResponseEntity<>(bookings, HttpStatus.OK);
	    }

	    // Search for bookings by user ID
	    @GetMapping("/bookings/user/{userId}")
	    public ResponseEntity<List<Booking>> searchBookingsByUserId(@PathVariable Long userId) {
	        List<Booking> bookings = searchService.searchBookingsByUserId(userId);
	        return new ResponseEntity<>(bookings, HttpStatus.OK);
	    }

	    // Search for bookings by status
	    @GetMapping("/bookings/status")
	    public ResponseEntity<List<Booking>> searchBookingsByStatus(@RequestParam("status") String status) {
	        List<Booking> bookings = searchService.searchBookingsByStatus(status);
	        return new ResponseEntity<>(bookings, HttpStatus.OK);
	    }

	    // Search for bookings by a specific reference number
	    @GetMapping("/bookings/reference/{reference}")
	    public ResponseEntity<Booking> searchBookingByReference(@PathVariable String reference) {
	        Booking booking = searchService.searchBookingByReference(reference);
	        return booking != null ? new ResponseEntity<>(booking, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}	


