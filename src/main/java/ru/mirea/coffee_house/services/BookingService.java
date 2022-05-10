package ru.mirea.coffee_house.services;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import ru.mirea.coffee_house.dto.BookingDTO;
import ru.mirea.coffee_house.model.Booking;
import ru.mirea.coffee_house.model.User;
import ru.mirea.coffee_house.repositories.BookingRepository;
import ru.mirea.coffee_house.repositories.UserRepository;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;
    private final UserRepository userRepository;

    public BookingService(BookingRepository bookingRepository, UserRepository userRepository) {
        this.bookingRepository = bookingRepository;
        this.userRepository = userRepository;
    }

    public Booking save(BookingDTO bookingDTO) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String email = authentication.getName();
        User user = userRepository.findByEmail(email);
        Booking booking = new Booking(bookingDTO.getDate(),bookingDTO.getTime(), bookingDTO.getNumberOfPeople(), user);
        return bookingRepository.save(booking);
    }
}
