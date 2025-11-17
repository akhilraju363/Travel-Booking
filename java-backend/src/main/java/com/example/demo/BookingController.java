
package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BookingController {

    private final List<Booking> bookings = new ArrayList<>();

    @PostMapping("/bookings")
    public String book(@RequestBody Booking booking) {
        bookings.add(booking);
        return "Booking successful";
    }
}
