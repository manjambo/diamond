/**
 * 
 */
package com.diamond.model;

import org.junit.Before;
import org.junit.Test;

/**
 * @author mark
 *
 */
public class TestModel {
	private Model model;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.model = new Model();
	}

	/**
	 * Test method for {@link com.diamond.model.Model#lookup(java.lang.String)}.
	 */
	@Test
	public void testLookup() {
		this.model.lookup("This is a Model Test");
	}

}
