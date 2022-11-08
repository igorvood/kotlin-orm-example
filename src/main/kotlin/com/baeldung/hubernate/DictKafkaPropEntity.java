package com.baeldung.hubernate;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "DICT_KAFKA_PROP", schema = "LOCALDEV", catalog = "")
@IdClass(DictKafkaPropEntityPK.class)
public class DictKafkaPropEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "TYPE_PROP", nullable = false, length = 256)
    private String typeProp;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PROP_ID", nullable = false, length = 256)
    private String propId;
    @OneToMany(mappedBy = "dictKafkaProp")
    private Collection<DictKafkaPropValueEntity> dictKafkaPropValues;

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
        DictKafkaPropEntity that = (DictKafkaPropEntity) o;
        return Objects.equals(typeProp, that.typeProp) && Objects.equals(propId, that.propId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeProp, propId);
    }

    public Collection<DictKafkaPropValueEntity> getDictKafkaPropValues() {
        return dictKafkaPropValues;
    }

    public void setDictKafkaPropValues(Collection<DictKafkaPropValueEntity> dictKafkaPropValues) {
        this.dictKafkaPropValues = dictKafkaPropValues;
    }
}
