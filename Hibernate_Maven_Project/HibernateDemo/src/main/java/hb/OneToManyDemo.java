package hb;

import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.List;
import java.util.ArrayList;

public class OneToManyDemo {
	public static void main (String[] args) {
		
		Subject s1 = new Subject();
		s1.setSub_id("sub-3");
		s1.setSub_name("Python");
		s1.setCategory("Tchnology");
		
		Subject s2 = new Subject();
		s2.setSub_id("sub-4");
		s2.setSub_name("Azure");
		s2.setCategory("Cloud");
		
		List<Subject> lst = new ArrayList();
		lst.add(s1);
		lst.add(s2);
		
		Teacher tec = new Teacher();
		tec.setTeacher_id("T-2");
		tec.setTeacher_name("def");
		tec.setSub(lst);
		
		Configuration con=new Configuration();
		con.configure("hb/hibernate.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction t=ses.beginTransaction();
		
		ses.persist(tec);
		t.commit();
		ses.close();
		sf.close();
		
		System.out.println("Success...");
		
	}
}