/*
 * This file is generated by jOOQ.
*/
package mongoDB.model.tables.records;


import javax.annotation.Generated;

import mongoDB.model.tables.Fee;

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
public class FeeRecord extends UpdatableRecordImpl<FeeRecord> implements Record8<Integer, String, String, Long, Integer, String, Long, Long> {

    private static final long serialVersionUID = 1394685661;

    /**
     * Setter for <code>transaction.fee.feeId</code>.
     */
    public void setFeeid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>transaction.fee.feeId</code>.
     */
    public Integer getFeeid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>transaction.fee.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>transaction.fee.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>transaction.fee.image</code>.
     */
    public void setImage(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>transaction.fee.image</code>.
     */
    public String getImage() {
        return (String) get(2);
    }

    /**
     * Setter for <code>transaction.fee.fee</code>.
     */
    public void setFee(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>transaction.fee.fee</code>.
     */
    public Long getFee() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>transaction.fee.ruleId</code>.
     */
    public void setRuleid(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>transaction.fee.ruleId</code>.
     */
    public Integer getRuleid() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>transaction.fee.modifiedBy</code>.
     */
    public void setModifiedby(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>transaction.fee.modifiedBy</code>.
     */
    public String getModifiedby() {
        return (String) get(5);
    }

    /**
     * Setter for <code>transaction.fee.createdAt</code>.
     */
    public void setCreatedat(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>transaction.fee.createdAt</code>.
     */
    public Long getCreatedat() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>transaction.fee.modifiedAt</code>.
     */
    public void setModifiedat(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>transaction.fee.modifiedAt</code>.
     */
    public Long getModifiedat() {
        return (Long) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, Long, Integer, String, Long, Long> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, String, Long, Integer, String, Long, Long> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Fee.FEE.FEEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Fee.FEE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Fee.FEE.IMAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return Fee.FEE.FEE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Fee.FEE.RULEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Fee.FEE.MODIFIEDBY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return Fee.FEE.CREATEDAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return Fee.FEE.MODIFIEDAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getFeeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getImage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getFee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getRuleid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getModifiedby();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getCreatedat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getModifiedat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeeRecord value1(Integer value) {
        setFeeid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeeRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeeRecord value3(String value) {
        setImage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeeRecord value4(Long value) {
        setFee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeeRecord value5(Integer value) {
        setRuleid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeeRecord value6(String value) {
        setModifiedby(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeeRecord value7(Long value) {
        setCreatedat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeeRecord value8(Long value) {
        setModifiedat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FeeRecord values(Integer value1, String value2, String value3, Long value4, Integer value5, String value6, Long value7, Long value8) {
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
     * Create a detached FeeRecord
     */
    public FeeRecord() {
        super(Fee.FEE);
    }

    /**
     * Create a detached, initialised FeeRecord
     */
    public FeeRecord(Integer feeid, String name, String image, Long fee, Integer ruleid, String modifiedby, Long createdat, Long modifiedat) {
        super(Fee.FEE);

        set(0, feeid);
        set(1, name);
        set(2, image);
        set(3, fee);
        set(4, ruleid);
        set(5, modifiedby);
        set(6, createdat);
        set(7, modifiedat);
    }
}
