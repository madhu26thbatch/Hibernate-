package com.controller;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;
import org.hibernate.query.Query;

import com.techpalle.model.Student;

public class MyProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory s=new Configuration().configure().buildSessionFactory();
		Session sf=s.openSession();
		Transaction t=sf.beginTransaction();
	//	Student a1=new Student("Rajesh","Java");
	//	Student a2=new Student("Ramesh","c++");
	//	Student a3=new Student("Suresh","sql");
		//Student a4=new Student("Rajeshwari","Java full stak");
	//	sf.save(a4);
		Query <Student> q =sf.createQuery("from Student");
		java.util.List<Student> d = q.list();
		 for(Student dept1:d) {
			   System.out.println(dept1.getId());
			   System.out.println(dept1.getName());
			  System.out.println(dept1.getCource());
			   System.out.println("_____________");
			  System.out.println("______________");
		   }
		
		t.commit();
		sf.close();
		s.close();

	}

}
