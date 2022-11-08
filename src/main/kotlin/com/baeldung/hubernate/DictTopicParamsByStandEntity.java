package com.baeldung.hubernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "DICT_TOPIC_PARAMS_BY_STAND", schema = "LOCALDEV", catalog = "")
@IdClass(DictTopicParamsByStandEntityPK.class)
public class DictTopicParamsByStandEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "NODE_ID", nullable = false, length = 512)
    private String nodeId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "STAND_ID", nullable = false, length = 256)
    private String standId;
    @Basic
    @Column(name = "CNT_PARTITION", nullable = false, precision = 0)
    private byte cntPartition;
    @Basic
    @Column(name = "TOPIC_NAME", nullable = false, length = 256)
    private String topicName;
    @ManyToOne
    @JoinColumn(name = "NODE_ID", referencedColumnName = "ID", nullable = false)
    private DictTopicNodeEntity dictTopicNodeByNodeId;
    @ManyToOne
    @JoinColumn(name = "STAND_ID", referencedColumnName = "ID", nullable = false)
    private MetaStandEntity metaStandByStandId;

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getStandId() {
        return standId;
    }

    public void setStandId(String standId) {
        this.standId = standId;
    }

    public byte getCntPartition() {
        return cntPartition;
    }

    public void setCntPartition(byte cntPartition) {
        this.cntPartition = cntPartition;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DictTopicParamsByStandEntity that = (DictTopicParamsByStandEntity) o;
        return cntPartition == that.cntPartition && Objects.equals(nodeId, that.nodeId) && Objects.equals(standId, that.standId) && Objects.equals(topicName, that.topicName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId, standId, cntPartition, topicName);
    }

    public DictTopicNodeEntity getDictTopicNodeByNodeId() {
        return dictTopicNodeByNodeId;
    }

    public void setDictTopicNodeByNodeId(DictTopicNodeEntity dictTopicNodeByNodeId) {
        this.dictTopicNodeByNodeId = dictTopicNodeByNodeId;
    }

    public MetaStandEntity getMetaStandByStandId() {
        return metaStandByStandId;
    }

    public void setMetaStandByStandId(MetaStandEntity metaStandByStandId) {
        this.metaStandByStandId = metaStandByStandId;
    }
}
