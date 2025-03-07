package com.Entity;

 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "User")
public class User {

	 @Id
	 @GeneratedValue (strategy = GenerationType.AUTO)
	 private Integer id;
	 
	 
	    @Column(name = "first_name")
	    private String firstName;
	   
	    @Column(name = "last_name")
	    private String lastName;
	    
	    
	    @Column(name = "email")
	    private String email;
	    
	    @Column(name = "Password")
	    private String password;

	    // Default constructor
	    public User() {}

	    // Parameterized constructor
	    public User(String firstName, String lastName, String email, String password) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.email = email;
	        this.password = password;
	    }

	    // Getters and Setters
	    public int getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) { 
	        this.password = password;
	    }

		// toString method for debugging purposes
		@Override
		public String toString() {
			return "User{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\''
					+ ", email='" + email + '\'' + ", password='" + password + '\'' + '}';

		}
}