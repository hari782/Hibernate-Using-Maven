package hb;

//ManyToMany

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="question")
public class Question {
	
	@Id
	@Column(name="qid",length=100)
	private String qid;
	
	@Column(name="qname",length=100)
	private String qname;
	
	public String getQid() {
		return qid;
	}

	public void setQid(String qid) {
		this.qid = qid;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public List<Answer> getAns() {
		return ans;
	}

	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}

	@ManyToMany(targetEntity = Answer.class,cascade = CascadeType.ALL)
	@JoinTable(name="quesandans",joinColumns= {@JoinColumn(name="ans_id")},inverseJoinColumns= {@JoinColumn(name="qid")})
	private List<Answer> ans;
}
