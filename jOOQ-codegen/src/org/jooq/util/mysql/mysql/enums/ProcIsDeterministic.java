/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.mysql.enums;



/**
 * This class is generated by jOOQ.
 */
public enum ProcIsDeterministic implements org.jooq.Enum {

	YES("YES"),

	NO("NO"),

	;

	private final String literal;

	private ProcIsDeterministic(String literal) {
		this.literal = literal;
	}

	@Override
	public String getName() {
		return "proc_is_deterministic";
	}

	@Override
	public String getLiteral() {
		return literal;
	}
}
