/**
 * This class is generated by jOOQ
 */
package com.duoduo.schema.tables;


import com.duoduo.schema.Duoduo;
import com.duoduo.schema.Keys;
import com.duoduo.schema.tables.records.AmountTestRecord;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class AmountTest extends TableImpl<AmountTestRecord> {

    private static final long serialVersionUID = 1434705187;

    /**
     * The reference instance of <code>duoduo.amount_test</code>
     */
    public static final AmountTest AMOUNT_TEST = new AmountTest();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AmountTestRecord> getRecordType() {
        return AmountTestRecord.class;
    }

    /**
     * The column <code>duoduo.amount_test.id</code>.
     */
    public final TableField<AmountTestRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>duoduo.amount_test.amount</code>.
     */
    public final TableField<AmountTestRecord, BigDecimal> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2), this, "");

    /**
     * Create a <code>duoduo.amount_test</code> table reference
     */
    public AmountTest() {
        this("amount_test", null);
    }

    /**
     * Create an aliased <code>duoduo.amount_test</code> table reference
     */
    public AmountTest(String alias) {
        this(alias, AMOUNT_TEST);
    }

    private AmountTest(String alias, Table<AmountTestRecord> aliased) {
        this(alias, aliased, null);
    }

    private AmountTest(String alias, Table<AmountTestRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<AmountTestRecord> getPrimaryKey() {
        return Keys.KEY_AMOUNT_TEST_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AmountTestRecord>> getKeys() {
        return Arrays.<UniqueKey<AmountTestRecord>>asList(Keys.KEY_AMOUNT_TEST_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AmountTest as(String alias) {
        return new AmountTest(alias, this);
    }

    /**
     * Rename this table
     */
    public AmountTest rename(String name) {
        return new AmountTest(name, null);
    }
}
