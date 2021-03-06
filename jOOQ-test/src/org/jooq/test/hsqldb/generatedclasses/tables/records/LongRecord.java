/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LongRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.LongRecord> implements org.jooq.Record2<java.lang.Integer, java.lang.Long>, org.jooq.test.hsqldb.generatedclasses.tables.interfaces.ILong {

	private static final long serialVersionUID = 1475318459;

	/**
	 * Setter for <code>PUBLIC.LONG.ID</code>. 
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>PUBLIC.LONG.ID</code>. 
	 */
	@Override
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>PUBLIC.LONG.OTHER</code>. 
	 */
	@Override
	public void setOther(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>PUBLIC.LONG.OTHER</code>. 
	 */
	@Override
	public java.lang.Long getOther() {
		return (java.lang.Long) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Long> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Long> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.hsqldb.generatedclasses.tables.Long.LONG.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return org.jooq.test.hsqldb.generatedclasses.tables.Long.LONG.OTHER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value2() {
		return getOther();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LongRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LongRecord value2(java.lang.Long value) {
		setOther(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public LongRecord values(java.lang.Integer value1, java.lang.Long value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.hsqldb.generatedclasses.tables.interfaces.ILong from) {
		setId(from.getId());
		setOther(from.getOther());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.hsqldb.generatedclasses.tables.interfaces.ILong> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached LongRecord
	 */
	public LongRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.Long.LONG);
	}

	/**
	 * Create a detached, initialised LongRecord
	 */
	public LongRecord(java.lang.Integer id, java.lang.Long other) {
		super(org.jooq.test.hsqldb.generatedclasses.tables.Long.LONG);

		setValue(0, id);
		setValue(1, other);
	}
}
