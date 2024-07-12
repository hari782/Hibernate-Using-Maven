package hb;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class CollectionMapping {

	public static void main(String[] args) {
		
		List<String> group_name = new ArrayList<String>();
		group_name.add("Telecom: Idea");
		group_name.add("Steel: TMT");
		group_name.add("Clothes: Allen Soley");
		
		Group gp = new Group();
		gp.setGroupid("G-1");
		gp.setOwner_name("Aditya Birla Groups");
		gp.setGroup(group_name);
		
		Configuration con = new Configuration();
		con.configure("hb/hibernate.cfg.xml");
		
		SessionFactory sf = con.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction t = ses.beginTransaction();
		
		ses.persist(gp);
		
		t.commit();
		ses.close();
		sf.close();

	}

}
