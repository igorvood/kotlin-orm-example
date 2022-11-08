package com.baeldung.hubernate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class DictTopicParamsByStandEntityPK implements Serializable {
    @Column(name = "NODE_ID", nullable = false, length = 512)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nodeId;
    @Column(name = "STAND_ID", nullable = false, length = 256)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String standId;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DictTopicParamsByStandEntityPK that = (DictTopicParamsByStandEntityPK) o;
        return Objects.equals(nodeId, that.nodeId) && Objects.equals(standId, that.standId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId, standId);
    }
}
