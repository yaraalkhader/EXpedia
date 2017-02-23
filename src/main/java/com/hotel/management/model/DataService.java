package com.hotel.management.model;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger; 

import org.apache.commons.lang3.StringUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

/**
 * Data service that consumes the JSON API,
 * the service offer the search functionality by calling JSON API
 * parsing the result and constructing java pojos 
 *
 * @author yk
 */
public class DataService {

	/**
	 * Constant value for the JSON API URL 
	 */
	private static final String JSON_API = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel";
	/**
	 * Constant value for destination city parameter name
	 */
	private static final String PARAMETER_DESTINATION_NAME = "destinationCity";
	/**
	 * Constant value for region id parameter name
	 */
	private static final String PARAMETER_DESTINATION_REGION = "regionIds";
	/**
	 * Constant value for min trip start date parameter name
	 */
	private static final String PARAMETER_MIN_TRIP_START_DATE = "minTripStartDate";
	/**
	 * Constant value for max trip start date parameter name
	 */
	private static final String PARAMETER_MAX_TRIP_START_DATE = "maxTripStartDate";
	/**
	 * Constant value for length of stay parameter name
	 */
	private static final String PARAMETER_LENGTH_OF_STAY = "lengthOfStay";
	/**
	 * Constant value for min star rate parameter name
	 */
	private static final String PARAMETER_MIN_STAR_RATING = "minStarRating";
	/**
	 * Constant value for max star rate parameter name
	 */
	private static final String PARAMETER_MAX_STAR_RATING = "maxStarRating";
	/**
	 * Constant value for min total rate parameter name
	 */
	private static final String PARAMETER_MIN_TOTAL_RATE = "minTotalRate";
	/**
	 * Constant value for max total rate parameter name
	 */
	private static final String PARAMETER_MAX_TOTAL_RATE = "maxTotalRate";
	/**
	 * Constant value for min guest rate parameter name
	 */
	private static final String PARAMETER_MIN_GUEST_RATING = "minGuestRating";
	
	/**
	 * Constant value for max guest rate parameter name
	 */
	private static final String PARAMETER_MAX_GUEST_RATING = "maxGuestRating";
	
	/**
	 * Constant value for and connector in url 
	 */
	private static final String URL_PARAM_START = "&";
	
	/**
	 * Constant value for equal connector in url 
	 */
	private static final String URL_PARAM_EQUAL = "=";
	
	/**
	 * Date formatter using the pattern yyyy-MM-dd 
	 */
	private SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
	
