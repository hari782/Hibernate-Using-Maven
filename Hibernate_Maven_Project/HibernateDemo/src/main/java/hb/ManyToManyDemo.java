package hb;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class ManyToManyDemo {

	public static void main(String[] args) {
		
		Answer ans1 = new Answer();
		ans1.setAns_id("ans-1");
		ans1.setAns("Hyper Text Markup Language");
		ans1.setPosted_by("abc");
		
		Answer ans2 = new Answer();
		ans2.setAns_id("ans-2");
		ans2.setAns("Hyper Text Markup Language");
		ans2.setPosted_by("abc");
		
		Answer ans3 = new Answer();
		ans3.setAns_id("ans-3");
		ans3.setAns("Hyper Text Markup Language");
		ans3.setPosted_by("abc");
		
		List<Answer> ans = new ArrayList();
		ans.add(ans1);
		ans.add(ans2);
		ans.add(ans3);
		
		Question que = new Question();
		que.setQid("Q-1");
		que.setQname("Expand HTTP");
		que.setAns(ans);
		
		Configuration con = new Configuration();
		con.configure("hb/hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction t = ses.beginTransaction();
		ses.persist(que);
		t.commit();
		ses.close();
		sf.close();
		
		System.out.println("Success....");
	}

}
