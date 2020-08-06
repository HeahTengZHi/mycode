package com.opt.logindemo;


public class UserController {
	
	private UserServices refuserService;
	
	void myLogic() {
		User refUser=new User();	//create object of User Class
		refUser.setUseID(111);		//set user ID
		refUser.setUserPassword("optimum");	//set user password
		
		refuserService=new UserServices();	//create object of UserService
		if(refuserService.getloginValidate(refUser)) { //call getLoginValidate and pass User reference as argument
			System.out.println("Welcome!!");
		}else{
			System.out.println("Invalid Account");
		}
	}//end of myLogic
}// end of UseController
