package ru.mirea.coffee_house.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mirea.coffee_house.model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
}
