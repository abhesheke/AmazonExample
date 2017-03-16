package com.test;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Samplegtestng {

	String username;
	String password;

	/*@BeforeClass
	public void beforeClass() {
		System.out.println("01----------Before Class");
		username = "Arjun";
		password = "testing";
		System.out.println("Intalize Username" + username);
		System.out.println("Intalize Password" + password);
	}

	@AfterClass
	public void afterClass() {
		System.out.println("04----------afterClass");
		System.out.println("Username" + username);
		System.out.println("Password" + password);

	}*/
	
	@BeforeGroups(groups= {"testing","aaa","bbb"})
	public void beforeGroupMethod()
	{
		c=50;
		System.out.println("before Group@@@@");
	}
	@AfterGroups(groups="testing")
	public void afterGroup()
	{
		System.out.println("After Group-----@@@@@,");
	}
	int a,b,c;
	@BeforeMethod
	public void beforeMethod() {
		a=10;b=20;
		System.out.println("1 -  Before method");
	}
	@Test(description = "Testing the application",groups="testing")
	public void test_req_01() {
		System.out.println("2--Test case with Groups"+(a+b+c));
	}
	
	@Test
	public void testing()
	{
		System.out.println("new test Cases");
	}
	
	 @Test public void test1_req_02() 
	 { 
		 System.out.println("2---Test case "+(a+b+c)); 
	 }

	@AfterMethod
	public void afterMethod() {
		System.out.println("3---After method");

	}
//	 @Test public void test1_req_02() { System.out.println("2---Test case"); }
	
	/*
	 * @Test public void test1_req_02() { System.out.println("2---Test case"); }
	 * 
	 * @Test public void test2_re() { System.out.println("2---Test case"); }
	 */
	
	

	

}
