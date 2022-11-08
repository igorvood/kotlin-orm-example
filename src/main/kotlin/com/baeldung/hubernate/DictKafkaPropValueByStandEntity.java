package com.baeldung.hubernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "DICT_KAFKA_PROP_VALUE_BY_STAND", schema = "LOCALDEV", catalog = "")
@IdClass(DictKafkaPropValueByStandEntityPK.class)
public class DictKafkaPropValueByStandEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "GRP_ID", nullable = false, length = 256)
    private String grpId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "TYPE_PROP", nullable = false, length = 256)
    private String typeProp;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PROP_ID", nullable = false, length = 256)
    private String propId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "STAND_ID", nullable = false, length = 256)
    private String standId;
    @Basic
    @Column(name = "PROP_VALUE", nullable = false, length = 256)
    private String propValue;
    @ManyToOne
    @JoinColumns({@JoinColumn(name = "TYPE_PROP", referencedColumnName = "TYPE_PROP", nullable = false), @JoinColumn(name = "GRP_ID", referencedColumnName = "GRP_ID", nullable = false), @JoinColumn(name = "PROP_ID", referencedColumnName = "PROP_ID", nullable = false)})
    private DictKafkaPropValueEntity dictKafkaPropValue;
    @ManyToOne
    @JoinColumn(name = "STAND_ID", referencedColumnName = "ID", nullable = false)
    private MetaStandEntity metaStandByStandId;

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

    public String getStandId() {
        return standId;
    }

    public void setStandId(String standId) {
        this.standId = standId;
    }

    public String getPropValue() {
        return propValue;
    }

    public void setPropValue(String propValue) {
        this.propValue = propValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DictKafkaPropValueByStandEntity that = (DictKafkaPropValueByStandEntity) o;
        return Objects.equals(grpId, that.grpId) && Objects.equals(typeProp, that.typeProp) && Objects.equals(propId, that.propId) && Objects.equals(standId, that.standId) && Objects.equals(propValue, that.propValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grpId, typeProp, propId, standId, propValue);
    }

    public DictKafkaPropValueEntity getDictKafkaPropValue() {
        return dictKafkaPropValue;
    }

    public void setDictKafkaPropValue(DictKafkaPropValueEntity dictKafkaPropValue) {
        this.dictKafkaPropValue = dictKafkaPropValue;
    }

    public MetaStandEntity getMetaStandByStandId() {
        return metaStandByStandId;
    }

    public void setMetaStandByStandId(MetaStandEntity metaStandByStandId) {
        this.metaStandByStandId = metaStandByStandId;
    }
}
