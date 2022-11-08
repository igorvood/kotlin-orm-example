package com.baeldung.hubernate;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "DICT_ABSTRACT_GRAPH_NODE", schema = "LOCALDEV", catalog = "")
@IdClass(DictAbstractGraphNodeEntityPK.class)
public class DictAbstractGraphNodeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "GRAPH_ID", nullable = false, length = 256)
    private String graphId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "NODE_TYPE", nullable = false, length = 32)
    private String nodeType;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "NODE_ID", nullable = false, length = 512)
    private String nodeId;
    @OneToMany(mappedBy = "dictAbstractGraphNodeByDictArrowBegFk")
    private Collection<DictArrowEntity> dictArrows;
    @OneToMany(mappedBy = "dictAbstractGraphNodeByDictArrowEndFk")
    private Collection<DictArrowEntity> dictArrows_0;
    @ManyToOne
    @JoinColumns({@JoinColumn(name = "NODE_TYPE", referencedColumnName = "NODE_TYPE", nullable = false), @JoinColumn(name = "NODE_ID", referencedColumnName = "ID", nullable = false)})
    private DictServiceNodeEntity dictServiceNode;
    @ManyToOne
    @JoinColumns({@JoinColumn(name = "NODE_TYPE", referencedColumnName = "NODE_TYPE", nullable = false), @JoinColumn(name = "NODE_ID", referencedColumnName = "ID", nullable = false)})
    private DictTopicNodeEntity dictTopicNode;

    public String getGraphId() {
        return graphId;
    }

    public void setGraphId(String graphId) {
        this.graphId = graphId;
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DictAbstractGraphNodeEntity that = (DictAbstractGraphNodeEntity) o;
        return Objects.equals(graphId, that.graphId) && Objects.equals(nodeType, that.nodeType) && Objects.equals(nodeId, that.nodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(graphId, nodeType, nodeId);
    }

    public Collection<DictArrowEntity> getDictArrows() {
        return dictArrows;
    }

    public void setDictArrows(Collection<DictArrowEntity> dictArrows) {
        this.dictArrows = dictArrows;
    }

    public Collection<DictArrowEntity> getDictArrows_0() {
        return dictArrows_0;
    }

    public void setDictArrows_0(Collection<DictArrowEntity> dictArrows_0) {
        this.dictArrows_0 = dictArrows_0;
    }

    public DictServiceNodeEntity getDictServiceNode() {
        return dictServiceNode;
    }

    public void setDictServiceNode(DictServiceNodeEntity dictServiceNode) {
        this.dictServiceNode = dictServiceNode;
    }

    public DictTopicNodeEntity getDictTopicNode() {
        return dictTopicNode;
    }

    public void setDictTopicNode(DictTopicNodeEntity dictTopicNode) {
        this.dictTopicNode = dictTopicNode;
    }
}
