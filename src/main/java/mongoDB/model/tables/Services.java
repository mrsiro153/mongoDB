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
import mongoDB.model.tables.records.ServicesRecord;

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
public class Services extends TableImpl<ServicesRecord> {

    private static final long serialVersionUID = -1903871182;

    /**
     * The reference instance of <code>transaction.services</code>
     */
    public static final Services SERVICES = new Services();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ServicesRecord> getRecordType() {
        return ServicesRecord.class;
    }

    /**
     * The column <code>transaction.services.id</code>.
     */
    public final TableField<ServicesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>transaction.services.titleVn</code>.
     */
    public final TableField<ServicesRecord, String> TITLEVN = createField("titleVn", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>transaction.services.titleEn</code>.
     */
    public final TableField<ServicesRecord, String> TITLEEN = createField("titleEn", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>transaction.services.icon</code>.
     */
    public final TableField<ServicesRecord, String> ICON = createField("icon", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

    /**
     * The column <code>transaction.services.image</code>.
     */
    public final TableField<ServicesRecord, String> IMAGE = createField("image", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

    /**
     * The column <code>transaction.services.descriptionVn</code>.
     */
    public final TableField<ServicesRecord, String> DESCRIPTIONVN = createField("descriptionVn", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>transaction.services.descriptionEn</code>.
     */
    public final TableField<ServicesRecord, String> DESCRIPTIONEN = createField("descriptionEn", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>transaction.services.servicesType</code>.
     */
    public final TableField<ServicesRecord, Integer> SERVICESTYPE = createField("servicesType", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>transaction.services.status</code>.
     */
    public final TableField<ServicesRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>transaction.services.modifiedBy</code>.
     */
    public final TableField<ServicesRecord, String> MODIFIEDBY = createField("modifiedBy", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>transaction.services.createdAt</code>.
     */
    public final TableField<ServicesRecord, Timestamp> CREATEDAT = createField("createdAt", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>transaction.services.modifiedAt</code>.
     */
    public final TableField<ServicesRecord, Timestamp> MODIFIEDAT = createField("modifiedAt", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>transaction.services</code> table reference
     */
    public Services() {
        this("services", null);
    }

    /**
     * Create an aliased <code>transaction.services</code> table reference
     */
    public Services(String alias) {
        this(alias, SERVICES);
    }

    private Services(String alias, Table<ServicesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Services(String alias, Table<ServicesRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ServicesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SERVICES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ServicesRecord> getPrimaryKey() {
        return Keys.KEY_SERVICES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ServicesRecord>> getKeys() {
        return Arrays.<UniqueKey<ServicesRecord>>asList(Keys.KEY_SERVICES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Services as(String alias) {
        return new Services(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Services rename(String name) {
        return new Services(name, null);
    }
}
