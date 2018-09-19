package randomQuestions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {
		Pattern p = Pattern.compile(".s"); 
		Matcher x = p.matcher("as"); 
		boolean b=x.matches();
		//System.out.println(b);
	 
		boolean b2=Pattern.compile("..s").matcher("ass").matches();
//		System.out.println(b2);
//		
//		System.out.println(Pattern.matches(".s", "qs"));
//
//		System.out.println(Pattern.matches(".s", "mk"));
//		
//		System.out.println(Pattern.matches(".s", "mst"));
//		
//		System.out.println(Pattern.matches(".s", "amns"));
//
//		System.out.println(Pattern.matches("..s", "mas"));
//
//		System.out.println(Pattern.matches("[aammmn]", "a"));
//
//		System.out.println(Pattern.matches("[a]+", "aa"));
//
//		System.out.println(Pattern.matches("[a]+[n]", "an"));
//
//		System.out.println(Pattern.matches("\\d", "a"));
//
//		System.out.println(Pattern.matches("\\D", "a"));
//
//		System.out.println(Pattern.matches("\\d", "1"));
//		

		System.out.println(Pattern.matches("[a-zA-Z0-9][8]", "fantin24"));

		/*System.out.println(Pattern.matches("(a-zA-Z0-9)(9)", "fantin#24"));

		System.out.println(Pattern.matches("[com]$", "com"));
*/	}
}
