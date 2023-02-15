package com.HQLProg.Question_2;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class operations {
	
	    public static int inserttest(Session session) {
		
	    	 Configuration cfg = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class);
	         SessionFactory factory = cfg.buildSessionFactory();
	          session = factory.openSession();
	         Transaction tx = session.beginTransaction();
	         
	         
	         SQLQuery q = session.createSQLQuery("SELECT DeptId,MAX(Sal) from Employee where Sal NOT IN(SELECT MAX(Sal) FROM Employee GROUP BY DeptId) GROUP BY DeptId");
	         List<Object[]> salData = (List<Object[]>)q.list();
	         for(Object[] sd: salData){
	             System.out.println((Integer.parseInt(sd[0].toString())));
	             System.out.print(" "+(Integer.parseInt(sd[1].toString())));
	             System.out.println("");
	         }
	         
			
	         
	         SQLQuery q3 = session.createSQLQuery("SELECT d.DeptId,d.DeptName,e.EmpId,e.EmpName,e.Sal,e.Gender FROM Department d join Employee e on d.DeptId=e.DeptId ORDER BY DeptName");
	         List<Object[]> empData = (List<Object[]>)q3.list();
	         for(Object[] sd3: empData){
	             System.out.println((Integer.parseInt(sd3[0].toString())));
	             System.out.print(" "+sd3[1].toString());
	             System.out.print((" "+Integer.parseInt(sd3[2].toString())));
	             System.out.print(" "+sd3[3].toString());
	             System.out.print((" "+Integer.parseInt(sd3[4].toString())));
	             System.out.print(" "+(Integer.parseInt(sd3[5].toString())));
	             System.out.println("");
	         }
	         
	    	 Scanner sc = new Scanner(System.in);
	 		while(true)
	 		{
	 			System.out.println("------------------------------");
	 			System.out.println("Enter the emloyee Id");
	 			int EmpId = sc.nextInt();
	 		
	 			System.out.println("Enter the emloyee name");
	 			String EmpName = sc.next();
	 			
	 			System.out.println("Enter the emloyee salary");
	 			int Salary = sc.nextInt();
	 			
	 			System.out.println("Enter the  Department ID");
	 			int DptId = sc.nextInt();
	 			
	 			System.out.println("Enter the emloyee gender");
	 			int EmpGender = sc.nextInt();
	 			
	 			System.out.println("Enter the emloyee DOB");
	 			String EmpDOB = sc.next();
	 			
	 			System.out.println("Enter the Department Id");
	 			int DeptId = sc.nextInt();
	 		
	 			System.out.println("Enter the Department name");
	 		String DptName = sc.next();
	         
			
	         
	         Employee em = new Employee();
	         Department dep = new Department();
	         em.setEmpId(EmpId);
	         em.setEmpName(EmpName);
	         em.setSal(Salary);
	         em.setDeptId(DptId);
	         em.setGender(EmpGender);
	         em.setDOB(EmpDOB);
	         dep.setDeptId(DeptId);
	         dep.setDeptName(DptName);
	         
	         System.out.println(em);
	         session.save(em);
	         session.save(dep);
	        
	         
	         tx.commit();
	        
	         
			
	         System.out.println("Are You want to insert more records [Yes/No] ?");
	         String resp = sc.next();
	         
	         if(resp.equalsIgnoreCase("no"))
	         {
	       	  System.out.println("Entered records added Successfully!!");
	       	  break;
	       	  
	         }
	         session.close();
	    }
	         return 1;
			
	}
	    
	    public static int secondHighestSalarytest(Session session) {
	    	
	    	 Configuration cfg = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class);
	         SessionFactory factory = cfg.buildSessionFactory();
	         
	         Transaction tx = session.beginTransaction();
	        
	        Employee e1 = new Employee();
			Query q1;
			int a,te;
		
			//session.beginTransaction();
			q1 = session.createQuery("SELECT DeptId,MAX(Sal) from Employee where Sal NOT IN(SELECT MAX(Sal) FROM Employee GROUP BY DeptId) GROUP BY DeptId");
			List<Integer> b = (List<Integer>)q1.list();
			int ret = b.size();
			
			tx.commit();	
			
	        return ret;
		}

	    public static int grpByDept(Session session) {
	    	 Configuration cfg = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class);
	         SessionFactory factory = cfg.buildSessionFactory();
	          session = factory.openSession();
	       //  Transaction tx = session.beginTransaction();
			Query q1;
			session.beginTransaction();
			q1 = session.createQuery("SELECT d.DeptId,d.DeptName,e.EmpId,e.EmpName,e.Sal,e.Gender FROM Department d join Employee e on d.DeptId=e.DeptId ORDER BY DeptName");
			List<Employee> list = (List<Employee>)q1.list();
			
			
			return 1;
		}
}
