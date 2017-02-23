
package com.hotel.management.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * The Class HotelScores.
 * Auto-generated
 */
public class HotelScores implements Serializable
{

    /** The raw appeal score. */
    @SerializedName("rawAppealScore")
    @Expose
    private Double rawAppealScore;
    
    /** The moving average score. */
    @SerializedName("movingAverageScore")
    @Expose
    private Double movingAverageScore;
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 1672237983889998541L;

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

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
