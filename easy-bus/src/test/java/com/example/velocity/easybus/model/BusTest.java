package com.example.velocity.easybus.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BusTest {
	Bus bus = new Bus("123", 122, "Mumbai", "Delhi", "22:00", "22:58","2022-07-08", "luxury","7865457900",1000, 2);


   Bus b= new Bus();
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testBus() {
		Bus b1=b;
		assertEquals(b1, b);
	}

	@Test
	void testBusStringIntStringStringStringStringStringStringStringDoubleInt() {
		Bus b2=bus;
		assertEquals(b2, bus);
	}

	@Test
	void testGetId() {
		String expected ="123";
		String actual = bus.getId();
		assertEquals(expected, actual);
	}

	@Test
	void testGetBusNo() {
		    int expected = 122;
			int actual = bus.getBusNo();
			assertEquals(expected, actual);
	}

	@Test
	void testGetDepartureLocation() {
		String expected = "Mumbai";
		String actual = bus.getDepartureLocation();
		assertEquals(expected, actual);
	}

	@Test
	void testGetArrivalLocation() {
		String expected = "Delhi";
		String actual = bus.getArrivalLocation();
		assertEquals(expected, actual);
	}

	@Test
	void testGetDepartureTime() {
		String expected = "22:00";
		String actual = bus.getDepartureTime();
		assertEquals(expected, actual);
	}

	@Test
	void testGetArrivalTime() {
		String expected = "22:58";
		String actual = bus.getArrivalTime();
		assertEquals(expected, actual);
	}

	@Test
	void testGetDate() {
		String expected = "2022-07-08";
		String actual = bus.getDate();
		assertEquals(expected, actual);
	}

	@Test
	void testGetBusType() {
		String expected = "luxury";
		String actual = bus.getBusType();
		assertEquals(expected, actual);
	}

	@Test
	void testGetDriverContact() {
		String expected = "7865457900";
		String actual = bus.getDriverContact();
		assertEquals(expected, actual);
	}

	@Test
	void testGetPrice() {
		double expected = 1000;
		double actual = bus.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	void testGetSeatsAvailable() {
		int expected = 2;
		int actual = bus.getSeatsAvailable();
		assertEquals(expected, actual);
	}

	@Test
	void testSetId() {
		String id ="62c86903f6a63e7ece096222";
		Bus bus = new Bus();
		bus.setId(id);
		assertEquals(bus.getId(),id);
	}

	@Test
	void testSetBusNo() {
		int busNo =122;
		Bus bus = new Bus();
		bus.setBusNo(busNo);
		assertEquals(bus.getBusNo(),busNo);
	}

	@Test
	void testSetDepartureLocation() {
		String d ="Delhi";
		Bus bus = new Bus();
		bus.setDepartureLocation(d);
		assertEquals(bus.getDepartureLocation(),d);
	}

	@Test
	void testSetArrivalLocation() {
		String arrivalLocation ="Delhi";
		Bus bus = new Bus();
		bus.setArrivalLocation(arrivalLocation);
		assertEquals(bus.getArrivalLocation(),arrivalLocation);
	}

	@Test
	void testSetDepartureTime() {
		String departureTime ="22:00";
		Bus bus = new Bus();
		bus.setDepartureTime(departureTime);
		assertEquals(bus.getDepartureTime(),departureTime);
	}

	@Test
	void testSetArrivalTime() {
		String arrivalTime = "22:58";
		Bus bus = new Bus();
		bus.setArrivalTime(arrivalTime);
		assertEquals(bus.getArrivalTime(),arrivalTime);
	}

	@Test
	void testSetDate() {
		String date = "2022-07-08";
		Bus bus = new Bus();
		bus.setDate(date);
		assertEquals(bus.getDate(),date);
	}

	@Test
	void testSetBusType() {
		String busType ="luxury";
		Bus bus = new Bus();
		bus.setBusType(busType);
		assertEquals(bus.getBusType(),busType);
	}

	@Test
	void testSetDriverContact() {
		String contact ="7865457900";
		Bus bus = new Bus();
		bus.setDriverContact(contact);;
		assertEquals(bus.getDriverContact(), contact);
	}

	@Test
	void testSetPrice() {
		double p=100;
		Bus b=new Bus();
		bus.setPrice(p);
		assertEquals(bus.getPrice(), p);
	}

	@Test
	void testSetSeatsAvailable() {
		int seatsAvailable = 2;
		Bus bus = new Bus();
		bus.setSeatsAvailable(seatsAvailable);
		assertEquals(bus.getSeatsAvailable(),seatsAvailable);
	}

	@Test
	void testEqualsObject() {
		Bus bus1 = new Bus("123", 122, "Mumbai", "Delhi", "22:00", "22:58","2022-07-08", "luxury","7865457900",1000, 2);

		boolean expected=bus.equals(bus1);
		assertEquals(true,expected );
	}

	@Test
	void testToString() {
		String c=bus.toString();
		assertEquals(c,bus.toString());
	}

}
