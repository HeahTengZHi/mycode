package assignment01Problem14;

import java.util.ArrayList;

public class ATMClass extends FunctionClass{
	
	
	
	//Go FunctionClass for method
	@Override
	void ATMFunction(ArrayList<UserClass> users) {
		// TODO Auto-generated method stub
		
		System.out.println("User Home Page");
		System.out.println("1.Register");
		System.out.println("2.Login");
		System.out.println("3.Forget Password");
		System.out.println("4.Logout (exit)");
		System.out.print("Enter your choice: ");
		String choose=sc.next();
		
			if(choose.equals("1")) {
				if(Registration(users)==1)
					System.out.println("Registration Successfully!!");
				else
					System.out.println("Email Exists!");
				//go back to main page
				System.out.println();
				ATMFunction(users);
			}else if(choose.equals("2")) {
				Login(users);
				//go back to main page
				System.out.println();
				ATMFunction(users);
			}else if(choose.equals("3")) {
				ForgotPassword(users);
				//go back to main page
				System.out.println();
				ATMFunction(users);
			}else if(choose.equals("4"))
				System.out.println("Logout Successfully");
			else {
				System.out.println("Invalid Options, Please try again!!");
				System.out.println();
				ATMFunction(users);
			}
				
		
	
	}

}
