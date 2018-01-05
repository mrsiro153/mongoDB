/*
 * This file is generated by jOOQ.
*/
package mongoDB.model.tables;


import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import mongoDB.model.Keys;
import mongoDB.model.Transaction;
import mongoDB.model.tables.records.CustomertypeRecord;

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
public class Customertype extends TableImpl<CustomertypeRecord> {

    private static final long serialVersionUID = -72009378;

    /**
     * The reference instance of <code>transaction.customerType</code>
     */
    public static final Customertype CUSTOMERTYPE = new Customertype();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CustomertypeRecord> getRecordType() {
        return CustomertypeRecord.class;
    }

    /**
     * The column <code>transaction.customerType.id</code>.
     */
    public final TableField<CustomertypeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>transaction.customerType.allUser</code>.
     */
    public final TableField<CustomertypeRecord, Integer> ALLUSER = createField("allUser", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>transaction.customerType.fromBirth</code>.
     */
    public final TableField<CustomertypeRecord, Date> FROMBIRTH = createField("fromBirth", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>transaction.customerType.toBirth</code>.
     */
    public final TableField<CustomertypeRecord, Date> TOBIRTH = createField("toBirth", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>transaction.customerType.fromRegister</code>.
     */
    public final TableField<CustomertypeRecord, Date> FROMREGISTER = createField("fromRegister", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>transaction.customerType.toRegister</code>.
     */
    public final TableField<CustomertypeRecord, Date> TOREGISTER = createField("toRegister", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>transaction.customerType.status</code>.
     */
    public final TableField<CustomertypeRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>transaction.customerType.createdAt</code>.
     */
    public final TableField<CustomertypeRecord, Timestamp> CREATEDAT = createField("createdAt", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>transaction.customerType.modifiedAt</code>.
     */
    public final TableField<CustomertypeRecord, Timestamp> MODIFIEDAT = createField("modifiedAt", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>transaction.customerType</code> table reference
     */
    public Customertype() {
        this("customerType", null);
    }

    /**
     * Create an aliased <code>transaction.customerType</code> table reference
     */
    public Customertype(String alias) {
        this(alias, CUSTOMERTYPE);
    }

    private Customertype(String alias, Table<CustomertypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Customertype(String alias, Table<CustomertypeRecord> aliased, Field<?>[] parameters) {
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
    public Identity<CustomertypeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CUSTOMERTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CustomertypeRecord> getPrimaryKey() {
        return Keys.KEY_CUSTOMERTYPE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CustomertypeRecord>> getKeys() {
        return Arrays.<UniqueKey<CustomertypeRecord>>asList(Keys.KEY_CUSTOMERTYPE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Customertype as(String alias) {
        return new Customertype(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Customertype rename(String name) {
        return new Customertype(name, null);
    }
}
