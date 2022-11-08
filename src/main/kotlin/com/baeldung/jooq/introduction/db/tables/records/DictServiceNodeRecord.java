/*
 * This file is generated by jOOQ.
 */
package com.baeldung.jooq.introduction.db.tables.records;


import com.baeldung.jooq.introduction.db.tables.DictServiceNode;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictServiceNodeRecord extends UpdatableRecordImpl<DictServiceNodeRecord> implements Record4<Object, Object, Object, Object> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>LOCALDEV.DICT_SERVICE_NODE.SERVICE_ID</code>.
     */
    public DictServiceNodeRecord setServiceId(Object value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.DICT_SERVICE_NODE.SERVICE_ID</code>.
     */
    public Object getServiceId() {
        return get(0);
    }

    /**
     * Setter for <code>LOCALDEV.DICT_SERVICE_NODE.PROFILE_ID</code>.
     */
    public DictServiceNodeRecord setProfileId(Object value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.DICT_SERVICE_NODE.PROFILE_ID</code>.
     */
    public Object getProfileId() {
        return get(1);
    }

    /**
     * Setter for <code>LOCALDEV.DICT_SERVICE_NODE.NODE_TYPE</code>.
     */
    public DictServiceNodeRecord setNodeType(Object value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.DICT_SERVICE_NODE.NODE_TYPE</code>.
     */
    public Object getNodeType() {
        return get(2);
    }

    /**
     * Setter for <code>LOCALDEV.DICT_SERVICE_NODE.ID</code>.
     */
    public DictServiceNodeRecord setId(Object value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.DICT_SERVICE_NODE.ID</code>.
     */
    public Object getId() {
        return get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Object, Object> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Object, Object, Object, Object> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Object, Object, Object, Object> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Object> field1() {
        return DictServiceNode.DICT_SERVICE_NODE.SERVICE_ID;
    }

    @Override
    public Field<Object> field2() {
        return DictServiceNode.DICT_SERVICE_NODE.PROFILE_ID;
    }

    @Override
    public Field<Object> field3() {
        return DictServiceNode.DICT_SERVICE_NODE.NODE_TYPE;
    }

    @Override
    public Field<Object> field4() {
        return DictServiceNode.DICT_SERVICE_NODE.ID;
    }

    @Override
    public Object component1() {
        return getServiceId();
    }

    @Override
    public Object component2() {
        return getProfileId();
    }

    @Override
    public Object component3() {
        return getNodeType();
    }

    @Override
    public Object component4() {
        return getId();
    }

    @Override
    public Object value1() {
        return getServiceId();
    }

    @Override
    public Object value2() {
        return getProfileId();
    }

    @Override
    public Object value3() {
        return getNodeType();
    }

    @Override
    public Object value4() {
        return getId();
    }

    @Override
    public DictServiceNodeRecord value1(Object value) {
        setServiceId(value);
        return this;
    }

    @Override
    public DictServiceNodeRecord value2(Object value) {
        setProfileId(value);
        return this;
    }

    @Override
    public DictServiceNodeRecord value3(Object value) {
        setNodeType(value);
        return this;
    }

    @Override
    public DictServiceNodeRecord value4(Object value) {
        setId(value);
        return this;
    }

    @Override
    public DictServiceNodeRecord values(Object value1, Object value2, Object value3, Object value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DictServiceNodeRecord
     */
    public DictServiceNodeRecord() {
        super(DictServiceNode.DICT_SERVICE_NODE);
    }

    /**
     * Create a detached, initialised DictServiceNodeRecord
     */
    public DictServiceNodeRecord(Object serviceId, Object profileId, Object nodeType, Object id) {
        super(DictServiceNode.DICT_SERVICE_NODE);

        setServiceId(serviceId);
        setProfileId(profileId);
        setNodeType(nodeType);
        setId(id);
    }
}