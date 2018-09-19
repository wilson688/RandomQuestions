package randomQuestions;

class Course2 {
	String subject1; String subject2; String subject3; 
	
	public Course2(String subject1, String subject2, String subject3) {
		this.subject1 = subject1; 
		this.subject2=subject2; 
		this.subject3=subject3; 
	}
}

class Student2 implements Cloneable {
	int id;
	String name; 
	Course2 course; 

   public  Student2(int id,  String name, Course2 course) {
	
	this.id=id; 
	this.name = name; 
	this.course=course; 
}
   
   protected Object clone() throws CloneNotSupportedException{
		
	   return super.clone(); 
	}  
}
public class ShallowCopy {
public static void main(String[] args) {
	Course2 science = new Course2("Physics", "Chemistry", "Biology"); 
	
	Student2 student1 = new Student2(111, "John", science); 
	Student2 student2 = null; 
	
	try {
		student2 = (Student2) student1.clone(); 
	}
	catch(CloneNotSupportedException e) {
		e.printStackTrace();
	}
	
	System.out.println(student1.course.subject3);
	student2.course.subject3 = "Math"; 
	System.out.println(student1.course.subject3);
}
}
