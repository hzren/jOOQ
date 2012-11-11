/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "SalesTerritoryHistory", schema = "Sales", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"SalesPersonID", "StartDate", "TerritoryID"})
})
public class SalesTerritoryHistory extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesTerritoryHistory> implements org.jooq.Record6<java.lang.Integer, java.lang.Integer, java.sql.Timestamp, java.sql.Timestamp, java.lang.String, java.sql.Timestamp> {

	private static final long serialVersionUID = 1900158851;

	/**
	 * Setter for <code>Sales.SalesTerritoryHistory.SalesPersonID</code>. 
	 */
	public void setSalesPersonID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.SalesPersonID, value);
	}

	/**
	 * Getter for <code>Sales.SalesTerritoryHistory.SalesPersonID</code>. 
	 */
	@javax.persistence.Column(name = "SalesPersonID", nullable = false, precision = 10)
	public java.lang.Integer getSalesPersonID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.SalesPersonID);
	}

	/**
	 * Setter for <code>Sales.SalesTerritoryHistory.TerritoryID</code>. 
	 */
	public void setTerritoryID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.TerritoryID, value);
	}

	/**
	 * Getter for <code>Sales.SalesTerritoryHistory.TerritoryID</code>. 
	 */
	@javax.persistence.Column(name = "TerritoryID", nullable = false, precision = 10)
	public java.lang.Integer getTerritoryID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.TerritoryID);
	}

	/**
	 * Setter for <code>Sales.SalesTerritoryHistory.StartDate</code>. 
	 */
	public void setStartDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.StartDate, value);
	}

	/**
	 * Getter for <code>Sales.SalesTerritoryHistory.StartDate</code>. 
	 */
	@javax.persistence.Column(name = "StartDate", nullable = false)
	public java.sql.Timestamp getStartDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.StartDate);
	}

	/**
	 * Setter for <code>Sales.SalesTerritoryHistory.EndDate</code>. 
	 */
	public void setEndDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.EndDate, value);
	}

	/**
	 * Getter for <code>Sales.SalesTerritoryHistory.EndDate</code>. 
	 */
	@javax.persistence.Column(name = "EndDate")
	public java.sql.Timestamp getEndDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.EndDate);
	}

	/**
	 * Setter for <code>Sales.SalesTerritoryHistory.rowguid</code>. 
	 */
	public void setrowguid(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.rowguid, value);
	}

	/**
	 * Getter for <code>Sales.SalesTerritoryHistory.rowguid</code>. 
	 */
	@javax.persistence.Column(name = "rowguid", nullable = false)
	public java.lang.String getrowguid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.rowguid);
	}

	/**
	 * Setter for <code>Sales.SalesTerritoryHistory.ModifiedDate</code>. 
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.ModifiedDate, value);
	}

	/**
	 * Getter for <code>Sales.SalesTerritoryHistory.ModifiedDate</code>. 
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.ModifiedDate);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record3<java.lang.Integer, java.sql.Timestamp, java.lang.Integer> key() {
		return (org.jooq.Record3) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.Integer, java.sql.Timestamp, java.sql.Timestamp, java.lang.String, java.sql.Timestamp> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4(), field5(), field6());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.Integer, java.sql.Timestamp, java.sql.Timestamp, java.lang.String, java.sql.Timestamp> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4(), value5(), value6());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.SalesPersonID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.TerritoryID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field3() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.StartDate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field4() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.EndDate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.rowguid;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field6() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory.ModifiedDate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getSalesPersonID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getTerritoryID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value3() {
		return getStartDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value4() {
		return getEndDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getrowguid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value6() {
		return getModifiedDate();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SalesTerritoryHistory
	 */
	public SalesTerritoryHistory() {
		super(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesTerritoryHistory.SalesTerritoryHistory);
	}
}
