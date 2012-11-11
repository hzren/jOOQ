/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@java.lang.SuppressWarnings("all")
public class SalesByStoreRecord extends org.jooq.impl.TableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.SalesByStoreRecord> implements org.jooq.Record3<java.lang.String, java.lang.String, java.math.BigDecimal> {

	private static final long serialVersionUID = -1584583132;

	/**
	 * Setter for <code>sakila.sales_by_store.store</code>. 
	 */
	public void setStore(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.SalesByStore.SALES_BY_STORE.STORE, value);
	}

	/**
	 * Getter for <code>sakila.sales_by_store.store</code>. 
	 */
	public java.lang.String getStore() {
		return getValue(org.jooq.examples.mysql.sakila.tables.SalesByStore.SALES_BY_STORE.STORE);
	}

	/**
	 * Setter for <code>sakila.sales_by_store.manager</code>. 
	 */
	public void setManager(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.SalesByStore.SALES_BY_STORE.MANAGER, value);
	}

	/**
	 * Getter for <code>sakila.sales_by_store.manager</code>. 
	 */
	public java.lang.String getManager() {
		return getValue(org.jooq.examples.mysql.sakila.tables.SalesByStore.SALES_BY_STORE.MANAGER);
	}

	/**
	 * Setter for <code>sakila.sales_by_store.total_sales</code>. 
	 */
	public void setTotalSales(java.math.BigDecimal value) {
		setValue(org.jooq.examples.mysql.sakila.tables.SalesByStore.SALES_BY_STORE.TOTAL_SALES, value);
	}

	/**
	 * Getter for <code>sakila.sales_by_store.total_sales</code>. 
	 */
	public java.math.BigDecimal getTotalSales() {
		return getValue(org.jooq.examples.mysql.sakila.tables.SalesByStore.SALES_BY_STORE.TOTAL_SALES);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.String, java.lang.String, java.math.BigDecimal> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.String, java.lang.String, java.math.BigDecimal> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.examples.mysql.sakila.tables.SalesByStore.SALES_BY_STORE.STORE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.examples.mysql.sakila.tables.SalesByStore.SALES_BY_STORE.MANAGER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field3() {
		return org.jooq.examples.mysql.sakila.tables.SalesByStore.SALES_BY_STORE.TOTAL_SALES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getStore();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getManager();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value3() {
		return getTotalSales();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SalesByStoreRecord
	 */
	public SalesByStoreRecord() {
		super(org.jooq.examples.mysql.sakila.tables.SalesByStore.SALES_BY_STORE);
	}
}
