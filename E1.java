package randomQuestions;

public class E1 {
	
	public static void main(String[] args) {
		try {
			int a = 30/1; 
			int a1[] = new int[5]; 
			a1[6] = 23; 
			String s = "sowmya"; 
			//int x = Integer.parseInt(s);
			s=null; 
			System.out.println(s.length());
			System.out.println(a);
			System.out.println(a1);
		}
		catch(NullPointerException | NumberFormatException | ArrayIndexOutOfBoundsException | ArithmeticException e) {System.out.println("catch "+e); }
		int x = 3+5; 
	    System.out.println(x); 
		
	}


}
