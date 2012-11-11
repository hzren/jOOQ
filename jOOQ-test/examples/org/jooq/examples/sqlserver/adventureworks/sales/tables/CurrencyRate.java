/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class CurrencyRate extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyRate> {

	private static final long serialVersionUID = -233849417;

	/**
	 * The singleton instance of <code>Sales.CurrencyRate</code>
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.sales.tables.CurrencyRate CurrencyRate = new org.jooq.examples.sqlserver.adventureworks.sales.tables.CurrencyRate();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyRate> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyRate.class;
	}

	/**
	 * The column <code>Sales.CurrencyRate.CurrencyRateID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyRate, java.lang.Integer> CurrencyRateID = createField("CurrencyRateID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>Sales.CurrencyRate.CurrencyRateDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyRate, java.sql.Timestamp> CurrencyRateDate = createField("CurrencyRateDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>Sales.CurrencyRate.FromCurrencyCode</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyRate, java.lang.String> FromCurrencyCode = createField("FromCurrencyCode", org.jooq.impl.SQLDataType.NCHAR, this);

	/**
	 * The column <code>Sales.CurrencyRate.ToCurrencyCode</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyRate, java.lang.String> ToCurrencyCode = createField("ToCurrencyCode", org.jooq.impl.SQLDataType.NCHAR, this);

	/**
	 * The column <code>Sales.CurrencyRate.AverageRate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyRate, java.math.BigDecimal> AverageRate = createField("AverageRate", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>Sales.CurrencyRate.EndOfDayRate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyRate, java.math.BigDecimal> EndOfDayRate = createField("EndOfDayRate", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>Sales.CurrencyRate.ModifiedDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyRate, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>Sales.CurrencyRate</code> table reference
	 */
	public CurrencyRate() {
		super("CurrencyRate", org.jooq.examples.sqlserver.adventureworks.sales.Sales.Sales);
	}

	/**
	 * Create an aliased <code>Sales.CurrencyRate</code> table reference
	 */
	public CurrencyRate(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.sales.Sales.Sales, org.jooq.examples.sqlserver.adventureworks.sales.tables.CurrencyRate.CurrencyRate);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyRate, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.IDENTITY_CurrencyRate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyRate> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_CurrencyRate_CurrencyRateID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyRate>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyRate>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_CurrencyRate_CurrencyRateID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyRate, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyRate, ?>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_CurrencyRate_Currency_FromCurrencyCode, org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_CurrencyRate_Currency_ToCurrencyCode);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.sqlserver.adventureworks.sales.tables.CurrencyRate as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.sales.tables.CurrencyRate(alias);
	}
}
