package com.unittest.codecoverage;

import com.unittest.codecoverage.exceptions.BehaviorException;
import com.unittest.codecoverage.exceptions.PersonException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class CodecoverageApplicationTests {


	@Test
	void testExceptionPackage() {
		try {
			throw new BehaviorException("new Exception");
		} catch (BehaviorException e){
			assertTrue(true);
		}

		PersonException pe = new PersonException("person Exception");
		try {
			throw pe;
		} catch (PersonException e){
			assertTrue(true);
		}

	}

}
