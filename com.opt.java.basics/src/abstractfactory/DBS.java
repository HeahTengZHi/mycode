package abstractfactory;

public class DBS implements CreditCard {

	@Override
	public int getCreditlimit() {
		// TODO Auto-generated method stub
		return 12000;
	}

	@Override
	public String getCardType() {
		// TODO Auto-generated method stub
		return "DBS Bank Gold Card";
	}

}
