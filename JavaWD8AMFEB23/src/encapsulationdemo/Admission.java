package encapsulationdemo;

public class Admission {
	
	public boolean validateAge(int age)  {
		
		if(age>=6) {
			return true;
		}else {
			throw new InvalidAgeException("Invalid Age");
		}
	}

}
