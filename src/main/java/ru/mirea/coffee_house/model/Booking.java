package ru.mirea.coffee_house.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "bookings")
@Data
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String date;

    private String time;

    private String numberOfPeople;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public Booking(){}

    public Booking(String date, String time, String numberOfPeople, User user) {
        this.date = date;
        this.time = time;
        this.numberOfPeople = numberOfPeople;
        this.user = user;
    }
}
