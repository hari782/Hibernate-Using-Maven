package hb;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ComponenetMapping {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Staff ID : ");
		String staff_id=sc.nextLine();
		
		System.out.println("Staff Name : ");
		String staff_name=sc.nextLine();
		
		System.out.println("Address1 : ");
		String add1=sc.nextLine();
		
		System.out.println("Address2 : ");
		String add2=sc.nextLine();
		
		System.out.println("Street : ");
		String street=sc.nextLine();
		
		System.out.println("City : ");
		String city=sc.nextLine();
		
		System.out.println("Pincode: ");
		String pincode=sc.nextLine();
		
		StaffAddress ad= new StaffAddress();
		ad.setAdd1(add1);
		ad.setAdd2(add2);
		ad.setStreet(street);
		ad.setCity(city);
		ad.setPincode(pincode);
		
		Staff staff=new Staff();
		staff.setStaff_id(staff_id);
		staff.setStaff_name(staff_name);
		staff.setAd(ad);
		
		Configuration con=new Configuration();
		con.configure("hb/hibernate.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction t=ses.beginTransaction();
		
		ses.persist(staff);
		t.commit();
		ses.close();
		sf.close();
		
		System.out.println("Created Successfully...");

	}

}
