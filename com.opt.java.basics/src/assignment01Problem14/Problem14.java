package assignment01Problem14;

import java.util.ArrayList;


public class Problem14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserClass user1=new UserClass("xyz@gmail.com","xyz123",1000.01,"red");
		UserClass user2=new UserClass("abc@gmail.com","abc123",900.51,"blue");
		ArrayList<UserClass> users=new ArrayList<UserClass>();
		
		users.add(user1);
		users.add(user2);
		new ATMClass().ATMFunction(users);
		
	}

}
 