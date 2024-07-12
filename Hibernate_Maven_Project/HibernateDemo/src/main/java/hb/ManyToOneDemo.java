package hb;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class ManyToOneDemo {

	public static void main(String[] args) {
		
		Address add = new Address();
		add.setAddr("N-1");
		add.setAddr1("Nandha Engineering College");
		add.setAddr2("Perundurai Road");
		add.setStreet("Vaikaal Medu");
		
		StudentsInfo stdin1 = new StudentsInfo();
		stdin1.setRollno("21ec026");
		stdin1.setStname("Haribalaji");
		stdin1.setAd(add);
		
		StudentsInfo stdin2 = new StudentsInfo();
		stdin2.setRollno("21erew");
		stdin2.setStname("qdfegdbr");
		stdin2.setAd(add);
		
		Configuration con = new Configuration();
		con.configure("hb/hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction t = ses.beginTransaction();
		ses.persist(stdin1);
		ses.persist(stdin2);
		
		t.commit();
		ses.close();
		sf.close();
		
		System.out.println("Success....");
	}

}
