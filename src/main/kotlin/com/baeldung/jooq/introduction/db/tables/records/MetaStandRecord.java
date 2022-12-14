/*
 * This file is generated by jOOQ.
 */
package com.baeldung.jooq.introduction.db.tables.records;


import com.baeldung.jooq.introduction.db.tables.MetaStand;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MetaStandRecord extends UpdatableRecordImpl<MetaStandRecord> implements Record5<Object, Object, Object, Object, Object> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>LOCALDEV.META_STAND.ID</code>.
     */
    public MetaStandRecord setId(Object value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.META_STAND.ID</code>.
     */
    public Object getId() {
        return get(0);
    }

    /**
     * Setter for <code>LOCALDEV.META_STAND.DESCRIPTION</code>.
     */
    public MetaStandRecord setDescription(Object value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.META_STAND.DESCRIPTION</code>.
     */
    public Object getDescription() {
        return get(1);
    }

    /**
     * Setter for <code>LOCALDEV.META_STAND.IS_LOCAL</code>.
     */
    public MetaStandRecord setIsLocal(Object value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.META_STAND.IS_LOCAL</code>.
     */
    public Object getIsLocal() {
        return get(2);
    }

    /**
     * Setter for <code>LOCALDEV.META_STAND.REPLACMENT_FOR_TOPIC_NAME</code>.
     */
    public MetaStandRecord setReplacmentForTopicName(Object value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.META_STAND.REPLACMENT_FOR_TOPIC_NAME</code>.
     */
    public Object getReplacmentForTopicName() {
        return get(3);
    }

    /**
     * Setter for <code>LOCALDEV.META_STAND.CNT_PARTITION</code>.
     */
    public MetaStandRecord setCntPartition(Object value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.META_STAND.CNT_PARTITION</code>.
     */
    public Object getCntPartition() {
        return get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Object> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Object, Object, Object, Object, Object> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Object, Object, Object, Object, Object> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Object> field1() {
        return MetaStand.META_STAND.ID;
    }

    @Override
    public Field<Object> field2() {
        return MetaStand.META_STAND.DESCRIPTION;
    }

    @Override
    public Field<Object> field3() {
        return MetaStand.META_STAND.IS_LOCAL;
    }

    @Override
    public Field<Object> field4() {
        return MetaStand.META_STAND.REPLACMENT_FOR_TOPIC_NAME;
    }

    @Override
    public Field<Object> field5() {
        return MetaStand.META_STAND.CNT_PARTITION;
    }

    @Override
    public Object component1() {
        return getId();
    }

    @Override
    public Object component2() {
        return getDescription();
    }

    @Override
    public Object component3() {
        return getIsLocal();
    }

    @Override
    public Object component4() {
        return getReplacmentForTopicName();
    }

    @Override
    public Object component5() {
        return getCntPartition();
    }

    @Override
    public Object value1() {
        return getId();
    }

    @Override
    public Object value2() {
        return getDescription();
    }

    @Override
    public Object value3() {
        return getIsLocal();
    }

    @Override
    public Object value4() {
        return getReplacmentForTopicName();
    }

    @Override
    public Object value5() {
        return getCntPartition();
    }

    @Override
    public MetaStandRecord value1(Object value) {
        setId(value);
        return this;
    }

    @Override
    public MetaStandRecord value2(Object value) {
        setDescription(value);
        return this;
    }

    @Override
    public MetaStandRecord value3(Object value) {
        setIsLocal(value);
        return this;
    }

    @Override
    public MetaStandRecord value4(Object value) {
        setReplacmentForTopicName(value);
        return this;
    }

    @Override
    public MetaStandRecord value5(Object value) {
        setCntPartition(value);
        return this;
    }

    @Override
    public MetaStandRecord values(Object value1, Object value2, Object value3, Object value4, Object value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MetaStandRecord
     */
    public MetaStandRecord() {
        super(MetaStand.META_STAND);
    }

    /**
     * Create a detached, initialised MetaStandRecord
     */
    public MetaStandRecord(Object id, Object description, Object isLocal, Object replacmentForTopicName, Object cntPartition) {
        super(MetaStand.META_STAND);

        setId(id);
        setDescription(description);
        setIsLocal(isLocal);
        setReplacmentForTopicName(replacmentForTopicName);
        setCntPartition(cntPartition);
    }
}
