package hb;

import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;

public class HibernateRetrieveData {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name : ");
		String a = s.nextLine();
		
		Configuration con = new Configuration();
		con.configure("hb/hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction t = ses.beginTransaction();
		
		Query q = ses.createQuery("from student where stname='"+a+"'");
		List lst  = q.list();
		Iterator ite = lst.iterator();
		while(ite.hasNext()) {
			student st = (student)ite.next();
			String rno = st.getRollno();
			String name = st.getStname();
			double mark = st.getMark();
			int rank = st.getRank();
			System.out.println("Roll no : "+rno);
			System.out.println("Name : "+name);
			System.out.println("Mark : "+mark);
			System.out.println("Rank : "+rank);
			System.out.println("***********************");
		}
	}

}
