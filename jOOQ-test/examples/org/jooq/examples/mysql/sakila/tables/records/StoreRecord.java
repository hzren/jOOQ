/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class StoreRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.StoreRecord> implements org.jooq.Record4<java.lang.Byte, java.lang.Byte, java.lang.Short, java.sql.Timestamp> {

	private static final long serialVersionUID = -14453077;

	/**
	 * Setter for <code>sakila.store.store_id</code>. 
	 */
	public void setStoreId(java.lang.Byte value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Store.STORE.STORE_ID, value);
	}

	/**
	 * Getter for <code>sakila.store.store_id</code>. 
	 */
	public java.lang.Byte getStoreId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Store.STORE.STORE_ID);
	}

	/**
	 * Setter for <code>sakila.store.manager_staff_id</code>. 
	 */
	public void setManagerStaffId(java.lang.Byte value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Store.STORE.MANAGER_STAFF_ID, value);
	}

	/**
	 * Link this record to a given {@link org.jooq.examples.mysql.sakila.tables.records.StaffRecord}
	 */
	public void setManagerStaffId(org.jooq.examples.mysql.sakila.tables.records.StaffRecord value) {
		if (value == null) {
			setValue(org.jooq.examples.mysql.sakila.tables.Store.STORE.MANAGER_STAFF_ID, null);
		}
		else {
			setValue(org.jooq.examples.mysql.sakila.tables.Store.STORE.MANAGER_STAFF_ID, value.getValue(org.jooq.examples.mysql.sakila.tables.Staff.STAFF.STAFF_ID));
		}
	}

	/**
	 * Getter for <code>sakila.store.manager_staff_id</code>. 
	 */
	public java.lang.Byte getManagerStaffId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Store.STORE.MANAGER_STAFF_ID);
	}

	/**
	 * Setter for <code>sakila.store.address_id</code>. 
	 */
	public void setAddressId(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Store.STORE.ADDRESS_ID, value);
	}

	/**
	 * Link this record to a given {@link org.jooq.examples.mysql.sakila.tables.records.AddressRecord}
	 */
	public void setAddressId(org.jooq.examples.mysql.sakila.tables.records.AddressRecord value) {
		if (value == null) {
			setValue(org.jooq.examples.mysql.sakila.tables.Store.STORE.ADDRESS_ID, null);
		}
		else {
			setValue(org.jooq.examples.mysql.sakila.tables.Store.STORE.ADDRESS_ID, value.getValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.ADDRESS_ID));
		}
	}

	/**
	 * Getter for <code>sakila.store.address_id</code>. 
	 */
	public java.lang.Short getAddressId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Store.STORE.ADDRESS_ID);
	}

	/**
	 * Setter for <code>sakila.store.last_update</code>. 
	 */
	public void setLastUpdate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Store.STORE.LAST_UPDATE, value);
	}

	/**
	 * Getter for <code>sakila.store.last_update</code>. 
	 */
	public java.sql.Timestamp getLastUpdate() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Store.STORE.LAST_UPDATE);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	/**
	 * Fetch a list of <code>sakila.customer</code> referencing this <code>sakila.store</code>
	 */
	public org.jooq.Result<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord> fetchCustomerList() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER)
			.where(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.STORE_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Store.STORE.STORE_ID)))
			.fetch();
	}

	/**
	 * Fetch a list of <code>sakila.inventory</code> referencing this <code>sakila.store</code>
	 */
	public org.jooq.Result<org.jooq.examples.mysql.sakila.tables.records.InventoryRecord> fetchInventoryList() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Inventory.INVENTORY)
			.where(org.jooq.examples.mysql.sakila.tables.Inventory.INVENTORY.STORE_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Store.STORE.STORE_ID)))
			.fetch();
	}

	/**
	 * Fetch a list of <code>sakila.staff</code> referencing this <code>sakila.store</code>
	 */
	public org.jooq.Result<org.jooq.examples.mysql.sakila.tables.records.StaffRecord> fetchStaffList() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Staff.STAFF)
			.where(org.jooq.examples.mysql.sakila.tables.Staff.STAFF.STORE_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Store.STORE.STORE_ID)))
			.fetch();
	}

	/**
	 * Fetch a <code>sakila.staff</code> referenced by this <code>sakila.store</code>
	 */
	public org.jooq.examples.mysql.sakila.tables.records.StaffRecord fetchStaff() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Staff.STAFF)
			.where(org.jooq.examples.mysql.sakila.tables.Staff.STAFF.STAFF_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Store.STORE.MANAGER_STAFF_ID)))
			.fetchOne();
	}

	/**
	 * Fetch a <code>sakila.address</code> referenced by this <code>sakila.store</code>
	 */
	public org.jooq.examples.mysql.sakila.tables.records.AddressRecord fetchAddress() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS)
			.where(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.ADDRESS_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Store.STORE.ADDRESS_ID)))
			.fetchOne();
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Byte> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Byte, java.lang.Byte, java.lang.Short, java.sql.Timestamp> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Byte, java.lang.Byte, java.lang.Short, java.sql.Timestamp> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field1() {
		return org.jooq.examples.mysql.sakila.tables.Store.STORE.STORE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field2() {
		return org.jooq.examples.mysql.sakila.tables.Store.STORE.MANAGER_STAFF_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field3() {
		return org.jooq.examples.mysql.sakila.tables.Store.STORE.ADDRESS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field4() {
		return org.jooq.examples.mysql.sakila.tables.Store.STORE.LAST_UPDATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value1() {
		return getStoreId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value2() {
		return getManagerStaffId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value3() {
		return getAddressId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value4() {
		return getLastUpdate();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached StoreRecord
	 */
	public StoreRecord() {
		super(org.jooq.examples.mysql.sakila.tables.Store.STORE);
	}
}
