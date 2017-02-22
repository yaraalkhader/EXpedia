package com.hotel.management.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.hotel.management.mb.HotelMngView;
import com.hotel.management.model.DataService;
import com.hotel.management.model.Hotel;

/**
 * @author yk
 * 
 */
public class HotelMngController {
	
	private HotelMngView view;
	private DataService service;
	
	public HotelMngController(HotelMngView view) {
		this.view = view;
		service = new DataService();
	} 
	
	/**
	 * 
	 */
	public void updateView() {
		System.out.println("searching");
		List<Hotel> hotelsList = service.findHotels(view.getDestinationName(), view.getMinTripStartDate(),
				view.getMaxTripStartDate(), view.getLengthOfStay(), view.getMinStarRating(), view.getMaxStarRating(), view.getMinTotalRate(),
				view.getMaxTotalRate(), view.getMinGuestRating(), view.getMaxGuestRating()); 
		if (hotelsList == null || hotelsList.isEmpty()) {
			view.setList( new ArrayList<Hotel>());
			
		} else {
			sortBySaving(hotelsList);
			view.setList(hotelsList);
		
		}
		System.out.println("size = "   + view.getList().size());
		
	}

	private void sortBySaving(List<Hotel> hotels) {
		Collections.sort(hotels, new Comparator<Hotel>() {

			public int compare(Hotel o1, Hotel o2) {
				
				return o2.getHotelPricingInfo().getPercentSavings().compareTo(o1.getHotelPricingInfo().getPercentSavings()) ;
			}
			
		});
		
	}
}
