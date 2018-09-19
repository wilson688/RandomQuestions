package randomQuestions;

public class OuterBatch30 {

	private int trainees = 5; 
	
	 class InnerBatch30{
		void call() {System.out.println("trainees "+trainees);}
	}
	
	public static void main(String[] args) {
		OuterBatch30 out = new OuterBatch30(); 
		OuterBatch30.InnerBatch30 in = out.new InnerBatch30(); 
		in.call(); 
	}
}


