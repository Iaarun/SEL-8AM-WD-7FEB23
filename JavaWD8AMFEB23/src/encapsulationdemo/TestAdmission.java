package encapsulationdemo;

public class TestAdmission {
	
	public static void main(String[] args) {
		Admission admission = new Admission();
		System.out.println("Check age");
	
		System.out.println(admission.validateAge(5));
		
		System.out.println("Check age success");
	}

}
