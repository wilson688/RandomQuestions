package randomQuestions;

class Course implements Cloneable{
	String subject1; 
	String subject2;
	String subject3; 
	
	public Course(String subject1, String subject2, String subject3) {
		super(); 
		this.subject1= subject1; 
		this.subject2=subject2; 
		this.subject3=subject3; 
	}
	
	protected Object clone() throws CloneNotSupportedException {
		return super.clone(); 
	}
}

class Student implements Cloneable {
	int id;
	String name; 
	Course course; 
	public Student(int id, String name, Course course) {
		super(); 
		this.id = id; 
		this.name=name; 
		this.course=course; 
	}
	
	protected Object clone() throws CloneNotSupportedException{
		Student ss1 = (Student) super.clone(); ss1.course = (Course)course.clone(); 
		return ss1; 
	}
}
public class DeepCopy {

	public static void main(String[] args) {
		Course c1 = new Course("CS", "Math", "Science"); 
		Student s1 = new Student(101,"Tae", c1); 
		
		Student s2=null; 
		try {
			s2= (Student)s1.clone(); 
		}catch(CloneNotSupportedException e) {e.printStackTrace();}
		
		System.out.println(s1.course.subject2);
		s2.course.subject2="Computers"; 
		System.out.println(s1.course.subject2);
	}
}
