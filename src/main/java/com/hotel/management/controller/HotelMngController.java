package com.hotel.management.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.hotel.management.mb.HotelMngView;
import com.hotel.management.model.DataService;
import com.hotel.management.model.Hotel;


/**
 * Controller class that connects between the view model. 
 *
 * @author yk
 */
public class HotelMngController {
	
	/**
	 * The view managed bean
	 */
	private HotelMngView view;
	
	/**
	 * The data service from where the hotels is retrieved
	 */
	private DataService service;
	
	public HotelMngController(HotelMngView view) {
		this.view = view;
		service = new DataService();
	} 
	
	/**
	 * update view is a visitor method that updates the view list of hotels,
	 * the method calls the dataservice and retrieves the data by passing
	 * the view search criteria. 
	 * 
	 */
	public void updateView() {
		
		List<Hotel> hotelsList = service.findHotels(view.getDestinationName(), view.getMinTripStartDate(),
				view.getMaxTripStartDate(), view.getLengthOfStay(), view.getMinStarRating(), view.getMaxStarRating(), view.getMinTotalRate(),
				view.getMaxTotalRate(), view.getMinGuestRating(), view.getMaxGuestRating()); 
		if (hotelsList == null || hotelsList.isEmpty()) {
			view.setList( new ArrayList<Hotel>());
			
		} else {
			sortBySaving(hotelsList);
			view.setList(hotelsList);
		
		}				
	}

	/**
	 * Sorts the list of hotels descendingly by the value of the offered 
	 * promotion 
	 * 
	 *
	 * @param  hotels  list of hotels to be sorted
	 * 
	 */
	private void sortBySaving(List<Hotel> hotels) {
		Collections.sort(hotels, new Comparator<Hotel>() {

			public int compare(Hotel o1, Hotel o2) {
				
				return o2.getHotelPricingInfo().getPercentSavings().compareTo(o1.getHotelPricingInfo().getPercentSavings()) ;
			}
			
		});
		
	}
}
