
package com.hotel.management.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Persona implements Serializable
{

    @SerializedName("personaType")
    @Expose
    private String personaType;
    private final static long serialVersionUID = -4876334197623775017L;

    public String getPersonaType() {
        return personaType;
    }

    public void setPersonaType(String personaType) {
        this.personaType = personaType;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
