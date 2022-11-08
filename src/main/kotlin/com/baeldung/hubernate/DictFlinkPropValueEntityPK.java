package com.baeldung.hubernate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class DictFlinkPropValueEntityPK implements Serializable {
    @Column(name = "SERVICE_ID", nullable = false, length = 255)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String serviceId;
    @Column(name = "PROFILE_ID", nullable = false, length = 255)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String profileId;
    @Column(name = "PROP_ID", nullable = false, length = 256)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String propId;

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

    public String getPropId() {
        return propId;
    }

    public void setPropId(String propId) {
        this.propId = propId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DictFlinkPropValueEntityPK that = (DictFlinkPropValueEntityPK) o;
        return Objects.equals(serviceId, that.serviceId) && Objects.equals(profileId, that.profileId) && Objects.equals(propId, that.propId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceId, profileId, propId);
    }
}
