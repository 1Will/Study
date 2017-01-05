package entity;

public class User {
	private Integer id;
	private String username;
	private String password;
	private String eamil;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return username;
	}
	public void setName(String name) {
		this.username = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String address) {
		this.password = address;
	}
	public String getEamil() {
		return eamil;
	}
	public void setEamil(String memo) {
		this.eamil = memo;
	}
	
	public String toString(){
		return "Users [id="+id+", username="+username+", password="+password+", eamil="+eamil+"]";
	}

	
}
