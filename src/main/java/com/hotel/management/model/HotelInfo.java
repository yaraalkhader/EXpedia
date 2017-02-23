
package com.hotel.management.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * The Class HotelInfo.
 * Auto-generated
 */
public class HotelInfo implements Serializable
{

    /** The hotel id. */
    @SerializedName("hotelId")
    @Expose
    private String hotelId;
    
    /** The hotel name. */
    @SerializedName("hotelName")
    @Expose
    private String hotelName;
    
    /** The hotel destination. */
    @SerializedName("hotelDestination")
    @Expose
    private String hotelDestination;
    
    /** The hotel destination region ID. */
    @SerializedName("hotelDestinationRegionID")
    @Expose
    private String hotelDestinationRegionID;
    
    /** The hotel long destination. */
    @SerializedName("hotelLongDestination")
    @Expose
    private String hotelLongDestination;
    
    /** The hotel street address. */
    @SerializedName("hotelStreetAddress")
    @Expose
    private String hotelStreetAddress;
    
    /** The hotel city. */
    @SerializedName("hotelCity")
    @Expose
    private String hotelCity;
    
    /** The hotel province. */
    @SerializedName("hotelProvince")
    @Expose
    private String hotelProvince;
    
    /** The hotel country code. */
    @SerializedName("hotelCountryCode")
    @Expose
    private String hotelCountryCode;
    
    /** The hotel location. */
    @SerializedName("hotelLocation")
    @Expose
    private String hotelLocation;
    
    /** The hotel latitude. */
    @SerializedName("hotelLatitude")
    @Expose
    private Double hotelLatitude;
    
    /** The hotel longitude. */
    @SerializedName("hotelLongitude")
    @Expose
    private Double hotelLongitude;
    
    /** The hotel star rating. */
    @SerializedName("hotelStarRating")
    @Expose
    private String hotelStarRating;
    
    /** The hotel guest review rating. */
    @SerializedName("hotelGuestReviewRating")
    @Expose
    private Double hotelGuestReviewRating;
    
    /** The travel start date. */
    @SerializedName("travelStartDate")
    @Expose
    private String travelStartDate;
    
    /** The travel end date. */
    @SerializedName("travelEndDate")
    @Expose
    private String travelEndDate;
    
    /** The hotel image url. */
    @SerializedName("hotelImageUrl")
    @Expose
    private String hotelImageUrl;
    
    /** The car package score. */
    @SerializedName("carPackageScore")
    @Expose
    private Double carPackageScore;
    
    /** The description. */
    @SerializedName("description")
    @Expose
    private String description;
    
    /** The distance from user. */
    @SerializedName("distanceFromUser")
    @Expose
    private Double distanceFromUser;
    
    /** The language. */
    @SerializedName("language")
    @Expose
    private String language;
    
    /** The moving average score. */
    @SerializedName("movingAverageScore")
    @Expose
    private Double movingAverageScore;
    
    /** The promotion amount. */
    @SerializedName("promotionAmount")
    @Expose
    private Double promotionAmount;
    
    /** The promotion description. */
    @SerializedName("promotionDescription")
    @Expose
    private String promotionDescription;
    
    /** The promotion tag. */
    @SerializedName("promotionTag")
    @Expose
    private String promotionTag;
    
    /** The raw appeal score. */
    @SerializedName("rawAppealScore")
    @Expose
    private Double rawAppealScore;
    
    /** The relevance score. */
    @SerializedName("relevanceScore")
    @Expose
    private Double relevanceScore;
    
    /** The status code. */
    @SerializedName("statusCode")
    @Expose
    private String statusCode;
    
    /** The status description. */
    @SerializedName("statusDescription")
    @Expose
    private String statusDescription;
    
    /** The car package. */
    @SerializedName("carPackage")
    @Expose
    private Boolean carPackage;
    
    /** The all inclusive. */
    @SerializedName("allInclusive")
    @Expose
    private Boolean allInclusive;
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = -5505090301224285259L;

    /**
     * Gets the hotel id.
     *
     * @return the hotel id
     */
    public String getHotelId() {
        return hotelId;
    }

    /**
     * Sets the hotel id.
     *
     * @param hotelId the new hotel id
     */
    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    /**
     * Gets the hotel name.
     *
     * @return the hotel name
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * Sets the hotel name.
     *
     * @param hotelName the new hotel name
     */
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    /**
     * Gets the hotel destination.
     *
     * @return the hotel destination
     */
    public String getHotelDestination() {
        return hotelDestination;
    }

    /**
     * Sets the hotel destination.
     *
     * @param hotelDestination the new hotel destination
     */
    public void setHotelDestination(String hotelDestination) {
        this.hotelDestination = hotelDestination;
    }

