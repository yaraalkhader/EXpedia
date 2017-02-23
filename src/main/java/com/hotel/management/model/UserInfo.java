
package com.hotel.management.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * The Class UserInfo.
 * Auto-generated
 */
public class UserInfo implements Serializable
{

    /** The persona. */
    @SerializedName("persona")
    @Expose
    private Persona persona;
    
    /** The user id. */
    @SerializedName("userId")
    @Expose
    private String userId;
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = 6506098346137758256L;

    /**
     * Gets the persona.
     *
     * @return the persona
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * Sets the persona.
     *
     * @param persona the new persona
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    /**
     * Gets the user id.
     *
     * @return the user id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the user id.
     *
     * @param userId the new user id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
