package ru.mirea.coffee_house.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.mirea.coffee_house.dto.BookingDTO;
import ru.mirea.coffee_house.services.BookingService;

@Controller
@RequestMapping("/booking")
public class BookingController {
    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @ModelAttribute("booking")
    public BookingDTO bookingDTO(){
        return new BookingDTO();
    }

    @GetMapping
    public String showBookingPage(){
        return "booking";
    }

    @PostMapping
    public String makeBooking(@ModelAttribute("booking")BookingDTO bookingDTO){
        bookingService.save(bookingDTO);
        return "redirect:/booking?success";
    }
}
