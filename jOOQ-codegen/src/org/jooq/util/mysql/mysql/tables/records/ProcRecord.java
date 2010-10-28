/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.mysql.tables.records;


import java.sql.Timestamp;

import org.jooq.Configuration;
import org.jooq.impl.TableRecordImpl;
import org.jooq.util.mysql.mysql.enums.ProcIsDeterministic;
import org.jooq.util.mysql.mysql.enums.ProcLanguage;
import org.jooq.util.mysql.mysql.enums.ProcSecurityType;
import org.jooq.util.mysql.mysql.enums.ProcSqlDataAccess;
import org.jooq.util.mysql.mysql.enums.ProcType;
import org.jooq.util.mysql.mysql.tables.Proc;


/**
 * This class is generated by jOOQ.
 *
 * Stored Procedures
 */
public class ProcRecord extends TableRecordImpl<ProcRecord> {

	private static final long serialVersionUID = 1L;

	/**
	 * An uncommented item
	 */
	public void setDb(String value) {
		setValue(Proc.DB, value);
	}

	/**
	 * An uncommented item
	 */
	public String getDb() {
		return getValue(Proc.DB);
	}

	/**
	 * An uncommented item
	 */
	public void setName(String value) {
		setValue(Proc.NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getName() {
		return getValue(Proc.NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setType(ProcType value) {
		setValue(Proc.TYPE, value);
	}

	/**
	 * An uncommented item
	 */
	public ProcType getType() {
		return getValue(Proc.TYPE);
	}

	/**
	 * An uncommented item
	 */
	public void setSpecificName(String value) {
		setValue(Proc.SPECIFIC_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getSpecificName() {
		return getValue(Proc.SPECIFIC_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setLanguage(ProcLanguage value) {
		setValue(Proc.LANGUAGE, value);
	}

	/**
	 * An uncommented item
	 */
	public ProcLanguage getLanguage() {
		return getValue(Proc.LANGUAGE);
	}

	/**
	 * An uncommented item
	 */
	public void setSqlDataAccess(ProcSqlDataAccess value) {
		setValue(Proc.SQL_DATA_ACCESS, value);
	}

	/**
	 * An uncommented item
	 */
	public ProcSqlDataAccess getSqlDataAccess() {
		return getValue(Proc.SQL_DATA_ACCESS);
	}

	/**
	 * An uncommented item
	 */
	public void setIsDeterministic(ProcIsDeterministic value) {
		setValue(Proc.IS_DETERMINISTIC, value);
	}

	/**
	 * An uncommented item
	 */
	public ProcIsDeterministic getIsDeterministic() {
		return getValue(Proc.IS_DETERMINISTIC);
	}

	/**
	 * An uncommented item
	 */
	public void setSecurityType(ProcSecurityType value) {
		setValue(Proc.SECURITY_TYPE, value);
	}

	/**
	 * An uncommented item
	 */
	public ProcSecurityType getSecurityType() {
		return getValue(Proc.SECURITY_TYPE);
	}

	/**
	 * An uncommented item
	 */
	public void setParamList(byte[] value) {
		setValue(Proc.PARAM_LIST, value);
	}

	/**
	 * An uncommented item
	 */
	public byte[] getParamList() {
		return getValue(Proc.PARAM_LIST);
	}

	/**
	 * An uncommented item
	 */
	public void setReturns(byte[] value) {
		setValue(Proc.RETURNS, value);
	}

	/**
	 * An uncommented item
	 */
	public byte[] getReturns() {
		return getValue(Proc.RETURNS);
	}

	/**
	 * An uncommented item
	 */
	public void setBody(byte[] value) {
		setValue(Proc.BODY, value);
	}

	/**
	 * An uncommented item
	 */
	public byte[] getBody() {
		return getValue(Proc.BODY);
	}

	/**
	 * An uncommented item
	 */
	public void setDefiner(String value) {
		setValue(Proc.DEFINER, value);
	}

	/**
	 * An uncommented item
	 */
	public String getDefiner() {
		return getValue(Proc.DEFINER);
	}

	/**
	 * An uncommented item
	 */
	public void setCreated(Timestamp value) {
		setValue(Proc.CREATED, value);
	}

	/**
	 * An uncommented item
	 */
	public Timestamp getCreated() {
		return getValue(Proc.CREATED);
	}

	/**
	 * An uncommented item
	 */
	public void setModified(Timestamp value) {
		setValue(Proc.MODIFIED, value);
	}

	/**
	 * An uncommented item
	 */
	public Timestamp getModified() {
		return getValue(Proc.MODIFIED);
	}

	/**
	 * An uncommented item
	 */
	public void setSqlMode(String value) {
		setValue(Proc.SQL_MODE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getSqlMode() {
		return getValue(Proc.SQL_MODE);
	}

	/**
	 * An uncommented item
	 */
	public void setComment(String value) {
		setValue(Proc.COMMENT, value);
	}

	/**
	 * An uncommented item
	 */
	public String getComment() {
		return getValue(Proc.COMMENT);
	}

	/**
	 * An uncommented item
	 */
	public void setCharacterSetClient(String value) {
		setValue(Proc.CHARACTER_SET_CLIENT, value);
	}

	/**
	 * An uncommented item
	 */
	public String getCharacterSetClient() {
		return getValue(Proc.CHARACTER_SET_CLIENT);
	}

	/**
	 * An uncommented item
	 */
	public void setCollationConnection(String value) {
		setValue(Proc.COLLATION_CONNECTION, value);
	}

	/**
	 * An uncommented item
	 */
	public String getCollationConnection() {
		return getValue(Proc.COLLATION_CONNECTION);
	}

	/**
	 * An uncommented item
	 */
	public void setDbCollation(String value) {
		setValue(Proc.DB_COLLATION, value);
	}

	/**
	 * An uncommented item
	 */
	public String getDbCollation() {
		return getValue(Proc.DB_COLLATION);
	}

	/**
	 * An uncommented item
	 */
	public void setBodyUtf8(byte[] value) {
		setValue(Proc.BODY_UTF8, value);
	}

	/**
	 * An uncommented item
	 */
	public byte[] getBodyUtf8() {
		return getValue(Proc.BODY_UTF8);
	}

	public ProcRecord(Configuration configuration) {
		super(configuration, Proc.PROC);
	}
}
