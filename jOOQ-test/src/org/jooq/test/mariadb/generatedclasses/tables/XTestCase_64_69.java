/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mariadb.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTestCase_64_69 extends org.jooq.impl.TableImpl<org.jooq.test.mariadb.generatedclasses.tables.records.XTestCase_64_69Record> {

	private static final long serialVersionUID = 1211297883;

	/**
	 * The singleton instance of <code>test.x_test_case_64_69</code>
	 */
	public static final org.jooq.test.mariadb.generatedclasses.tables.XTestCase_64_69 X_TEST_CASE_64_69 = new org.jooq.test.mariadb.generatedclasses.tables.XTestCase_64_69();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mariadb.generatedclasses.tables.records.XTestCase_64_69Record> getRecordType() {
		return org.jooq.test.mariadb.generatedclasses.tables.records.XTestCase_64_69Record.class;
	}

	/**
	 * The column <code>test.x_test_case_64_69.ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.mariadb.generatedclasses.tables.records.XTestCase_64_69Record, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), X_TEST_CASE_64_69);

	/**
	 * The column <code>test.x_test_case_64_69.UNUSED_ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.mariadb.generatedclasses.tables.records.XTestCase_64_69Record, java.lang.Integer> UNUSED_ID = createField("UNUSED_ID", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_64_69);

	/**
	 * No further instances allowed
	 */
	private XTestCase_64_69() {
		super("x_test_case_64_69", org.jooq.test.mariadb.generatedclasses.Test.TEST);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.mariadb.generatedclasses.tables.records.XTestCase_64_69Record> getPrimaryKey() {
		return org.jooq.test.mariadb.generatedclasses.Keys.KEY_X_TEST_CASE_64_69_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.mariadb.generatedclasses.tables.records.XTestCase_64_69Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.mariadb.generatedclasses.tables.records.XTestCase_64_69Record>>asList(org.jooq.test.mariadb.generatedclasses.Keys.KEY_X_TEST_CASE_64_69_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.mariadb.generatedclasses.tables.records.XTestCase_64_69Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.mariadb.generatedclasses.tables.records.XTestCase_64_69Record, ?>>asList(org.jooq.test.mariadb.generatedclasses.Keys.FK_X_TEST_CASE_64_69A, org.jooq.test.mariadb.generatedclasses.Keys.FK_X_TEST_CASE_64_69B);
	}
}
