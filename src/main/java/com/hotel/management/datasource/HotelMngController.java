package com.hotel.management.datasource;

import java.util.ArrayList;
import java.util.List;

import com.hotel.management.mb.HotelMngView;
import com.hotel.management.model.DataService;
import com.hotel.management.model.Hotel;

public class HotelMngController {
	
	private HotelMngView view;
	private DataService service;
	
	public HotelMngController(HotelMngView view) {
		this.view = view;
		service = new DataService();
	}
	
	public void updateView() {
		System.out.println("searching");
		List<Hotel> hotelsList = service.findHotels(view.getDestinationName(), view.getMinTripStartDate(),
				view.getMaxTripStartDate(), view.getLengthOfStay(), view.getMinStarRating(), view.getMaxStarRating(), view.getMinTotalRate(),
				view.getMaxTotalRate(), view.getMinGuestRating(), view.getMaxGuestRating()); 
		if (hotelsList == null || hotelsList.isEmpty()) {
			view.setList( new ArrayList<Hotel>());
			
		} else {
			view.setList( hotelsList);
		
		}
		System.out.println("size = "   + view.getList().size());
		
	}

}
