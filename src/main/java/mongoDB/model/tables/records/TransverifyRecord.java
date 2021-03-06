/*
 * This file is generated by jOOQ.
*/
package mongoDB.model.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import mongoDB.model.tables.Transverify;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class TransverifyRecord extends UpdatableRecordImpl<TransverifyRecord> implements Record8<String, String, Integer, Integer, Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1998350323;

    /**
     * Setter for <code>transaction.transVerify.transactionNumber</code>.
     */
    public void setTransactionnumber(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>transaction.transVerify.transactionNumber</code>.
     */
    public String getTransactionnumber() {
        return (String) get(0);
    }

    /**
     * Setter for <code>transaction.transVerify.refKey</code>.
     */
    public void setRefkey(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>transaction.transVerify.refKey</code>.
     */
    public String getRefkey() {
        return (String) get(1);
    }

    /**
     * Setter for <code>transaction.transVerify.verifyOTP</code>.
     */
    public void setVerifyotp(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>transaction.transVerify.verifyOTP</code>.
     */
    public Integer getVerifyotp() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>transaction.transVerify.verifyAccount</code>.
     */
    public void setVerifyaccount(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>transaction.transVerify.verifyAccount</code>.
     */
    public Integer getVerifyaccount() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>transaction.transVerify.verifyUser</code>.
     */
    public void setVerifyuser(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>transaction.transVerify.verifyUser</code>.
     */
    public Integer getVerifyuser() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>transaction.transVerify.statusToFront</code>.
     */
    public void setStatustofront(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>transaction.transVerify.statusToFront</code>.
     */
    public Integer getStatustofront() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>transaction.transVerify.createdAt</code>.
     */
    public void setCreatedat(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>transaction.transVerify.createdAt</code>.
     */
    public Timestamp getCreatedat() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>transaction.transVerify.modifiedAt</code>.
     */
    public void setModifiedat(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>transaction.transVerify.modifiedAt</code>.
     */
    public Timestamp getModifiedat() {
        return (Timestamp) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, Integer, Integer, Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, Integer, Integer, Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Transverify.TRANSVERIFY.TRANSACTIONNUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Transverify.TRANSVERIFY.REFKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Transverify.TRANSVERIFY.VERIFYOTP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Transverify.TRANSVERIFY.VERIFYACCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Transverify.TRANSVERIFY.VERIFYUSER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Transverify.TRANSVERIFY.STATUSTOFRONT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Transverify.TRANSVERIFY.CREATEDAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return Transverify.TRANSVERIFY.MODIFIEDAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getTransactionnumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getRefkey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getVerifyotp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getVerifyaccount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getVerifyuser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getStatustofront();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreatedat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getModifiedat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransverifyRecord value1(String value) {
        setTransactionnumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransverifyRecord value2(String value) {
        setRefkey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransverifyRecord value3(Integer value) {
        setVerifyotp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransverifyRecord value4(Integer value) {
        setVerifyaccount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransverifyRecord value5(Integer value) {
        setVerifyuser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransverifyRecord value6(Integer value) {
        setStatustofront(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransverifyRecord value7(Timestamp value) {
        setCreatedat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransverifyRecord value8(Timestamp value) {
        setModifiedat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TransverifyRecord values(String value1, String value2, Integer value3, Integer value4, Integer value5, Integer value6, Timestamp value7, Timestamp value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TransverifyRecord
     */
    public TransverifyRecord() {
        super(Transverify.TRANSVERIFY);
    }

    /**
     * Create a detached, initialised TransverifyRecord
     */
    public TransverifyRecord(String transactionnumber, String refkey, Integer verifyotp, Integer verifyaccount, Integer verifyuser, Integer statustofront, Timestamp createdat, Timestamp modifiedat) {
        super(Transverify.TRANSVERIFY);

        set(0, transactionnumber);
        set(1, refkey);
        set(2, verifyotp);
        set(3, verifyaccount);
        set(4, verifyuser);
        set(5, statustofront);
        set(6, createdat);
        set(7, modifiedat);
    }
}
