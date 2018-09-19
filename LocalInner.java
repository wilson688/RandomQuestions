package randomQuestions;

public class LocalInner {

	private int x = 78; 
	
	void call() {
		class Inner {
			void display() {
				System.out.println("Calling inner"+x);
			}
			void display2() {
				System.out.println("Calling inner 2"+x);
			}
		}
		Inner in = new Inner(); 
		in.display();
		in.display2();
	}
	
	public static void main(String[] args) {
		LocalInner local = new LocalInner(); 
		local.call();
	}
}
