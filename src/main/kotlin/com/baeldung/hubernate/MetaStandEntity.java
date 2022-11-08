package com.baeldung.hubernate;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "META_STAND", schema = "LOCALDEV", catalog = "")
public class MetaStandEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false, length = 256)
    private String id;
    @Basic
    @Column(name = "DESCRIPTION", nullable = false, length = 512)
    private String description;
    @Basic
    @Column(name = "IS_LOCAL", nullable = false, precision = 0)
    private boolean isLocal;
    @Basic
    @Column(name = "REPLACMENT_FOR_TOPIC_NAME", nullable = false, length = 16)
    private String replacmentForTopicName;
    @Basic
    @Column(name = "CNT_PARTITION", nullable = false, precision = 0)
    private byte cntPartition;
    @OneToMany(mappedBy = "metaStandByStandId")
    private Collection<DictKafkaPropValueByStandEntity> dictKafkaPropValueByStandsById;
    @OneToMany(mappedBy = "metaStandByStandId")
    private Collection<DictPlaceHolderByServiceEntity> dictPlaceHolderByServicesById;
    @OneToMany(mappedBy = "metaStandByStandId")
    private Collection<DictTopicParamsByStandEntity> dictTopicParamsByStandsById;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isLocal() {
        return isLocal;
    }

    public void setLocal(boolean local) {
        isLocal = local;
    }

    public String getReplacmentForTopicName() {
        return replacmentForTopicName;
    }

    public void setReplacmentForTopicName(String replacmentForTopicName) {
        this.replacmentForTopicName = replacmentForTopicName;
    }

    public byte getCntPartition() {
        return cntPartition;
    }

    public void setCntPartition(byte cntPartition) {
        this.cntPartition = cntPartition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MetaStandEntity that = (MetaStandEntity) o;
        return isLocal == that.isLocal && cntPartition == that.cntPartition && Objects.equals(id, that.id) && Objects.equals(description, that.description) && Objects.equals(replacmentForTopicName, that.replacmentForTopicName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, isLocal, replacmentForTopicName, cntPartition);
    }

    public Collection<DictKafkaPropValueByStandEntity> getDictKafkaPropValueByStandsById() {
        return dictKafkaPropValueByStandsById;
    }

    public void setDictKafkaPropValueByStandsById(Collection<DictKafkaPropValueByStandEntity> dictKafkaPropValueByStandsById) {
        this.dictKafkaPropValueByStandsById = dictKafkaPropValueByStandsById;
    }

    public Collection<DictPlaceHolderByServiceEntity> getDictPlaceHolderByServicesById() {
        return dictPlaceHolderByServicesById;
    }

    public void setDictPlaceHolderByServicesById(Collection<DictPlaceHolderByServiceEntity> dictPlaceHolderByServicesById) {
        this.dictPlaceHolderByServicesById = dictPlaceHolderByServicesById;
    }

    public Collection<DictTopicParamsByStandEntity> getDictTopicParamsByStandsById() {
        return dictTopicParamsByStandsById;
    }

    public void setDictTopicParamsByStandsById(Collection<DictTopicParamsByStandEntity> dictTopicParamsByStandsById) {
        this.dictTopicParamsByStandsById = dictTopicParamsByStandsById;
    }
}
