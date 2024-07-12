package hb;

import javax.persistence.*;

@Entity
@Table(name="TransactionInfo")
public class Transaction_Info {
	
	private Customer cus;
	private int qty;
	private double total;
	private String tran_id, pro_name;
	
	@OneToOne(targetEntity=Customer.class, cascade=CascadeType.ALL)
	@JoinColumn(name="cus_id")
	public Customer getCus() {
		return cus;
	}
	public void setCus(Customer cus) {
		this.cus = cus;
	}
	
	@Column(name="qty",length=10)
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	@Column(name="total",length=15)
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	@Id
	@Column(name="tran_id",length=20)
	public String getTran_id() {
		return tran_id;
	}
	public void setTran_id(String tran_id) {
		this.tran_id = tran_id;
	}
	
	@Column(name="Pro_name",length=30)
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	

}
