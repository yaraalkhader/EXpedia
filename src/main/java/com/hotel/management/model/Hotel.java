
package com.hotel.management.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hotel implements Serializable
{

    @SerializedName("offerDateRange")
    @Expose
    private OfferDateRange offerDateRange;
    @SerializedName("destination")
    @Expose
    private Destination destination;
    @SerializedName("hotelInfo")
    @Expose
    private HotelInfo hotelInfo;
    @SerializedName("hotelUrgencyInfo")
    @Expose
    private HotelUrgencyInfo hotelUrgencyInfo;
    @SerializedName("hotelPricingInfo")
    @Expose
    private HotelPricingInfo hotelPricingInfo;
    @SerializedName("hotelUrls")
    @Expose
    private HotelUrls hotelUrls;
    @SerializedName("hotelScores")
    @Expose
    private HotelScores hotelScores;
    private final static long serialVersionUID = 4846677704242537727L;

    public OfferDateRange getOfferDateRange() {
        return offerDateRange;
    }

    public void setOfferDateRange(OfferDateRange offerDateRange) {
        this.offerDateRange = offerDateRange;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public HotelInfo getHotelInfo() {
        return hotelInfo;
    }

    public void setHotelInfo(HotelInfo hotelInfo) {
        this.hotelInfo = hotelInfo;
    }

    public HotelUrgencyInfo getHotelUrgencyInfo() {
        return hotelUrgencyInfo;
    }

    public void setHotelUrgencyInfo(HotelUrgencyInfo hotelUrgencyInfo) {
        this.hotelUrgencyInfo = hotelUrgencyInfo;
    }

    public HotelPricingInfo getHotelPricingInfo() {
        return hotelPricingInfo;
    }

    public void setHotelPricingInfo(HotelPricingInfo hotelPricingInfo) {
        this.hotelPricingInfo = hotelPricingInfo;
    }

    public HotelUrls getHotelUrls() {
        return hotelUrls;
    }

    public void setHotelUrls(HotelUrls hotelUrls) {
        this.hotelUrls = hotelUrls;
    }

    public HotelScores getHotelScores() {
        return hotelScores;
    }

    public void setHotelScores(HotelScores hotelScores) {
        this.hotelScores = hotelScores;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
