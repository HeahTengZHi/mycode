package abstractfactory;

public class Citi implements CreditCard {

	@Override
	public int getCreditlimit() {
		// TODO Auto-generated method stub
		return 10000;
	}

	@Override
	public String getCardType() {
		// TODO Auto-generated method stub
		return "Citi Bank CreditCart";
	}

}
