/*
 * This file is generated by jOOQ.
 */
package com.baeldung.jooq.introduction.db.tables.records;


import com.baeldung.jooq.introduction.db.tables.DictArrow;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictArrowRecord extends UpdatableRecordImpl<DictArrowRecord> implements Record7<Object, Object, Object, Object, Object, Object, Object> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>LOCALDEV.DICT_ARROW.GRAPH_ID</code>.
     */
    public DictArrowRecord setGraphId(Object value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.DICT_ARROW.GRAPH_ID</code>.
     */
    public Object getGraphId() {
        return get(0);
    }

    /**
     * Setter for <code>LOCALDEV.DICT_ARROW.BEG_NODE_TYPE</code>.
     */
    public DictArrowRecord setBegNodeType(Object value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.DICT_ARROW.BEG_NODE_TYPE</code>.
     */
    public Object getBegNodeType() {
        return get(1);
    }

    /**
     * Setter for <code>LOCALDEV.DICT_ARROW.BEG_NODE_ID</code>.
     */
    public DictArrowRecord setBegNodeId(Object value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.DICT_ARROW.BEG_NODE_ID</code>.
     */
    public Object getBegNodeId() {
        return get(2);
    }

    /**
     * Setter for <code>LOCALDEV.DICT_ARROW.END_NODE_TYPE</code>.
     */
    public DictArrowRecord setEndNodeType(Object value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.DICT_ARROW.END_NODE_TYPE</code>.
     */
    public Object getEndNodeType() {
        return get(3);
    }

    /**
     * Setter for <code>LOCALDEV.DICT_ARROW.END_NODE_ID</code>.
     */
    public DictArrowRecord setEndNodeId(Object value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.DICT_ARROW.END_NODE_ID</code>.
     */
    public Object getEndNodeId() {
        return get(4);
    }

    /**
     * Setter for <code>LOCALDEV.DICT_ARROW.PROPERTY_KEY</code>.
     */
    public DictArrowRecord setPropertyKey(Object value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.DICT_ARROW.PROPERTY_KEY</code>.
     */
    public Object getPropertyKey() {
        return get(5);
    }

    /**
     * Setter for <code>LOCALDEV.DICT_ARROW.FLINK_SRV</code>.
     */
    public DictArrowRecord setFlinkSrv(Object value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.DICT_ARROW.FLINK_SRV</code>.
     */
    public Object getFlinkSrv() {
        return get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record5<Object, Object, Object, Object, Object> key() {
        return (Record5) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Object, Object, Object, Object, Object, Object, Object> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Object, Object, Object, Object, Object, Object, Object> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Object> field1() {
        return DictArrow.DICT_ARROW.GRAPH_ID;
    }

    @Override
    public Field<Object> field2() {
        return DictArrow.DICT_ARROW.BEG_NODE_TYPE;
    }

    @Override
    public Field<Object> field3() {
        return DictArrow.DICT_ARROW.BEG_NODE_ID;
    }

    @Override
    public Field<Object> field4() {
        return DictArrow.DICT_ARROW.END_NODE_TYPE;
    }

    @Override
    public Field<Object> field5() {
        return DictArrow.DICT_ARROW.END_NODE_ID;
    }

    @Override
    public Field<Object> field6() {
        return DictArrow.DICT_ARROW.PROPERTY_KEY;
    }

    @Override
    public Field<Object> field7() {
        return DictArrow.DICT_ARROW.FLINK_SRV;
    }

    @Override
    public Object component1() {
        return getGraphId();
    }

    @Override
    public Object component2() {
        return getBegNodeType();
    }

    @Override
    public Object component3() {
        return getBegNodeId();
    }

    @Override
    public Object component4() {
        return getEndNodeType();
    }

    @Override
    public Object component5() {
        return getEndNodeId();
    }

    @Override
    public Object component6() {
        return getPropertyKey();
    }

    @Override
    public Object component7() {
        return getFlinkSrv();
    }

    @Override
    public Object value1() {
        return getGraphId();
    }

    @Override
    public Object value2() {
        return getBegNodeType();
    }

    @Override
    public Object value3() {
        return getBegNodeId();
    }

    @Override
    public Object value4() {
        return getEndNodeType();
    }

    @Override
    public Object value5() {
        return getEndNodeId();
    }

    @Override
    public Object value6() {
        return getPropertyKey();
    }

    @Override
    public Object value7() {
        return getFlinkSrv();
    }

    @Override
    public DictArrowRecord value1(Object value) {
        setGraphId(value);
        return this;
    }

    @Override
    public DictArrowRecord value2(Object value) {
        setBegNodeType(value);
        return this;
    }

    @Override
    public DictArrowRecord value3(Object value) {
        setBegNodeId(value);
        return this;
    }

    @Override
    public DictArrowRecord value4(Object value) {
        setEndNodeType(value);
        return this;
    }

    @Override
    public DictArrowRecord value5(Object value) {
        setEndNodeId(value);
        return this;
    }

    @Override
    public DictArrowRecord value6(Object value) {
        setPropertyKey(value);
        return this;
    }

    @Override
    public DictArrowRecord value7(Object value) {
        setFlinkSrv(value);
        return this;
    }

    @Override
    public DictArrowRecord values(Object value1, Object value2, Object value3, Object value4, Object value5, Object value6, Object value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DictArrowRecord
     */
    public DictArrowRecord() {
        super(DictArrow.DICT_ARROW);
    }

    /**
     * Create a detached, initialised DictArrowRecord
     */
    public DictArrowRecord(Object graphId, Object begNodeType, Object begNodeId, Object endNodeType, Object endNodeId, Object propertyKey, Object flinkSrv) {
        super(DictArrow.DICT_ARROW);

        setGraphId(graphId);
        setBegNodeType(begNodeType);
        setBegNodeId(begNodeId);
        setEndNodeType(endNodeType);
        setEndNodeId(endNodeId);
        setPropertyKey(propertyKey);
        setFlinkSrv(flinkSrv);
    }
}
