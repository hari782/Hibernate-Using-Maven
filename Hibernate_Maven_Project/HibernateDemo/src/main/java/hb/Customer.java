package hb;

import javax.persistence.*;

@Entity
@Table(name="Customer")
public class Customer {
	
	private String cus_id, cus_name, cus_mail;
	private Transaction_Info tran;

	@OneToOne(targetEntity=Transaction_Info.class,cascade=CascadeType.ALL)
	public Transaction_Info getTran() {
		return tran;
	}

	public void setTran(Transaction_Info tran) {
		this.tran = tran;
	}

	@Id
	@Column(name="cus_id",length=10)
	public String getCus_id() {
		return cus_id;
	}

	public void setCus_id(String cus_id) {
		this.cus_id = cus_id;
	}

	@Column(name="cus_name",length=100)
	public String getCus_name() {
		return cus_name;
	}

	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}

	@Column(name="Mail",length=100)
	public String getCus_mail() {
		return cus_mail;
	}

	public void setCus_mail(String cus_mail) {
		this.cus_mail = cus_mail;
	}
	

}
