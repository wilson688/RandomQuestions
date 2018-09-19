package randomQuestions;

class X{
	X() {System.out.println("Calling x class");
}
	X(int x){this(); System.out.println(x);}
}

public class ThisKeyword {

	public static void main(String[] args) {
		X x1 = new X(12); 
	}
}
