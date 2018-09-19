package randomQuestions;

class C {
	C getDisplay() {
		System.out.println("Calling A class");
		return this;
	}

	void call() {
		System.out.println("Calling A's call method");
	}
}

class B extends C {
	B getDisplay() {
		System.out.println("calling B class");
		return this;
	}
}

public class CoVar {
	public static void main(String[] args) {
    new B().getDisplay().call();
    System.out.println("-------------------------------------");
    new B().getDisplay(); 

    System.out.println("-------------------------------------");
    new C().getDisplay().call();

    System.out.println("-------------------------------------");
    new C().getDisplay(); 
	}
}
