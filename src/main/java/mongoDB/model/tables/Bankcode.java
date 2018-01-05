/*
 * This file is generated by jOOQ.
*/
package mongoDB.model.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import mongoDB.model.Keys;
import mongoDB.model.Transaction;
import mongoDB.model.tables.records.BankcodeRecord;

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
public class Bankcode extends TableImpl<BankcodeRecord> {

    private static final long serialVersionUID = -36165742;

    /**
     * The reference instance of <code>transaction.bankCode</code>
     */
    public static final Bankcode BANKCODE = new Bankcode();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BankcodeRecord> getRecordType() {
        return BankcodeRecord.class;
    }

    /**
     * The column <code>transaction.bankCode.bankCode</code>.
     */
    public final TableField<BankcodeRecord, String> BANKCODE_ = createField("bankCode", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");

    /**
     * The column <code>transaction.bankCode.bankName</code>.
     */
    public final TableField<BankcodeRecord, String> BANKNAME = createField("bankName", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>transaction.bankCode.shortName</code>.
     */
    public final TableField<BankcodeRecord, String> SHORTNAME = createField("shortName", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>transaction.bankCode.keyWord</code>.
     */
    public final TableField<BankcodeRecord, String> KEYWORD = createField("keyWord", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>transaction.bankCode.shortNo</code>.
     */
    public final TableField<BankcodeRecord, Integer> SHORTNO = createField("shortNo", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>transaction.bankCode.suggestion</code>.
     */
    public final TableField<BankcodeRecord, Byte> SUGGESTION = createField("suggestion", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * Create a <code>transaction.bankCode</code> table reference
     */
    public Bankcode() {
        this("bankCode", null);
    }

    /**
     * Create an aliased <code>transaction.bankCode</code> table reference
     */
    public Bankcode(String alias) {
        this(alias, BANKCODE);
    }

    private Bankcode(String alias, Table<BankcodeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Bankcode(String alias, Table<BankcodeRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<BankcodeRecord> getPrimaryKey() {
        return Keys.KEY_BANKCODE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BankcodeRecord>> getKeys() {
        return Arrays.<UniqueKey<BankcodeRecord>>asList(Keys.KEY_BANKCODE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Bankcode as(String alias) {
        return new Bankcode(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Bankcode rename(String name) {
        return new Bankcode(name, null);
    }
}
