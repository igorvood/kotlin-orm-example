/*
 * This file is generated by jOOQ.
 */
package com.baeldung.jooq.introduction.db.tables.records;


import com.baeldung.jooq.introduction.db.tables.DictTopicNode;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictTopicNodeRecord extends UpdatableRecordImpl<DictTopicNodeRecord> implements Record9<Object, Object, Object, Object, Object, Object, Object, Object, Object> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>LOCALDEV.DICT_TOPIC_NODE.ID</code>.
     */
    public DictTopicNodeRecord setId(Object value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.DICT_TOPIC_NODE.ID</code>.
     */
    public Object getId() {
        return get(0);
    }

    /**
     * Setter for <code>LOCALDEV.DICT_TOPIC_NODE.NODE_TYPE</code>.
     */
    public DictTopicNodeRecord setNodeType(Object value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.DICT_TOPIC_NODE.NODE_TYPE</code>.
     */
    public Object getNodeType() {
        return get(1);
    }

    /**
     * Setter for <code>LOCALDEV.DICT_TOPIC_NODE.IS_OUR</code>.
     */
    public DictTopicNodeRecord setIsOur(Object value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.DICT_TOPIC_NODE.IS_OUR</code>.
     */
    public Object getIsOur() {
        return get(2);
    }

    /**
     * Setter for <code>LOCALDEV.DICT_TOPIC_NODE.PRODUCER_PROP_GRP</code>.
     */
    public DictTopicNodeRecord setProducerPropGrp(Object value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.DICT_TOPIC_NODE.PRODUCER_PROP_GRP</code>.
     */
    public Object getProducerPropGrp() {
        return get(3);
    }

    /**
     * Setter for <code>LOCALDEV.DICT_TOPIC_NODE.PRODUCER_PROP_GRP_REF</code>.
     */
    public DictTopicNodeRecord setProducerPropGrpRef(Object value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.DICT_TOPIC_NODE.PRODUCER_PROP_GRP_REF</code>.
     */
    public Object getProducerPropGrpRef() {
        return get(4);
    }

    /**
     * Setter for <code>LOCALDEV.DICT_TOPIC_NODE.PRD_TYPE</code>.
     */
    public DictTopicNodeRecord setPrdType(Object value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.DICT_TOPIC_NODE.PRD_TYPE</code>.
     */
    public Object getPrdType() {
        return get(5);
    }

    /**
     * Setter for <code>LOCALDEV.DICT_TOPIC_NODE.CONSUMER_PROP_GRP</code>.
     */
    public DictTopicNodeRecord setConsumerPropGrp(Object value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.DICT_TOPIC_NODE.CONSUMER_PROP_GRP</code>.
     */
    public Object getConsumerPropGrp() {
        return get(6);
    }

    /**
     * Setter for <code>LOCALDEV.DICT_TOPIC_NODE.CONSUMER_PROP_GRP_REF</code>.
     */
    public DictTopicNodeRecord setConsumerPropGrpRef(Object value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.DICT_TOPIC_NODE.CONSUMER_PROP_GRP_REF</code>.
     */
    public Object getConsumerPropGrpRef() {
        return get(7);
    }

    /**
     * Setter for <code>LOCALDEV.DICT_TOPIC_NODE.CNS_TYPE</code>.
     */
    public DictTopicNodeRecord setCnsType(Object value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.DICT_TOPIC_NODE.CNS_TYPE</code>.
     */
    public Object getCnsType() {
        return get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Object> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Object, Object, Object, Object, Object, Object, Object, Object, Object> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Object, Object, Object, Object, Object, Object, Object, Object, Object> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Object> field1() {
        return DictTopicNode.DICT_TOPIC_NODE.ID;
    }

    @Override
    public Field<Object> field2() {
        return DictTopicNode.DICT_TOPIC_NODE.NODE_TYPE;
    }

    @Override
    public Field<Object> field3() {
        return DictTopicNode.DICT_TOPIC_NODE.IS_OUR;
    }

    @Override
    public Field<Object> field4() {
        return DictTopicNode.DICT_TOPIC_NODE.PRODUCER_PROP_GRP;
    }

    @Override
    public Field<Object> field5() {
        return DictTopicNode.DICT_TOPIC_NODE.PRODUCER_PROP_GRP_REF;
    }

    @Override
    public Field<Object> field6() {
        return DictTopicNode.DICT_TOPIC_NODE.PRD_TYPE;
    }

    @Override
    public Field<Object> field7() {
        return DictTopicNode.DICT_TOPIC_NODE.CONSUMER_PROP_GRP;
    }

    @Override
    public Field<Object> field8() {
        return DictTopicNode.DICT_TOPIC_NODE.CONSUMER_PROP_GRP_REF;
    }

    @Override
    public Field<Object> field9() {
        return DictTopicNode.DICT_TOPIC_NODE.CNS_TYPE;
    }

    @Override
    public Object component1() {
        return getId();
    }

    @Override
    public Object component2() {
        return getNodeType();
    }

    @Override
    public Object component3() {
        return getIsOur();
    }

    @Override
    public Object component4() {
        return getProducerPropGrp();
    }

    @Override
    public Object component5() {
        return getProducerPropGrpRef();
    }

    @Override
    public Object component6() {
        return getPrdType();
    }

    @Override
    public Object component7() {
        return getConsumerPropGrp();
    }

    @Override
    public Object component8() {
        return getConsumerPropGrpRef();
    }

    @Override
    public Object component9() {
        return getCnsType();
    }

    @Override
    public Object value1() {
        return getId();
    }

    @Override
    public Object value2() {
        return getNodeType();
    }

    @Override
    public Object value3() {
        return getIsOur();
    }

    @Override
    public Object value4() {
        return getProducerPropGrp();
    }

    @Override
    public Object value5() {
        return getProducerPropGrpRef();
    }

    @Override
    public Object value6() {
        return getPrdType();
    }

    @Override
    public Object value7() {
        return getConsumerPropGrp();
    }

    @Override
    public Object value8() {
        return getConsumerPropGrpRef();
    }

    @Override
    public Object value9() {
        return getCnsType();
    }

    @Override
    public DictTopicNodeRecord value1(Object value) {
        setId(value);
        return this;
    }

    @Override
    public DictTopicNodeRecord value2(Object value) {
        setNodeType(value);
        return this;
    }

    @Override
    public DictTopicNodeRecord value3(Object value) {
        setIsOur(value);
        return this;
    }

    @Override
    public DictTopicNodeRecord value4(Object value) {
        setProducerPropGrp(value);
        return this;
    }

    @Override
    public DictTopicNodeRecord value5(Object value) {
        setProducerPropGrpRef(value);
        return this;
    }

    @Override
    public DictTopicNodeRecord value6(Object value) {
        setPrdType(value);
        return this;
    }

    @Override
    public DictTopicNodeRecord value7(Object value) {
        setConsumerPropGrp(value);
        return this;
    }

    @Override
    public DictTopicNodeRecord value8(Object value) {
        setConsumerPropGrpRef(value);
        return this;
    }

    @Override
    public DictTopicNodeRecord value9(Object value) {
        setCnsType(value);
        return this;
    }

    @Override
    public DictTopicNodeRecord values(Object value1, Object value2, Object value3, Object value4, Object value5, Object value6, Object value7, Object value8, Object value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DictTopicNodeRecord
     */
    public DictTopicNodeRecord() {
        super(DictTopicNode.DICT_TOPIC_NODE);
    }

    /**
     * Create a detached, initialised DictTopicNodeRecord
     */
    public DictTopicNodeRecord(Object id, Object nodeType, Object isOur, Object producerPropGrp, Object producerPropGrpRef, Object prdType, Object consumerPropGrp, Object consumerPropGrpRef, Object cnsType) {
        super(DictTopicNode.DICT_TOPIC_NODE);

        setId(id);
        setNodeType(nodeType);
        setIsOur(isOur);
        setProducerPropGrp(producerPropGrp);
        setProducerPropGrpRef(producerPropGrpRef);
        setPrdType(prdType);
        setConsumerPropGrp(consumerPropGrp);
        setConsumerPropGrpRef(consumerPropGrpRef);
        setCnsType(cnsType);
    }
}
