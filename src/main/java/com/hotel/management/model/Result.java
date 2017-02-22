
package com.hotel.management.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result implements Serializable
{

    @SerializedName("offerInfo")
    @Expose
    private OfferInfo offerInfo;
    @SerializedName("userInfo")
    @Expose
    private UserInfo userInfo;
    @SerializedName("offers")
    @Expose
    private Offers offers;
    private final static long serialVersionUID = -1625435514326374239L;

    public OfferInfo getOfferInfo() {
        return offerInfo;
    }

    public void setOfferInfo(OfferInfo offerInfo) {
        this.offerInfo = offerInfo;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public Offers getOffers() {
        return offers;
    }

    public void setOffers(Offers offers) {
        this.offers = offers;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
