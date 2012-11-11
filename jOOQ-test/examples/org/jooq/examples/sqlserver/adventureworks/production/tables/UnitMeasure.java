/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class UnitMeasure extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.UnitMeasure> {

	private static final long serialVersionUID = -418160627;

	/**
	 * The singleton instance of <code>Production.UnitMeasure</code>
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.production.tables.UnitMeasure UnitMeasure = new org.jooq.examples.sqlserver.adventureworks.production.tables.UnitMeasure();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.UnitMeasure> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.records.UnitMeasure.class;
	}

	/**
	 * The column <code>Production.UnitMeasure.UnitMeasureCode</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.UnitMeasure, java.lang.String> UnitMeasureCode = createField("UnitMeasureCode", org.jooq.impl.SQLDataType.NCHAR, this);

	/**
	 * The column <code>Production.UnitMeasure.Name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.UnitMeasure, java.lang.String> Name = createField("Name", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The column <code>Production.UnitMeasure.ModifiedDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.UnitMeasure, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>Production.UnitMeasure</code> table reference
	 */
	public UnitMeasure() {
		super("UnitMeasure", org.jooq.examples.sqlserver.adventureworks.production.Production.Production);
	}

	/**
	 * Create an aliased <code>Production.UnitMeasure</code> table reference
	 */
	public UnitMeasure(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.production.Production.Production, org.jooq.examples.sqlserver.adventureworks.production.tables.UnitMeasure.UnitMeasure);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.UnitMeasure> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_UnitMeasure_UnitMeasureCode;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.UnitMeasure>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.UnitMeasure>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_UnitMeasure_UnitMeasureCode);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.sqlserver.adventureworks.production.tables.UnitMeasure as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.production.tables.UnitMeasure(alias);
	}
}
