package com.example.velocity.easybus.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.example.velocity.easybus.exception.ResourceNotFoundException;
import com.example.velocity.easybus.model.Bus;
import com.example.velocity.easybus.model.Feedback;
import com.example.velocity.easybus.model.User;
import com.example.velocity.easybus.repository.UserRepository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
@RunWith(SpringRunner.class)
class UserControllerTest {

	@InjectMocks
	UserController userController;

	@Mock
	UserRepository urepo;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSaveUser() throws ParseException  {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

		
		User user = new User();

		user.setDob("2002-08-08");
		user.setEmail("mahi@gmail.com");
		user.setId("M123");
		user.setName("Mahi");
		user.setPassword("mahi");
		user.setPhoneNo("9345678907");
		user.hashCode();
		when(urepo.save(any(User.class))).thenReturn(user);

		String response = userController.saveUser(user);

		assertEquals("User registered Successfully", response);
	}

	@Test
	void testGetAllUsers() {
		when(urepo.findAll()).thenReturn(Stream.of(
				new User("user21", "Sanjana", "sanju@gmail.com", "2022-07-15", "testing", "8372833292"),
				new User("user21", "Sanjana", "sanju@gmail.com", "2022-07-15", "testing", "8372833292"))
				.collect(Collectors.toList()));
		assertEquals(2, userController.getAllUsers().size());
	}

	/*@Test
	void testLoginUser() throws ResourceNotFoundException{
		//Boolean isLogin=false;
		//String email="abc@ims.com";
		//String password="testing";
		Optional<User> user =  urepo.findByEmail("abc@ims.com");

	

		assertEquals(true,user.isPresent());

		
	}*/
	@Test
	void testLoginUser() throws ResourceNotFoundException {
		
		Boolean isLogin=false;

Optional<User> user = Optional.of(new User("M123", "Mahi", "mahi@gmail.com", "20-08-2000", "mahi", "67867856543"));
		
		//brepo.save(bus);
		
		when(urepo.findByEmail("mahi@gmail.com")).thenReturn(user);
		
		if(user.get().getEmail()=="mahi@gmail.com"&& user.get().getPassword()=="mahi")
		{
			isLogin=true;
		}
		
		Boolean respone=userController.loginUser(user);
		  assertEquals(isLogin,respone);
		
	/*	Boolean isLogin=false;

		String user="abc@ims.com";
		String password="testing";

		
		Optional<User> user1 = urepo.findByEmail("abc@ims.com");
	    
		if(user.equals(user1.get().getEmail()) && password.equals(user1.get().getPassword()))
		{
			isLogin=true;
		}
      assertEquals(true, isLogin);*/
      
      
		
	}

	@Test
	void testLoginAdmin() {

		Boolean isLogin=false;
		User u=new User("M123", "Khalid", "Khalid@gmail.com", "20-08-2000", "developer", "67867856543");

		Optional<User> user = Optional.of(new User(u.getId(), u.getName(), u.getEmail(), u.getDob(), u.getPassword(), u.getPhoneNo()));
				
				//brepo.save(bus);
				
				when(urepo.findByEmail("mahi@gmail.com")).thenReturn(user);
				if(user.get().getEmail()=="Khalid@gmail.com"&& user.get().getPassword()=="developer")
				{
					isLogin=true;
				}
				
				Boolean respone=userController.loginAdmin(user);
				  assertEquals(isLogin,respone);
	/*Boolean b = false;
		String email = "Khalid@gmail.com";
		String password = "developer";
		//User d = urepo.findByEmail(email);

		if (email.equals("Khalid@gmail.com") && password.equals("developer")) {
			b = true;
		}
		assertEquals(true, b);*/
	}
		

	@Test
	void testUpdateDetails() throws ResourceNotFoundException {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
		User user =new User("M123", "Mahi", "mahi@gmail.com", "2022-08-09", "mahi", "8678907654");
		
		user.setName("madhu");
		user.setEmail("madhu@gmail.com");
		when(urepo.save(any(User.class))).thenReturn(user);
		String response = userController.updateDetails("nikki@gmail.com",user);
		 assertEquals("updated",response);

	}

	@Test
	void testGetUserById() throws ResourceNotFoundException {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

		
		Optional<User> user = Optional.of(new User("M123", "Mahi", "mahi@gmail.com", "20-08-2000", "mahi", "67867856543"));
		
		//brepo.save(bus);
		
		when(urepo.findByEmail("mahi@gmail.com")).thenReturn(user);
		
		//Optional<Bus> bus1=<Optional>(busController.getBusById("abc101")
		
		
		assertEquals(user, userController.getUserById("mahi@gmail.com"));
		
		
		

		

    }
}