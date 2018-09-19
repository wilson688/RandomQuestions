package randomQuestions;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("d:/sowmya.txt"));
				FileInputStream fis = new FileInputStream("xyz.txt")) {
					String text; 
					while((text=br.readLine())!=null) {
						System.err.println(text);
					}
				}
				catch(IOException e) { System.out.println(e); }
				finally {
					System.out.println("finally"); 
				}
				}
				
	}
