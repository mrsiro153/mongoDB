/*
 * This file is generated by jOOQ.
*/
package mongoDB.model.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import mongoDB.model.tables.Fdtype;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
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
public class FdtypeRecord extends UpdatableRecordImpl<FdtypeRecord> implements Record14<String, String, String, Integer, String, BigDecimal, String, Integer, Integer, Integer, Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1153751482;

    /**
     * Setter for <code>transaction.fdType.fdTypeId</code>.
     */
    public void setFdtypeid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>transaction.fdType.fdTypeId</code>.
     */
    public String getFdtypeid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>transaction.fdType.adminCif</code>.
     */
    public void setAdmincif(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>transaction.fdType.adminCif</code>.
     */
    public String getAdmincif() {
        return (String) get(1);
    }

    /**
     * Setter for <code>transaction.fdType.typeName</code>.
     */
    public void setTypename(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>transaction.fdType.typeName</code>.
     */
    public String getTypename() {
        return (String) get(2);
    }

    /**
     * Setter for <code>transaction.fdType.term</code>.
     */
    public void setTerm(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>transaction.fdType.term</code>.
     */
    public Integer getTerm() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>transaction.fdType.termCd</code>.
     */
    public void setTermcd(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>transaction.fdType.termCd</code>.
     */
    public String getTermcd() {
        return (String) get(4);
    }

    /**
     * Setter for <code>transaction.fdType.intRate</code>.
     */
    public void setIntrate(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>transaction.fdType.intRate</code>.
     */
    public BigDecimal getIntrate() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>transaction.fdType.intFreq</code>.
     */
    public void setIntfreq(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>transaction.fdType.intFreq</code>.
     */
    public String getIntfreq() {
        return (String) get(6);
    }

    /**
     * Setter for <code>transaction.fdType.intCdByTime</code>.
     */
    public void setIntcdbytime(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>transaction.fdType.intCdByTime</code>.
     */
    public Integer getIntcdbytime() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>transaction.fdType.overIntCd</code>.
     */
    public void setOverintcd(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>transaction.fdType.overIntCd</code>.
     */
    public Integer getOverintcd() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>transaction.fdType.preIntCd</code>.
     */
    public void setPreintcd(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>transaction.fdType.preIntCd</code>.
     */
    public Integer getPreintcd() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>transaction.fdType.preAllow</code>.
     */
    public void setPreallow(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>transaction.fdType.preAllow</code>.
     */
    public Integer getPreallow() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>transaction.fdType.status</code>.
     */
    public void setStatus(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>transaction.fdType.status</code>.
     */
    public Integer getStatus() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>transaction.fdType.createdAt</code>.
     */
    public void setCreatedat(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>transaction.fdType.createdAt</code>.
     */
    public Timestamp getCreatedat() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>transaction.fdType.modifyAt</code>.
     */
    public void setModifyat(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>transaction.fdType.modifyAt</code>.
     */
    public Timestamp getModifyat() {
        return (Timestamp) get(13);
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
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<String, String, String, Integer, String, BigDecimal, String, Integer, Integer, Integer, Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<String, String, String, Integer, String, BigDecimal, String, Integer, Integer, Integer, Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Fdtype.FDTYPE.FDTYPEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Fdtype.FDTYPE.ADMINCIF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Fdtype.FDTYPE.TYPENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Fdtype.FDTYPE.TERM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Fdtype.FDTYPE.TERMCD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return Fdtype.FDTYPE.INTRATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Fdtype.FDTYPE.INTFREQ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Fdtype.FDTYPE.INTCDBYTIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return Fdtype.FDTYPE.OVERINTCD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return Fdtype.FDTYPE.PREINTCD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return Fdtype.FDTYPE.PREALLOW;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return Fdtype.FDTYPE.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return Fdtype.FDTYPE.CREATEDAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return Fdtype.FDTYPE.MODIFYAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getFdtypeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getAdmincif();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTypename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getTerm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTermcd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getIntrate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getIntfreq();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getIntcdbytime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getOverintcd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getPreintcd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getPreallow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getCreatedat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getModifyat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdtypeRecord value1(String value) {
        setFdtypeid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdtypeRecord value2(String value) {
        setAdmincif(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdtypeRecord value3(String value) {
        setTypename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdtypeRecord value4(Integer value) {
        setTerm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdtypeRecord value5(String value) {
        setTermcd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdtypeRecord value6(BigDecimal value) {
        setIntrate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdtypeRecord value7(String value) {
        setIntfreq(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdtypeRecord value8(Integer value) {
        setIntcdbytime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdtypeRecord value9(Integer value) {
        setOverintcd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdtypeRecord value10(Integer value) {
        setPreintcd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdtypeRecord value11(Integer value) {
        setPreallow(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdtypeRecord value12(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdtypeRecord value13(Timestamp value) {
        setCreatedat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdtypeRecord value14(Timestamp value) {
        setModifyat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FdtypeRecord values(String value1, String value2, String value3, Integer value4, String value5, BigDecimal value6, String value7, Integer value8, Integer value9, Integer value10, Integer value11, Integer value12, Timestamp value13, Timestamp value14) {
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
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FdtypeRecord
     */
    public FdtypeRecord() {
        super(Fdtype.FDTYPE);
    }

    /**
     * Create a detached, initialised FdtypeRecord
     */
    public FdtypeRecord(String fdtypeid, String admincif, String typename, Integer term, String termcd, BigDecimal intrate, String intfreq, Integer intcdbytime, Integer overintcd, Integer preintcd, Integer preallow, Integer status, Timestamp createdat, Timestamp modifyat) {
        super(Fdtype.FDTYPE);

        set(0, fdtypeid);
        set(1, admincif);
        set(2, typename);
        set(3, term);
        set(4, termcd);
        set(5, intrate);
        set(6, intfreq);
        set(7, intcdbytime);
        set(8, overintcd);
        set(9, preintcd);
        set(10, preallow);
        set(11, status);
        set(12, createdat);
        set(13, modifyat);
    }
}
