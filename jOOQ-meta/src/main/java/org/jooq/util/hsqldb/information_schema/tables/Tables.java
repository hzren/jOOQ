/**
 * This class is generated by jOOQ
 */
package org.jooq.util.hsqldb.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class Tables extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 440470701;

	/**
	 * The singleton instance of <code>INFORMATION_SCHEMA.TABLES</code>
	 */
	public static final org.jooq.util.hsqldb.information_schema.tables.Tables TABLES = new org.jooq.util.hsqldb.information_schema.tables.Tables();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLES.TABLE_CATALOG</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLES.TABLE_SCHEMA</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLES.TABLE_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLES.TABLE_TYPE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_TYPE = createField("TABLE_TYPE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLES.SELF_REFERENCING_COLUMN_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SELF_REFERENCING_COLUMN_NAME = createField("SELF_REFERENCING_COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLES.REFERENCE_GENERATION</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> REFERENCE_GENERATION = createField("REFERENCE_GENERATION", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLES.USER_DEFINED_TYPE_CATALOG</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> USER_DEFINED_TYPE_CATALOG = createField("USER_DEFINED_TYPE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLES.USER_DEFINED_TYPE_SCHEMA</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> USER_DEFINED_TYPE_SCHEMA = createField("USER_DEFINED_TYPE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLES.USER_DEFINED_TYPE_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> USER_DEFINED_TYPE_NAME = createField("USER_DEFINED_TYPE_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLES.IS_INSERTABLE_INTO</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IS_INSERTABLE_INTO = createField("IS_INSERTABLE_INTO", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLES.IS_TYPED</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IS_TYPED = createField("IS_TYPED", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLES.COMMIT_ACTION</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> COMMIT_ACTION = createField("COMMIT_ACTION", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Create a <code>INFORMATION_SCHEMA.TABLES</code> table reference
	 */
	public Tables() {
		super("TABLES", org.jooq.util.hsqldb.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}

	/**
	 * Create an aliased <code>INFORMATION_SCHEMA.TABLES</code> table reference
	 */
	public Tables(java.lang.String alias) {
		super(alias, org.jooq.util.hsqldb.information_schema.InformationSchema.INFORMATION_SCHEMA, org.jooq.util.hsqldb.information_schema.tables.Tables.TABLES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.util.hsqldb.information_schema.tables.Tables as(java.lang.String alias) {
		return new org.jooq.util.hsqldb.information_schema.tables.Tables(alias);
	}
}
