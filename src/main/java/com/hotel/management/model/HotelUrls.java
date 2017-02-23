
package com.hotel.management.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * The Class HotelUrls.
 * Auto-generated
 */
public class HotelUrls implements Serializable
{

    /** The hotel infosite url. */
    @SerializedName("hotelInfositeUrl")
    @Expose
    private String hotelInfositeUrl;
    
    /** The hotel search result url. */
    @SerializedName("hotelSearchResultUrl")
    @Expose
    private String hotelSearchResultUrl;
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = -8624171010749650438L;

    /**
     * Gets the hotel infosite url.
     *
     * @return the hotel infosite url
     */
    public String getHotelInfositeUrl() {
        return hotelInfositeUrl;
    }

    /**
     * Sets the hotel infosite url.
     *
     * @param hotelInfositeUrl the new hotel infosite url
     */
    public void setHotelInfositeUrl(String hotelInfositeUrl) {
        this.hotelInfositeUrl = hotelInfositeUrl;
    }

    /**
     * Gets the hotel search result url.
     *
     * @return the hotel search result url
     */
    public String getHotelSearchResultUrl() {
        return hotelSearchResultUrl;
    }

    /**
     * Sets the hotel search result url.
     *
     * @param hotelSearchResultUrl the new hotel search result url
     */
    public void setHotelSearchResultUrl(String hotelSearchResultUrl) {
        this.hotelSearchResultUrl = hotelSearchResultUrl;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
