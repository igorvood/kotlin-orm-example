package com.baeldung.hubernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "DICT_FLINK_PROP_VALUE", schema = "LOCALDEV", catalog = "")
@IdClass(DictFlinkPropValueEntityPK.class)
public class DictFlinkPropValueEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "SERVICE_ID", nullable = false, length = 255)
    private String serviceId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PROFILE_ID", nullable = false, length = 255)
    private String profileId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PROP_ID", nullable = false, length = 256)
    private String propId;
    @Basic
    @Column(name = "PROP_VALUE", nullable = false, length = 256)
    private String propValue;
    @Basic
    @Column(name = "IS_FUNCTION", nullable = false, precision = 0)
    private boolean isFunction;
    @Basic
    @Column(name = "FUNCTION_ID", nullable = true, length = 256)
    private String functionId;
    @ManyToOne
    @JoinColumns({@JoinColumn(name = "SERVICE_ID", referencedColumnName = "SERVICE_ID", nullable = false), @JoinColumn(name = "PROFILE_ID", referencedColumnName = "PROFILE_ID", nullable = false)})
    private DictServiceNodeEntity dictServiceNode;
    @ManyToOne
    @JoinColumn(name = "FUNCTION_ID", referencedColumnName = "ID")
    private MetaPropertyFunctionEntity metaPropertyFunctionByFunctionId;

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

    public String getPropValue() {
        return propValue;
    }

    public void setPropValue(String propValue) {
        this.propValue = propValue;
    }

    public boolean isFunction() {
        return isFunction;
    }

    public void setFunction(boolean function) {
        isFunction = function;
    }

    public String getFunctionId() {
        return functionId;
    }

    public void setFunctionId(String functionId) {
        this.functionId = functionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DictFlinkPropValueEntity that = (DictFlinkPropValueEntity) o;
        return isFunction == that.isFunction && Objects.equals(serviceId, that.serviceId) && Objects.equals(profileId, that.profileId) && Objects.equals(propId, that.propId) && Objects.equals(propValue, that.propValue) && Objects.equals(functionId, that.functionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceId, profileId, propId, propValue, isFunction, functionId);
    }

    public DictServiceNodeEntity getDictServiceNode() {
        return dictServiceNode;
    }

    public void setDictServiceNode(DictServiceNodeEntity dictServiceNode) {
        this.dictServiceNode = dictServiceNode;
    }

    public MetaPropertyFunctionEntity getMetaPropertyFunctionByFunctionId() {
        return metaPropertyFunctionByFunctionId;
    }

    public void setMetaPropertyFunctionByFunctionId(MetaPropertyFunctionEntity metaPropertyFunctionByFunctionId) {
        this.metaPropertyFunctionByFunctionId = metaPropertyFunctionByFunctionId;
    }
}
