package com.baeldung.hubernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "DICT_PLACE_HOLDER_BY_SERVICE", schema = "LOCALDEV", catalog = "")
@IdClass(DictPlaceHolderByServiceEntityPK.class)
public class DictPlaceHolderByServiceEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "SERVICE_ID", nullable = false, length = 255)
    private String serviceId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PROFILE_ID", nullable = false, length = 255)
    private String profileId;
    @Basic
    @Column(name = "STAND_ID", nullable = false, length = 255)
    private String standId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PLACE_HOLDER_ID", nullable = false, length = 255)
    private String placeHolderId;
    @Basic
    @Column(name = "VALUE", nullable = false, length = 256)
    private String value;
    @ManyToOne
    @JoinColumns({@JoinColumn(name = "SERVICE_ID", referencedColumnName = "SERVICE_ID", nullable = false), @JoinColumn(name = "PROFILE_ID", referencedColumnName = "PROFILE_ID", nullable = false)})
    private DictServiceNodeEntity dictServiceNode;
    @ManyToOne
    @JoinColumn(name = "STAND_ID", referencedColumnName = "ID", nullable = false)
    private MetaStandEntity metaStandByStandId;
    @ManyToOne
    @JoinColumn(name = "PLACE_HOLDER_ID", referencedColumnName = "ID", nullable = false)
    private DictPlaceHolderEntity dictPlaceHolderByPlaceHolderId;

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

    public String getStandId() {
        return standId;
    }

    public void setStandId(String standId) {
        this.standId = standId;
    }

    public String getPlaceHolderId() {
        return placeHolderId;
    }

    public void setPlaceHolderId(String placeHolderId) {
        this.placeHolderId = placeHolderId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DictPlaceHolderByServiceEntity that = (DictPlaceHolderByServiceEntity) o;
        return Objects.equals(serviceId, that.serviceId) && Objects.equals(profileId, that.profileId) && Objects.equals(standId, that.standId) && Objects.equals(placeHolderId, that.placeHolderId) && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceId, profileId, standId, placeHolderId, value);
    }

    public DictServiceNodeEntity getDictServiceNode() {
        return dictServiceNode;
    }

    public void setDictServiceNode(DictServiceNodeEntity dictServiceNode) {
        this.dictServiceNode = dictServiceNode;
    }

    public MetaStandEntity getMetaStandByStandId() {
        return metaStandByStandId;
    }

    public void setMetaStandByStandId(MetaStandEntity metaStandByStandId) {
        this.metaStandByStandId = metaStandByStandId;
    }

    public DictPlaceHolderEntity getDictPlaceHolderByPlaceHolderId() {
        return dictPlaceHolderByPlaceHolderId;
    }

    public void setDictPlaceHolderByPlaceHolderId(DictPlaceHolderEntity dictPlaceHolderByPlaceHolderId) {
        this.dictPlaceHolderByPlaceHolderId = dictPlaceHolderByPlaceHolderId;
    }
}
