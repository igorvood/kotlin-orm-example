/*
 * This file is generated by jOOQ.
 */
package com.baeldung.jooq.introduction.db.tables;


import com.baeldung.jooq.introduction.db.Localdev;
import com.baeldung.jooq.introduction.db.tables.records.AllPlaceholderRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AllPlaceholder extends TableImpl<AllPlaceholderRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>LOCALDEV.ALL_PLACEHOLDER</code>
     */
    public static final AllPlaceholder ALL_PLACEHOLDER = new AllPlaceholder();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AllPlaceholderRecord> getRecordType() {
        return AllPlaceholderRecord.class;
    }

    /**
     * The column <code>LOCALDEV.ALL_PLACEHOLDER.SERVICE_ID</code>.
     */
    public final TableField<AllPlaceholderRecord, Object> SERVICE_ID = createField(DSL.name("SERVICE_ID"), SQLDataType.OTHER, this, "");

    /**
     * The column <code>LOCALDEV.ALL_PLACEHOLDER.PROFILE_ID</code>.
     */
    public final TableField<AllPlaceholderRecord, Object> PROFILE_ID = createField(DSL.name("PROFILE_ID"), SQLDataType.OTHER, this, "");

    /**
     * The column <code>LOCALDEV.ALL_PLACEHOLDER.STAND</code>.
     */
    public final TableField<AllPlaceholderRecord, Object> STAND = createField(DSL.name("STAND"), SQLDataType.OTHER, this, "");

    /**
     * The column <code>LOCALDEV.ALL_PLACEHOLDER.PROP_VALUE</code>.
     */
    public final TableField<AllPlaceholderRecord, Object> PROP_VALUE = createField(DSL.name("PROP_VALUE"), SQLDataType.OTHER, this, "");

    private AllPlaceholder(Name alias, Table<AllPlaceholderRecord> aliased) {
        this(alias, aliased, null);
    }

    private AllPlaceholder(Name alias, Table<AllPlaceholderRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    /**
     * Create an aliased <code>LOCALDEV.ALL_PLACEHOLDER</code> table reference
     */
    public AllPlaceholder(String alias) {
        this(DSL.name(alias), ALL_PLACEHOLDER);
    }

    /**
     * Create an aliased <code>LOCALDEV.ALL_PLACEHOLDER</code> table reference
     */
    public AllPlaceholder(Name alias) {
        this(alias, ALL_PLACEHOLDER);
    }

    /**
     * Create a <code>LOCALDEV.ALL_PLACEHOLDER</code> table reference
     */
    public AllPlaceholder() {
        this(DSL.name("ALL_PLACEHOLDER"), null);
    }

    public <O extends Record> AllPlaceholder(Table<O> child, ForeignKey<O, AllPlaceholderRecord> key) {
        super(child, key, ALL_PLACEHOLDER);
    }

    @Override
    public Schema getSchema() {
        return Localdev.LOCALDEV;
    }

    @Override
    public AllPlaceholder as(String alias) {
        return new AllPlaceholder(DSL.name(alias), this);
    }

    @Override
    public AllPlaceholder as(Name alias) {
        return new AllPlaceholder(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AllPlaceholder rename(String name) {
        return new AllPlaceholder(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AllPlaceholder rename(Name name) {
        return new AllPlaceholder(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Object, Object, Object, Object> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}