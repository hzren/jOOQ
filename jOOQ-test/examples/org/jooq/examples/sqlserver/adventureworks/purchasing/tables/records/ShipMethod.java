/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "ShipMethod", schema = "Purchasing")
public class ShipMethod extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ShipMethod> implements org.jooq.Record6<java.lang.Integer, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.sql.Timestamp> {

	private static final long serialVersionUID = -1029965456;

	/**
	 * Setter for <code>Purchasing.ShipMethod.ShipMethodID</code>. 
	 */
	public void setShipMethodID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.ShipMethod.ShipMethod.ShipMethodID, value);
	}

	/**
	 * Getter for <code>Purchasing.ShipMethod.ShipMethodID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ShipMethodID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getShipMethodID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.ShipMethod.ShipMethod.ShipMethodID);
	}

	/**
	 * Setter for <code>Purchasing.ShipMethod.Name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.ShipMethod.ShipMethod.Name, value);
	}

	/**
	 * Getter for <code>Purchasing.ShipMethod.Name</code>. 
	 */
	@javax.persistence.Column(name = "Name", nullable = false, length = 50)
	public java.lang.String getName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.ShipMethod.ShipMethod.Name);
	}

	/**
	 * Setter for <code>Purchasing.ShipMethod.ShipBase</code>. 
	 */
	public void setShipBase(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.ShipMethod.ShipMethod.ShipBase, value);
	}

	/**
	 * Getter for <code>Purchasing.ShipMethod.ShipBase</code>. 
	 */
	@javax.persistence.Column(name = "ShipBase", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getShipBase() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.ShipMethod.ShipMethod.ShipBase);
	}

	/**
	 * Setter for <code>Purchasing.ShipMethod.ShipRate</code>. 
	 */
	public void setShipRate(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.ShipMethod.ShipMethod.ShipRate, value);
	}

	/**
	 * Getter for <code>Purchasing.ShipMethod.ShipRate</code>. 
	 */
	@javax.persistence.Column(name = "ShipRate", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getShipRate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.ShipMethod.ShipMethod.ShipRate);
	}

	/**
	 * Setter for <code>Purchasing.ShipMethod.rowguid</code>. 
	 */
	public void setrowguid(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.ShipMethod.ShipMethod.rowguid, value);
	}

	/**
	 * Getter for <code>Purchasing.ShipMethod.rowguid</code>. 
	 */
	@javax.persistence.Column(name = "rowguid", nullable = false)
	public java.lang.String getrowguid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.ShipMethod.ShipMethod.rowguid);
	}

	/**
	 * Setter for <code>Purchasing.ShipMethod.ModifiedDate</code>. 
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.ShipMethod.ShipMethod.ModifiedDate, value);
	}

	/**
	 * Getter for <code>Purchasing.ShipMethod.ModifiedDate</code>. 
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.ShipMethod.ShipMethod.ModifiedDate);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.sql.Timestamp> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4(), field5(), field6());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.sql.Timestamp> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4(), value5(), value6());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.examples.sqlserver.adventureworks.purchasing.tables.ShipMethod.ShipMethod.ShipMethodID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.examples.sqlserver.adventureworks.purchasing.tables.ShipMethod.ShipMethod.Name;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field3() {
		return org.jooq.examples.sqlserver.adventureworks.purchasing.tables.ShipMethod.ShipMethod.ShipBase;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field4() {
		return org.jooq.examples.sqlserver.adventureworks.purchasing.tables.ShipMethod.ShipMethod.ShipRate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.jooq.examples.sqlserver.adventureworks.purchasing.tables.ShipMethod.ShipMethod.rowguid;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field6() {
		return org.jooq.examples.sqlserver.adventureworks.purchasing.tables.ShipMethod.ShipMethod.ModifiedDate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getShipMethodID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value3() {
		return getShipBase();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value4() {
		return getShipRate();
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
	 * Create a detached ShipMethod
	 */
	public ShipMethod() {
		super(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.ShipMethod.ShipMethod);
	}
}
