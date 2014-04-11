package entity;

public class User {
	private int id;
	private String username;
	private String name;
	private String pwd;
	private int age;
	private int sex;
	private String phone;
	
	
	public User() {
		super();
	}
	public User(int id,String username, String name, String pwd, int age, int sex,
			String phone) {
		super();
		this.id=id;//this.setId(id);
		this.username = username;
		this.name = name;
		this.pwd = pwd;
		this.age = age;
		this.sex = sex;
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
