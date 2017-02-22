
package com.hotel.management.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HotelPricingInfo implements Serializable
{

    @SerializedName("averagePriceValue")
    @Expose
    private Double averagePriceValue;
    @SerializedName("totalPriceValue")
    @Expose
    private Double totalPriceValue;
    @SerializedName("originalPricePerNight")
    @Expose
    private String originalPricePerNight;
    @SerializedName("hotelTotalBaseRate")
    @Expose
    private Double hotelTotalBaseRate;
    @SerializedName("hotelTotalTaxesAndFees")
    @Expose
    private Double hotelTotalTaxesAndFees;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("hotelTotalMandatoryTaxesAndFees")
    @Expose
    private Double hotelTotalMandatoryTaxesAndFees;
    @SerializedName("percentSavings")
    @Expose
    private Double percentSavings;
    @SerializedName("drr")
    @Expose
    private Boolean drr;
    private final static long serialVersionUID = 4130316500399084711L;

    public Double getAveragePriceValue() {
        return averagePriceValue;
    }

    public void setAveragePriceValue(Double averagePriceValue) {
        this.averagePriceValue = averagePriceValue;
    }

    public Double getTotalPriceValue() {
        return totalPriceValue;
    }

    public void setTotalPriceValue(Double totalPriceValue) {
        this.totalPriceValue = totalPriceValue;
    }

    public String getOriginalPricePerNight() {
        return originalPricePerNight;
    }

    public void setOriginalPricePerNight(String originalPricePerNight) {
        this.originalPricePerNight = originalPricePerNight;
    }

    public Double getHotelTotalBaseRate() {
        return hotelTotalBaseRate;
    }

    public void setHotelTotalBaseRate(Double hotelTotalBaseRate) {
        this.hotelTotalBaseRate = hotelTotalBaseRate;
    }

    public Double getHotelTotalTaxesAndFees() {
        return hotelTotalTaxesAndFees;
    }

    public void setHotelTotalTaxesAndFees(Double hotelTotalTaxesAndFees) {
        this.hotelTotalTaxesAndFees = hotelTotalTaxesAndFees;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getHotelTotalMandatoryTaxesAndFees() {
        return hotelTotalMandatoryTaxesAndFees;
    }

    public void setHotelTotalMandatoryTaxesAndFees(Double hotelTotalMandatoryTaxesAndFees) {
        this.hotelTotalMandatoryTaxesAndFees = hotelTotalMandatoryTaxesAndFees;
    }

    public Double getPercentSavings() {
        return percentSavings;
    }

    public void setPercentSavings(Double percentSavings) {
        this.percentSavings = percentSavings;
    }

    public Boolean getDrr() {
        return drr;
    }

    public void setDrr(Boolean drr) {
        this.drr = drr;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
