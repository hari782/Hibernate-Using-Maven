package hb;
import javax.persistence.*;

@Entity
@Table(name="library")
public class LibraryInfo {
	private String lib_id, lib_name;
	private int total_books;
	
	@Id
	@Column(name="lib_id",length=30)
	public String getLib_id() {
		return lib_id;
	}
	public void setLib_id(String lib_id) {
		this.lib_id = lib_id;
	}
	
	@Column(name="lib_name",length=100)
	public String getLib_name() {
		return lib_name;
	}
	public void setLib_name(String lib_name) {
		this.lib_name = lib_name;
	}
	
	@Column(name="Total_Books",length=3)
	public int getTotal_books() {
		return total_books;
	}
	public void setTotal_books(int books) {
		this.total_books = books;
	}
	
}
