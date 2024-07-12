package hb;

public class Staff {
	private String staff_id,staff_name; 
	private StaffAddress ad;
	public String getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(String staff_id) {
		this.staff_id = staff_id;
	}
	public String getStaff_name() {
		return staff_name;
	}
	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}
	public StaffAddress getAd() {
		return ad;
	}
	public void setAd(StaffAddress ad) {
		this.ad = ad;
	}
	
	
}
