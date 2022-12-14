/*
 * This file is generated by jOOQ.
 */
package com.baeldung.jooq.introduction.db.tables.records;


import com.baeldung.jooq.introduction.db.tables.DictKafkaPropValueByStand;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictKafkaPropValueByStandRecord extends UpdatableRecordImpl<DictKafkaPropValueByStandRecord> implements Record5<Object, Object, Object, Object, Object> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>LOCALDEV.DICT_KAFKA_PROP_VALUE_BY_STAND.GRP_ID</code>.
     */
    public DictKafkaPropValueByStandRecord setGrpId(Object value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.DICT_KAFKA_PROP_VALUE_BY_STAND.GRP_ID</code>.
     */
    public Object getGrpId() {
        return get(0);
    }

    /**
     * Setter for <code>LOCALDEV.DICT_KAFKA_PROP_VALUE_BY_STAND.TYPE_PROP</code>.
     */
    public DictKafkaPropValueByStandRecord setTypeProp(Object value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.DICT_KAFKA_PROP_VALUE_BY_STAND.TYPE_PROP</code>.
     */
    public Object getTypeProp() {
        return get(1);
    }

    /**
     * Setter for <code>LOCALDEV.DICT_KAFKA_PROP_VALUE_BY_STAND.PROP_ID</code>.
     */
    public DictKafkaPropValueByStandRecord setPropId(Object value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.DICT_KAFKA_PROP_VALUE_BY_STAND.PROP_ID</code>.
     */
    public Object getPropId() {
        return get(2);
    }

    /**
     * Setter for <code>LOCALDEV.DICT_KAFKA_PROP_VALUE_BY_STAND.STAND_ID</code>.
     */
    public DictKafkaPropValueByStandRecord setStandId(Object value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.DICT_KAFKA_PROP_VALUE_BY_STAND.STAND_ID</code>.
     */
    public Object getStandId() {
        return get(3);
    }

    /**
     * Setter for <code>LOCALDEV.DICT_KAFKA_PROP_VALUE_BY_STAND.PROP_VALUE</code>.
     */
    public DictKafkaPropValueByStandRecord setPropValue(Object value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.DICT_KAFKA_PROP_VALUE_BY_STAND.PROP_VALUE</code>.
     */
    public Object getPropValue() {
        return get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record4<Object, Object, Object, Object> key() {
        return (Record4) super.key();
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
        return DictKafkaPropValueByStand.DICT_KAFKA_PROP_VALUE_BY_STAND.GRP_ID;
    }

    @Override
    public Field<Object> field2() {
        return DictKafkaPropValueByStand.DICT_KAFKA_PROP_VALUE_BY_STAND.TYPE_PROP;
    }

    @Override
    public Field<Object> field3() {
        return DictKafkaPropValueByStand.DICT_KAFKA_PROP_VALUE_BY_STAND.PROP_ID;
    }

    @Override
    public Field<Object> field4() {
        return DictKafkaPropValueByStand.DICT_KAFKA_PROP_VALUE_BY_STAND.STAND_ID;
    }

    @Override
    public Field<Object> field5() {
        return DictKafkaPropValueByStand.DICT_KAFKA_PROP_VALUE_BY_STAND.PROP_VALUE;
    }

    @Override
    public Object component1() {
        return getGrpId();
    }

    @Override
    public Object component2() {
        return getTypeProp();
    }

    @Override
    public Object component3() {
        return getPropId();
    }

    @Override
    public Object component4() {
        return getStandId();
    }

    @Override
    public Object component5() {
        return getPropValue();
    }

    @Override
    public Object value1() {
        return getGrpId();
    }

    @Override
    public Object value2() {
        return getTypeProp();
    }

    @Override
    public Object value3() {
        return getPropId();
    }

    @Override
    public Object value4() {
        return getStandId();
    }

    @Override
    public Object value5() {
        return getPropValue();
    }

    @Override
    public DictKafkaPropValueByStandRecord value1(Object value) {
        setGrpId(value);
        return this;
    }

    @Override
    public DictKafkaPropValueByStandRecord value2(Object value) {
        setTypeProp(value);
        return this;
    }

    @Override
    public DictKafkaPropValueByStandRecord value3(Object value) {
        setPropId(value);
        return this;
    }

    @Override
    public DictKafkaPropValueByStandRecord value4(Object value) {
        setStandId(value);
        return this;
    }

    @Override
    public DictKafkaPropValueByStandRecord value5(Object value) {
        setPropValue(value);
        return this;
    }

    @Override
    public DictKafkaPropValueByStandRecord values(Object value1, Object value2, Object value3, Object value4, Object value5) {
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
     * Create a detached DictKafkaPropValueByStandRecord
     */
    public DictKafkaPropValueByStandRecord() {
        super(DictKafkaPropValueByStand.DICT_KAFKA_PROP_VALUE_BY_STAND);
    }

    /**
     * Create a detached, initialised DictKafkaPropValueByStandRecord
     */
    public DictKafkaPropValueByStandRecord(Object grpId, Object typeProp, Object propId, Object standId, Object propValue) {
        super(DictKafkaPropValueByStand.DICT_KAFKA_PROP_VALUE_BY_STAND);

        setGrpId(grpId);
        setTypeProp(typeProp);
        setPropId(propId);
        setStandId(standId);
        setPropValue(propValue);
    }
}
