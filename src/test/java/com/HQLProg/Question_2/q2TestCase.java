package com.HQLProg.Question_2;

import static org.junit.Assert.assertEquals;

import java.io.Console;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class q2TestCase {

	App a = new App();
	private static SessionFactory factory;
	private static Session session;

	/*
	 * @Test public void home() { System.out.println("test case running.....");
	 * 
	 * }
	 */
	@BeforeClass
	public static void testbfrclass() {
		 Configuration cfg = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class);
         SessionFactory factory = cfg.buildSessionFactory();
		System.out.println("before class");
	}
	@AfterClass
	public static void testafterrclass() {
		 Configuration cfg = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class);
         SessionFactory factory = cfg.buildSessionFactory();
		System.out.println("after class");
	}
	
	@Before
	public void testbfr() {
		System.out.println("before Test");
	}
	@After
	public void testafter() {
		System.out.println("After class");
	}
	
	@Test
	public void insertRecordTest() {
		int status;
		status = operations.inserttest(session);
		assertEquals(1, status);
	}

	@Test
	public void secHighSalTest() {

		int status = operations.secondHighestSalarytest(session);
		assertEquals(4, status);
	}

	@Test
	public void grpByDeptTest() {
		int status = operations.grpByDept(session);
		assertEquals(1, status);
	}

}
