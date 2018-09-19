package randomQuestions;

class Test{
	interface testInt{
		void test(); 
	}
}
interface A {
	void call(); 
	interface B{
		void call2(); 
	}
}

public class MainTest implements A.B, A, Test.testInt {
	
	public void call() {System.out.println("Calling A");}
	public void call2() {System.out.println("Calling B");}
	public void test() {System.out.println("calling test method");}
	
	public static void main(String[] args) {
		A.B ab = new MainTest(); 
		ab.call2(); 
		A a1 = new MainTest(); 
		a1.call(); 
		Test.testInt msg = new MainTest(); 
		msg.test(); 

		
	}
}
