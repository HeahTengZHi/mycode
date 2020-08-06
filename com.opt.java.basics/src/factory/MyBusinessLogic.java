package factory;

public class MyBusinessLogic {
	public static Bank getBusinessLogic(String choice) {
		if(choice.equals("DBS")) {
			return new DBSBank();
		}else if (choice.equals("HSBC")) {
			return new HSBCBank();
		}else {
			return new UnknownBank();
		}
	}//end of getBusinessLogic
}//end of MyBusinessLogic
