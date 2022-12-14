/*
 * This file is generated by jOOQ.
 */
package com.baeldung.jooq.introduction.db.tables;


import com.baeldung.jooq.introduction.db.Keys;
import com.baeldung.jooq.introduction.db.Localdev;
import com.baeldung.jooq.introduction.db.tables.records.DictArrowRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
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
public class DictArrow extends TableImpl<DictArrowRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>LOCALDEV.DICT_ARROW</code>
     */
    public static final DictArrow DICT_ARROW = new DictArrow();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DictArrowRecord> getRecordType() {
        return DictArrowRecord.class;
    }

    /**
     * The column <code>LOCALDEV.DICT_ARROW.GRAPH_ID</code>.
     */
    public final TableField<DictArrowRecord, Object> GRAPH_ID = createField(DSL.name("GRAPH_ID"), SQLDataType.OTHER, this, "");

    /**
     * The column <code>LOCALDEV.DICT_ARROW.BEG_NODE_TYPE</code>.
     */
    public final TableField<DictArrowRecord, Object> BEG_NODE_TYPE = createField(DSL.name("BEG_NODE_TYPE"), SQLDataType.OTHER, this, "");

    /**
     * The column <code>LOCALDEV.DICT_ARROW.BEG_NODE_ID</code>.
     */
    public final TableField<DictArrowRecord, Object> BEG_NODE_ID = createField(DSL.name("BEG_NODE_ID"), SQLDataType.OTHER, this, "");

    /**
     * The column <code>LOCALDEV.DICT_ARROW.END_NODE_TYPE</code>.
     */
    public final TableField<DictArrowRecord, Object> END_NODE_TYPE = createField(DSL.name("END_NODE_TYPE"), SQLDataType.OTHER, this, "");

    /**
     * The column <code>LOCALDEV.DICT_ARROW.END_NODE_ID</code>.
     */
    public final TableField<DictArrowRecord, Object> END_NODE_ID = createField(DSL.name("END_NODE_ID"), SQLDataType.OTHER, this, "");

    /**
     * The column <code>LOCALDEV.DICT_ARROW.PROPERTY_KEY</code>.
     */
    public final TableField<DictArrowRecord, Object> PROPERTY_KEY = createField(DSL.name("PROPERTY_KEY"), SQLDataType.OTHER, this, "");

    /**
     * The column <code>LOCALDEV.DICT_ARROW.FLINK_SRV</code>.
     */
    public final TableField<DictArrowRecord, Object> FLINK_SRV = createField(DSL.name("FLINK_SRV"), SQLDataType.OTHER, this, "");

    private DictArrow(Name alias, Table<DictArrowRecord> aliased) {
        this(alias, aliased, null);
    }

    private DictArrow(Name alias, Table<DictArrowRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>LOCALDEV.DICT_ARROW</code> table reference
     */
    public DictArrow(String alias) {
        this(DSL.name(alias), DICT_ARROW);
    }

    /**
     * Create an aliased <code>LOCALDEV.DICT_ARROW</code> table reference
     */
    public DictArrow(Name alias) {
        this(alias, DICT_ARROW);
    }

    /**
     * Create a <code>LOCALDEV.DICT_ARROW</code> table reference
     */
    public DictArrow() {
        this(DSL.name("DICT_ARROW"), null);
    }

    public <O extends Record> DictArrow(Table<O> child, ForeignKey<O, DictArrowRecord> key) {
        super(child, key, DICT_ARROW);
    }

    @Override
    public Schema getSchema() {
        return Localdev.LOCALDEV;
    }

    @Override
    public UniqueKey<DictArrowRecord> getPrimaryKey() {
        return Keys.PK_DICT_ARROW;
    }

    @Override
    public List<UniqueKey<DictArrowRecord>> getKeys() {
        return Arrays.<UniqueKey<DictArrowRecord>>asList(Keys.PK_DICT_ARROW);
    }

    @Override
    public DictArrow as(String alias) {
        return new DictArrow(DSL.name(alias), this);
    }

    @Override
    public DictArrow as(Name alias) {
        return new DictArrow(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DictArrow rename(String name) {
        return new DictArrow(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DictArrow rename(Name name) {
        return new DictArrow(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Object, Object, Object, Object, Object, Object, Object> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
