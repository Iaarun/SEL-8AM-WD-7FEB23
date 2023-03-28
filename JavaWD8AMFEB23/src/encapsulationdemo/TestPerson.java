package encapsulationdemo;

public class TestPerson {
	public static void main(String[] args) {
		Person person = new Person();
		
		person.setName("1581515");
		person.setAge(5000);
		person.setUid("1234-1521-3215");
		
		
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getUid());
		System.out.print(person.getOrgName());
	}

}
