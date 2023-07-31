package day3;

public class Encapsulation {
	private String name;
	private int id;
	private String email;
	private long phone;
	public  Encapsulation() {
	super();
	}
	public Encapsulation(String name,int id,String email,long phone) {
		super();
		this.name=name;
		this.id=id;
		this.email=email;
		this.phone=phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}

	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setName("vaidhegi");
		obj.setId(67854);
		obj.setEmail("vaidhegi@tygmail.com");
		obj.setPhone(67879543);
		System.out.println("your name is  :"+obj.getName());
		System.out.println("your id is  :"+obj.getId());
		System.out.println("your email is  :"+obj.getEmail());
		System.out.println("your phone is  :"+obj.getPhone());
	}
	}


