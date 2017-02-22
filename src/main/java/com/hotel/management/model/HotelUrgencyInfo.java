
package com.hotel.management.model;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HotelUrgencyInfo implements Serializable
{

    @SerializedName("airAttachRemainingTime")
    @Expose
    private Integer airAttachRemainingTime;
    @SerializedName("numberOfPeopleViewing")
    @Expose
    private Integer numberOfPeopleViewing;
    @SerializedName("numberOfPeopleBooked")
    @Expose
    private Integer numberOfPeopleBooked;
    @SerializedName("numberOfRoomsLeft")
    @Expose
    private Integer numberOfRoomsLeft;
    @SerializedName("lastBookedTime")
    @Expose
    private Integer lastBookedTime;
    @SerializedName("almostSoldStatus")
    @Expose
    private String almostSoldStatus;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("almostSoldOutRoomTypeInfoCollection")
    @Expose
    private List<Object> almostSoldOutRoomTypeInfoCollection = null;
    @SerializedName("airAttachEnabled")
    @Expose
    private Boolean airAttachEnabled;
    private final static long serialVersionUID = -357018882122344151L;

    public Integer getAirAttachRemainingTime() {
        return airAttachRemainingTime;
    }

    public void setAirAttachRemainingTime(Integer airAttachRemainingTime) {
        this.airAttachRemainingTime = airAttachRemainingTime;
    }

    public Integer getNumberOfPeopleViewing() {
        return numberOfPeopleViewing;
    }

    public void setNumberOfPeopleViewing(Integer numberOfPeopleViewing) {
        this.numberOfPeopleViewing = numberOfPeopleViewing;
    }

    public Integer getNumberOfPeopleBooked() {
        return numberOfPeopleBooked;
    }

    public void setNumberOfPeopleBooked(Integer numberOfPeopleBooked) {
        this.numberOfPeopleBooked = numberOfPeopleBooked;
    }

    public Integer getNumberOfRoomsLeft() {
        return numberOfRoomsLeft;
    }

    public void setNumberOfRoomsLeft(Integer numberOfRoomsLeft) {
        this.numberOfRoomsLeft = numberOfRoomsLeft;
    }

    public Integer getLastBookedTime() {
        return lastBookedTime;
    }

    public void setLastBookedTime(Integer lastBookedTime) {
        this.lastBookedTime = lastBookedTime;
    }

    public String getAlmostSoldStatus() {
        return almostSoldStatus;
    }

    public void setAlmostSoldStatus(String almostSoldStatus) {
        this.almostSoldStatus = almostSoldStatus;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public List<Object> getAlmostSoldOutRoomTypeInfoCollection() {
        return almostSoldOutRoomTypeInfoCollection;
    }

    public void setAlmostSoldOutRoomTypeInfoCollection(List<Object> almostSoldOutRoomTypeInfoCollection) {
        this.almostSoldOutRoomTypeInfoCollection = almostSoldOutRoomTypeInfoCollection;
    }

    public Boolean getAirAttachEnabled() {
        return airAttachEnabled;
    }

    public void setAirAttachEnabled(Boolean airAttachEnabled) {
        this.airAttachEnabled = airAttachEnabled;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
