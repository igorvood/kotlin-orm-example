/*
 * This file is generated by jOOQ.
 */
package com.baeldung.jooq.introduction.db.tables.records;


import com.baeldung.jooq.introduction.db.tables.MetaPropertyFunction;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MetaPropertyFunctionRecord extends UpdatableRecordImpl<MetaPropertyFunctionRecord> implements Record2<Object, Object> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>LOCALDEV.META_PROPERTY_FUNCTION.ID</code>.
     */
    public MetaPropertyFunctionRecord setId(Object value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.META_PROPERTY_FUNCTION.ID</code>.
     */
    public Object getId() {
        return get(0);
    }

    /**
     * Setter for <code>LOCALDEV.META_PROPERTY_FUNCTION.DESCRIPTION</code>.
     */
    public MetaPropertyFunctionRecord setDescription(Object value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.META_PROPERTY_FUNCTION.DESCRIPTION</code>.
     */
    public Object getDescription() {
        return get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Object> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Object, Object> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Object, Object> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Object> field1() {
        return MetaPropertyFunction.META_PROPERTY_FUNCTION.ID;
    }

    @Override
    public Field<Object> field2() {
        return MetaPropertyFunction.META_PROPERTY_FUNCTION.DESCRIPTION;
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
    public Object value1() {
        return getId();
    }

    @Override
    public Object value2() {
        return getDescription();
    }

    @Override
    public MetaPropertyFunctionRecord value1(Object value) {
        setId(value);
        return this;
    }

    @Override
    public MetaPropertyFunctionRecord value2(Object value) {
        setDescription(value);
        return this;
    }

    @Override
    public MetaPropertyFunctionRecord values(Object value1, Object value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MetaPropertyFunctionRecord
     */
    public MetaPropertyFunctionRecord() {
        super(MetaPropertyFunction.META_PROPERTY_FUNCTION);
    }

    /**
     * Create a detached, initialised MetaPropertyFunctionRecord
     */
    public MetaPropertyFunctionRecord(Object id, Object description) {
        super(MetaPropertyFunction.META_PROPERTY_FUNCTION);

        setId(id);
        setDescription(description);
    }
}
