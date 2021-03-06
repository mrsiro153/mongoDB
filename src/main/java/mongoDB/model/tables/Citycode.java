/*
 * This file is generated by jOOQ.
*/
package mongoDB.model.tables;


import javax.annotation.Generated;

import mongoDB.model.Transaction;
import mongoDB.model.tables.records.CitycodeRecord;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class Citycode extends TableImpl<CitycodeRecord> {

    private static final long serialVersionUID = 1377841287;

    /**
     * The reference instance of <code>transaction.cityCode</code>
     */
    public static final Citycode CITYCODE = new Citycode();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CitycodeRecord> getRecordType() {
        return CitycodeRecord.class;
    }

    /**
     * The column <code>transaction.cityCode.cityName</code>.
     */
    public final TableField<CitycodeRecord, String> CITYNAME = createField("cityName", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>transaction.cityCode.cityCode</code>.
     */
    public final TableField<CitycodeRecord, String> CITYCODE_ = createField("cityCode", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>transaction.cityCode.type</code>.
     */
    public final TableField<CitycodeRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>transaction.cityCode</code> table reference
     */
    public Citycode() {
        this("cityCode", null);
    }

    /**
     * Create an aliased <code>transaction.cityCode</code> table reference
     */
    public Citycode(String alias) {
        this(alias, CITYCODE);
    }

    private Citycode(String alias, Table<CitycodeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Citycode(String alias, Table<CitycodeRecord> aliased, Field<?>[] parameters) {
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
    public Citycode as(String alias) {
        return new Citycode(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Citycode rename(String name) {
        return new Citycode(name, null);
    }
}
