
package com.hotel.management.model;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OfferDateRange implements Serializable
{

    @SerializedName("travelStartDate")
    @Expose
    private List<Integer> travelStartDate = null;
    @SerializedName("travelEndDate")
    @Expose
    private List<Integer> travelEndDate = null;
    @SerializedName("lengthOfStay")
    @Expose
    private Integer lengthOfStay;
    private final static long serialVersionUID = -4349735310478660252L;

    public List<Integer> getTravelStartDate() {
        return travelStartDate;
    }

    public void setTravelStartDate(List<Integer> travelStartDate) {
        this.travelStartDate = travelStartDate;
    }

    public List<Integer> getTravelEndDate() {
        return travelEndDate;
    }

    public void setTravelEndDate(List<Integer> travelEndDate) {
        this.travelEndDate = travelEndDate;
    }

    public Integer getLengthOfStay() {
        return lengthOfStay;
    }

    public void setLengthOfStay(Integer lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
