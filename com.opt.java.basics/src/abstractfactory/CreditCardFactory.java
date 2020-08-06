package abstractfactory;

public class CreditCardFactory implements AbstractFactory<CreditCard> {

	@Override
	public CreditCard create(String bankType) {
		if(bankType.equals("citi")) {
			return new Citi();
		}else if(bankType.equals("dbs")) {
			return new DBS();
		}
		return null;
	}


}
