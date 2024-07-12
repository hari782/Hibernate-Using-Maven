package hb;

import javax.persistence.*;

//ManyToOne

@Entity
@Table(name="CollegeAddress")
public class Address {
	
	private String addr;
	private String addr1, addr2, street;
	private StudentsInfo stinfo;
	
	@Id
	@Column(name="addid",length=100)
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	@Column(name="add1",length=100)
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	
	@Column(name="add2",length=100)
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	
	@Column(name="Street",length=200)
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	@ManyToOne(targetEntity=StudentsInfo.class,cascade = CascadeType.ALL)
	public StudentsInfo getStinfo() {
		return stinfo;
	}
	public void setStinfo(StudentsInfo stinfo) {
		this.stinfo = stinfo;
	}
	

}
