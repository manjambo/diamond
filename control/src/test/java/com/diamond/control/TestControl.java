package com.diamond.control;

import org.junit.Before;
import org.junit.Test;

public class TestControl {
	private Control control;
	@Before
	public void setUp() throws Exception {
		this.control = new Control();
	}

	@Test
	public void testControl() {
		this.control.control("phishing");
	}

}
