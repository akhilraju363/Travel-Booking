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

import com.Entity.Payment;
import com.service.PaymentService;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

	 @Autowired
	    private PaymentService paymentService;

	    // Create a new payment
	    @PostMapping
	    public ResponseEntity<Payment> createPayment(@RequestBody Payment payment) {
	        Payment createdPayment = paymentService.createPayment(payment);
	        return new ResponseEntity<>(createdPayment, HttpStatus.CREATED);
	    }

	    // Get a payment by ID
	    @GetMapping("/{id}")
	    public ResponseEntity<Payment> getPaymentById(@PathVariable Long id) {
	        Payment payment = paymentService.getPaymentById(id);
	        return payment != null ? new ResponseEntity<>(payment, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }

	    // Get all payments
	    @GetMapping
	    public ResponseEntity<List<Payment>> getAllPayments() {
	        List<Payment> payments = paymentService.getAllPayments();
	        return new ResponseEntity<>(payments, HttpStatus.OK);
	    }

	    // Update an existing payment
	    @PutMapping("/{id}")
	    public ResponseEntity<Payment> updatePayment(@PathVariable Long id, @RequestBody Payment paymentDetails) {
	        Payment updatedPayment = paymentService.updatePayment(id, paymentDetails);
	        return updatedPayment != null ? new ResponseEntity<>(updatedPayment, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }

	    // Delete a payment by ID
	    @DeleteMapping("/{id}")
	    public ResponseEntity<HttpStatus> deletePayment(@PathVariable Long id) {
	        boolean isDeleted = paymentService.deletePayment(id);
	        return isDeleted ? new ResponseEntity<>(HttpStatus.NO_CONTENT) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}

