package com.hotel.management.mb;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import com.hotel.management.controller.HotelMngController;
import com.hotel.management.model.Hotel;

/**
 * The view managed bean which links to the web page
 *
 * @author yk
 */
@ManagedBean(name = "hotelMngView", eager = true)
public class HotelMngView {
	
	/**
	 * String value presenting destination name which binds to either region id or city 
	 */
	private String destinationName;
	
	/**
	 * Date value presenting trip minimum start Date  
	 */
	private Date minTripStartDate;

	/**
	 * Date value presenting trip maximum start Date  
	 */
	private Date maxTripStartDate;
	

	/**
	 * String value presenting the duration of stay as a number  
	 */
	private String lengthOfStay; 
	

	/**
	 * String value presenting the minimum star rate of the hotel as a double 
	 */
	private String minStarRating;
	
	/**
	 * String value presenting the maximum star rate of the hotel as a double 
	 */
	private String maxStarRating;
	
	/**
	 * String value presenting the minimum total rate of the hotel as an integer
	 */
	private String minTotalRate;
	
	/**
	 * String value presenting the maximum total rate of the hotel as an integer
	 */
	private String maxTotalRate;
	
	/**
	 * String value presenting the minimum guest rate of the hotel as a double 
	 */
	private String minGuestRating;
	
	/**
	 * String value presenting the maximum guest rate of the hotel as a double 
	 */
	private String maxGuestRating;
	
	/**
	 * List of hotels to be displayed after the search is executed 
	 */
	private List<Hotel> list;
	
	/**
	 * The view controller instance 
	 */
	private HotelMngController controller;
	
	/**
	 * Getter method 
	 */
	public List<Hotel> getList() {
		return list;
	}
	
	/**
	 * Setter method
	 * @param list of hotels 
	 */
	public void setList(List<Hotel> list) {
		this.list = list;
	}
	
	
	
	
	/**
	 * Initializes the controller with access to the view
	 */
	@SuppressWarnings("restriction")
	@PostConstruct
	public void init() {
		System.out.println("init will be called");
		controller = new HotelMngController(this);
	}
	
	/**
	 * Search action method, calles the controller to update the view
	 * @return search action
	 */
	public String search() {
		controller.updateView();		
		return "";
	}
	
	/**
	 * Getter method 
	 */
	public String getDestinationName() {
		return destinationName;
	}
	/**
	 * Setter method 
	 * @param destination name
	 */
	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}
	
	/**
	 * Getter method 
	 */
	public Date getMinTripStartDate() {
		return minTripStartDate;
	}
	
	/**
	 * Setter method
	 * @param date representing the minimum start date 
	 */
	public void setMinTripStartDate(Date minTripStartDate) {
		this.minTripStartDate = minTripStartDate;
	}
	
	/**
	 * Getter method 
	 */
	public Date getMaxTripStartDate() {
		return maxTripStartDate;
	}
	
	/**
	 * Setter method 
	 * @param date presenting the trip maximum start date
	 */
	public void setMaxTripStartDate(Date maxTripStartDate) {
		this.maxTripStartDate = maxTripStartDate;
	}
	
	/**
	 * Getter method 
	 */
	public String getLengthOfStay() {
		return lengthOfStay;
	}
	
	/**
	 * Setter method
	 * @param String presenting the length of stay
	 */
	public void setLengthOfStay(String lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}
	
	/**
	 * Getter method 
	 */
	public String getMinStarRating() {
		return minStarRating;
	}
	
	/**
	 * Setter method 
	 * @param String presenting the star rating
	 */
	public void setMinStarRating(String minStarRating) {
		this.minStarRating = minStarRating;
	}
	
	/**
	 * Getter method 
	 */
	public String getMaxStarRating() {
		return maxStarRating;
	}
	
	/**
	 * Setter method 
	 * @param String presenting maximum star rating
	 */
	public void setMaxStarRating(String maxStarRating) {
		this.maxStarRating = maxStarRating;
	}
	
	/**
	 * Getter method 
	 */
	public String getMinTotalRate() {
		return minTotalRate;
	}
	
	/**
	 * Setter method
	 * @param String presenting the minimum total rate 
	 */
	public void setMinTotalRate(String minTotalRate) {
		this.minTotalRate = minTotalRate;
	}
	
	/**
	 * Getter method 
	 */
	public String getMaxTotalRate() {
		return maxTotalRate;
	}
	/**
	 * Setter method
	 * @param String presenting the maximum total rate 
	 */
	public void setMaxTotalRate(String maxTotalRate) {
		this.maxTotalRate = maxTotalRate;
	}
	/**
	 * Getter method 
	 */
	public String getMinGuestRating() {
		return minGuestRating;
	}
	/**
	 * Setter method
	 * @param String presenting the minimum guest rate 
	 */
	public void setMinGuestRating(String minGuestRating) {
		this.minGuestRating = minGuestRating;
	}
	/**
	 * Getter method 
	 */
	public String getMaxGuestRating() {
		return maxGuestRating;
	}
	
	/**
	 * Setter method
	 * @param String presenting the maximum guest rate 
	 */
	public void setMaxGuestRating(String maxGuestRating) {
		this.maxGuestRating = maxGuestRating;
	}
	
	
}
