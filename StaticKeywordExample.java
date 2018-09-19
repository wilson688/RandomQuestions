package randomQuestions;

public class StaticKeywordExample {

	int count=0; 
	StaticKeywordExample(){
	count++; 
	System.out.println(count);
	}
	public static void main(String[] args) {
		StaticKeywordExample i1 = new StaticKeywordExample(); 

		StaticKeywordExample i2 = new StaticKeywordExample(); 

		StaticKeywordExample i3 = new StaticKeywordExample(); 
	}
}

class StaticKeywordExample2 {

	static int count=0; 
	StaticKeywordExample2(){
	count++; 
	System.out.println(count);
	}
	public static void main(String[] args) {
		StaticKeywordExample2 i1 = new StaticKeywordExample2(); 

		StaticKeywordExample2 i2 = new StaticKeywordExample2(); 

		StaticKeywordExample2 i3 = new StaticKeywordExample2(); 
	}
}
