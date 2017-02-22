/**
 * 
 */
package com.hotel.management.model;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;

/**
 * @author yk
 *
 */
public class DataServiceTest {

	DataService dataService = new DataService();

	 @Test
	public void findHotelsTest() {

		assertEquals(
				dataService.findHotels(null, null, null, null, null, null,
						null, null, null, null).size(), 50);

	}

	 @Test
	public void findHotelsTestByRegionId() {
		String testReqionIDValue = "6023332";
		List<Hotel> hotels = dataService.findHotels(testReqionIDValue, null,
				null, null, null, null, null, null, null, null);

		for (Hotel hotel : hotels) {
			assert (hotel.getDestination().getRegionID()
					.equals(testReqionIDValue));
		}

	}

	@Test
	public void findHotelsTestByAllValues() {

		List<Hotel> hotels = dataService.findHotels(null, null, null, null, null, null,
				null, null, null, null);
		
		
		
		
		String destinationName = hotels.get(0).getDestination().getCity();
		
		
		
		String minStarRating  = hotels.get(0).getHotelInfo().getHotelStarRating();
		String maxStarRating  = hotels.get(0).getHotelInfo().getHotelStarRating();;
		String minTotalRate = String.valueOf(hotels.get(0).getHotelPricingInfo().getTotalPriceValue().intValue());
		String maxTotalRate = String.valueOf(hotels.get(0).getHotelPricingInfo().getTotalPriceValue().intValue() + 1);
		String minGuestRating = String.valueOf(hotels.get(0).getHotelInfo().getHotelGuestReviewRating());
		String maxGuestRating = String.valueOf(hotels.get(0).getHotelInfo().getHotelGuestReviewRating());
		String hotelName = hotels.get(0).getHotelInfo().getHotelName();
		
		hotels = dataService.findHotels(destinationName,
				null, null, null,
				minStarRating, maxStarRating, minTotalRate, maxTotalRate,
				minGuestRating, maxGuestRating);
		boolean found = false;

		if (hotels != null) {
			for (Hotel hotel : hotels) {
				if (hotel.getHotelInfo().getHotelName()
						.equals(hotelName))
					found = true;
			}
		}
		assert (found);

	}
}
