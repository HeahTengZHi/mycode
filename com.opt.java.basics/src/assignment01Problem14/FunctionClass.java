package assignment01Problem14;
import java.util.*;
//extends to get the user's account details
abstract class FunctionClass{
	
	UserClass LoginUser=null;
	Scanner sc=new Scanner(System.in);
	
	String checkPassword() {
		System.out.print("Enter Password: ");
		String registerPassword=sc.nextLine();
		System.out.print("Retype Password: ");
		String retypePassword=sc.nextLine();
		if(registerPassword.equals(retypePassword))
			return registerPassword;
		else
			System.out.println("Password doesn't match! Please try again.");
			return checkPassword();
	}
	
	//return 0 is exists account return 1 register successful
	int Registration(ArrayList<UserClass> users) {
		//email equals userID
		//email Validation (Check @ and .com)
		//Check existing email (email already exists!!)
		//else ask question for security key => (Registration Successful);
		System.out.print("Enter Email address: ");
		String registerEmail=sc.next();
		for(UserClass u:users) {
			if(u.getEmail().equals(registerEmail)) {
				return 0;
			}
		}
		String password=checkPassword();
		System.out.print("Saving Amount: ");
		double saving=sc.nextDouble();
		System.out.print("(Security Key), What is your favourite colour? : ");
		String setSecurityKey=sc.next();
		users.add(new UserClass(registerEmail,password,saving,setSecurityKey));
		return 1;
	}
	
	//Return null or user account
	void Login(ArrayList<UserClass> users) {
		//Check Email & PW
		System.out.print("Enter Email address: ");
		String email=sc.next();
		System.out.print("Enter Password: ");
		String password=sc.next();
		//if equals (Login Successful!!)
		//else (Invalid ID or Password)
		for(UserClass u:users) {
			if(u.getEmail().equals(email) && u.getPassword().equals(password)) {
				LoginUser=u;
				savingAccountOptions();
				return;
			}
		}
		System.out.println("Incorrect ID or Password, Please try again");
		Login(users);
	}
	
	void savingAccountOptions() {
		System.out.println("1.Check Available Bank Balance");
		System.out.println("2.Deposit Amount");
		System.out.println("3.Withdraw Amount");
		System.out.print("Enter you choice: ");
		int n=sc.nextInt();
		savingAccount(n,LoginUser);
	}
	
	void preventNegativeAmount(Double amount) {
		if(amount<0) {
			System.out.println("Amount can't be negative!! ");
			System.out.print("Please try again: ");
			amount=sc.nextDouble();
			preventNegativeAmount(amount);
		}
	}
	
	void continueOrLogout() {
		System.out.print("Wish to continue? (y/n): ");
		//Reuse scanner
		String s=sc.next();
		//If yes Back to savingAccount options
		if(s.equalsIgnoreCase("y")) {
			//The options provided by user
			savingAccountOptions();
		}else {
			System.out.print("Thanks for Banking with Us !! ");
			System.out.print("Logout Successfully!!");
		}
	}
	
	void savingAccount(int options,UserClass user) {
		
		//Check Available Bank Balance
		if(options==1) {
			System.out.println("Your account balance is: "+user.getBalance());
			continueOrLogout();
		//Deposit Amount
		}else if(options==2) {
			System.out.print("Enter Amount: ");
			//Reuse scanner
			double amount=sc.nextDouble();
			//To avoid negative amount
			preventNegativeAmount(amount);
			user.setBalance(user.getBalance()+amount);
			System.out.println("Your current account balance is: "+user.getBalance());
			continueOrLogout();
		//Withdraw Amount
		}else if(options==3) {
			//Show the account balance
			System.out.println("Your current account balance is: "+user.getBalance());
			System.out.print("Enter Amount You want to Withdraw: ");
			//Reuse scanner
			double amount=sc.nextDouble();
			//To avoid negative amount
			preventNegativeAmount(amount);
			if(amount>user.getBalance()) {
				System.out.println("Amount withdraw wan't more than your saving, Please try again. ");
				savingAccount(3,LoginUser);
			}
			//deduct and update account balance 
			user.setBalance(user.getBalance()-amount);
			//Show the account balance
			System.out.println("Your current account balance is: "+user.getBalance());
			continueOrLogout();
		}else {
			System.out.println("Invalid options");
			savingAccountOptions();
		}
		
		
	}
	
	
	
	void ForgotPassword(ArrayList<UserClass> users) {
		System.out.print("Enter Email address: ");
		String email=sc.next();
		System.out.print("Enter Security Key, What is your favourite colour?: ");
		String securityKey=sc.next();
		//Check Email & PW
		for(UserClass u:users) {
			if(u.getEmail().equals(email) && u.getSecurityKey().equals(securityKey)) {
				System.out.println("Enter New Password: ");
				String newPassword=sc.next();
				System.out.println("Old Password: "+u.getPassword());
				u.setPassword(newPassword);
				System.out.println("New Password: "+u.getPassword());
				System.out.println("Password Changed ");
				break;
			}else if(u.getEmail().equals(email) && !u.getSecurityKey().equals(securityKey)) {
				System.out.println("Security Key doesn't match, Please try again. ");
				//go to retype label and retype new password and security key
				return;
			}else {
				System.out.println("Invalid Account, Please try again!!");
				return;
			}
		}
	}
		
		//if equals => Enter new password and Retype new password required  else (Invalid ID or PW)
		//if Enter new password and Retype new password !equals show (Password doesnt match) =>Retype required
		//else ask question for security key
		//if answer equals security key (Your password has been reset successfully) 
		//else (Please try again [only 2 chances if wrong again back to main page and show(Fail to reset password)])
	
	
	abstract void ATMFunction(ArrayList<UserClass> users);
}
