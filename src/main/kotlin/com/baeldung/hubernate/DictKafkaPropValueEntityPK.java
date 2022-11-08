package com.baeldung.hubernate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class DictKafkaPropValueEntityPK implements Serializable {
    @Column(name = "GRP_ID", nullable = false, length = 256)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String grpId;
    @Column(name = "TYPE_PROP", nullable = false, length = 256)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String typeProp;
    @Column(name = "PROP_ID", nullable = false, length = 256)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String propId;

    public String getGrpId() {
        return grpId;
    }

    public void setGrpId(String grpId) {
        this.grpId = grpId;
    }

    public String getTypeProp() {
        return typeProp;
    }

    public void setTypeProp(String typeProp) {
        this.typeProp = typeProp;
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
        DictKafkaPropValueEntityPK that = (DictKafkaPropValueEntityPK) o;
        return Objects.equals(grpId, that.grpId) && Objects.equals(typeProp, that.typeProp) && Objects.equals(propId, that.propId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grpId, typeProp, propId);
    }
}
