
package com.hotel.management.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * The Class OfferInfo.
 * Auto-generated
 */
public class OfferInfo implements Serializable
{

    /** The site ID. */
    @SerializedName("siteID")
    @Expose
    private String siteID;
    
    /** The language. */
    @SerializedName("language")
    @Expose
    private String language;
    
    /** The currency. */
    @SerializedName("currency")
    @Expose
    private String currency;
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 9047830529319081649L;

    /**
     * Gets the site ID.
     *
     * @return the site ID
     */
    public String getSiteID() {
        return siteID;
    }

    /**
     * Sets the site ID.
     *
     * @param siteID the new site ID
     */
    public void setSiteID(String siteID) {
        this.siteID = siteID;
    }

    /**
     * Gets the language.
     *
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the language.
     *
     * @param language the new language
     */
    public void setLanguage(String language) {
        this.language = language;
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

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
