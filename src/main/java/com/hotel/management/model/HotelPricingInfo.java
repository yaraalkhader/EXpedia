
package com.hotel.management.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * The Class HotelPricingInfo.
 * Auto-generated
 */
public class HotelPricingInfo implements Serializable
{

    /** The average price value. */
    @SerializedName("averagePriceValue")
    @Expose
    private Double averagePriceValue;
    
    /** The total price value. */
    @SerializedName("totalPriceValue")
    @Expose
    private Double totalPriceValue;
    
    /** The original price per night. */
    @SerializedName("originalPricePerNight")
    @Expose
    private String originalPricePerNight;
    
    /** The hotel total base rate. */
    @SerializedName("hotelTotalBaseRate")
    @Expose
    private Double hotelTotalBaseRate;
    
    /** The hotel total taxes and fees. */
    @SerializedName("hotelTotalTaxesAndFees")
    @Expose
    private Double hotelTotalTaxesAndFees;
    
    /** The currency. */
    @SerializedName("currency")
    @Expose
    private String currency;
    
    /** The hotel total mandatory taxes and fees. */
    @SerializedName("hotelTotalMandatoryTaxesAndFees")
    @Expose
    private Double hotelTotalMandatoryTaxesAndFees;
    
    /** The percent savings. */
    @SerializedName("percentSavings")
    @Expose
    private Double percentSavings;
    
    /** The drr. */
    @SerializedName("drr")
    @Expose
    private Boolean drr;
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 4130316500399084711L;

    /**
     * Gets the average price value.
     *
     * @return the average price value
     */
    public Double getAveragePriceValue() {
        return averagePriceValue;
    }

    /**
     * Sets the average price value.
     *
     * @param averagePriceValue the new average price value
     */
    public void setAveragePriceValue(Double averagePriceValue) {
        this.averagePriceValue = averagePriceValue;
    }

    /**
     * Gets the total price value.
     *
     * @return the total price value
     */
    public Double getTotalPriceValue() {
        return totalPriceValue;
    }

    /**
     * Sets the total price value.
     *
     * @param totalPriceValue the new total price value
     */
    public void setTotalPriceValue(Double totalPriceValue) {
        this.totalPriceValue = totalPriceValue;
    }

    /**
     * Gets the original price per night.
     *
     * @return the original price per night
     */
    public String getOriginalPricePerNight() {
        return originalPricePerNight;
    }

    /**
     * Sets the original price per night.
     *
     * @param originalPricePerNight the new original price per night
     */
    public void setOriginalPricePerNight(String originalPricePerNight) {
        this.originalPricePerNight = originalPricePerNight;
    }

    /**
     * Gets the hotel total base rate.
     *
     * @return the hotel total base rate
     */
    public Double getHotelTotalBaseRate() {
        return hotelTotalBaseRate;
    }

    /**
     * Sets the hotel total base rate.
     *
     * @param hotelTotalBaseRate the new hotel total base rate
     */
    public void setHotelTotalBaseRate(Double hotelTotalBaseRate) {
        this.hotelTotalBaseRate = hotelTotalBaseRate;
    }

    /**
     * Gets the hotel total taxes and fees.
     *
     * @return the hotel total taxes and fees
     */
    public Double getHotelTotalTaxesAndFees() {
        return hotelTotalTaxesAndFees;
    }

    /**
     * Sets the hotel total taxes and fees.
     *
     * @param hotelTotalTaxesAndFees the new hotel total taxes and fees
     */
    public void setHotelTotalTaxesAndFees(Double hotelTotalTaxesAndFees) {
        this.hotelTotalTaxesAndFees = hotelTotalTaxesAndFees;
    }

    /**
     * Gets the currency.
     *
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the currency.
     *
     * @param currency the new currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Gets the hotel total mandatory taxes and fees.
     *
     * @return the hotel total mandatory taxes and fees
     */
    public Double getHotelTotalMandatoryTaxesAndFees() {
        return hotelTotalMandatoryTaxesAndFees;
    }

    /**
     * Sets the hotel total mandatory taxes and fees.
     *
     * @param hotelTotalMandatoryTaxesAndFees the new hotel total mandatory taxes and fees
     */
    public void setHotelTotalMandatoryTaxesAndFees(Double hotelTotalMandatoryTaxesAndFees) {
        this.hotelTotalMandatoryTaxesAndFees = hotelTotalMandatoryTaxesAndFees;
    }

    /**
     * Gets the percent savings.
     *
     * @return the percent savings
     */
    public Double getPercentSavings() {
        return percentSavings;
    }

    /**
     * Sets the percent savings.
     *
     * @param percentSavings the new percent savings
     */
    public void setPercentSavings(Double percentSavings) {
        this.percentSavings = percentSavings;
    }

    /**
     * Gets the drr.
     *
     * @return the drr
     */
    public Boolean getDrr() {
        return drr;
    }

    /**
     * Sets the drr.
     *
     * @param drr the new drr
     */
    public void setDrr(Boolean drr) {
        this.drr = drr;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
