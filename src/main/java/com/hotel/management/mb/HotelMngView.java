package com.hotel.management.mb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.hotel.management.datasource.HotelMngController;
import com.hotel.management.model.Hotel;

public class HotelMngView {
	private String destinationName;
	private Date minTripStartDate;
	private Date maxTripStartDate;
	private String lengthOfStay; 
	private String minStarRating;
	private String maxStarRating;
	private String minTotalRate;
	private String maxTotalRate;
	private String minGuestRating;
	private String maxGuestRating;
	
	private List<Hotel> list;
	public List<Hotel> getList() {
		return list;
	}
	public void setList(List<Hotel> list) {
		this.list = list;
	}
	private HotelMngController controller;
	
	
	public HotelMngView() {
		controller = new HotelMngController();
	}
	public String search() {
		System.out.println("searching");
		List<Hotel> hotelsList = controller.searchForHotels(destinationName, minTripStartDate, maxTripStartDate, lengthOfStay, minStarRating, maxStarRating, minTotalRate, maxTotalRate, minGuestRating, maxGuestRating); 
		if (hotelsList == null || hotelsList.isEmpty()) {
			list = new ArrayList<Hotel>();
			
		} else {
		list = hotelsList;
		
		}
		//System.out.println("name = " + list[0].getName());
		System.out.println("size = "   + list.size());
		return "";
	}
	
	public String getDestinationName() {
		return destinationName;
	}
	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}
	public Date getMinTripStartDate() {
		return minTripStartDate;
	}
	public void setMinTripStartDate(Date minTripStartDate) {
		this.minTripStartDate = minTripStartDate;
	}
	public Date getMaxTripStartDate() {
		return maxTripStartDate;
	}
	public void setMaxTripStartDate(Date maxTripStartDate) {
		this.maxTripStartDate = maxTripStartDate;
	}
	public String getLengthOfStay() {
		return lengthOfStay;
	}
	public void setLengthOfStay(String lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}
	public String getMinStarRating() {
		return minStarRating;
	}
	public void setMinStarRating(String minStarRating) {
		this.minStarRating = minStarRating;
	}
	public String getMaxStarRating() {
		return maxStarRating;
	}
	public void setMaxStarRating(String maxStarRating) {
		this.maxStarRating = maxStarRating;
	}
	public String getMinTotalRate() {
		return minTotalRate;
	}
	public void setMinTotalRate(String minTotalRate) {
		this.minTotalRate = minTotalRate;
	}
	public String getMaxTotalRate() {
		return maxTotalRate;
	}
	public void setMaxTotalRate(String maxTotalRate) {
		this.maxTotalRate = maxTotalRate;
	}
	public String getMinGuestRating() {
		return minGuestRating;
	}
	public void setMinGuestRating(String minGuestRating) {
		this.minGuestRating = minGuestRating;
	}
	public String getMaxGuestRating() {
		return maxGuestRating;
	}
	public void setMaxGuestRating(String maxGuestRating) {
		this.maxGuestRating = maxGuestRating;
	}
	
	
	
}