    /**
     * Gets the hotel destination region ID.
     *
     * @return the hotel destination region ID
     */
    public String getHotelDestinationRegionID() {
        return hotelDestinationRegionID;
    }

    /**
     * Sets the hotel destination region ID.
     *
     * @param hotelDestinationRegionID the new hotel destination region ID
     */
    public void setHotelDestinationRegionID(String hotelDestinationRegionID) {
        this.hotelDestinationRegionID = hotelDestinationRegionID;
    }

    /**
     * Gets the hotel long destination.
     *
     * @return the hotel long destination
     */
    public String getHotelLongDestination() {
        return hotelLongDestination;
    }

    /**
     * Sets the hotel long destination.
     *
     * @param hotelLongDestination the new hotel long destination
     */
    public void setHotelLongDestination(String hotelLongDestination) {
        this.hotelLongDestination = hotelLongDestination;
    }

    /**
     * Gets the hotel street address.
     *
     * @return the hotel street address
     */
    public String getHotelStreetAddress() {
        return hotelStreetAddress;
    }

    /**
     * Sets the hotel street address.
     *
     * @param hotelStreetAddress the new hotel street address
     */
    public void setHotelStreetAddress(String hotelStreetAddress) {
        this.hotelStreetAddress = hotelStreetAddress;
    }

    /**
     * Gets the hotel city.
     *
     * @return the hotel city
     */
    public String getHotelCity() {
        return hotelCity;
    }

    /**
     * Sets the hotel city.
     *
     * @param hotelCity the new hotel city
     */
    public void setHotelCity(String hotelCity) {
        this.hotelCity = hotelCity;
    }

    /**
     * Gets the hotel province.
     *
     * @return the hotel province
     */
    public String getHotelProvince() {
        return hotelProvince;
    }

    /**
     * Sets the hotel province.
     *
     * @param hotelProvince the new hotel province
     */
    public void setHotelProvince(String hotelProvince) {
        this.hotelProvince = hotelProvince;
    }

    /**
     * Gets the hotel country code.
     *
     * @return the hotel country code
     */
    public String getHotelCountryCode() {
        return hotelCountryCode;
    }

    /**
     * Sets the hotel country code.
     *
     * @param hotelCountryCode the new hotel country code
     */
    public void setHotelCountryCode(String hotelCountryCode) {
        this.hotelCountryCode = hotelCountryCode;
    }

    /**
     * Gets the hotel location.
     *
     * @return the hotel location
     */
    public String getHotelLocation() {
        return hotelLocation;
    }

    /**
     * Sets the hotel location.
     *
     * @param hotelLocation the new hotel location
     */
    public void setHotelLocation(String hotelLocation) {
        this.hotelLocation = hotelLocation;
    }

    /**
     * Gets the hotel latitude.
     *
     * @return the hotel latitude
     */
    public Double getHotelLatitude() {
        return hotelLatitude;
    }

    /**
     * Sets the hotel latitude.
     *
     * @param hotelLatitude the new hotel latitude
     */
    public void setHotelLatitude(Double hotelLatitude) {
        this.hotelLatitude = hotelLatitude;
    }

    /**
     * Gets the hotel longitude.
     *
     * @return the hotel longitude
     */
    public Double getHotelLongitude() {
        return hotelLongitude;
    }

    /**
     * Sets the hotel longitude.
     *
     * @param hotelLongitude the new hotel longitude
     */
    public void setHotelLongitude(Double hotelLongitude) {
        this.hotelLongitude = hotelLongitude;
    }

    /**
     * Gets the hotel star rating.
     *
     * @return the hotel star rating
     */
    public String getHotelStarRating() {
        return hotelStarRating;
    }

    /**
     * Sets the hotel star rating.
     *
     * @param hotelStarRating the new hotel star rating
     */
    public void setHotelStarRating(String hotelStarRating) {
        this.hotelStarRating = hotelStarRating;
    }

    /**
     * Gets the hotel guest review rating.
     *
     * @return the hotel guest review rating
     */
    public Double getHotelGuestReviewRating() {
        return hotelGuestReviewRating;
    }

    /**
     * Sets the hotel guest review rating.
     *
     * @param hotelGuestReviewRating the new hotel guest review rating
     */
    public void setHotelGuestReviewRating(Double hotelGuestReviewRating) {
        this.hotelGuestReviewRating = hotelGuestReviewRating;
    }

    /**
     * Gets the travel start date.
     *
     * @return the travel start date
     */
    public String getTravelStartDate() {
        return travelStartDate;
    }

