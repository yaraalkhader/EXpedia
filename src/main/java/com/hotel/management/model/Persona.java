
package com.hotel.management.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * The Class Persona.
 * Auto-generated
 */
public class Persona implements Serializable
{

    /** The persona type. */
    @SerializedName("personaType")
    @Expose
    private String personaType;
    
    /** The Constant serialVersionUID. */
    private final static long serialVersionUID = -4876334197623775017L;

    /**
     * Gets the persona type.
     *
     * @return the persona type
     */
    public String getPersonaType() {
        return personaType;
    }

    /**
     * Sets the persona type.
     *
     * @param personaType the new persona type
     */
    public void setPersonaType(String personaType) {
        this.personaType = personaType;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
