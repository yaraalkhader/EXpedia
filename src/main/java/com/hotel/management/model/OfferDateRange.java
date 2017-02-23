
package com.hotel.management.model;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * The Class OfferDateRange.
 * Auto-generated
 */
public class OfferDateRange implements Serializable
{

    /** The travel start date. */
    @SerializedName("travelStartDate")
    @Expose
    private List<Integer> travelStartDate = null;
    
    /** The travel end date. */
    @SerializedName("travelEndDate")
    @Expose
    private List<Integer> travelEndDate = null;
    
    /** The length of stay. */
    @SerializedName("lengthOfStay")
    @Expose
    private Integer lengthOfStay;
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = -4349735310478660252L;

    /**
     * Gets the travel start date.
     *
     * @return the travel start date
     */
    public List<Integer> getTravelStartDate() {
        return travelStartDate;
    }

    /**
     * Sets the travel start date.
     *
     * @param travelStartDate the new travel start date
     */
    public void setTravelStartDate(List<Integer> travelStartDate) {
        this.travelStartDate = travelStartDate;
    }

    /**
     * Gets the travel end date.
     *
     * @return the travel end date
     */
    public List<Integer> getTravelEndDate() {
        return travelEndDate;
    }

    /**
     * Sets the travel end date.
     *
     * @param travelEndDate the new travel end date
     */
    public void setTravelEndDate(List<Integer> travelEndDate) {
        this.travelEndDate = travelEndDate;
    }

    /**
     * Gets the length of stay.
     *
     * @return the length of stay
     */
    public Integer getLengthOfStay() {
        return lengthOfStay;
    }

    /**
     * Sets the length of stay.
     *
     * @param lengthOfStay the new length of stay
     */
    public void setLengthOfStay(Integer lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
