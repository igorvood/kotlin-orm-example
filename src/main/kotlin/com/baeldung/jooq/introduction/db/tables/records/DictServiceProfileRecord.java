/*
 * This file is generated by jOOQ.
 */
package com.baeldung.jooq.introduction.db.tables.records;


import com.baeldung.jooq.introduction.db.tables.DictServiceProfile;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictServiceProfileRecord extends TableRecordImpl<DictServiceProfileRecord> implements Record3<Object, Object, Object> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>LOCALDEV.DICT_SERVICE_PROFILE.ID</code>.
     */
    public DictServiceProfileRecord setId(Object value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.DICT_SERVICE_PROFILE.ID</code>.
     */
    public Object getId() {
        return get(0);
    }

    /**
     * Setter for <code>LOCALDEV.DICT_SERVICE_PROFILE.MAIN_CLASS</code>.
     */
    public DictServiceProfileRecord setMainClass(Object value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.DICT_SERVICE_PROFILE.MAIN_CLASS</code>.
     */
    public Object getMainClass() {
        return get(1);
    }

    /**
     * Setter for <code>LOCALDEV.DICT_SERVICE_PROFILE.PROFILE_ID</code>.
     */
    public DictServiceProfileRecord setProfileId(Object value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>LOCALDEV.DICT_SERVICE_PROFILE.PROFILE_ID</code>.
     */
    public Object getProfileId() {
        return get(2);
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
        return DictServiceProfile.DICT_SERVICE_PROFILE.ID;
    }

    @Override
    public Field<Object> field2() {
        return DictServiceProfile.DICT_SERVICE_PROFILE.MAIN_CLASS;
    }

    @Override
    public Field<Object> field3() {
        return DictServiceProfile.DICT_SERVICE_PROFILE.PROFILE_ID;
    }

    @Override
    public Object component1() {
        return getId();
    }

    @Override
    public Object component2() {
        return getMainClass();
    }

    @Override
    public Object component3() {
        return getProfileId();
    }

    @Override
    public Object value1() {
        return getId();
    }

    @Override
    public Object value2() {
        return getMainClass();
    }

    @Override
    public Object value3() {
        return getProfileId();
    }

    @Override
    public DictServiceProfileRecord value1(Object value) {
        setId(value);
        return this;
    }

    @Override
    public DictServiceProfileRecord value2(Object value) {
        setMainClass(value);
        return this;
    }

    @Override
    public DictServiceProfileRecord value3(Object value) {
        setProfileId(value);
        return this;
    }

    @Override
    public DictServiceProfileRecord values(Object value1, Object value2, Object value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DictServiceProfileRecord
     */
    public DictServiceProfileRecord() {
        super(DictServiceProfile.DICT_SERVICE_PROFILE);
    }

    /**
     * Create a detached, initialised DictServiceProfileRecord
     */
    public DictServiceProfileRecord(Object id, Object mainClass, Object profileId) {
        super(DictServiceProfile.DICT_SERVICE_PROFILE);

        setId(id);
        setMainClass(mainClass);
        setProfileId(profileId);
    }
}
