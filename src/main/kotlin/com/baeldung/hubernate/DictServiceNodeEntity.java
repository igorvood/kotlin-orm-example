package com.baeldung.hubernate;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "DICT_SERVICE_NODE", schema = "LOCALDEV", catalog = "")
@IdClass(DictServiceNodeEntityPK.class)
public class DictServiceNodeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "SERVICE_ID", nullable = false, length = 255)
    private String serviceId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PROFILE_ID", nullable = false, length = 255)
    private String profileId;
    @Basic
    @Column(name = "NODE_TYPE", nullable = false, length = 32)
    private String nodeType;
    @Basic
    @Column(name = "ID", nullable = false, length = 512)
    private String id;
    @OneToMany(mappedBy = "dictServiceNode")
    private Collection<DictFlinkPropValueEntity> dictFlinkPropValues;
    @OneToMany(mappedBy = "dictServiceNode")
    private Collection<DictPlaceHolderByServiceEntity> dictPlaceHolderByServices;
    @ManyToOne
    @JoinColumn(name = "SERVICE_ID", referencedColumnName = "ID", nullable = false)
    private DictServiceEntity dictServiceByServiceId;

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

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DictServiceNodeEntity that = (DictServiceNodeEntity) o;
        return Objects.equals(serviceId, that.serviceId) && Objects.equals(profileId, that.profileId) && Objects.equals(nodeType, that.nodeType) && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceId, profileId, nodeType, id);
    }

    public Collection<DictFlinkPropValueEntity> getDictFlinkPropValues() {
        return dictFlinkPropValues;
    }

    public void setDictFlinkPropValues(Collection<DictFlinkPropValueEntity> dictFlinkPropValues) {
        this.dictFlinkPropValues = dictFlinkPropValues;
    }

    public Collection<DictPlaceHolderByServiceEntity> getDictPlaceHolderByServices() {
        return dictPlaceHolderByServices;
    }

    public void setDictPlaceHolderByServices(Collection<DictPlaceHolderByServiceEntity> dictPlaceHolderByServices) {
        this.dictPlaceHolderByServices = dictPlaceHolderByServices;
    }

    public DictServiceEntity getDictServiceByServiceId() {
        return dictServiceByServiceId;
    }

    public void setDictServiceByServiceId(DictServiceEntity dictServiceByServiceId) {
        this.dictServiceByServiceId = dictServiceByServiceId;
    }
}
