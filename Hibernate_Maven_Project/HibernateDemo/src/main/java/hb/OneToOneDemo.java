package hb;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class OneToOneDemo {

	public static void main(String[] args) {
		
		Transaction_Info tran = new Transaction_Info();
		tran.setTran_id("t1");
		tran.setPro_name("Laptop");
		tran.setQty(1);
		tran.setTotal(50000.0);
		
		Customer cus = new Customer();
		cus.setCus_id("c1");
		cus.setCus_name("Hari");
		cus.setCus_mail("haribalaji2583@gmail.com");
		cus.setTran(tran);
		
		Configuration con = new Configuration();
		con.configure("hb/hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction t = ses.beginTransaction();
		ses.persist(cus);
		t.commit();
		ses.close();
		sf.close();
		
		System.out.println("Success...");
	}

}
