package com.baeldung.hubernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "DICT_ARROW", schema = "LOCALDEV", catalog = "")
@IdClass(DictArrowEntityPK.class)
public class DictArrowEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "GRAPH_ID", nullable = false, length = 256)
    private String graphId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "BEG_NODE_TYPE", nullable = false, length = 32)
    private String begNodeType;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "BEG_NODE_ID", nullable = false, length = 512)
    private String begNodeId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "END_NODE_TYPE", nullable = false, length = 32)
    private String endNodeType;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "END_NODE_ID", nullable = false, length = 512)
    private String endNodeId;
    @Basic
    @Column(name = "PROPERTY_KEY", nullable = false, length = 256)
    private String propertyKey;
    @Basic
    @Column(name = "FLINK_SRV", nullable = false, length = 512)
    private String flinkSrv;
    @ManyToOne
    @JoinColumns({@JoinColumn(name = "GRAPH_ID", referencedColumnName = "GRAPH_ID", nullable = false), @JoinColumn(name = "BEG_NODE_TYPE", referencedColumnName = "NODE_TYPE", nullable = false), @JoinColumn(name = "BEG_NODE_ID", referencedColumnName = "NODE_ID", nullable = false)})
    private DictAbstractGraphNodeEntity dictAbstractGraphNodeByDictArrowBegFk;
    @ManyToOne
    @JoinColumns({@JoinColumn(name = "GRAPH_ID", referencedColumnName = "GRAPH_ID", nullable = false), @JoinColumn(name = "END_NODE_TYPE", referencedColumnName = "NODE_TYPE", nullable = false), @JoinColumn(name = "END_NODE_ID", referencedColumnName = "NODE_ID", nullable = false)})
    private DictAbstractGraphNodeEntity dictAbstractGraphNodeByDictArrowEndFk;

    public String getGraphId() {
        return graphId;
    }

    public void setGraphId(String graphId) {
        this.graphId = graphId;
    }

    public String getBegNodeType() {
        return begNodeType;
    }

    public void setBegNodeType(String begNodeType) {
        this.begNodeType = begNodeType;
    }

    public String getBegNodeId() {
        return begNodeId;
    }

    public void setBegNodeId(String begNodeId) {
        this.begNodeId = begNodeId;
    }

    public String getEndNodeType() {
        return endNodeType;
    }

    public void setEndNodeType(String endNodeType) {
        this.endNodeType = endNodeType;
    }

    public String getEndNodeId() {
        return endNodeId;
    }

    public void setEndNodeId(String endNodeId) {
        this.endNodeId = endNodeId;
    }

    public String getPropertyKey() {
        return propertyKey;
    }

    public void setPropertyKey(String propertyKey) {
        this.propertyKey = propertyKey;
    }

    public String getFlinkSrv() {
        return flinkSrv;
    }

    public void setFlinkSrv(String flinkSrv) {
        this.flinkSrv = flinkSrv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DictArrowEntity that = (DictArrowEntity) o;
        return Objects.equals(graphId, that.graphId) && Objects.equals(begNodeType, that.begNodeType) && Objects.equals(begNodeId, that.begNodeId) && Objects.equals(endNodeType, that.endNodeType) && Objects.equals(endNodeId, that.endNodeId) && Objects.equals(propertyKey, that.propertyKey) && Objects.equals(flinkSrv, that.flinkSrv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(graphId, begNodeType, begNodeId, endNodeType, endNodeId, propertyKey, flinkSrv);
    }

    public DictAbstractGraphNodeEntity getDictAbstractGraphNodeByDictArrowBegFk() {
        return dictAbstractGraphNodeByDictArrowBegFk;
    }

    public void setDictAbstractGraphNodeByDictArrowBegFk(DictAbstractGraphNodeEntity dictAbstractGraphNodeByDictArrowBegFk) {
        this.dictAbstractGraphNodeByDictArrowBegFk = dictAbstractGraphNodeByDictArrowBegFk;
    }

    public DictAbstractGraphNodeEntity getDictAbstractGraphNodeByDictArrowEndFk() {
        return dictAbstractGraphNodeByDictArrowEndFk;
    }

    public void setDictAbstractGraphNodeByDictArrowEndFk(DictAbstractGraphNodeEntity dictAbstractGraphNodeByDictArrowEndFk) {
        this.dictAbstractGraphNodeByDictArrowEndFk = dictAbstractGraphNodeByDictArrowEndFk;
    }
}
