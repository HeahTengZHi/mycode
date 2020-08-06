package abstractfactory;


//Service
public class DebitCardFactory implements AbstractFactory<DebitCard> {

	@Override
	public DebitCard create(String bankType) {
		if(bankType.equals("hsbc")) {
			return new HSBC();
		}else if(bankType.equals("uob")) {
			return new UOB();
		}
		return null;
	}

}
