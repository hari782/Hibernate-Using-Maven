package hb;


import javax.persistence.*;

//OneToMany

@Entity
@Table(name="Subject")
public class Subject {
	
	private String sub_id, sub_name;
	private String category;
	
	@Id
	@Column(name="subid",length=100)
	public String getSub_id() {
		return sub_id;
	}
	public void setSub_id(String sub_id) {
		this.sub_id = sub_id;
	}
	
	@Column(name="subname",length=100)
	public String getSub_name() {
		return sub_name;
	}
	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}
	
	@Column(name="category",length=100)
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}
