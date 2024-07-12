package hb;

//ManyToMany

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="answer")
public class Answer {
	
	private String ans_id, ans, posted_by;
	
	@Id
	@Column(name="ans_id",length=100)
	public String getAns_id() {
		return ans_id;
	}

	public void setAns_id(String ans_id) {
		this.ans_id = ans_id;
	}
	
	@Column(name="ans",length=100)
	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}
	
	@Column(name="posted",length=100)
	public String getPosted_by() {
		return posted_by;
	}

	public void setPosted_by(String posted_by) {
		this.posted_by = posted_by;
	}
	
}
