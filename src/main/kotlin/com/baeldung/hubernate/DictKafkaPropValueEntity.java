package com.baeldung.hubernate;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "DICT_KAFKA_PROP_VALUE", schema = "LOCALDEV", catalog = "")
@IdClass(DictKafkaPropValueEntityPK.class)
public class DictKafkaPropValueEntity {
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
    @Basic
    @Column(name = "PROP_VALUE", nullable = false, length = 256)
    private String propValue;
    @ManyToOne
    @JoinColumns({@JoinColumn(name = "TYPE_PROP", referencedColumnName = "TYPE_READ", nullable = false), @JoinColumn(name = "GRP_ID", referencedColumnName = "ID", nullable = false)})
    private DictKafkaPropertyGrpEntity dictKafkaPropertyGrp;
    @ManyToOne
    @JoinColumns({@JoinColumn(name = "TYPE_PROP", referencedColumnName = "TYPE_PROP", nullable = false), @JoinColumn(name = "PROP_ID", referencedColumnName = "PROP_ID", nullable = false)})
    private DictKafkaPropEntity dictKafkaProp;
    @OneToMany(mappedBy = "dictKafkaPropValue")
    private Collection<DictKafkaPropValueByStandEntity> dictKafkaPropValueByStands;

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
        DictKafkaPropValueEntity that = (DictKafkaPropValueEntity) o;
        return Objects.equals(grpId, that.grpId) && Objects.equals(typeProp, that.typeProp) && Objects.equals(propId, that.propId) && Objects.equals(propValue, that.propValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grpId, typeProp, propId, propValue);
    }

    public DictKafkaPropertyGrpEntity getDictKafkaPropertyGrp() {
        return dictKafkaPropertyGrp;
    }

    public void setDictKafkaPropertyGrp(DictKafkaPropertyGrpEntity dictKafkaPropertyGrp) {
        this.dictKafkaPropertyGrp = dictKafkaPropertyGrp;
    }

    public DictKafkaPropEntity getDictKafkaProp() {
        return dictKafkaProp;
    }

    public void setDictKafkaProp(DictKafkaPropEntity dictKafkaProp) {
        this.dictKafkaProp = dictKafkaProp;
    }

    public Collection<DictKafkaPropValueByStandEntity> getDictKafkaPropValueByStands() {
        return dictKafkaPropValueByStands;
    }

    public void setDictKafkaPropValueByStands(Collection<DictKafkaPropValueByStandEntity> dictKafkaPropValueByStands) {
        this.dictKafkaPropValueByStands = dictKafkaPropValueByStands;
    }
}
