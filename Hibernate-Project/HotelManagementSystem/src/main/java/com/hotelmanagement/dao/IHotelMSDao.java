package com.hotelmanagement.dao;

import java.util.List;

import com.hotelmanagement.model.HotelMS;

public interface IHotelMSDao 
{
	void saveHotel(HotelMS hms);
	
	void updateHotel(HotelMS hms);
	
	HotelMS getHotelMSById(long id);
	
	List<HotelMS> getAllHotels();
	
	void deteleHotelMS(long id);
	
}
