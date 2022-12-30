package com.unittest.codecoverage;

import com.unittest.codecoverage.exceptions.BehaviorException;
import com.unittest.codecoverage.exceptions.PersonException;
import com.unittest.codecoverage.models.*;
import com.unittest.codecoverage.models.validators.PersonValidator;
import com.unittest.codecoverage.repositories.PersonRepository;
import com.unittest.codecoverage.services.impl.PersonServiceImpl;
import com.unittest.codecoverage.services.impl.TrafficBehaviorServiceImpl;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

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
	@Test
	void testModelPackage() {
		Gender female_g = Gender.F;
		Person p = new Person();
		p.setGender(female_g);
		p.setName("new Female");
		PersonValidator pv = new PersonValidator();
		boolean result = pv.requiredName(p);

		assertEquals("new Female", p.getName());
		assertTrue(result);

		TrafficLigth green_tr = TrafficLigth.GREEN;
		Footpassenger fp = new Footpassenger();
		fp.setCrossedTrafficLigth(green_tr);

		assertEquals(green_tr, fp.getCrossedTrafficLigth());

		StreetDirectionFlow one_way_str = StreetDirectionFlow.ONE_WAY;
		Traffic traffic = new Traffic();
		traffic.setStreetDirectionFlow(one_way_str);

		assertEquals(one_way_str, traffic.getStreetDirectionFlow());

	}
	@Test
	void testRepositoriesPackage() {
		try {
			PersonRepository p = new PersonRepository();
			p.insert(null);
			fail();
		} catch (Exception e){
			assertTrue(true);
		}

		try {
			PersonRepository p = new PersonRepository();
			p.insert(new Person());
			assertTrue(true);
		} catch (Exception e){
			fail();
		}
	}

	@Test
	void testServicesPackage() {
		try {
			PersonServiceImpl ps = new PersonServiceImpl();
			ps.insert(new Person());
			fail();
		} catch (PersonException e){
			assertTrue(true);
		}

		Footpassenger ft =  new Footpassenger();
		ft.setCrossedTrafficLigth(TrafficLigth.RED);
		ft.setCrossedTheRoad(true);
		Traffic tr = new Traffic();
		tr.setIntenseCarTraffic(true);

		try {
			TrafficBehaviorServiceImpl ts = new TrafficBehaviorServiceImpl();
			ts.footpassengerCrossTheStreet(tr,ft);
			fail();
		} catch (BehaviorException e){
			assertTrue(true);
		}
	}

}
