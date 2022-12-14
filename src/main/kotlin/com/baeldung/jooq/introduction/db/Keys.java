/*
 * This file is generated by jOOQ.
 */
package com.baeldung.jooq.introduction.db;


import com.baeldung.jooq.introduction.db.tables.Databasechangeloglock;
import com.baeldung.jooq.introduction.db.tables.DictAbstractGraphNode;
import com.baeldung.jooq.introduction.db.tables.DictArrow;
import com.baeldung.jooq.introduction.db.tables.DictFlinkPropValue;
import com.baeldung.jooq.introduction.db.tables.DictKafkaProp;
import com.baeldung.jooq.introduction.db.tables.DictKafkaPropValue;
import com.baeldung.jooq.introduction.db.tables.DictKafkaPropValueByStand;
import com.baeldung.jooq.introduction.db.tables.DictKafkaPropertyGrp;
import com.baeldung.jooq.introduction.db.tables.DictPlaceHolder;
import com.baeldung.jooq.introduction.db.tables.DictPlaceHolderByService;
import com.baeldung.jooq.introduction.db.tables.DictService;
import com.baeldung.jooq.introduction.db.tables.DictServiceNode;
import com.baeldung.jooq.introduction.db.tables.DictTopicNode;
import com.baeldung.jooq.introduction.db.tables.DictTopicParamsByStand;
import com.baeldung.jooq.introduction.db.tables.MetaPropertyFunction;
import com.baeldung.jooq.introduction.db.tables.MetaStand;
import com.baeldung.jooq.introduction.db.tables.records.DatabasechangeloglockRecord;
import com.baeldung.jooq.introduction.db.tables.records.DictAbstractGraphNodeRecord;
import com.baeldung.jooq.introduction.db.tables.records.DictArrowRecord;
import com.baeldung.jooq.introduction.db.tables.records.DictFlinkPropValueRecord;
import com.baeldung.jooq.introduction.db.tables.records.DictKafkaPropRecord;
import com.baeldung.jooq.introduction.db.tables.records.DictKafkaPropValueByStandRecord;
import com.baeldung.jooq.introduction.db.tables.records.DictKafkaPropValueRecord;
import com.baeldung.jooq.introduction.db.tables.records.DictKafkaPropertyGrpRecord;
import com.baeldung.jooq.introduction.db.tables.records.DictPlaceHolderByServiceRecord;
import com.baeldung.jooq.introduction.db.tables.records.DictPlaceHolderRecord;
import com.baeldung.jooq.introduction.db.tables.records.DictServiceNodeRecord;
import com.baeldung.jooq.introduction.db.tables.records.DictServiceRecord;
import com.baeldung.jooq.introduction.db.tables.records.DictTopicNodeRecord;
import com.baeldung.jooq.introduction.db.tables.records.DictTopicParamsByStandRecord;
import com.baeldung.jooq.introduction.db.tables.records.MetaPropertyFunctionRecord;
import com.baeldung.jooq.introduction.db.tables.records.MetaStandRecord;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in 
 * LOCALDEV.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<DatabasechangeloglockRecord> PK_DATABASECHANGELOGLOCK = Internal.createUniqueKey(Databasechangeloglock.DATABASECHANGELOGLOCK, DSL.name("PK_DATABASECHANGELOGLOCK"), new TableField[] { Databasechangeloglock.DATABASECHANGELOGLOCK.ID }, true);
    public static final UniqueKey<DictAbstractGraphNodeRecord> PK_DICT_ABSTRACT_GRAPH_NODE = Internal.createUniqueKey(DictAbstractGraphNode.DICT_ABSTRACT_GRAPH_NODE, DSL.name("PK_DICT_ABSTRACT_GRAPH_NODE"), new TableField[] { DictAbstractGraphNode.DICT_ABSTRACT_GRAPH_NODE.GRAPH_ID, DictAbstractGraphNode.DICT_ABSTRACT_GRAPH_NODE.NODE_TYPE, DictAbstractGraphNode.DICT_ABSTRACT_GRAPH_NODE.NODE_ID }, true);
    public static final UniqueKey<DictArrowRecord> PK_DICT_ARROW = Internal.createUniqueKey(DictArrow.DICT_ARROW, DSL.name("PK_DICT_ARROW"), new TableField[] { DictArrow.DICT_ARROW.GRAPH_ID, DictArrow.DICT_ARROW.BEG_NODE_TYPE, DictArrow.DICT_ARROW.BEG_NODE_ID, DictArrow.DICT_ARROW.END_NODE_TYPE, DictArrow.DICT_ARROW.END_NODE_ID }, true);
    public static final UniqueKey<DictFlinkPropValueRecord> PK_DICT_FLINK_PROP_VALUE = Internal.createUniqueKey(DictFlinkPropValue.DICT_FLINK_PROP_VALUE, DSL.name("PK_DICT_FLINK_PROP_VALUE"), new TableField[] { DictFlinkPropValue.DICT_FLINK_PROP_VALUE.SERVICE_ID, DictFlinkPropValue.DICT_FLINK_PROP_VALUE.PROFILE_ID, DictFlinkPropValue.DICT_FLINK_PROP_VALUE.PROP_ID }, true);
    public static final UniqueKey<DictKafkaPropRecord> PK_DICT_KAFKA_PROP = Internal.createUniqueKey(DictKafkaProp.DICT_KAFKA_PROP, DSL.name("PK_DICT_KAFKA_PROP"), new TableField[] { DictKafkaProp.DICT_KAFKA_PROP.TYPE_PROP, DictKafkaProp.DICT_KAFKA_PROP.PROP_ID }, true);
    public static final UniqueKey<DictKafkaPropValueRecord> PK_DICT_KAFKA_PROP_VALUE = Internal.createUniqueKey(DictKafkaPropValue.DICT_KAFKA_PROP_VALUE, DSL.name("PK_DICT_KAFKA_PROP_VALUE"), new TableField[] { DictKafkaPropValue.DICT_KAFKA_PROP_VALUE.TYPE_PROP, DictKafkaPropValue.DICT_KAFKA_PROP_VALUE.GRP_ID, DictKafkaPropValue.DICT_KAFKA_PROP_VALUE.PROP_ID }, true);
    public static final UniqueKey<DictKafkaPropValueByStandRecord> PK_DICT_KAFKA_PROP_VALUE_BY_STAND = Internal.createUniqueKey(DictKafkaPropValueByStand.DICT_KAFKA_PROP_VALUE_BY_STAND, DSL.name("PK_DICT_KAFKA_PROP_VALUE_BY_STAND"), new TableField[] { DictKafkaPropValueByStand.DICT_KAFKA_PROP_VALUE_BY_STAND.TYPE_PROP, DictKafkaPropValueByStand.DICT_KAFKA_PROP_VALUE_BY_STAND.STAND_ID, DictKafkaPropValueByStand.DICT_KAFKA_PROP_VALUE_BY_STAND.GRP_ID, DictKafkaPropValueByStand.DICT_KAFKA_PROP_VALUE_BY_STAND.PROP_ID }, true);
    public static final UniqueKey<DictKafkaPropertyGrpRecord> PK_DICT_KAFKA_PROPERTY_GRP = Internal.createUniqueKey(DictKafkaPropertyGrp.DICT_KAFKA_PROPERTY_GRP, DSL.name("PK_DICT_KAFKA_PROPERTY_GRP"), new TableField[] { DictKafkaPropertyGrp.DICT_KAFKA_PROPERTY_GRP.TYPE_READ, DictKafkaPropertyGrp.DICT_KAFKA_PROPERTY_GRP.ID }, true);
    public static final UniqueKey<DictPlaceHolderRecord> PK_DICT_PLACE_HOLDER = Internal.createUniqueKey(DictPlaceHolder.DICT_PLACE_HOLDER, DSL.name("PK_DICT_PLACE_HOLDER"), new TableField[] { DictPlaceHolder.DICT_PLACE_HOLDER.ID }, true);
    public static final UniqueKey<DictPlaceHolderByServiceRecord> PK_DICT_PLACE_HOLDER_BY_SERVICE = Internal.createUniqueKey(DictPlaceHolderByService.DICT_PLACE_HOLDER_BY_SERVICE, DSL.name("PK_DICT_PLACE_HOLDER_BY_SERVICE"), new TableField[] { DictPlaceHolderByService.DICT_PLACE_HOLDER_BY_SERVICE.SERVICE_ID, DictPlaceHolderByService.DICT_PLACE_HOLDER_BY_SERVICE.PROFILE_ID, DictPlaceHolderByService.DICT_PLACE_HOLDER_BY_SERVICE.PLACE_HOLDER_ID }, true);
    public static final UniqueKey<DictServiceRecord> PK_DICT_SERVICE = Internal.createUniqueKey(DictService.DICT_SERVICE, DSL.name("PK_DICT_SERVICE"), new TableField[] { DictService.DICT_SERVICE.ID }, true);
    public static final UniqueKey<DictServiceNodeRecord> PK_DICT_SERVICE_NODE = Internal.createUniqueKey(DictServiceNode.DICT_SERVICE_NODE, DSL.name("PK_DICT_SERVICE_NODE"), new TableField[] { DictServiceNode.DICT_SERVICE_NODE.SERVICE_ID, DictServiceNode.DICT_SERVICE_NODE.PROFILE_ID }, true);
    public static final UniqueKey<DictTopicNodeRecord> PK_DICT_TOPIC_NODE = Internal.createUniqueKey(DictTopicNode.DICT_TOPIC_NODE, DSL.name("PK_DICT_TOPIC_NODE"), new TableField[] { DictTopicNode.DICT_TOPIC_NODE.ID }, true);
    public static final UniqueKey<DictTopicParamsByStandRecord> PK_DICT_TOPIC_PARAMS_BY_STAND = Internal.createUniqueKey(DictTopicParamsByStand.DICT_TOPIC_PARAMS_BY_STAND, DSL.name("PK_DICT_TOPIC_PARAMS_BY_STAND"), new TableField[] { DictTopicParamsByStand.DICT_TOPIC_PARAMS_BY_STAND.STAND_ID, DictTopicParamsByStand.DICT_TOPIC_PARAMS_BY_STAND.NODE_ID }, true);
    public static final UniqueKey<MetaPropertyFunctionRecord> PK_META_PROPERTY_FUNCTION = Internal.createUniqueKey(MetaPropertyFunction.META_PROPERTY_FUNCTION, DSL.name("PK_META_PROPERTY_FUNCTION"), new TableField[] { MetaPropertyFunction.META_PROPERTY_FUNCTION.ID }, true);
    public static final UniqueKey<MetaStandRecord> PK_META_STAND = Internal.createUniqueKey(MetaStand.META_STAND, DSL.name("PK_META_STAND"), new TableField[] { MetaStand.META_STAND.ID }, true);
}
