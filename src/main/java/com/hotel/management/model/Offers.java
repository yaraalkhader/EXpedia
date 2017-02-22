
package com.hotel.management.model;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Offers implements Serializable
{

    @SerializedName("Hotel")
    @Expose
    private List<Hotel> hotel = null;
    private final static long serialVersionUID = 8507682809217454225L;

    public List<Hotel> getHotel() {
        return hotel;
    }

    public void setHotel(List<Hotel> hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
