
package com.HQLProg.Question_2;

import org.hibernate.Session;

import org.hibernate.cfg.Configuration;
import org.hibernate.internal.build.AllowSysOut;
import org.hibernate.SessionFactory;
import org.junit.Test;


import junit.framework.TestCase;

public class AppTest extends TestCase {

	App a = new App();
	private static SessionFactory factory;
    private static Session session;
   
    @Test
    public void home()
    {
    	System.out.println("test case running.....");
    }
    
    
	/*@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		factory = HibernateUtil.getSessionFactory();
		System.out.println("SessionFactory created");
	}

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
		 if (factory != null) factory.close();
		System.out.println("SessionFactory destroyed");
	}

	@BeforeEach
	public void setUp() throws Exception {
		session = factory.openSession();
		System.out.println("Session created");
	}

	@AfterEach
	public void tearDown() throws Exception {
		  if (session != null) session.close();
	        System.out.println("Session closed\n");
	}
	*/
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	/*
	 * @Test // @Order(1) public void insertRecordTest() { int status; status =
	 * operations.insertData(session); assertEquals(1, status); }
	 */
	 
	
	/*
	 * @Test // @Order(3) public void grpByDeptTest() { int status =
	 * Operations.grpByDept(session); assertEquals(1, status); }
	 * 
	 * 
	 * @Test // @Order(2) public void secHighSalTest() { int status =
	 * Operations.secondHighestSalary(session); assertEquals(4, status); } }
	 */
	

}
