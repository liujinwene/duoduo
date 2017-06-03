/**
 * This class is generated by jOOQ
 */
package com.duoduo.schema;


import com.duoduo.schema.tables.Configuration;
import com.duoduo.schema.tables.EhOrder;
import com.duoduo.schema.tables.Order;
import com.duoduo.schema.tables.ReceiveMessage;
import com.duoduo.schema.tables.records.ConfigurationRecord;
import com.duoduo.schema.tables.records.EhOrderRecord;
import com.duoduo.schema.tables.records.OrderRecord;
import com.duoduo.schema.tables.records.ReceiveMessageRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>duoduo</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<ConfigurationRecord, Long> IDENTITY_CONFIGURATION = Identities0.IDENTITY_CONFIGURATION;
    public static final Identity<EhOrderRecord, Long> IDENTITY_EH_ORDER = Identities0.IDENTITY_EH_ORDER;
    public static final Identity<OrderRecord, Long> IDENTITY_ORDER = Identities0.IDENTITY_ORDER;
    public static final Identity<ReceiveMessageRecord, Long> IDENTITY_RECEIVE_MESSAGE = Identities0.IDENTITY_RECEIVE_MESSAGE;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ConfigurationRecord> KEY_CONFIGURATION_PRIMARY = UniqueKeys0.KEY_CONFIGURATION_PRIMARY;
    public static final UniqueKey<ConfigurationRecord> KEY_CONFIGURATION_U_NAME = UniqueKeys0.KEY_CONFIGURATION_U_NAME;
    public static final UniqueKey<EhOrderRecord> KEY_EH_ORDER_PRIMARY = UniqueKeys0.KEY_EH_ORDER_PRIMARY;
    public static final UniqueKey<EhOrderRecord> KEY_EH_ORDER_U_ORDER_ID = UniqueKeys0.KEY_EH_ORDER_U_ORDER_ID;
    public static final UniqueKey<OrderRecord> KEY_ORDER_PRIMARY = UniqueKeys0.KEY_ORDER_PRIMARY;
    public static final UniqueKey<ReceiveMessageRecord> KEY_RECEIVE_MESSAGE_PRIMARY = UniqueKeys0.KEY_RECEIVE_MESSAGE_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<ConfigurationRecord, Long> IDENTITY_CONFIGURATION = createIdentity(Configuration.CONFIGURATION, Configuration.CONFIGURATION.ID);
        public static Identity<EhOrderRecord, Long> IDENTITY_EH_ORDER = createIdentity(EhOrder.EH_ORDER, EhOrder.EH_ORDER.ID);
        public static Identity<OrderRecord, Long> IDENTITY_ORDER = createIdentity(Order.ORDER, Order.ORDER.ID);
        public static Identity<ReceiveMessageRecord, Long> IDENTITY_RECEIVE_MESSAGE = createIdentity(ReceiveMessage.RECEIVE_MESSAGE, ReceiveMessage.RECEIVE_MESSAGE.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<ConfigurationRecord> KEY_CONFIGURATION_PRIMARY = createUniqueKey(Configuration.CONFIGURATION, "KEY_configuration_PRIMARY", Configuration.CONFIGURATION.ID);
        public static final UniqueKey<ConfigurationRecord> KEY_CONFIGURATION_U_NAME = createUniqueKey(Configuration.CONFIGURATION, "KEY_configuration_u_name", Configuration.CONFIGURATION.NAME);
        public static final UniqueKey<EhOrderRecord> KEY_EH_ORDER_PRIMARY = createUniqueKey(EhOrder.EH_ORDER, "KEY_eh_order_PRIMARY", EhOrder.EH_ORDER.ID);
        public static final UniqueKey<EhOrderRecord> KEY_EH_ORDER_U_ORDER_ID = createUniqueKey(EhOrder.EH_ORDER, "KEY_eh_order_u_order_id", EhOrder.EH_ORDER.ORDER_ID);
        public static final UniqueKey<OrderRecord> KEY_ORDER_PRIMARY = createUniqueKey(Order.ORDER, "KEY_order_PRIMARY", Order.ORDER.ID);
        public static final UniqueKey<ReceiveMessageRecord> KEY_RECEIVE_MESSAGE_PRIMARY = createUniqueKey(ReceiveMessage.RECEIVE_MESSAGE, "KEY_receive_message_PRIMARY", ReceiveMessage.RECEIVE_MESSAGE.ID);
    }
}
