package randomQuestions;

interface Product {
	public void addItems(); 
}
public class AnonymousInnerClass {

	public static void main(String[] args) {
		Product p1 = new Product() {
			public void addItems() {System.out.println("TV");}}; 
			p1.addItems();
		}
	}

