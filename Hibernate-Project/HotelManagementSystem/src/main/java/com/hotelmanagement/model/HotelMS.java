package com.hotelmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity  
@Table(name = "hotelms")

public class HotelMS 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
	
	@Column(name = "Hotel_Name")
    private String hotelName;
	
	@Column(name = "Hotel_Location")
	private String hotelLocation;
	
	@Column(name = "Rooms")
	private int rooms;

	public HotelMS() 
	{
		
	}

	public HotelMS(int id, String hotelName, String hotelLocation, int rooms) {
		super();
		this.id = id;
		this.hotelName = hotelName;
		this.hotelLocation = hotelLocation;
		this.rooms = rooms;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelLocation() {
		return hotelLocation;
	}

	public void setHotelLocation(String hotelLocation) {
		this.hotelLocation = hotelLocation;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return "HotelMS [id=" + id + ", hotelName=" + hotelName + ", hotelLocation=" + hotelLocation + ", rooms="
				+ rooms + "]";
	}

}
