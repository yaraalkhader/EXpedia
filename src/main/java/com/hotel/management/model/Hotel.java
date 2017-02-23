
package com.hotel.management.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * The Class Hotel.
 * Auto-generated
 */
public class Hotel implements Serializable
{

    /** The offer date range. */
    @SerializedName("offerDateRange")
    @Expose
    private OfferDateRange offerDateRange;
    
    /** The destination. */
    @SerializedName("destination")
    @Expose
    private Destination destination;
    
    /** The hotel info. */
    @SerializedName("hotelInfo")
    @Expose
    private HotelInfo hotelInfo;
    
    /** The hotel urgency info. */
    @SerializedName("hotelUrgencyInfo")
    @Expose
    private HotelUrgencyInfo hotelUrgencyInfo;
    
    /** The hotel pricing info. */
    @SerializedName("hotelPricingInfo")
    @Expose
    private HotelPricingInfo hotelPricingInfo;
    
    /** The hotel urls. */
    @SerializedName("hotelUrls")
    @Expose
    private HotelUrls hotelUrls;
    
    /** The hotel scores. */
    @SerializedName("hotelScores")
    @Expose
    private HotelScores hotelScores;
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 4846677704242537727L;

    /**
     * Gets the offer date range.
     *
     * @return the offer date range
     */
    public OfferDateRange getOfferDateRange() {
        return offerDateRange;
    }

    /**
     * Sets the offer date range.
     *
     * @param offerDateRange the new offer date range
     */
    public void setOfferDateRange(OfferDateRange offerDateRange) {
        this.offerDateRange = offerDateRange;
    }

    /**
     * Gets the destination.
     *
     * @return the destination
     */
    public Destination getDestination() {
        return destination;
    }

    /**
     * Sets the destination.
     *
     * @param destination the new destination
     */
    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    /**
     * Gets the hotel info.
     *
     * @return the hotel info
     */
    public HotelInfo getHotelInfo() {
        return hotelInfo;
    }

    /**
     * Sets the hotel info.
     *
     * @param hotelInfo the new hotel info
     */
    public void setHotelInfo(HotelInfo hotelInfo) {
        this.hotelInfo = hotelInfo;
    }

    /**
     * Gets the hotel urgency info.
     *
     * @return the hotel urgency info
     */
    public HotelUrgencyInfo getHotelUrgencyInfo() {
        return hotelUrgencyInfo;
    }

    /**
     * Sets the hotel urgency info.
     *
     * @param hotelUrgencyInfo the new hotel urgency info
     */
    public void setHotelUrgencyInfo(HotelUrgencyInfo hotelUrgencyInfo) {
        this.hotelUrgencyInfo = hotelUrgencyInfo;
    }

    /**
     * Gets the hotel pricing info.
     *
     * @return the hotel pricing info
     */
    public HotelPricingInfo getHotelPricingInfo() {
        return hotelPricingInfo;
    }

    /**
     * Sets the hotel pricing info.
     *
     * @param hotelPricingInfo the new hotel pricing info
     */
    public void setHotelPricingInfo(HotelPricingInfo hotelPricingInfo) {
        this.hotelPricingInfo = hotelPricingInfo;
    }

    /**
     * Gets the hotel urls.
     *
     * @return the hotel urls
     */
    public HotelUrls getHotelUrls() {
        return hotelUrls;
    }

    /**
     * Sets the hotel urls.
     *
     * @param hotelUrls the new hotel urls
     */
    public void setHotelUrls(HotelUrls hotelUrls) {
        this.hotelUrls = hotelUrls;
    }

    /**
     * Gets the hotel scores.
     *
     * @return the hotel scores
     */
    public HotelScores getHotelScores() {
        return hotelScores;
    }

    /**
     * Sets the hotel scores.
     *
     * @param hotelScores the new hotel scores
     */
    public void setHotelScores(HotelScores hotelScores) {
        this.hotelScores = hotelScores;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
