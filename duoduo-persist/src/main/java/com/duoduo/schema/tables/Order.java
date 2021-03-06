/**
 * This class is generated by jOOQ
 */
package com.duoduo.schema.tables;


import com.duoduo.schema.Duoduo;
import com.duoduo.schema.Keys;
import com.duoduo.schema.tables.records.OrderRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Order extends TableImpl<OrderRecord> {

    private static final long serialVersionUID = -2090730231;

    /**
     * The reference instance of <code>duoduo.order</code>
     */
    public static final Order ORDER = new Order();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrderRecord> getRecordType() {
        return OrderRecord.class;
    }

    /**
     * The column <code>duoduo.order.id</code>.
     */
    public final TableField<OrderRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>duoduo.order.task_id</code>.
     */
    public final TableField<OrderRecord, String> TASK_ID = createField("task_id", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>duoduo.order.order_json</code>.
     */
    public final TableField<OrderRecord, String> ORDER_JSON = createField("order_json", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>duoduo.order.create_time</code>.
     */
    public final TableField<OrderRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>duoduo.order.order_id</code>.
     */
    public final TableField<OrderRecord, String> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>duoduo.order.mobile</code>.
     */
    public final TableField<OrderRecord, String> MOBILE = createField("mobile", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

    /**
     * The column <code>duoduo.order.content</code>.
     */
    public final TableField<OrderRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.VARCHAR.length(1024).nullable(false), this, "");

    /**
     * The column <code>duoduo.order.receive_message_json</code>.
     */
    public final TableField<OrderRecord, String> RECEIVE_MESSAGE_JSON = createField("receive_message_json", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>duoduo.order.receive_time</code>.
     */
    public final TableField<OrderRecord, Timestamp> RECEIVE_TIME = createField("receive_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>duoduo.order.send_message_json</code>.
     */
    public final TableField<OrderRecord, String> SEND_MESSAGE_JSON = createField("send_message_json", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>duoduo.order.receive_content</code>.
     */
    public final TableField<OrderRecord, String> RECEIVE_CONTENT = createField("receive_content", org.jooq.impl.SQLDataType.VARCHAR.length(256), this, "");

    /**
     * Create a <code>duoduo.order</code> table reference
     */
    public Order() {
        this("order", null);
    }

    /**
     * Create an aliased <code>duoduo.order</code> table reference
     */
    public Order(String alias) {
        this(alias, ORDER);
    }

    private Order(String alias, Table<OrderRecord> aliased) {
        this(alias, aliased, null);
    }

    private Order(String alias, Table<OrderRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Duoduo.DUODUO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<OrderRecord, Long> getIdentity() {
        return Keys.IDENTITY_ORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OrderRecord> getPrimaryKey() {
        return Keys.KEY_ORDER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OrderRecord>> getKeys() {
        return Arrays.<UniqueKey<OrderRecord>>asList(Keys.KEY_ORDER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Order as(String alias) {
        return new Order(alias, this);
    }

    /**
     * Rename this table
     */
    public Order rename(String name) {
        return new Order(name, null);
    }
}
