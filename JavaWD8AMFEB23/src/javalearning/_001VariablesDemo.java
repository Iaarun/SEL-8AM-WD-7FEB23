package javalearning;

/*
 local
 instance
 class
 */
public class _001VariablesDemo {
	//instance variable
	String name;
	
	//class variable
	static String courseName;
	
	public static void main(String[] args) {
		//datatype identifier = value
     //local variable
		int num1 = 30;
		
		_001VariablesDemo obj1 = new _001VariablesDemo();
		
		_001VariablesDemo obj2 = new _001VariablesDemo();
		
		obj1.name="Arun";
		obj2.name = "Amit";
		obj1.courseName="Selenium";
	//	obj2.courseName=""
		
		
		System.out.println(obj1.name);//Arun
		System.out.println(obj2.name); //Amit
		System.out.println(obj1.courseName); //Selenium
		System.out.println(obj2.courseName);//Selenium
		
		obj2.name = "Tushar";
		obj2.courseName="Java";
		System.out.println(obj1.name);//Arun
		System.out.println(obj2.name); //Tushar
		System.out.println(obj1.courseName); //Java
		System.out.println(obj2.courseName);//Java
	}
	
	public static void test1() {
		int num1 =50;
		
	}
	

}

