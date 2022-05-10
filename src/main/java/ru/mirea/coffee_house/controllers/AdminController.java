package ru.mirea.coffee_house.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.mirea.coffee_house.model.Booking;
import ru.mirea.coffee_house.repositories.BookingRepository;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    BookingRepository bookingRepository;

    @GetMapping()
    public String userBookings(Model model) {

        List<Booking> list = bookingRepository.findAll();

        model.addAttribute("bookings", list);

        return "admin";
    }
}
