package hb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeInhertance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contract ct = new Contract();
		ct.setEmp_id("emp-1");
		ct.setEmp_name("abcd");
		ct.setHr_rate(200.00);
		ct.setIncentive(500.00);
		
		Permanent pt = new Permanent();
		pt.setEmp_id("emp-2");
		pt.setEmp_name("efgh");
		pt.setBonus(2000.0);
		pt.setSalary(50000.0);
		
		Employee em = new Employee();
		em.setEmp_id("emp-3");
		em.setEmp_name("ijkl");
		
		Configuration con = new Configuration();
		con.configure("hb/hibernate.cfg.xml");
		
		SessionFactory sf = con.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction t = ses.beginTransaction();
		
		ses.persist(ct);
		
		ses.persist(pt);
		
		ses.persist(em);
		
		t.commit();
		ses.close();
		sf.close();
		System.out.println("Success...");

		
		
		

	}

}
