/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ingres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TIdentity extends org.jooq.impl.TableImpl<org.jooq.test.ingres.generatedclasses.tables.records.TIdentityRecord> {

	private static final long serialVersionUID = -1372032234;

	/**
	 * The singleton instance of <code>test.t_identity</code>
	 */
	public static final org.jooq.test.ingres.generatedclasses.tables.TIdentity T_IDENTITY = new org.jooq.test.ingres.generatedclasses.tables.TIdentity();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.ingres.generatedclasses.tables.records.TIdentityRecord> getRecordType() {
		return org.jooq.test.ingres.generatedclasses.tables.records.TIdentityRecord.class;
	}

	/**
	 * The column <code>test.t_identity.id</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, T_IDENTITY);

	/**
	 * The column <code>test.t_identity.val</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> VAL = createField("val", org.jooq.impl.SQLDataType.INTEGER, T_IDENTITY);

	/**
	 * No further instances allowed
	 */
	private TIdentity() {
		super("t_identity", org.jooq.test.ingres.generatedclasses.Test.TEST);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.test.ingres.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> getIdentity() {
		return org.jooq.test.ingres.generatedclasses.Keys.IDENTITY_T_IDENTITY;
	}
}
