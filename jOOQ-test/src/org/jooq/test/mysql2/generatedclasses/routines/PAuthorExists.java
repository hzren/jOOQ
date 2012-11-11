/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 *
 * Check existence of an author
 */
@java.lang.SuppressWarnings("all")
public class PAuthorExists extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -476644108;

	/**
	 * The parameter <code>test2.p_author_exists.author_name</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.String> AUTHOR_NAME = createParameter("author_name", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * The parameter <code>test2.p_author_exists.result</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RESULT = createParameter("result", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public PAuthorExists() {
		super("p_author_exists", org.jooq.test.mysql2.generatedclasses.Test2.TEST2);

		addInParameter(AUTHOR_NAME);
		addOutParameter(RESULT);
	}

	/**
	 * Set the <code>author_name</code> parameter IN value to the routine
	 */
	public void setAuthorName(java.lang.String value) {
		setValue(org.jooq.test.mysql2.generatedclasses.routines.PAuthorExists.AUTHOR_NAME, value);
	}

	/**
	 * Get the <code>result</code> parameter OUT value from the routine
	 */
	public java.lang.Integer getResult() {
		return getValue(RESULT);
	}
}
