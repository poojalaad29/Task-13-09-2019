package com.wp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpEntry {

	public static void main(String[] args) {
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		emp e1=new emp(111,"AAA",50000);
		emp e2=new emp(112,"BBB",60000);
		emp e3=new emp(113,"CCC",70000);
		emp e4=new emp(114,"DDD",80000);
		emp e5=new emp(115,"EEE",90000);
		emp e6=new emp(116,"FFF",83000);
		e6.setSal(85000);
		Transaction tr=session.beginTransaction();
		session.save(e1); session.save(e2);
		session.save(e3); session.save(e4);
		session.save(e5);session.save(e6);
		session.delete(e5);
		
		session.update(e6);
		
		tr.commit();
		session.close();
		System.out.println("RECORD Updated");
		
	}
}