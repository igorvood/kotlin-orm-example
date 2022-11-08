/*
 * This file is generated by jOOQ.
 */
package com.baeldung.jooq.introduction.db.tables;


import com.baeldung.jooq.introduction.db.Keys;
import com.baeldung.jooq.introduction.db.Localdev;
import com.baeldung.jooq.introduction.db.tables.records.DictKafkaPropRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictKafkaProp extends TableImpl<DictKafkaPropRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>LOCALDEV.DICT_KAFKA_PROP</code>
     */
    public static final DictKafkaProp DICT_KAFKA_PROP = new DictKafkaProp();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DictKafkaPropRecord> getRecordType() {
        return DictKafkaPropRecord.class;
    }

    /**
     * The column <code>LOCALDEV.DICT_KAFKA_PROP.TYPE_PROP</code>.
     */
    public final TableField<DictKafkaPropRecord, Object> TYPE_PROP = createField(DSL.name("TYPE_PROP"), SQLDataType.OTHER, this, "");

    /**
     * The column <code>LOCALDEV.DICT_KAFKA_PROP.PROP_ID</code>.
     */
    public final TableField<DictKafkaPropRecord, Object> PROP_ID = createField(DSL.name("PROP_ID"), SQLDataType.OTHER, this, "");

    private DictKafkaProp(Name alias, Table<DictKafkaPropRecord> aliased) {
        this(alias, aliased, null);
    }

    private DictKafkaProp(Name alias, Table<DictKafkaPropRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>LOCALDEV.DICT_KAFKA_PROP</code> table reference
     */
    public DictKafkaProp(String alias) {
        this(DSL.name(alias), DICT_KAFKA_PROP);
    }

    /**
     * Create an aliased <code>LOCALDEV.DICT_KAFKA_PROP</code> table reference
     */
    public DictKafkaProp(Name alias) {
        this(alias, DICT_KAFKA_PROP);
    }

    /**
     * Create a <code>LOCALDEV.DICT_KAFKA_PROP</code> table reference
     */
    public DictKafkaProp() {
        this(DSL.name("DICT_KAFKA_PROP"), null);
    }

    public <O extends Record> DictKafkaProp(Table<O> child, ForeignKey<O, DictKafkaPropRecord> key) {
        super(child, key, DICT_KAFKA_PROP);
    }

    @Override
    public Schema getSchema() {
        return Localdev.LOCALDEV;
    }

    @Override
    public UniqueKey<DictKafkaPropRecord> getPrimaryKey() {
        return Keys.PK_DICT_KAFKA_PROP;
    }

    @Override
    public List<UniqueKey<DictKafkaPropRecord>> getKeys() {
        return Arrays.<UniqueKey<DictKafkaPropRecord>>asList(Keys.PK_DICT_KAFKA_PROP);
    }

    @Override
    public DictKafkaProp as(String alias) {
        return new DictKafkaProp(DSL.name(alias), this);
    }

    @Override
    public DictKafkaProp as(Name alias) {
        return new DictKafkaProp(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DictKafkaProp rename(String name) {
        return new DictKafkaProp(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DictKafkaProp rename(Name name) {
        return new DictKafkaProp(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Object, Object> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
