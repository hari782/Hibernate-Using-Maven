package hb;

import javax.persistence.*;

//ManyToOne

@Entity
@Table(name="StdInfo")
public class StudentsInfo {
	
	private String rollno, stname;
	private Address ad;
	
	@Id
	@Column(name="Rollno",length=100)
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	
	@Column(name="name",length=100)
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	
	@OneToOne(targetEntity=Address.class,cascade = CascadeType.ALL)
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}
	
}
