package com.example.velocity.easybus.model;

import static org.junit.jupiter.api.Assertions.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookingTest  {
//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//java.util.Date yourDate = sdf.parse("2022-07-20");
	Date d=new Date(2022, 07, 8) ;
	Date d1=new Date(2022, 07, 10) ;
	Booking b=new Booking("M123", "Mahi", 10, 100, 1000, 998076540, "Mounika", 123456, 02, 2024, 1230, d, "mounika@gmail.com", "Mumbai", "Delhi", "AC", "20:30", "10:00", "B123", "booking", "2022-07-08", (long) 20);
    Booking b1=new  Booking(); 
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testBooking() {
		Booking b2=b1;
		assertEquals(b2, b1);
	}

	@Test
	void testBookingStringStringIntDoubleDoubleLongStringIntIntIntIntDateStringStringStringStringStringStringStringStringStringLong() {
		Booking b3=b;
		assertEquals(b3, b);
	}

	@Test
	void testGetId() {
		String expected="M123";
		String actual=b.getId();
		assertEquals(expected, actual);
	}

	@Test
	void testGetPassengerName() {
		String expected="Mahi";
		String actual=b.getPassengerName();
		assertEquals(expected, actual);
	}

	@Test
	void testGetNumberOfseats() {
		int expected=10;
		int actual=b.getNumberOfseats();
		assertEquals(expected, actual);
	}

	@Test
	void testGetPrice() {
		double expected=100;
		double actual=b.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	void testGetTotalCost() {
		double expected=1000;
		double actual=b.getTotalCost();
		assertEquals(expected, actual);
	}

	@Test
	void testGetPhoneNumber() {
		long expected=998076540;
		long actual=b.getPhoneNumber();
		assertEquals(expected, actual);
	}

	@Test
	void testGetNameOnCard() {
		String expected="Mounika";
		String actual=b.getNameOnCard();
		assertEquals(expected, actual);
	}

	@Test
	void testGetCreditDebitCard() {
		int expected=123456;
		int actual=b.getCreditDebitCard();
		assertEquals(expected, actual);
	}

	@Test
	void testGetExpMonth() {
		int expected=02;
		int actual=b.getExpMonth();
		assertEquals(expected, actual);
	}

	@Test
	void testGetExpYear() {
		int expected=2024;
		int actual=b.getExpYear();
		assertEquals(expected, actual);
	}

	@Test
	void testGetCvv() {
		int expected=1230;
		int actual=b.getCvv();
		assertEquals(expected, actual);
	}

	@Test
	void testGetDateOfBooking() {
		Date expected=d;
		Date actual=b.getDateOfBooking();
		assertEquals(expected, actual);
	}

	@Test
	void testGetEmail() {
		String expected="mounika@gmail.com";
		String actual=b.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	void testGetDepartureLocation() {
		String expected="Mumbai";
		String actual=b.getDepartureLocation();
		assertEquals(expected, actual);	}

	@Test
	void testGetArrivalLocation() {
		String expected="Delhi";
		String actual=b.getArrivalLocation();
		assertEquals(expected, actual);
	}

	@Test
	void testGetBusType() {
		String expected="AC";
		String actual=b.getBusType();
		assertEquals(expected, actual);
	}

	@Test
	void testGetDepartureTime() {
		String expected="20:30";
		String actual=b.getDepartureTime();
		assertEquals(expected, actual);
	}

	@Test
	void testGetArrivalTime() {
		String expected="10:00";
		String actual=b.getArrivalTime();
		assertEquals(expected, actual);
	}

	@Test
	void testGetBusId() {
		String expected="B123";
		String actual=b.getBusId();
		assertEquals(expected, actual);
	}

	@Test
	void testGetStatus() {
		String expected="booking";
		String actual=b.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	void testGetJourneyDate() {
		String expected="2022-07-08";
		String actual=b.getJourneyDate();
		assertEquals(expected, actual);
	}

	@Test
	void testGetSeat() {
		long expected=20;
		long actual=b.getSeat();
		assertEquals(expected, actual);
	}

	@Test
	void testSetId() {
		String id="M100";
		Booking book=new Booking();
		book.setId(id);
		assertEquals(book.getId(),id);
	}

	@Test
	void testSetPassengerName() {
		String name="ABC";
		Booking book=new Booking();
		book.setPassengerName(name);
		assertEquals(book.getPassengerName(),name);
	}

	@Test
	void testSetNumberOfseats() {
		int n=1;
		Booking book=new Booking();
		book.setNumberOfseats(n);
		assertEquals(book.getNumberOfseats(),n);
	}

	@Test
	void testSetPrice() {
		double price=50;
		Booking book=new Booking();
		book.setPrice(price);
		assertEquals(book.getPrice(),price);
	}

	@Test
	void testSetTotalCost() {
		double tc=50;
		Booking book=new Booking();
		book.setTotalCost(tc);
		assertEquals(book.getTotalCost(),tc);
	}

	@Test
	void testSetPhoneNumber() {
		long pn=786543234;
		Booking book=new Booking();
		book.setPhoneNumber(pn);
		assertEquals(book.getPhoneNumber(),pn);
	}

	@Test
	void testSetNameOnCard() {
		String name="Abc";
		Booking book=new Booking();
		book.setNameOnCard(name);
		assertEquals(book.getNameOnCard(),name);
	}

	@Test
	void testSetCreditDebitCard() {
		int cardNo=56789;
		Booking book=new Booking();
		book.setCreditDebitCard(cardNo);
		assertEquals(book.getCreditDebitCard(),cardNo);
	}

	@Test
	void testSetExpMonth() {
		int em=8;
		Booking book=new Booking();
		book.setExpMonth(em);
		assertEquals(book.getExpMonth(),em);
	}

	@Test
	void testSetExpYear() {
		int ey=2029;
		Booking book=new Booking();
		book.setExpYear(ey);
		assertEquals(book.getExpYear(),ey);
	}

	@Test
	void testSetCvv() {
		int id=3456;
		Booking book=new Booking();
		book.setCvv(id);
		assertEquals(book.getCvv(),id);
	}

	@Test
	void testSetDateOfBooking() {
		Date d=d1;
		Booking book=new Booking();
		book.setDateOfBooking(d);
		assertEquals(book.getDateOfBooking(),d);
	}

	@Test
	void testSetEmail() {
		String email="ab@gmail.com";
		Booking book=new Booking();
		book.setEmail(email);
		assertEquals(book.getEmail(),email);
	}

	@Test
	void testSetDepartureLocation() {
		String deptLoc="Madrid";
		Booking book=new Booking();
		book.setDepartureLocation(deptLoc);
		assertEquals(book.getDepartureLocation(),deptLoc);
	}

	@Test
	void testSetArrivalLocation() {
		String ALoc="Sydney";
		Booking book=new Booking();
		book.setArrivalLocation(ALoc);
		assertEquals(book.getArrivalLocation(),ALoc);
	}

	@Test
	void testSetBusType() {
		String bt="Normal";
		Booking book=new Booking();
		book.setBusType(bt);
		assertEquals(book.getBusType(),bt);
	}

	@Test
	void testSetDepartureTime() {
		String time="10:00";
		Booking book=new Booking();
		book.setDepartureTime(time);
		assertEquals(book.getDepartureTime(),time);
	}

	@Test
	void testSetArrivalTime() {
		String t="1:00";
		Booking book=new Booking();
		book.setArrivalTime(t);
		assertEquals(book.getArrivalTime(),t);
	}

	@Test
	void testSetBusId() {
		String id="B700";
		Booking book=new Booking();
		book.setBusId(id);
		assertEquals(book.getBusId(),id);
	}

	@Test
	void testSetStatus() {
		String id="booked";
		Booking book=new Booking();
		book.setStatus(id);
		assertEquals(book.getStatus(),id);
	}

	@Test
	void testSetJourneyDate() {
		String d="2022-01-02";
		Booking book=new Booking();
		book.setJourneyDate(d);
		assertEquals(book.getJourneyDate(),d);
	}

	@Test
	void testSetSeat() {
		long seat=2;
		Booking book=new Booking();
		book.setSeat(seat);
		assertEquals(book.getSeat(),seat);
	}

	@Test
	void testEqualsObject() {
		Booking b1=new Booking("M123", "Mahi", 10, 100, 1000, 998076540, "Mounika", 123456, 02, 2024, 1230, d, "mounika@gmail.com", "Mumbai", "Delhi", "AC", "20:30", "10:00", "B123", "booking", "2022-07-08", (long) 20);
		boolean expected=b1.equals(b);
		assertEquals(true,expected );
	}

	@Test
	void testToString() {
		String b1=b.toString();
		assertEquals(b1, b.toString());
	}
	
	@Test
	void testHashCode() {
		Booking b1=new Booking("M123", "Mahi", 10, 100, 1000, 998076540, "Mounika", 123456, 02, 2024, 1230, d, "mounika@gmail.com", "Mumbai", "Delhi", "AC", "20:30", "10:00", "B123", "booking", "2022-07-08", (long) 20);
		int expected=b1.hashCode();
		assertEquals(expected, b.hashCode());
	}

}
