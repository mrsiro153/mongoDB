/*
 * This file is generated by jOOQ.
*/
package mongoDB.model.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import mongoDB.model.Keys;
import mongoDB.model.Transaction;
import mongoDB.model.tables.records.TransactiontypeRecord;

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
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Transactiontype extends TableImpl<TransactiontypeRecord> {

    private static final long serialVersionUID = 511553621;

    /**
     * The reference instance of <code>transaction.transactionType</code>
     */
    public static final Transactiontype TRANSACTIONTYPE = new Transactiontype();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TransactiontypeRecord> getRecordType() {
        return TransactiontypeRecord.class;
    }

    /**
     * The column <code>transaction.transactionType.transactionType</code>.
     */
    public final TableField<TransactiontypeRecord, String> TRANSACTIONTYPE_ = createField("transactionType", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "");

    /**
     * The column <code>transaction.transactionType.nameType</code>.
     */
    public final TableField<TransactiontypeRecord, String> NAMETYPE = createField("nameType", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>transaction.transactionType.description</code>.
     */
    public final TableField<TransactiontypeRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>transaction.transactionType.currency</code>.
     */
    public final TableField<TransactiontypeRecord, String> CURRENCY = createField("currency", org.jooq.impl.SQLDataType.VARCHAR.length(3).nullable(false), this, "");

    /**
     * The column <code>transaction.transactionType.status</code>.
     */
    public final TableField<TransactiontypeRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>transaction.transactionType.ruleId</code>.
     */
    public final TableField<TransactiontypeRecord, Integer> RULEID = createField("ruleId", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>transaction.transactionType.administrators</code>.
     */
    public final TableField<TransactiontypeRecord, String> ADMINISTRATORS = createField("administrators", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>transaction.transactionType.createdAt</code>.
     */
    public final TableField<TransactiontypeRecord, Timestamp> CREATEDAT = createField("createdAt", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>transaction.transactionType.modifiedAt</code>.
     */
    public final TableField<TransactiontypeRecord, Timestamp> MODIFIEDAT = createField("modifiedAt", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>transaction.transactionType</code> table reference
     */
    public Transactiontype() {
        this("transactionType", null);
    }

    /**
     * Create an aliased <code>transaction.transactionType</code> table reference
     */
    public Transactiontype(String alias) {
        this(alias, TRANSACTIONTYPE);
    }

    private Transactiontype(String alias, Table<TransactiontypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Transactiontype(String alias, Table<TransactiontypeRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TransactiontypeRecord> getPrimaryKey() {
        return Keys.KEY_TRANSACTIONTYPE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TransactiontypeRecord>> getKeys() {
        return Arrays.<UniqueKey<TransactiontypeRecord>>asList(Keys.KEY_TRANSACTIONTYPE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Transactiontype as(String alias) {
        return new Transactiontype(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Transactiontype rename(String name) {
        return new Transactiontype(name, null);
    }
}
