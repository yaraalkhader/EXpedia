
package com.hotel.management.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HotelInfo implements Serializable
{

    @SerializedName("hotelId")
    @Expose
    private String hotelId;
    @SerializedName("hotelName")
    @Expose
    private String hotelName;
    @SerializedName("hotelDestination")
    @Expose
    private String hotelDestination;
    @SerializedName("hotelDestinationRegionID")
    @Expose
    private String hotelDestinationRegionID;
    @SerializedName("hotelLongDestination")
    @Expose
    private String hotelLongDestination;
    @SerializedName("hotelStreetAddress")
    @Expose
    private String hotelStreetAddress;
    @SerializedName("hotelCity")
    @Expose
    private String hotelCity;
    @SerializedName("hotelProvince")
    @Expose
    private String hotelProvince;
    @SerializedName("hotelCountryCode")
    @Expose
    private String hotelCountryCode;
    @SerializedName("hotelLocation")
    @Expose
    private String hotelLocation;
    @SerializedName("hotelLatitude")
    @Expose
    private Double hotelLatitude;
    @SerializedName("hotelLongitude")
    @Expose
    private Double hotelLongitude;
    @SerializedName("hotelStarRating")
    @Expose
    private String hotelStarRating;
    @SerializedName("hotelGuestReviewRating")
    @Expose
    private Double hotelGuestReviewRating;
    @SerializedName("travelStartDate")
    @Expose
    private String travelStartDate;
    @SerializedName("travelEndDate")
    @Expose
    private String travelEndDate;
    @SerializedName("hotelImageUrl")
    @Expose
    private String hotelImageUrl;
    @SerializedName("carPackageScore")
    @Expose
    private Double carPackageScore;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("distanceFromUser")
    @Expose
    private Double distanceFromUser;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("movingAverageScore")
    @Expose
    private Double movingAverageScore;
    @SerializedName("promotionAmount")
    @Expose
    private Double promotionAmount;
    @SerializedName("promotionDescription")
    @Expose
    private String promotionDescription;
    @SerializedName("promotionTag")
    @Expose
    private String promotionTag;
    @SerializedName("rawAppealScore")
    @Expose
    private Double rawAppealScore;
    @SerializedName("relevanceScore")
    @Expose
    private Double relevanceScore;
    @SerializedName("statusCode")
    @Expose
    private String statusCode;
    @SerializedName("statusDescription")
    @Expose
    private String statusDescription;
    @SerializedName("carPackage")
    @Expose
    private Boolean carPackage;
    @SerializedName("allInclusive")
    @Expose
    private Boolean allInclusive;
    private final static long serialVersionUID = -5505090301224285259L;

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelDestination() {
        return hotelDestination;
    }

    public void setHotelDestination(String hotelDestination) {
        this.hotelDestination = hotelDestination;
    }

    public String getHotelDestinationRegionID() {
        return hotelDestinationRegionID;
    }

    public void setHotelDestinationRegionID(String hotelDestinationRegionID) {
        this.hotelDestinationRegionID = hotelDestinationRegionID;
    }

    public String getHotelLongDestination() {
        return hotelLongDestination;
    }

    public void setHotelLongDestination(String hotelLongDestination) {
        this.hotelLongDestination = hotelLongDestination;
    }

    public String getHotelStreetAddress() {
        return hotelStreetAddress;
    }

    public void setHotelStreetAddress(String hotelStreetAddress) {
        this.hotelStreetAddress = hotelStreetAddress;
    }

    public String getHotelCity() {
        return hotelCity;
    }

    public void setHotelCity(String hotelCity) {
        this.hotelCity = hotelCity;
    }

    public String getHotelProvince() {
        return hotelProvince;
    }

    public void setHotelProvince(String hotelProvince) {
        this.hotelProvince = hotelProvince;
    }

    public String getHotelCountryCode() {
        return hotelCountryCode;
    }

    public void setHotelCountryCode(String hotelCountryCode) {
        this.hotelCountryCode = hotelCountryCode;
    }

    public String getHotelLocation() {
        return hotelLocation;
    }

    public void setHotelLocation(String hotelLocation) {
        this.hotelLocation = hotelLocation;
    }

    public Double getHotelLatitude() {
        return hotelLatitude;
    }

    public void setHotelLatitude(Double hotelLatitude) {
        this.hotelLatitude = hotelLatitude;
    }

    public Double getHotelLongitude() {
        return hotelLongitude;
    }

    public void setHotelLongitude(Double hotelLongitude) {
        this.hotelLongitude = hotelLongitude;
    }

    public String getHotelStarRating() {
        return hotelStarRating;
    }

    public void setHotelStarRating(String hotelStarRating) {
        this.hotelStarRating = hotelStarRating;
    }

    public Double getHotelGuestReviewRating() {
        return hotelGuestReviewRating;
    }

    public void setHotelGuestReviewRating(Double hotelGuestReviewRating) {
        this.hotelGuestReviewRating = hotelGuestReviewRating;
    }

    public String getTravelStartDate() {
        return travelStartDate;
    }

    public void setTravelStartDate(String travelStartDate) {
        this.travelStartDate = travelStartDate;
    }

    public String getTravelEndDate() {
        return travelEndDate;
    }

    public void setTravelEndDate(String travelEndDate) {
        this.travelEndDate = travelEndDate;
    }

    public String getHotelImageUrl() {
        return hotelImageUrl;
    }

    public void setHotelImageUrl(String hotelImageUrl) {
        this.hotelImageUrl = hotelImageUrl;
    }

    public Double getCarPackageScore() {
        return carPackageScore;
    }

    public void setCarPackageScore(Double carPackageScore) {
        this.carPackageScore = carPackageScore;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getDistanceFromUser() {
        return distanceFromUser;
    }

    public void setDistanceFromUser(Double distanceFromUser) {
        this.distanceFromUser = distanceFromUser;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Double getMovingAverageScore() {
        return movingAverageScore;
    }

    public void setMovingAverageScore(Double movingAverageScore) {
        this.movingAverageScore = movingAverageScore;
    }

    public Double getPromotionAmount() {
        return promotionAmount;
    }

    public void setPromotionAmount(Double promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    public String getPromotionDescription() {
        return promotionDescription;
    }

    public void setPromotionDescription(String promotionDescription) {
        this.promotionDescription = promotionDescription;
    }

    public String getPromotionTag() {
        return promotionTag;
    }

    public void setPromotionTag(String promotionTag) {
        this.promotionTag = promotionTag;
    }

    public Double getRawAppealScore() {
        return rawAppealScore;
    }

    public void setRawAppealScore(Double rawAppealScore) {
        this.rawAppealScore = rawAppealScore;
    }

    public Double getRelevanceScore() {
        return relevanceScore;
    }

    public void setRelevanceScore(Double relevanceScore) {
        this.relevanceScore = relevanceScore;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public Boolean getCarPackage() {
        return carPackage;
    }

    public void setCarPackage(Boolean carPackage) {
        this.carPackage = carPackage;
    }

    public Boolean getAllInclusive() {
        return allInclusive;
    }

    public void setAllInclusive(Boolean allInclusive) {
        this.allInclusive = allInclusive;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
