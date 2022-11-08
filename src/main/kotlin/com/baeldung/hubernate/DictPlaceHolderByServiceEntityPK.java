package com.baeldung.hubernate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class DictPlaceHolderByServiceEntityPK implements Serializable {
    @Column(name = "SERVICE_ID", nullable = false, length = 255)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String serviceId;
    @Column(name = "PROFILE_ID", nullable = false, length = 255)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String profileId;
    @Column(name = "PLACE_HOLDER_ID", nullable = false, length = 255)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String placeHolderId;

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public String getPlaceHolderId() {
        return placeHolderId;
    }

    public void setPlaceHolderId(String placeHolderId) {
        this.placeHolderId = placeHolderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DictPlaceHolderByServiceEntityPK that = (DictPlaceHolderByServiceEntityPK) o;
        return Objects.equals(serviceId, that.serviceId) && Objects.equals(profileId, that.profileId) && Objects.equals(placeHolderId, that.placeHolderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceId, profileId, placeHolderId);
    }
}
