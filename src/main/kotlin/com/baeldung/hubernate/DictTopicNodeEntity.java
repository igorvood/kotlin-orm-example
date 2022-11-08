package com.baeldung.hubernate;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "DICT_TOPIC_NODE", schema = "LOCALDEV", catalog = "")
public class DictTopicNodeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false, length = 512)
    private String id;
    @Basic
    @Column(name = "NODE_TYPE", nullable = false, length = 32)
    private String nodeType;
    @Basic
    @Column(name = "IS_OUR", nullable = false, precision = 0)
    private boolean isOur;
    @Basic
    @Column(name = "PRODUCER_PROP_GRP", nullable = true, length = 256)
    private String producerPropGrp;
    @Basic
    @Column(name = "PRODUCER_PROP_GRP_REF", nullable = false, length = 256)
    private String producerPropGrpRef;
    @Basic
    @Column(name = "PRD_TYPE", nullable = false, length = 256)
    private String prdType;
    @Basic
    @Column(name = "CONSUMER_PROP_GRP", nullable = true, length = 256)
    private String consumerPropGrp;
    @Basic
    @Column(name = "CONSUMER_PROP_GRP_REF", nullable = false, length = 256)
    private String consumerPropGrpRef;
    @Basic
    @Column(name = "CNS_TYPE", nullable = false, length = 256)
    private String cnsType;
    @ManyToOne
    @JoinColumns({@JoinColumn(name = "PRD_TYPE", referencedColumnName = "TYPE_READ", nullable = false), @JoinColumn(name = "PRODUCER_PROP_GRP_REF", referencedColumnName = "ID", nullable = false)})
    private DictKafkaPropertyGrpEntity dictKafkaPropertyGrpByDictTopicNodeProducerFk;
    @ManyToOne
    @JoinColumns({@JoinColumn(name = "CNS_TYPE", referencedColumnName = "TYPE_READ", nullable = false), @JoinColumn(name = "CONSUMER_PROP_GRP_REF", referencedColumnName = "ID", nullable = false)})
    private DictKafkaPropertyGrpEntity dictKafkaPropertyGrpByDictTopicNodeConsumerFk;
    @OneToMany(mappedBy = "dictTopicNodeByNodeId")
    private Collection<DictTopicParamsByStandEntity> dictTopicParamsByStandsById;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public boolean isOur() {
        return isOur;
    }

    public void setOur(boolean our) {
        isOur = our;
    }

    public String getProducerPropGrp() {
        return producerPropGrp;
    }

    public void setProducerPropGrp(String producerPropGrp) {
        this.producerPropGrp = producerPropGrp;
    }

    public String getProducerPropGrpRef() {
        return producerPropGrpRef;
    }

    public void setProducerPropGrpRef(String producerPropGrpRef) {
        this.producerPropGrpRef = producerPropGrpRef;
    }

    public String getPrdType() {
        return prdType;
    }

    public void setPrdType(String prdType) {
        this.prdType = prdType;
    }

    public String getConsumerPropGrp() {
        return consumerPropGrp;
    }

    public void setConsumerPropGrp(String consumerPropGrp) {
        this.consumerPropGrp = consumerPropGrp;
    }

    public String getConsumerPropGrpRef() {
        return consumerPropGrpRef;
    }

    public void setConsumerPropGrpRef(String consumerPropGrpRef) {
        this.consumerPropGrpRef = consumerPropGrpRef;
    }

    public String getCnsType() {
        return cnsType;
    }

    public void setCnsType(String cnsType) {
        this.cnsType = cnsType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DictTopicNodeEntity that = (DictTopicNodeEntity) o;
        return isOur == that.isOur && Objects.equals(id, that.id) && Objects.equals(nodeType, that.nodeType) && Objects.equals(producerPropGrp, that.producerPropGrp) && Objects.equals(producerPropGrpRef, that.producerPropGrpRef) && Objects.equals(prdType, that.prdType) && Objects.equals(consumerPropGrp, that.consumerPropGrp) && Objects.equals(consumerPropGrpRef, that.consumerPropGrpRef) && Objects.equals(cnsType, that.cnsType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nodeType, isOur, producerPropGrp, producerPropGrpRef, prdType, consumerPropGrp, consumerPropGrpRef, cnsType);
    }

    public DictKafkaPropertyGrpEntity getDictKafkaPropertyGrpByDictTopicNodeProducerFk() {
        return dictKafkaPropertyGrpByDictTopicNodeProducerFk;
    }

    public void setDictKafkaPropertyGrpByDictTopicNodeProducerFk(DictKafkaPropertyGrpEntity dictKafkaPropertyGrpByDictTopicNodeProducerFk) {
        this.dictKafkaPropertyGrpByDictTopicNodeProducerFk = dictKafkaPropertyGrpByDictTopicNodeProducerFk;
    }

    public DictKafkaPropertyGrpEntity getDictKafkaPropertyGrpByDictTopicNodeConsumerFk() {
        return dictKafkaPropertyGrpByDictTopicNodeConsumerFk;
    }

    public void setDictKafkaPropertyGrpByDictTopicNodeConsumerFk(DictKafkaPropertyGrpEntity dictKafkaPropertyGrpByDictTopicNodeConsumerFk) {
        this.dictKafkaPropertyGrpByDictTopicNodeConsumerFk = dictKafkaPropertyGrpByDictTopicNodeConsumerFk;
    }

    public Collection<DictTopicParamsByStandEntity> getDictTopicParamsByStandsById() {
        return dictTopicParamsByStandsById;
    }

    public void setDictTopicParamsByStandsById(Collection<DictTopicParamsByStandEntity> dictTopicParamsByStandsById) {
        this.dictTopicParamsByStandsById = dictTopicParamsByStandsById;
    }
}
