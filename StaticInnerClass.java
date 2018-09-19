package randomQuestions;

public class StaticInnerClass {

	static int x = 34; 
	static int y = 44;	
	static class Inner {
		static void call() {
			System.out.println("The value of x is "+x);
		}
		 void call2() {
			System.out.println("The value of y is "+y);
		}
	}
	
	public static void main(String[] args) {
		StaticInnerClass.Inner sic = new StaticInnerClass.Inner(); 
		sic.call2();
		StaticInnerClass.Inner.call();
	}
}
