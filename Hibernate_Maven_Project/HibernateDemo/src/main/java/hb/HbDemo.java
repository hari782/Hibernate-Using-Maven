package hb;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class HbDemo {

	public static void main(String[] args) {
		
		student st = new student();
		st.setRollno("21ec004");
		st.setStname("Afsar");
		st.setRank(1);
		st.setMark(99.98);
		
		Configuration con = new Configuration();
		con.configure("hb/hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction t = ses.beginTransaction();
		
		ses.persist(st);
		
		t.commit();
		ses.close();
		sf.close();
		
		System.out.println("Success...");

	}

}
