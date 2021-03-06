/**
 * This class is generated by jOOQ
 */
package com.duoduo.schema;


import com.duoduo.schema.tables.Configuration;
import com.duoduo.schema.tables.EhOrder;
import com.duoduo.schema.tables.Order;
import com.duoduo.schema.tables.ReceiveMessage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Duoduo extends SchemaImpl {

    private static final long serialVersionUID = 1896106691;

    /**
     * The reference instance of <code>duoduo</code>
     */
    public static final Duoduo DUODUO = new Duoduo();

    /**
     * The table <code>duoduo.configuration</code>.
     */
    public final Configuration CONFIGURATION = com.duoduo.schema.tables.Configuration.CONFIGURATION;

    /**
     * The table <code>duoduo.eh_order</code>.
     */
    public final EhOrder EH_ORDER = com.duoduo.schema.tables.EhOrder.EH_ORDER;

    /**
     * The table <code>duoduo.order</code>.
     */
    public final Order ORDER = com.duoduo.schema.tables.Order.ORDER;

    /**
     * The table <code>duoduo.receive_message</code>.
     */
    public final ReceiveMessage RECEIVE_MESSAGE = com.duoduo.schema.tables.ReceiveMessage.RECEIVE_MESSAGE;

    /**
     * No further instances allowed
     */
    private Duoduo() {
        super("duoduo", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Configuration.CONFIGURATION,
            EhOrder.EH_ORDER,
            Order.ORDER,
            ReceiveMessage.RECEIVE_MESSAGE);
    }
}
