
package com.hotel.management.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * The Class Result.
 * Auto-generated
 */
public class Result implements Serializable
{

    /** The offer info. */
    @SerializedName("offerInfo")
    @Expose
    private OfferInfo offerInfo;
    
    /** The user info. */
    @SerializedName("userInfo")
    @Expose
    private UserInfo userInfo;
    
    /** The offers. */
    @SerializedName("offers")
    @Expose
    private Offers offers;
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = -1625435514326374239L;

    /**
     * Gets the offer info.
     *
     * @return the offer info
     */
    public OfferInfo getOfferInfo() {
        return offerInfo;
    }

    /**
     * Sets the offer info.
     *
     * @param offerInfo the new offer info
     */
    public void setOfferInfo(OfferInfo offerInfo) {
        this.offerInfo = offerInfo;
    }

    /**
     * Gets the user info.
     *
     * @return the user info
     */
    public UserInfo getUserInfo() {
        return userInfo;
    }

    /**
     * Sets the user info.
     *
     * @param userInfo the new user info
     */
    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    /**
     * Gets the offers.
     *
     * @return the offers
     */
    public Offers getOffers() {
        return offers;
    }

    /**
     * Sets the offers.
     *
     * @param offers the new offers
     */
    public void setOffers(Offers offers) {
        this.offers = offers;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
