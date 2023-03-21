package classesandobjects;

/*
 public 
 protected
 default
 private
 */
class Test {

	
}

public class AccessModifiers {
	
	public String str1;
	protected String str2;
	String str3;
	private String str4;

	public void test1() {
		System.out.println("public method test1");
	}

	protected void test2() {
		System.out.println("public method test1");
	}

	void test3() {
		System.out.println("public method test1");
	}

	private void test4() {
		System.out.println("public method test1");
	}
	
	public static void test5() {
		System.out.println("static method test5");
	}
	
	
	
	public static void main(String[] args) {
		AccessModifiers am = new AccessModifiers();
		
		am.str1= "Test1";
		am.str2="Test2";
		am.str3="Test3";
		am.str4="Test4";
		
		am.test1();
		am.test2();
		am.test3();
		am.test4();
		
		test5();
		
	}


}
