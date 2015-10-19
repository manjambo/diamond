/**
 * 
 */
package com.diamond.web;

import org.junit.Before;
import org.junit.Test;

/**
 * @author mark
 *
 */
public class TestWeb {
	private Web web;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.web = new Web();
	}

	/**
	 * Test method for {@link com.diamond.web.Web#show(java.lang.String)}.
	 */
	@Test
	public void testShow() {
		this.web.show("testing");
	}

}
