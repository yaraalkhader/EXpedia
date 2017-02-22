
package com.hotel.management.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HotelUrls implements Serializable
{

    @SerializedName("hotelInfositeUrl")
    @Expose
    private String hotelInfositeUrl;
    @SerializedName("hotelSearchResultUrl")
    @Expose
    private String hotelSearchResultUrl;
    private final static long serialVersionUID = -8624171010749650438L;

    public String getHotelInfositeUrl() {
        return hotelInfositeUrl;
    }

    public void setHotelInfositeUrl(String hotelInfositeUrl) {
        this.hotelInfositeUrl = hotelInfositeUrl;
    }

    public String getHotelSearchResultUrl() {
        return hotelSearchResultUrl;
    }

    public void setHotelSearchResultUrl(String hotelSearchResultUrl) {
        this.hotelSearchResultUrl = hotelSearchResultUrl;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
