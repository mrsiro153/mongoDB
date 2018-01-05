/*
 * This file is generated by jOOQ.
*/
package mongoDB.model.tables.records;


import java.math.BigInteger;
import java.sql.Timestamp;

import javax.annotation.Generated;

import mongoDB.model.tables.Producttype;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ProducttypeRecord extends UpdatableRecordImpl<ProducttypeRecord> implements Record12<Integer, Integer, BigInteger, BigInteger, Long, Long, String, Double, Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 103246977;

    /**
     * Setter for <code>transaction.productType.productTypeId</code>.
     */
    public void setProducttypeid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>transaction.productType.productTypeId</code>.
     */
    public Integer getProducttypeid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>transaction.productType.productID</code>.
     */
    public void setProductid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>transaction.productType.productID</code>.
     */
    public Integer getProductid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>transaction.productType.maxAmount</code>.
     */
    public void setMaxamount(BigInteger value) {
        set(2, value);
    }

    /**
     * Getter for <code>transaction.productType.maxAmount</code>.
     */
    public BigInteger getMaxamount() {
        return (BigInteger) get(2);
    }

    /**
     * Setter for <code>transaction.productType.minAmount</code>.
     */
    public void setMinamount(BigInteger value) {
        set(3, value);
    }

    /**
     * Getter for <code>transaction.productType.minAmount</code>.
     */
    public BigInteger getMinamount() {
        return (BigInteger) get(3);
    }

    /**
     * Setter for <code>transaction.productType.fromDate</code>.
     */
    public void setFromdate(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>transaction.productType.fromDate</code>.
     */
    public Long getFromdate() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>transaction.productType.toDate</code>.
     */
    public void setTodate(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>transaction.productType.toDate</code>.
     */
    public Long getTodate() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>transaction.productType.description</code>.
     */
    public void setDescription(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>transaction.productType.description</code>.
     */
    public String getDescription() {
        return (String) get(6);
    }

    /**
     * Setter for <code>transaction.productType.interest</code>.
     */
    public void setInterest(Double value) {
        set(7, value);
    }

    /**
     * Getter for <code>transaction.productType.interest</code>.
     */
    public Double getInterest() {
        return (Double) get(7);
    }

    /**
     * Setter for <code>transaction.productType.period</code>.
     */
    public void setPeriod(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>transaction.productType.period</code>.
     */
    public Integer getPeriod() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>transaction.productType.status</code>.
     */
    public void setStatus(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>transaction.productType.status</code>.
     */
    public Integer getStatus() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>transaction.productType.createdAt</code>.
     */
    public void setCreatedat(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>transaction.productType.createdAt</code>.
     */
    public Timestamp getCreatedat() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>transaction.productType.modifiedAt</code>.
     */
    public void setModifiedat(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>transaction.productType.modifiedAt</code>.
     */
    public Timestamp getModifiedat() {
        return (Timestamp) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, BigInteger, BigInteger, Long, Long, String, Double, Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, BigInteger, BigInteger, Long, Long, String, Double, Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Producttype.PRODUCTTYPE.PRODUCTTYPEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Producttype.PRODUCTTYPE.PRODUCTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field3() {
        return Producttype.PRODUCTTYPE.MAXAMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field4() {
        return Producttype.PRODUCTTYPE.MINAMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return Producttype.PRODUCTTYPE.FROMDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return Producttype.PRODUCTTYPE.TODATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Producttype.PRODUCTTYPE.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field8() {
        return Producttype.PRODUCTTYPE.INTEREST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return Producttype.PRODUCTTYPE.PERIOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return Producttype.PRODUCTTYPE.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return Producttype.PRODUCTTYPE.CREATEDAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return Producttype.PRODUCTTYPE.MODIFIEDAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getProducttypeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getProductid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value3() {
        return getMaxamount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value4() {
        return getMinamount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getFromdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getTodate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value8() {
        return getInterest();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getPeriod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getCreatedat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getModifiedat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProducttypeRecord value1(Integer value) {
        setProducttypeid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProducttypeRecord value2(Integer value) {
        setProductid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProducttypeRecord value3(BigInteger value) {
        setMaxamount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProducttypeRecord value4(BigInteger value) {
        setMinamount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProducttypeRecord value5(Long value) {
        setFromdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProducttypeRecord value6(Long value) {
        setTodate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProducttypeRecord value7(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProducttypeRecord value8(Double value) {
        setInterest(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProducttypeRecord value9(Integer value) {
        setPeriod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProducttypeRecord value10(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProducttypeRecord value11(Timestamp value) {
        setCreatedat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProducttypeRecord value12(Timestamp value) {
        setModifiedat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProducttypeRecord values(Integer value1, Integer value2, BigInteger value3, BigInteger value4, Long value5, Long value6, String value7, Double value8, Integer value9, Integer value10, Timestamp value11, Timestamp value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProducttypeRecord
     */
    public ProducttypeRecord() {
        super(Producttype.PRODUCTTYPE);
    }

    /**
     * Create a detached, initialised ProducttypeRecord
     */
    public ProducttypeRecord(Integer producttypeid, Integer productid, BigInteger maxamount, BigInteger minamount, Long fromdate, Long todate, String description, Double interest, Integer period, Integer status, Timestamp createdat, Timestamp modifiedat) {
        super(Producttype.PRODUCTTYPE);

        set(0, producttypeid);
        set(1, productid);
        set(2, maxamount);
        set(3, minamount);
        set(4, fromdate);
        set(5, todate);
        set(6, description);
        set(7, interest);
        set(8, period);
        set(9, status);
        set(10, createdat);
        set(11, modifiedat);
    }
}
