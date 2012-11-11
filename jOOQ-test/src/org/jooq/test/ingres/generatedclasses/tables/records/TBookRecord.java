/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ingres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
 */
@java.lang.SuppressWarnings("all")
public class TBookRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord> implements org.jooq.Record9<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, byte[]> {

	private static final long serialVersionUID = 114849396;

	/**
	 * Setter for <code>test.t_book.id</code>. The book ID
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.TBook.ID, value);
	}

	/**
	 * Getter for <code>test.t_book.id</code>. The book ID
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.TBook.ID);
	}

	/**
	 * Setter for <code>test.t_book.author_id</code>. The author ID in entity 'author'
	 */
	public void setAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.TBook.AUTHOR_ID, value);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.ingres.generatedclasses.tables.records.TAuthorRecord}
	 */
	public void setAuthorId(org.jooq.test.ingres.generatedclasses.tables.records.TAuthorRecord value) {
		if (value == null) {
			setValue(org.jooq.test.ingres.generatedclasses.tables.TBook.AUTHOR_ID, null);
		}
		else {
			setValue(org.jooq.test.ingres.generatedclasses.tables.TBook.AUTHOR_ID, value.getValue(org.jooq.test.ingres.generatedclasses.tables.TAuthor.ID));
		}
	}

	/**
	 * Getter for <code>test.t_book.author_id</code>. The author ID in entity 'author'
	 */
	public java.lang.Integer getAuthorId() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.TBook.AUTHOR_ID);
	}

	/**
	 * Setter for <code>test.t_book.co_author_id</code>. 
	 */
	public void setCoAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.TBook.CO_AUTHOR_ID, value);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.ingres.generatedclasses.tables.records.TAuthorRecord}
	 */
	public void setCoAuthorId(org.jooq.test.ingres.generatedclasses.tables.records.TAuthorRecord value) {
		if (value == null) {
			setValue(org.jooq.test.ingres.generatedclasses.tables.TBook.CO_AUTHOR_ID, null);
		}
		else {
			setValue(org.jooq.test.ingres.generatedclasses.tables.TBook.CO_AUTHOR_ID, value.getValue(org.jooq.test.ingres.generatedclasses.tables.TAuthor.ID));
		}
	}

	/**
	 * Getter for <code>test.t_book.co_author_id</code>. 
	 */
	public java.lang.Integer getCoAuthorId() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.TBook.CO_AUTHOR_ID);
	}

	/**
	 * Setter for <code>test.t_book.details_id</code>. 
	 */
	public void setDetailsId(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.TBook.DETAILS_ID, value);
	}

	/**
	 * Getter for <code>test.t_book.details_id</code>. 
	 */
	public java.lang.Integer getDetailsId() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.TBook.DETAILS_ID);
	}

	/**
	 * Setter for <code>test.t_book.title</code>. The book's title
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.TBook.TITLE, value);
	}

	/**
	 * Getter for <code>test.t_book.title</code>. The book's title
	 */
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.TBook.TITLE);
	}

	/**
	 * Setter for <code>test.t_book.published_in</code>. The year the book was published in
	 */
	public void setPublishedIn(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.TBook.PUBLISHED_IN, value);
	}

	/**
	 * Getter for <code>test.t_book.published_in</code>. The year the book was published in
	 */
	public java.lang.Integer getPublishedIn() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.TBook.PUBLISHED_IN);
	}

	/**
	 * Setter for <code>test.t_book.language_id</code>. The language of the book
	 */
	public void setLanguageId(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.TBook.LANGUAGE_ID, value);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.ingres.generatedclasses.tables.records.TLanguageRecord}
	 */
	public void setLanguageId(org.jooq.test.ingres.generatedclasses.tables.records.TLanguageRecord value) {
		if (value == null) {
			setValue(org.jooq.test.ingres.generatedclasses.tables.TBook.LANGUAGE_ID, null);
		}
		else {
			setValue(org.jooq.test.ingres.generatedclasses.tables.TBook.LANGUAGE_ID, value.getValue(org.jooq.test.ingres.generatedclasses.tables.TLanguage.ID));
		}
	}

	/**
	 * Getter for <code>test.t_book.language_id</code>. The language of the book
	 */
	public java.lang.Integer getLanguageId() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.TBook.LANGUAGE_ID);
	}

	/**
	 * Setter for <code>test.t_book.content_text</code>. Some textual content of the book
	 */
	public void setContentText(java.lang.String value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.TBook.CONTENT_TEXT, value);
	}

	/**
	 * Getter for <code>test.t_book.content_text</code>. Some textual content of the book
	 */
	public java.lang.String getContentText() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.TBook.CONTENT_TEXT);
	}

	/**
	 * Setter for <code>test.t_book.content_pdf</code>. Some binary content of the book
	 */
	public void setContentPdf(byte[] value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.TBook.CONTENT_PDF, value);
	}

	/**
	 * Getter for <code>test.t_book.content_pdf</code>. Some binary content of the book
	 */
	public byte[] getContentPdf() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.TBook.CONTENT_PDF);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	/**
	 * Fetch a list of <code>test.t_book_to_book_store</code> referencing this <code>test.t_book</code>
	 */
	public org.jooq.Result<org.jooq.test.ingres.generatedclasses.tables.records.TBookToBookStoreRecord> fetchTBookToBookStoreList() {
		return create()
			.selectFrom(org.jooq.test.ingres.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE)
			.where(org.jooq.test.ingres.generatedclasses.tables.TBookToBookStore.BOOK_ID.equal(getValue(org.jooq.test.ingres.generatedclasses.tables.TBook.ID)))
			.fetch();
	}

	/**
	 * Fetch a <code>test.t_author</code> referenced by this <code>test.t_book</code>
	 */
	public org.jooq.test.ingres.generatedclasses.tables.records.TAuthorRecord fetchTAuthorByAuthorId() {
		return create()
			.selectFrom(org.jooq.test.ingres.generatedclasses.tables.TAuthor.T_AUTHOR)
			.where(org.jooq.test.ingres.generatedclasses.tables.TAuthor.ID.equal(getValue(org.jooq.test.ingres.generatedclasses.tables.TBook.AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * Fetch a <code>test.t_author</code> referenced by this <code>test.t_book</code>
	 */
	public org.jooq.test.ingres.generatedclasses.tables.records.TAuthorRecord fetchTAuthorByCoAuthorId() {
		return create()
			.selectFrom(org.jooq.test.ingres.generatedclasses.tables.TAuthor.T_AUTHOR)
			.where(org.jooq.test.ingres.generatedclasses.tables.TAuthor.ID.equal(getValue(org.jooq.test.ingres.generatedclasses.tables.TBook.CO_AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * Fetch a <code>test.t_language</code> referenced by this <code>test.t_book</code>
	 */
	public org.jooq.test.ingres.generatedclasses.tables.records.TLanguageRecord fetchTLanguage() {
		return create()
			.selectFrom(org.jooq.test.ingres.generatedclasses.tables.TLanguage.T_LANGUAGE)
			.where(org.jooq.test.ingres.generatedclasses.tables.TLanguage.ID.equal(getValue(org.jooq.test.ingres.generatedclasses.tables.TBook.LANGUAGE_ID)))
			.fetchOne();
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
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, byte[]> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4(), field5(), field6(), field7(), field8(), field9());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, byte[]> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4(), value5(), value6(), value7(), value8(), value9());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.ingres.generatedclasses.tables.TBook.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.ingres.generatedclasses.tables.TBook.AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.test.ingres.generatedclasses.tables.TBook.CO_AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.jooq.test.ingres.generatedclasses.tables.TBook.DETAILS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.jooq.test.ingres.generatedclasses.tables.TBook.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return org.jooq.test.ingres.generatedclasses.tables.TBook.PUBLISHED_IN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return org.jooq.test.ingres.generatedclasses.tables.TBook.LANGUAGE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return org.jooq.test.ingres.generatedclasses.tables.TBook.CONTENT_TEXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<byte[]> field9() {
		return org.jooq.test.ingres.generatedclasses.tables.TBook.CONTENT_PDF;
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

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBookRecord
	 */
	public TBookRecord() {
		super(org.jooq.test.ingres.generatedclasses.tables.TBook.T_BOOK);
	}
}