    /**
     * Sets the travel start date.
     *
     * @param travelStartDate the new travel start date
     */
    public void setTravelStartDate(String travelStartDate) {
        this.travelStartDate = travelStartDate;
    }

    /**
     * Gets the travel end date.
     *
     * @return the travel end date
     */
    public String getTravelEndDate() {
        return travelEndDate;
    }

    /**
     * Sets the travel end date.
     *
     * @param travelEndDate the new travel end date
     */
    public void setTravelEndDate(String travelEndDate) {
        this.travelEndDate = travelEndDate;
    }

    /**
     * Gets the hotel image url.
     *
     * @return the hotel image url
     */
    public String getHotelImageUrl() {
        return hotelImageUrl;
    }

    /**
     * Sets the hotel image url.
     *
     * @param hotelImageUrl the new hotel image url
     */
    public void setHotelImageUrl(String hotelImageUrl) {
        this.hotelImageUrl = hotelImageUrl;
    }

    /**
     * Gets the car package score.
     *
     * @return the car package score
     */
    public Double getCarPackageScore() {
        return carPackageScore;
    }

    /**
     * Sets the car package score.
     *
     * @param carPackageScore the new car package score
     */
    public void setCarPackageScore(Double carPackageScore) {
        this.carPackageScore = carPackageScore;
    }

    /**
     * Gets the description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description.
     *
     * @param description the new description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the distance from user.
     *
     * @return the distance from user
     */
    public Double getDistanceFromUser() {
        return distanceFromUser;
    }

    /**
     * Sets the distance from user.
     *
     * @param distanceFromUser the new distance from user
     */
    public void setDistanceFromUser(Double distanceFromUser) {
        this.distanceFromUser = distanceFromUser;
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
     * Gets the moving average score.
     *
     * @return the moving average score
     */
    public Double getMovingAverageScore() {
        return movingAverageScore;
    }

    /**
     * Sets the moving average score.
     *
     * @param movingAverageScore the new moving average score
     */
    public void setMovingAverageScore(Double movingAverageScore) {
        this.movingAverageScore = movingAverageScore;
    }

    /**
     * Gets the promotion amount.
     *
     * @return the promotion amount
     */
    public Double getPromotionAmount() {
        return promotionAmount;
    }

    /**
     * Sets the promotion amount.
     *
     * @param promotionAmount the new promotion amount
     */
    public void setPromotionAmount(Double promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    /**
     * Gets the promotion description.
     *
     * @return the promotion description
     */
    public String getPromotionDescription() {
        return promotionDescription;
    }

    /**
     * Sets the promotion description.
     *
     * @param promotionDescription the new promotion description
     */
    public void setPromotionDescription(String promotionDescription) {
        this.promotionDescription = promotionDescription;
    }

    /**
     * Gets the promotion tag.
     *
     * @return the promotion tag
     */
    public String getPromotionTag() {
        return promotionTag;
    }

    /**
     * Sets the promotion tag.
     *
     * @param promotionTag the new promotion tag
     */
    public void setPromotionTag(String promotionTag) {
        this.promotionTag = promotionTag;
    }

    /**
     * Gets the raw appeal score.
     *
     * @return the raw appeal score
     */
    public Double getRawAppealScore() {
        return rawAppealScore;
    }

    /**
     * Sets the raw appeal score.
     *
     * @param rawAppealScore the new raw appeal score
     */
    public void setRawAppealScore(Double rawAppealScore) {
        this.rawAppealScore = rawAppealScore;
    }

    /**
     * Gets the relevance score.
     *
     * @return the relevance score
     */
    public Double getRelevanceScore() {
        return relevanceScore;
    }

    /**
     * Sets the relevance score.
     *
     * @param relevanceScore the new relevance score
     */
    public void setRelevanceScore(Double relevanceScore) {
        this.relevanceScore = relevanceScore;
    }

    /**
     * Gets the status code.
     *
     * @return the status code
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the status code.
     *
     * @param statusCode the new status code
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * Gets the status description.
     *
     * @return the status description
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * Sets the status description.
     *
     * @param statusDescription the new status description
     */
    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    /**
     * Gets the car package.
     *
     * @return the car package
     */
    public Boolean getCarPackage() {
        return carPackage;
    }

    /**
     * Sets the car package.
     *
     * @param carPackage the new car package
     */
    public void setCarPackage(Boolean carPackage) {
        this.carPackage = carPackage;
    }

    /**
     * Gets the all inclusive.
     *
     * @return the all inclusive
     */
    public Boolean getAllInclusive() {
        return allInclusive;
    }

    /**
     * Sets the all inclusive.
     *
     * @param allInclusive the new all inclusive
     */
    public void setAllInclusive(Boolean allInclusive) {
        this.allInclusive = allInclusive;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
