package abstractfactory;

//either it will create instance of DebitCard or CreditCard
public class FactoryProvider {
	public static AbstractFactory getFactory(String userChoice){

		if (userChoice.equals("credit")) {
			return new CreditCardFactory();
		}else if (userChoice.equals("debit")) {
			return new DebitCardFactory();
		}
		return null;
		
		
	}
}