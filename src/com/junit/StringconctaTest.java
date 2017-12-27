package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringconctaTest {

	Stringconcta e=new Stringconcta();
	@Test
	void testStringconcat() {
		assertEquals("saipriyadarshini",e.Stringconcat());
	}
}
