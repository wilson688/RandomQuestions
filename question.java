package randomQuestions;

class User{
	int userID; 
	String userName; 
	
	public User(int id, String name) {
		this.userID = id; 
		this.userName= name; 
				
	}
	
	public User(User u) {
		userID=u.userID; 
		userName=u.userName; 
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	void display() {
		System.out.println(userID+" "+userName);
	}
	
	public static void main(String[] args) {
		User u1 = new User(101, "x"); 
		User u2 = new User(u1); 
		u1.display();
		u2.display();
		User u3 = new User(102, "y"); 
		User u4 = new User(); 
		u4.userID = u3.userID; 
		u4.userName = u3.userName; 
		u3.display();
		u4.display();
		
	}
}

