package com.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

//public class Payment {
	@Entity
	@Table(name = "payments")
	public class Payment {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(nullable = false)
	    private Double amount;

	    @Column(nullable = false)
	    private String currency;

	    @Column(nullable = false)
	    private String paymentMethod;

	    @Column(nullable = false)
	    private LocalDateTime paymentDate;

	    @Column(nullable = false)
	    private String status;

	    @ManyToOne
	    @JoinColumn(name = "user_id", nullable = false)
	    private User user;

	    // Default constructor
	    public Payment() {}

	    // Parameterized constructor
	    public Payment(Double amount, String currency, String paymentMethod, LocalDateTime paymentDate, String status, User user) {
	        this.amount = amount;
	        this.currency = currency;
	        this.paymentMethod = paymentMethod;
	        this.paymentDate = paymentDate;
	        this.status = status;
	        this.user = user;
	    }

	    // Getters and Setters
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public Double getAmount() {
	        return amount;
	    }

	    public void setAmount(Double amount) {
	        this.amount = amount;
	    }

	    public String getCurrency() {
	        return currency;
	    }

	    public void setCurrency(String currency) {
	        this.currency = currency;
	    }

	    public String getPaymentMethod() {
	        return paymentMethod;
	    }

	    public void setPaymentMethod(String paymentMethod) {
	        this.paymentMethod = paymentMethod;
	    }

	    public LocalDateTime getPaymentDate() {
	        return paymentDate;
	    }

	    public void setPaymentDate(LocalDateTime paymentDate) {
	        this.paymentDate = paymentDate;
	    }

	    public String getStatus() {
	        return status;
	    }

	    public void setStatus(String status) {
	        this.status = status;
	    }

	    public User getUser() {
	        return user;
	    }

	    public void setUser(User user) {
	        this.user = user;
	    }

		// toString method for debugging purposes
		@Override
		public String toString() {
			return "Payment{" + "id=" + id + ", amount=" + amount + ", currency='" + currency + '\''
					+ ", paymentMethod='" + paymentMethod + '\'' + ", paymentDate=" + paymentDate + ", status='"
					+ status + '\'' + ", user=" + user + '}';
		}
	}


