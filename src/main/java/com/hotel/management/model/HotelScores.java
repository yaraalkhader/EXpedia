
package com.hotel.management.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HotelScores implements Serializable
{

    @SerializedName("rawAppealScore")
    @Expose
    private Double rawAppealScore;
    @SerializedName("movingAverageScore")
    @Expose
    private Double movingAverageScore;
    private final static long serialVersionUID = 1672237983889998541L;

    public Double getRawAppealScore() {
        return rawAppealScore;
    }

    public void setRawAppealScore(Double rawAppealScore) {
        this.rawAppealScore = rawAppealScore;
    }

    public Double getMovingAverageScore() {
        return movingAverageScore;
    }

    public void setMovingAverageScore(Double movingAverageScore) {
        this.movingAverageScore = movingAverageScore;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
