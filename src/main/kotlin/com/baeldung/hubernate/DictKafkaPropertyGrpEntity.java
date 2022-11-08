package com.baeldung.hubernate;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "DICT_KAFKA_PROPERTY_GRP", schema = "LOCALDEV", catalog = "")
@IdClass(DictKafkaPropertyGrpEntityPK.class)
public class DictKafkaPropertyGrpEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false, length = 256)
    private String id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "TYPE_READ", nullable = false, length = 256)
    private String typeRead;
    @Basic
    @Column(name = "DESCRIPTION", nullable = true, length = 512)
    private String description;
    @OneToMany(mappedBy = "dictKafkaPropertyGrp")
    private Collection<DictKafkaPropValueEntity> dictKafkaPropValues;
    @OneToMany(mappedBy = "dictKafkaPropertyGrpByDictTopicNodeProducerFk")
    private Collection<DictTopicNodeEntity> dictTopicNodes;
    @OneToMany(mappedBy = "dictKafkaPropertyGrpByDictTopicNodeConsumerFk")
    private Collection<DictTopicNodeEntity> dictTopicNodes_0;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTypeRead() {
        return typeRead;
    }

    public void setTypeRead(String typeRead) {
        this.typeRead = typeRead;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DictKafkaPropertyGrpEntity that = (DictKafkaPropertyGrpEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(typeRead, that.typeRead) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, typeRead, description);
    }

    public Collection<DictKafkaPropValueEntity> getDictKafkaPropValues() {
        return dictKafkaPropValues;
    }

    public void setDictKafkaPropValues(Collection<DictKafkaPropValueEntity> dictKafkaPropValues) {
        this.dictKafkaPropValues = dictKafkaPropValues;
    }

    public Collection<DictTopicNodeEntity> getDictTopicNodes() {
        return dictTopicNodes;
    }

    public void setDictTopicNodes(Collection<DictTopicNodeEntity> dictTopicNodes) {
        this.dictTopicNodes = dictTopicNodes;
    }

    public Collection<DictTopicNodeEntity> getDictTopicNodes_0() {
        return dictTopicNodes_0;
    }

    public void setDictTopicNodes_0(Collection<DictTopicNodeEntity> dictTopicNodes_0) {
        this.dictTopicNodes_0 = dictTopicNodes_0;
    }
}
