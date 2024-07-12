package hb;

import java.util.*;
import javax.persistence.*;

//OneToMany

@Entity
@Table(name="Teacher")
public class Teacher {
	
	private String teacher_id, teacher_name;
	private List<Subject> sub;
	
	@Id
	@Column(name="teacherid",length=100)
	public String getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(String teacher_id) {
		this.teacher_id = teacher_id;
	}
	
	@Column(name="teacher_name",length=100)
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="sub_id")
	@OrderColumn(name="subindex")
	public List<Subject> getSub() {
		return sub;
	}
	public void setSub(List<Subject> sub) {
		this.sub = sub;
	}
	
}
