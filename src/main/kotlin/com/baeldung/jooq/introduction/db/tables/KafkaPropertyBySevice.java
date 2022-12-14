/*
 * This file is generated by jOOQ.
 */
package com.baeldung.jooq.introduction.db.tables;


import com.baeldung.jooq.introduction.db.Localdev;
import com.baeldung.jooq.introduction.db.tables.records.KafkaPropertyBySeviceRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
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
public class KafkaPropertyBySevice extends TableImpl<KafkaPropertyBySeviceRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>LOCALDEV.KAFKA_PROPERTY_BY_SEVICE</code>
     */
    public static final KafkaPropertyBySevice KAFKA_PROPERTY_BY_SEVICE = new KafkaPropertyBySevice();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<KafkaPropertyBySeviceRecord> getRecordType() {
        return KafkaPropertyBySeviceRecord.class;
    }

    /**
     * The column <code>LOCALDEV.KAFKA_PROPERTY_BY_SEVICE.SERVICE_ID</code>.
     */
    public final TableField<KafkaPropertyBySeviceRecord, Object> SERVICE_ID = createField(DSL.name("SERVICE_ID"), SQLDataType.OTHER, this, "");

    /**
     * The column <code>LOCALDEV.KAFKA_PROPERTY_BY_SEVICE.PROFILE_ID</code>.
     */
    public final TableField<KafkaPropertyBySeviceRecord, Object> PROFILE_ID = createField(DSL.name("PROFILE_ID"), SQLDataType.OTHER, this, "");

    /**
     * The column <code>LOCALDEV.KAFKA_PROPERTY_BY_SEVICE.STAND</code>.
     */
    public final TableField<KafkaPropertyBySeviceRecord, Object> STAND = createField(DSL.name("STAND"), SQLDataType.OTHER, this, "");

    /**
     * The column <code>LOCALDEV.KAFKA_PROPERTY_BY_SEVICE.PROP_ID</code>.
     */
    public final TableField<KafkaPropertyBySeviceRecord, Object> PROP_ID = createField(DSL.name("PROP_ID"), SQLDataType.OTHER, this, "");

    /**
     * The column <code>LOCALDEV.KAFKA_PROPERTY_BY_SEVICE.TYPE_PROP</code>.
     */
    public final TableField<KafkaPropertyBySeviceRecord, String> TYPE_PROP = createField(DSL.name("TYPE_PROP"), SQLDataType.CHAR(3), this, "");

    /**
     * The column <code>LOCALDEV.KAFKA_PROPERTY_BY_SEVICE.ENV_PROP_NAME</code>.
     */
    public final TableField<KafkaPropertyBySeviceRecord, Object> ENV_PROP_NAME = createField(DSL.name("ENV_PROP_NAME"), SQLDataType.OTHER, this, "");

    /**
     * The column <code>LOCALDEV.KAFKA_PROPERTY_BY_SEVICE.PROPERTY_VAL</code>.
     */
    public final TableField<KafkaPropertyBySeviceRecord, Object> PROPERTY_VAL = createField(DSL.name("PROPERTY_VAL"), SQLDataType.OTHER, this, "");

    private KafkaPropertyBySevice(Name alias, Table<KafkaPropertyBySeviceRecord> aliased) {
        this(alias, aliased, null);
    }

    private KafkaPropertyBySevice(Name alias, Table<KafkaPropertyBySeviceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    /**
     * Create an aliased <code>LOCALDEV.KAFKA_PROPERTY_BY_SEVICE</code> table reference
     */
    public KafkaPropertyBySevice(String alias) {
        this(DSL.name(alias), KAFKA_PROPERTY_BY_SEVICE);
    }

    /**
     * Create an aliased <code>LOCALDEV.KAFKA_PROPERTY_BY_SEVICE</code> table reference
     */
    public KafkaPropertyBySevice(Name alias) {
        this(alias, KAFKA_PROPERTY_BY_SEVICE);
    }

    /**
     * Create a <code>LOCALDEV.KAFKA_PROPERTY_BY_SEVICE</code> table reference
     */
    public KafkaPropertyBySevice() {
        this(DSL.name("KAFKA_PROPERTY_BY_SEVICE"), null);
    }

    public <O extends Record> KafkaPropertyBySevice(Table<O> child, ForeignKey<O, KafkaPropertyBySeviceRecord> key) {
        super(child, key, KAFKA_PROPERTY_BY_SEVICE);
    }

    @Override
    public Schema getSchema() {
        return Localdev.LOCALDEV;
    }

    @Override
    public KafkaPropertyBySevice as(String alias) {
        return new KafkaPropertyBySevice(DSL.name(alias), this);
    }

    @Override
    public KafkaPropertyBySevice as(Name alias) {
        return new KafkaPropertyBySevice(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public KafkaPropertyBySevice rename(String name) {
        return new KafkaPropertyBySevice(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public KafkaPropertyBySevice rename(Name name) {
        return new KafkaPropertyBySevice(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Object, Object, Object, Object, String, Object, Object> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
