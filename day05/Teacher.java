package day05;

public class Teacher extends Person{
	
	private String id;
	private String subject;
	
	//인자생성자
	public Teacher(String id, String subject, String name, int age) {
		super(name, age);
		this.id = id;
		this.subject = subject;
	}
	
	//setter,getter
	public String getId() {
		return id;
	}
	public String getSubject() {
		return subject;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	//메소드오버라이딩
	@Override
	public String personInfo() {
		String info = super.personInfo();
		info += "\nID : " + id + "\n과목 : " + subject;
		return info;
	}

}
