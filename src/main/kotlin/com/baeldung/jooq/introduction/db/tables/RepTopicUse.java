/*
 * This file is generated by jOOQ.
 */
package com.baeldung.jooq.introduction.db.tables;


import com.baeldung.jooq.introduction.db.Localdev;
import com.baeldung.jooq.introduction.db.tables.records.RepTopicUseRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
public class RepTopicUse extends TableImpl<RepTopicUseRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>LOCALDEV.REP_TOPIC_USE</code>
     */
    public static final RepTopicUse REP_TOPIC_USE = new RepTopicUse();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RepTopicUseRecord> getRecordType() {
        return RepTopicUseRecord.class;
    }

    /**
     * The column <code>LOCALDEV.REP_TOPIC_USE.GRAPH_ID</code>.
     */
    public final TableField<RepTopicUseRecord, Object> GRAPH_ID = createField(DSL.name("GRAPH_ID"), SQLDataType.OTHER, this, "");

    /**
     * The column <code>LOCALDEV.REP_TOPIC_USE.TOPIC_ID</code>.
     */
    public final TableField<RepTopicUseRecord, Object> TOPIC_ID = createField(DSL.name("TOPIC_ID"), SQLDataType.OTHER, this, "");

    /**
     * The column <code>LOCALDEV.REP_TOPIC_USE.USED</code>.
     */
    public final TableField<RepTopicUseRecord, Object> USED = createField(DSL.name("USED"), SQLDataType.OTHER, this, "");

    private RepTopicUse(Name alias, Table<RepTopicUseRecord> aliased) {
        this(alias, aliased, null);
    }

    private RepTopicUse(Name alias, Table<RepTopicUseRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    /**
     * Create an aliased <code>LOCALDEV.REP_TOPIC_USE</code> table reference
     */
    public RepTopicUse(String alias) {
        this(DSL.name(alias), REP_TOPIC_USE);
    }

    /**
     * Create an aliased <code>LOCALDEV.REP_TOPIC_USE</code> table reference
     */
    public RepTopicUse(Name alias) {
        this(alias, REP_TOPIC_USE);
    }

    /**
     * Create a <code>LOCALDEV.REP_TOPIC_USE</code> table reference
     */
    public RepTopicUse() {
        this(DSL.name("REP_TOPIC_USE"), null);
    }

    public <O extends Record> RepTopicUse(Table<O> child, ForeignKey<O, RepTopicUseRecord> key) {
        super(child, key, REP_TOPIC_USE);
    }

    @Override
    public Schema getSchema() {
        return Localdev.LOCALDEV;
    }

    @Override
    public RepTopicUse as(String alias) {
        return new RepTopicUse(DSL.name(alias), this);
    }

    @Override
    public RepTopicUse as(Name alias) {
        return new RepTopicUse(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RepTopicUse rename(String name) {
        return new RepTopicUse(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RepTopicUse rename(Name name) {
        return new RepTopicUse(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Object, Object, Object> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
