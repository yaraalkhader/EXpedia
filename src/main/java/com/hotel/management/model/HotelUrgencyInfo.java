
package com.hotel.management.model;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * The Class HotelUrgencyInfo.
 * Auto-generated
 */
public class HotelUrgencyInfo implements Serializable
{

    /** The air attach remaining time. */
    @SerializedName("airAttachRemainingTime")
    @Expose
    private Integer airAttachRemainingTime;
    
    /** The number of people viewing. */
    @SerializedName("numberOfPeopleViewing")
    @Expose
    private Integer numberOfPeopleViewing;
    
    /** The number of people booked. */
    @SerializedName("numberOfPeopleBooked")
    @Expose
    private Integer numberOfPeopleBooked;
    
    /** The number of rooms left. */
    @SerializedName("numberOfRoomsLeft")
    @Expose
    private Integer numberOfRoomsLeft;
    
    /** The last booked time. */
    @SerializedName("lastBookedTime")
    @Expose
    private Integer lastBookedTime;
    
    /** The almost sold status. */
    @SerializedName("almostSoldStatus")
    @Expose
    private String almostSoldStatus;
    
    /** The link. */
    @SerializedName("link")
    @Expose
    private String link;
    
    /** The almost sold out room type info collection. */
    @SerializedName("almostSoldOutRoomTypeInfoCollection")
    @Expose
    private List<Object> almostSoldOutRoomTypeInfoCollection = null;
    
    /** The air attach enabled. */
    @SerializedName("airAttachEnabled")
    @Expose
    private Boolean airAttachEnabled;
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = -357018882122344151L;

    /**
     * Gets the air attach remaining time.
     *
     * @return the air attach remaining time
     */
    public Integer getAirAttachRemainingTime() {
        return airAttachRemainingTime;
    }

    /**
     * Sets the air attach remaining time.
     *
     * @param airAttachRemainingTime the new air attach remaining time
     */
    public void setAirAttachRemainingTime(Integer airAttachRemainingTime) {
        this.airAttachRemainingTime = airAttachRemainingTime;
    }

    /**
     * Gets the number of people viewing.
     *
     * @return the number of people viewing
     */
    public Integer getNumberOfPeopleViewing() {
        return numberOfPeopleViewing;
    }

    /**
     * Sets the number of people viewing.
     *
     * @param numberOfPeopleViewing the new number of people viewing
     */
    public void setNumberOfPeopleViewing(Integer numberOfPeopleViewing) {
        this.numberOfPeopleViewing = numberOfPeopleViewing;
    }

    /**
     * Gets the number of people booked.
     *
     * @return the number of people booked
     */
    public Integer getNumberOfPeopleBooked() {
        return numberOfPeopleBooked;
    }

    /**
     * Sets the number of people booked.
     *
     * @param numberOfPeopleBooked the new number of people booked
     */
    public void setNumberOfPeopleBooked(Integer numberOfPeopleBooked) {
        this.numberOfPeopleBooked = numberOfPeopleBooked;
    }

    /**
     * Gets the number of rooms left.
     *
     * @return the number of rooms left
     */
    public Integer getNumberOfRoomsLeft() {
        return numberOfRoomsLeft;
    }

    /**
     * Sets the number of rooms left.
     *
     * @param numberOfRoomsLeft the new number of rooms left
     */
    public void setNumberOfRoomsLeft(Integer numberOfRoomsLeft) {
        this.numberOfRoomsLeft = numberOfRoomsLeft;
    }

    /**
     * Gets the last booked time.
     *
     * @return the last booked time
     */
    public Integer getLastBookedTime() {
        return lastBookedTime;
    }

    /**
     * Sets the last booked time.
     *
     * @param lastBookedTime the new last booked time
     */
    public void setLastBookedTime(Integer lastBookedTime) {
        this.lastBookedTime = lastBookedTime;
    }

    /**
     * Gets the almost sold status.
     *
     * @return the almost sold status
     */
    public String getAlmostSoldStatus() {
        return almostSoldStatus;
    }

    /**
     * Sets the almost sold status.
     *
     * @param almostSoldStatus the new almost sold status
     */
    public void setAlmostSoldStatus(String almostSoldStatus) {
        this.almostSoldStatus = almostSoldStatus;
    }

    /**
     * Gets the link.
     *
     * @return the link
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets the link.
     *
     * @param link the new link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * Gets the almost sold out room type info collection.
     *
     * @return the almost sold out room type info collection
     */
    public List<Object> getAlmostSoldOutRoomTypeInfoCollection() {
        return almostSoldOutRoomTypeInfoCollection;
    }

    /**
     * Sets the almost sold out room type info collection.
     *
     * @param almostSoldOutRoomTypeInfoCollection the new almost sold out room type info collection
     */
    public void setAlmostSoldOutRoomTypeInfoCollection(List<Object> almostSoldOutRoomTypeInfoCollection) {
        this.almostSoldOutRoomTypeInfoCollection = almostSoldOutRoomTypeInfoCollection;
    }

    /**
     * Gets the air attach enabled.
     *
     * @return the air attach enabled
     */
    public Boolean getAirAttachEnabled() {
        return airAttachEnabled;
    }

    /**
     * Sets the air attach enabled.
     *
     * @param airAttachEnabled the new air attach enabled
     */
    public void setAirAttachEnabled(Boolean airAttachEnabled) {
        this.airAttachEnabled = airAttachEnabled;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
