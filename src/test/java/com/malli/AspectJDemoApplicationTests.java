package com.malli;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.malli.pojo.Address;
import com.malli.vo.Employe;
import com.malli.vo.User;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class AspectJDemoApplicationTests {

	@Autowired
	Employe employee;
	
	@Autowired
	User user;
	
	@Autowired
	Address addr;

	
	
	@Test
	public void testEmploye() {
		employee.setId(1);
		employee.setName("Malli Chandana");

	}
	
	@Test
	public void testUser() {
		
		//user.setEmail("test@test.com");
		user.setOrg("Cognizant");
	}
	
	@Test
	public void testUsermail() {
		
		System.out.println("*******************"+user.getEmail());
		
	}
	
	@Test
	public void testAddress() {
		addr.setCity("Avanigadda");
		addr.setCountry("India");
	}

}
