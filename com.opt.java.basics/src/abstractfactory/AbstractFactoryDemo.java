package abstractfactory;

import java.util.Scanner;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter choice (Debit/Credit): ");
		String userChoice1 = sc.next();
		
		AbstractFactory refAbstractFactory = FactoryProvider.getFactory(userChoice1);
		
		switch(userChoice1) {
		case "credit":
			System.out.println("Enter choice (Citi/DBS): ");
			String userChoice2 = sc.next();
			CreditCard cc=(CreditCard)refAbstractFactory.create(userChoice2);
			System.out.println("Credit limit: "+cc.getCreditlimit()+"\nCredit Type: "+cc.getCardType());
			//Delete the object from the memory after used
			cc=null;
			break;
		case "debit":
			System.out.println("Enter choice (HSBC/UOB): ");
			userChoice2 = sc.next();
			DebitCard dc=(DebitCard)refAbstractFactory.create(userChoice2);
			System.out.println("Credit limit: "+dc.getCreditlimit()+"\nCredit Type: "+dc.getCardType());
			//Delete the object from the memory after used
			dc=null;
			break;
		default:
			break;
		}
		// check how to get getCreditLimit() and getCardType()
		
		// Implement DebitCardFactory() as well
	}

}
