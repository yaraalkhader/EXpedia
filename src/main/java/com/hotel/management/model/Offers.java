
package com.hotel.management.model;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * The Class Offers.
 * Auto-generated
 */
public class Offers implements Serializable
{

    /** The hotel. */
    @SerializedName("Hotel")
    @Expose
    private List<Hotel> hotel = null;
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 8507682809217454225L;

    /**
     * Gets the hotel.
     *
     * @return the hotel
     */
    public List<Hotel> getHotel() {
        return hotel;
    }

    /**
     * Sets the hotel.
     *
     * @param hotel the new hotel
     */
    public void setHotel(List<Hotel> hotel) {
        this.hotel = hotel;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
