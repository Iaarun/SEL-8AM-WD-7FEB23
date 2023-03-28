package abstractiondemo;

public class Test  extends AbstractClass implements Interface1, Interface2{
	
	
	
	public static void main(String[] args) {
		//Annonymous implementation
		AbstractClass abs = new AbstractClass() {
			
			@Override
			public void test1() {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		Test t1 = new Test();
		t1.test1();
		t1.test2();
	}

	@Override
	public void test1() {
		System.out.println("Test 1 method");
		
	}

	@Override
	public void test3() {
           System.out.println("Test 3");		
	}

	
	
	

}
