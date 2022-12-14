/*
 * This file is generated by jOOQ.
 */
package com.baeldung.jooq.introduction.db.tables.records;


import com.baeldung.jooq.introduction.db.tables.DictKafkaPropertyGrp;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictKafkaPropertyGrpRecord extends UpdatableRecordImpl<DictKafkaPropertyGrpRecord> implements Record3<Object, Object, Object> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>LOCALDEV.DICT_KAFKA_PROPERTY_GRP.ID</code>.
     */
    public DictKafkaPropertyGrpRecord setId(Object value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.DICT_KAFKA_PROPERTY_GRP.ID</code>.
     */
    public Object getId() {
        return get(0);
    }

    /**
     * Setter for <code>LOCALDEV.DICT_KAFKA_PROPERTY_GRP.TYPE_READ</code>.
     */
    public DictKafkaPropertyGrpRecord setTypeRead(Object value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.DICT_KAFKA_PROPERTY_GRP.TYPE_READ</code>.
     */
    public Object getTypeRead() {
        return get(1);
    }

    /**
     * Setter for <code>LOCALDEV.DICT_KAFKA_PROPERTY_GRP.DESCRIPTION</code>.
     */
    public DictKafkaPropertyGrpRecord setDescription(Object value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.DICT_KAFKA_PROPERTY_GRP.DESCRIPTION</code>.
     */
    public Object getDescription() {
        return get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Object, Object> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Object, Object, Object> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Object, Object, Object> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Object> field1() {
        return DictKafkaPropertyGrp.DICT_KAFKA_PROPERTY_GRP.ID;
    }

    @Override
    public Field<Object> field2() {
        return DictKafkaPropertyGrp.DICT_KAFKA_PROPERTY_GRP.TYPE_READ;
    }

    @Override
    public Field<Object> field3() {
        return DictKafkaPropertyGrp.DICT_KAFKA_PROPERTY_GRP.DESCRIPTION;
    }

    @Override
    public Object component1() {
        return getId();
    }

    @Override
    public Object component2() {
        return getTypeRead();
    }

    @Override
    public Object component3() {
        return getDescription();
    }

    @Override
    public Object value1() {
        return getId();
    }

    @Override
    public Object value2() {
        return getTypeRead();
    }

    @Override
    public Object value3() {
        return getDescription();
    }

    @Override
    public DictKafkaPropertyGrpRecord value1(Object value) {
        setId(value);
        return this;
    }

    @Override
    public DictKafkaPropertyGrpRecord value2(Object value) {
        setTypeRead(value);
        return this;
    }

    @Override
    public DictKafkaPropertyGrpRecord value3(Object value) {
        setDescription(value);
        return this;
    }

    @Override
    public DictKafkaPropertyGrpRecord values(Object value1, Object value2, Object value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DictKafkaPropertyGrpRecord
     */
    public DictKafkaPropertyGrpRecord() {
        super(DictKafkaPropertyGrp.DICT_KAFKA_PROPERTY_GRP);
    }

    /**
     * Create a detached, initialised DictKafkaPropertyGrpRecord
     */
    public DictKafkaPropertyGrpRecord(Object id, Object typeRead, Object description) {
        super(DictKafkaPropertyGrp.DICT_KAFKA_PROPERTY_GRP);

        setId(id);
        setTypeRead(typeRead);
        setDescription(description);
    }
}
