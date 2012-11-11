/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "v_book", schema = "test2")
public class VBookRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.mysql2.generatedclasses.tables.records.VBookRecord> implements org.jooq.Record10<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, byte[], org.jooq.test.mysql2.generatedclasses.enums.VBookStatus> {

	private static final long serialVersionUID = 1710272839;

	/**
	 * Setter for <code>test2.v_book.ID</code>. The book ID
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.VBook.V_BOOK.ID, value);
	}

	/**
	 * Getter for <code>test2.v_book.ID</code>. The book ID
	 */
	@javax.persistence.Column(name = "ID", nullable = false, precision = 10)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.VBook.V_BOOK.ID);
	}

	/**
	 * Setter for <code>test2.v_book.AUTHOR_ID</code>. The author ID in entity 'author'
	 */
	public void setAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.VBook.V_BOOK.AUTHOR_ID, value);
	}

	/**
	 * Getter for <code>test2.v_book.AUTHOR_ID</code>. The author ID in entity 'author'
	 */
	@javax.persistence.Column(name = "AUTHOR_ID", nullable = false, precision = 10)
	public java.lang.Integer getAuthorId() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.VBook.V_BOOK.AUTHOR_ID);
	}

	/**
	 * Setter for <code>test2.v_book.co_author_id</code>. 
	 */
	public void setCoAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.VBook.V_BOOK.CO_AUTHOR_ID, value);
	}

	/**
	 * Getter for <code>test2.v_book.co_author_id</code>. 
	 */
	@javax.persistence.Column(name = "co_author_id", precision = 10)
	public java.lang.Integer getCoAuthorId() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.VBook.V_BOOK.CO_AUTHOR_ID);
	}

	/**
	 * Setter for <code>test2.v_book.DETAILS_ID</code>. Some more details about the book
	 */
	public void setDetailsId(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.VBook.V_BOOK.DETAILS_ID, value);
	}

	/**
	 * Getter for <code>test2.v_book.DETAILS_ID</code>. Some more details about the book
	 */
	@javax.persistence.Column(name = "DETAILS_ID", precision = 10)
	public java.lang.Integer getDetailsId() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.VBook.V_BOOK.DETAILS_ID);
	}

	/**
	 * Setter for <code>test2.v_book.TITLE</code>. The book's title
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.VBook.V_BOOK.TITLE, value);
	}

	/**
	 * Getter for <code>test2.v_book.TITLE</code>. The book's title
	 */
	@javax.persistence.Column(name = "TITLE", nullable = false, length = 65535)
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.VBook.V_BOOK.TITLE);
	}

	/**
	 * Setter for <code>test2.v_book.PUBLISHED_IN</code>. The year the book was published in
	 */
	public void setPublishedIn(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.VBook.V_BOOK.PUBLISHED_IN, value);
	}

	/**
	 * Getter for <code>test2.v_book.PUBLISHED_IN</code>. The year the book was published in
	 */
	@javax.persistence.Column(name = "PUBLISHED_IN", nullable = false, precision = 10)
	public java.lang.Integer getPublishedIn() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.VBook.V_BOOK.PUBLISHED_IN);
	}

	/**
	 * Setter for <code>test2.v_book.LANGUAGE_ID</code>. The language of the book
	 */
	public void setLanguageId(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.VBook.V_BOOK.LANGUAGE_ID, value);
	}

	/**
	 * Getter for <code>test2.v_book.LANGUAGE_ID</code>. The language of the book
	 */
	@javax.persistence.Column(name = "LANGUAGE_ID", nullable = false, precision = 10)
	public java.lang.Integer getLanguageId() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.VBook.V_BOOK.LANGUAGE_ID);
	}

	/**
	 * Setter for <code>test2.v_book.CONTENT_TEXT</code>. Some textual content of the book
	 */
	public void setContentText(java.lang.String value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.VBook.V_BOOK.CONTENT_TEXT, value);
	}

	/**
	 * Getter for <code>test2.v_book.CONTENT_TEXT</code>. Some textual content of the book
	 */
	@javax.persistence.Column(name = "CONTENT_TEXT")
	public java.lang.String getContentText() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.VBook.V_BOOK.CONTENT_TEXT);
	}

	/**
	 * Setter for <code>test2.v_book.CONTENT_PDF</code>. Some binary content of the book
	 */
	public void setContentPdf(byte[] value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.VBook.V_BOOK.CONTENT_PDF, value);
	}

	/**
	 * Getter for <code>test2.v_book.CONTENT_PDF</code>. Some binary content of the book
	 */
	@javax.persistence.Column(name = "CONTENT_PDF")
	public byte[] getContentPdf() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.VBook.V_BOOK.CONTENT_PDF);
	}

	/**
	 * Setter for <code>test2.v_book.STATUS</code>. The book's stock status
	 */
	public void setStatus(org.jooq.test.mysql2.generatedclasses.enums.VBookStatus value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.VBook.V_BOOK.STATUS, value);
	}

	/**
	 * Getter for <code>test2.v_book.STATUS</code>. The book's stock status
	 */
	@javax.persistence.Column(name = "STATUS", length = 8)
	public org.jooq.test.mysql2.generatedclasses.enums.VBookStatus getStatus() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.VBook.V_BOOK.STATUS);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	// -------------------------------------------------------------------------
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, byte[], org.jooq.test.mysql2.generatedclasses.enums.VBookStatus> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4(), field5(), field6(), field7(), field8(), field9(), field10());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, byte[], org.jooq.test.mysql2.generatedclasses.enums.VBookStatus> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4(), value5(), value6(), value7(), value8(), value9(), value10());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.mysql2.generatedclasses.tables.VBook.V_BOOK.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.mysql2.generatedclasses.tables.VBook.V_BOOK.AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.test.mysql2.generatedclasses.tables.VBook.V_BOOK.CO_AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.jooq.test.mysql2.generatedclasses.tables.VBook.V_BOOK.DETAILS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.jooq.test.mysql2.generatedclasses.tables.VBook.V_BOOK.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return org.jooq.test.mysql2.generatedclasses.tables.VBook.V_BOOK.PUBLISHED_IN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return org.jooq.test.mysql2.generatedclasses.tables.VBook.V_BOOK.LANGUAGE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return org.jooq.test.mysql2.generatedclasses.tables.VBook.V_BOOK.CONTENT_TEXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<byte[]> field9() {
		return org.jooq.test.mysql2.generatedclasses.tables.VBook.V_BOOK.CONTENT_PDF;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.test.mysql2.generatedclasses.enums.VBookStatus> field10() {
		return org.jooq.test.mysql2.generatedclasses.tables.VBook.V_BOOK.STATUS;
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
	public java.lang.Integer value2() {
		return getAuthorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getCoAuthorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getDetailsId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getPublishedIn();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value7() {
		return getLanguageId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getContentText();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value9() {
		return getContentPdf();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.mysql2.generatedclasses.enums.VBookStatus value10() {
		return getStatus();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached VBookRecord
	 */
	public VBookRecord() {
		super(org.jooq.test.mysql2.generatedclasses.tables.VBook.V_BOOK);
	}
}
