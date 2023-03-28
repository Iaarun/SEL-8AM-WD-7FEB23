package encapsulationdemo;

public class Person {
	private String name;
	private int age;
	private String uid;
	private String orgName="Microsoft";
	
	public String getOrgName() {
		return orgName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
	char[] arr=	name.toCharArray();
	for(char a:arr) {
		if(!Character.isDigit(a)) {
			this.name = name;
		}
	}
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>=1 && age <=100) {
			this.age = age;
		}else {
			this.age = -1;
		}
		
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	

}
