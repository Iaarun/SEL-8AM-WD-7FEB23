package javalearning;
/*
 for
 while
 do-while
 */

public class _006LoopStatements {

	public static void main(String[] args) {
		_006LoopStatements ls = new _006LoopStatements();
		ls.continuebreakstatement();
	}

	public void forloopdemo() {
		/*
		 * for(initialization; condition;increment/decrement){ code block }
		 */

		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello world!!");
		}
		int sum = 0;
		for (int i = 1; i <= 10; i++) {

			sum = sum + i;

		}
		System.out.println(sum);
	}

	public void printevennumber() {
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.print(i);
			}
		}
	}

	public void whileloop() {
		/*
		 * initialization; while(condition){
		 * 
		 * code block increment/decrement }
		 * 
		 */
		int i = 1;
		while (i <= 50) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

	public void nestedforloopdemo() {
		/*
		 * //number of rows for(int i=1;i<=5; i++) { //number of coulmns for(int
		 * j=1;j<=5; j++) { code } }
		 */

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public void pattern1() {

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void pattern2() {

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void pattern3() {

		for (int i = 1; i <= 4; i++) {
			for (int j = i; j <= 4; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public void breakstatement() {
		for(int i=1; i<=10; i++) {
			if(i==7) {
				break;
			}
			System.out.println(i);
		}
	}

	public void continuebreakstatement() {
		for(int i=1; i<=10; i++) {
			if(i%2 !=0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
