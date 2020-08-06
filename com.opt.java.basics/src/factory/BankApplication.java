package factory;
import java.util.Scanner;
public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your choice: ");
		String choice=sc.next();
		
		Bank refBank=MyBusinessLogic.getBusinessLogic(choice);
		refBank.getBankDetails();
	}

}
