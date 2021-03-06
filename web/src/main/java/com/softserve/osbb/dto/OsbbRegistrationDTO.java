/*
 * Project “OSBB” – a web-application which is a godsend for condominium head, managers and 
 * residents. It offers a very easy way to manage accounting and residents, events and 
 * organizational issues. It represents a simple design and great functionality that is needed 
 * for managing. 
 */
package com.softserve.osbb.dto;

import com.softserve.osbb.model.Attachment;
import com.softserve.osbb.model.District;

import java.sql.Timestamp;

/**
 * Created by nazar.dovhyy on 29.10.2016.
 */
public class OsbbRegistrationDTO extends AbstractDTO {

    private Integer osbbId;
    private String name;
    private String description;
    private UserRegistrationDTO creator;
    private String houseNumber;
    private District district;
    private String districtStr;
    private Attachment logo;
    private Timestamp creationDate;
    private boolean available;

    public Integer getOsbbId() {
        return osbbId;
    }

    public void setOsbbId(Integer osbbId) {
        this.osbbId = osbbId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserRegistrationDTO getCreator() {
        return creator;
    }

    public void setCreator(UserRegistrationDTO creator) {
        this.creator = creator;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public String getDistrictStr() {
        return districtStr;
    }

    public void setDistrictStr(String districtStr) {
        this.districtStr = districtStr;
    }

    public Attachment getLogo() {
        return logo;
    }

    public void setLogo(Attachment logo) {
        this.logo = logo;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
