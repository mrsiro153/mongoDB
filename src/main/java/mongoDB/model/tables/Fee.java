/*
 * This file is generated by jOOQ.
*/
package mongoDB.model.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import mongoDB.model.Keys;
import mongoDB.model.Transaction;
import mongoDB.model.tables.records.FeeRecord;

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
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Fee extends TableImpl<FeeRecord> {

    private static final long serialVersionUID = -1091021138;

    /**
     * The reference instance of <code>transaction.fee</code>
     */
    public static final Fee FEE = new Fee();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FeeRecord> getRecordType() {
        return FeeRecord.class;
    }

    /**
     * The column <code>transaction.fee.feeId</code>.
     */
    public final TableField<FeeRecord, Integer> FEEID = createField("feeId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>transaction.fee.name</code>.
     */
    public final TableField<FeeRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>transaction.fee.image</code>.
     */
    public final TableField<FeeRecord, String> IMAGE = createField("image", org.jooq.impl.SQLDataType.VARCHAR.length(512), this, "");

    /**
     * The column <code>transaction.fee.fee</code>.
     */
    public final TableField<FeeRecord, Long> FEE_ = createField("fee", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>transaction.fee.ruleId</code>.
     */
    public final TableField<FeeRecord, Integer> RULEID = createField("ruleId", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>transaction.fee.modifiedBy</code>.
     */
    public final TableField<FeeRecord, String> MODIFIEDBY = createField("modifiedBy", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>transaction.fee.createdAt</code>.
     */
    public final TableField<FeeRecord, Long> CREATEDAT = createField("createdAt", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>transaction.fee.modifiedAt</code>.
     */
    public final TableField<FeeRecord, Long> MODIFIEDAT = createField("modifiedAt", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>transaction.fee</code> table reference
     */
    public Fee() {
        this("fee", null);
    }

    /**
     * Create an aliased <code>transaction.fee</code> table reference
     */
    public Fee(String alias) {
        this(alias, FEE);
    }

    private Fee(String alias, Table<FeeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Fee(String alias, Table<FeeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Transaction.TRANSACTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FeeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_FEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FeeRecord> getPrimaryKey() {
        return Keys.KEY_FEE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FeeRecord>> getKeys() {
        return Arrays.<UniqueKey<FeeRecord>>asList(Keys.KEY_FEE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Fee as(String alias) {
        return new Fee(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Fee rename(String name) {
        return new Fee(name, null);
    }
}
