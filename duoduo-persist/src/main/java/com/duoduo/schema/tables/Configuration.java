/**
 * This class is generated by jOOQ
 */
package com.duoduo.schema.tables;


import com.duoduo.schema.Duoduo;
import com.duoduo.schema.Keys;
import com.duoduo.schema.tables.records.ConfigurationRecord;

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
public class Configuration extends TableImpl<ConfigurationRecord> {

    private static final long serialVersionUID = -72789249;

    /**
     * The reference instance of <code>duoduo.configuration</code>
     */
    public static final Configuration CONFIGURATION = new Configuration();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ConfigurationRecord> getRecordType() {
        return ConfigurationRecord.class;
    }

    /**
     * The column <code>duoduo.configuration.id</code>.
     */
    public final TableField<ConfigurationRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>duoduo.configuration.name</code>.
     */
    public final TableField<ConfigurationRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>duoduo.configuration.value</code>.
     */
    public final TableField<ConfigurationRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.VARCHAR.length(256), this, "");

    /**
     * The column <code>duoduo.configuration.description</code>.
     */
    public final TableField<ConfigurationRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(256), this, "");

    /**
     * Create a <code>duoduo.configuration</code> table reference
     */
    public Configuration() {
        this("configuration", null);
    }

    /**
     * Create an aliased <code>duoduo.configuration</code> table reference
     */
    public Configuration(String alias) {
        this(alias, CONFIGURATION);
    }

    private Configuration(String alias, Table<ConfigurationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Configuration(String alias, Table<ConfigurationRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ConfigurationRecord, Long> getIdentity() {
        return Keys.IDENTITY_CONFIGURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ConfigurationRecord> getPrimaryKey() {
        return Keys.KEY_CONFIGURATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ConfigurationRecord>> getKeys() {
        return Arrays.<UniqueKey<ConfigurationRecord>>asList(Keys.KEY_CONFIGURATION_PRIMARY, Keys.KEY_CONFIGURATION_U_NAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Configuration as(String alias) {
        return new Configuration(alias, this);
    }

    /**
     * Rename this table
     */
    public Configuration rename(String name) {
        return new Configuration(name, null);
    }
}