	/**
	 * Find the hotel method using the user search criteria, the method builds
	 * the JSON API URL suing the user search criteria, only parameter 
	 * with values are appended to the URL.<br/>
	 * Parameters are normalized before setting them in the URL. 
	 * 
	 * @param destinationName  
	 * @param minTripStartDate
	 * @param maxTripStartDate
	 * @param lengthOfStay 
	 * @param minStarRating
	 * @param maxStarRating
	 * @param minTotalRate
	 * @param maxTotalRate
	 * @param minGuestRating
	 * @param maxGuestRating
	 * 
	 * @return list of matching hotels  
	 */
	public List<Hotel> findHotels(String destinationName,
			Date minTripStartDate, Date maxTripStartDate, String lengthOfStay,
			String minStarRating, String maxStarRating, String minTotalRate,
			String maxTotalRate, String minGuestRating, String maxGuestRating) {
		
		String urlStr = JSON_API;
		if (validateNotEmpty(destinationName)){
			if (StringUtils.isNumeric(destinationName)) {
				urlStr = urlStr + getParameter(PARAMETER_DESTINATION_REGION, normalize(destinationName.trim()));
			} else{
				urlStr = urlStr + getParameter(PARAMETER_DESTINATION_NAME, normalize(destinationName.trim()));
			}
		}
				
		if (validateNotEmpty(minTripStartDate)){
			urlStr = urlStr + getParameter(PARAMETER_MIN_TRIP_START_DATE, normalize(minTripStartDate));
		}
		
		if (validateNotEmpty(maxTripStartDate)){
			urlStr = urlStr + getParameter(PARAMETER_MAX_TRIP_START_DATE, normalize(maxTripStartDate));
		}
		
		
		if (validateNotEmpty(lengthOfStay)){
			urlStr = urlStr + getParameter(PARAMETER_LENGTH_OF_STAY, normalize(lengthOfStay.trim()));
		}		
		
		if (validateNotEmpty(minStarRating)){
			urlStr = urlStr + getParameter(PARAMETER_MIN_STAR_RATING, normalize(minStarRating.trim()));
		}
				
		if (validateNotEmpty(maxStarRating)){
			urlStr = urlStr + getParameter(PARAMETER_MAX_STAR_RATING, normalize(maxStarRating.trim()));
		}
		
		if (validateNotEmpty(minTotalRate)){
			urlStr = urlStr + getParameter(PARAMETER_MIN_TOTAL_RATE, normalize(minTotalRate.trim()));
		}
		
		if (validateNotEmpty(maxTotalRate)){
			urlStr = urlStr + getParameter(PARAMETER_MAX_TOTAL_RATE, normalize(maxTotalRate.trim()));
		}
		
		if (validateNotEmpty(minGuestRating)){
			urlStr = urlStr + getParameter(PARAMETER_MIN_GUEST_RATING, normalize(minGuestRating.trim()));
		}
		 
		if (validateNotEmpty(maxGuestRating)){
			urlStr = urlStr + getParameter(PARAMETER_MAX_GUEST_RATING, normalize(maxGuestRating.trim()));
		}
		
		Logger.getLogger(DataService.class.getName()).log(Level.INFO, urlStr);
		return jsonHandler(urlStr);
	}
	
	/**
	 * Validates if the date is empty 
	 * 
	 * 
	 * @param value of the date as a string
	 * 
	 * @return boolean, false if the the date is empty
	 */
	private boolean validateNotEmpty(String value) {
		return value == null || value.isEmpty() ? false : true;
	}
	
	/**
	 * Validates if the date is empty 
	 * 
	 * @param value 
	 * 
	 * @return boolean, false if the the date is empty
	 */
	private boolean validateNotEmpty(Date value){
		return value == null ? false : true;
	}
	
	/**
	 * Normalize strings values by escaping spaces, to be able to add them
	 * successfully to the URL 
	 * 
	 * @param value 
	 * 
	 * @return normalized value
	 */
	private String normalize(String value) {
		return value.replace(" ", "%20");
	}
	
	/**
	 * Normalize date by converting it to the right format
	 * 
	 * @param value 
	 * 
	 * @return normalized date
	 */
	private String normalize(Date value) {
		return dateFormatter.format(value);
	}
	
	/**
	 * Creates parameter to be added to the URL
	 * @param name
	 * @param value 
	 * 
	 * @return parameter construct
	 */
	private String getParameter(String name, String value) {
		return URL_PARAM_START + name + URL_PARAM_EQUAL + value;
	}

	/**
	 * Handler for JSON API, calls the api and parses the result
	 * then constructs pojos from it
	 * 
	 * @param urlStr
	 * 
	 * @return list of hotels
	 */
	private List<Hotel> jsonHandler(String urlStr) {
		URL url;
		
		try {
			url = new URL(urlStr);
			HttpURLConnection request = (HttpURLConnection) url.openConnection();
			JsonParser jp = new JsonParser(); 
			JsonElement root = jp.parse(new InputStreamReader((InputStream) request
					.getContent())); // Convert the input stream to a json element
			
			Gson gson = new GsonBuilder().setPrettyPrinting().create();		
			Result result = gson.fromJson(root, Result.class);
			
			return result.getOffers().getHotel();
		} catch (IOException e) {			
			e.printStackTrace();
		}
				
		return null;
	}


}
