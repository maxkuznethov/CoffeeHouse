package ru.mirea.coffee_house.dto;

import lombok.Data;

@Data
public class BookingDTO {
    private String date;
    private String time;
    private String numberOfPeople;

}
