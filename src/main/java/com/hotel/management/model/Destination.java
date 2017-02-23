
package com.hotel.management.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * The Class Destination.
 * Auto-generated
 */
public class Destination implements Serializable
{

    /** The region ID. */
    @SerializedName("regionID")
    @Expose
    private String regionID;
    
    /** The long name. */
    @SerializedName("longName")
    @Expose
    private String longName;
    
    /** The country. */
    @SerializedName("country")
    @Expose
    private String country;
    
    /** The province. */
    @SerializedName("province")
    @Expose
    private String province;
    
    /** The city. */
    @SerializedName("city")
    @Expose
    private String city;
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = -3955804957157327834L;

    /**
     * Gets the region ID.
     *
     * @return the region ID
     */
    public String getRegionID() {
        return regionID;
    }

    /**
     * Sets the region ID.
     *
     * @param regionID the new region ID
     */
    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    /**
     * Gets the long name.
     *
     * @return the long name
     */
    public String getLongName() {
        return longName;
    }

    /**
     * Sets the long name.
     *
     * @param longName the new long name
     */
    public void setLongName(String longName) {
        this.longName = longName;
    }

    /**
     * Gets the country.
     *
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the country.
     *
     * @param country the new country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Gets the province.
     *
     * @return the province
     */
    public String getProvince() {
        return province;
    }

    /**
     * Sets the province.
     *
     * @param province the new province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * Gets the city.
     *
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city.
     *
     * @param city the new city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
