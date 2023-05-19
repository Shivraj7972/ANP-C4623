package com.hotelmanagement;

import java.util.List;

import com.hotelmanagement.dao.HotelMSDao;
import com.hotelmanagement.model.HotelMS;

public class App {
    public static void main(String[] args) {
        HotelMSDao hotelDao = new HotelMSDao();

        // Test saveHotel
        HotelMS h = new HotelMS(1, "Hotel Shivraj", "Pune", 10);
        HotelMS h1 = new HotelMS(2, "Hotel Punjab", "Mumbai", 6);

        hotelDao.saveHotel(h);
        hotelDao.saveHotel(h1);

        // Test updateHotel
        h.setHotelName("Hotel Shivray");
        hotelDao.updateHotel(h);
        hotelDao.updateHotel(h1);

        // Test getAllHotels
        List<HotelMS> hotels = hotelDao.getAllHotels();
        for (HotelMS hotel : hotels) {
            System.out.println("Hotel ID: " + hotel.getId());
            System.out.println("Hotel Name: " + hotel.getHotelName());
            System.out.println("Location: " + hotel.getHotelLocation());
            System.out.println("Rooms: " +hotel.getRooms());
            System.out.println("--------------------");
        }

        // Test deleteHotel
        //hotelDao.deleteHotel(h1);
    }
}

