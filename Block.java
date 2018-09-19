package randomQuestions;

public class Block {
	{
		System.out.println("1");
	}
	
	static {
		System.out.println("2");
		System.exit(0);
	}
	
	{
		System.out.println("3");
	}
	
	public static void main(String[] args) {
		
	}
}
