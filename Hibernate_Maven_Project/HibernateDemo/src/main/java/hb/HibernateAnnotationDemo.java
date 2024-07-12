package hb;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class HibernateAnnotationDemo {

	public static void main(String[] args) {
		LibraryInfo lib = new LibraryInfo();
		
		lib.setLib_id("lib-1");
		lib.setLib_name("NEC Library");
		lib.setTotal_books(4000);
		
		Configuration con = new Configuration();
		con.configure("hb/hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory(); 
		Session ses = sf.openSession();
		Transaction t = ses.beginTransaction();
		
		ses.persist(lib);
		
		t.commit();
		ses.close();
		sf.close();
		
		System.out.println("Success...");

	}

}
