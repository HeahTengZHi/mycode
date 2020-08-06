package abstractfactory;


//POJO
public class HSBC implements DebitCard {

	@Override
	public int getCreditlimit() {
		// TODO Auto-generated method stub
		return 20000;
	}

	@Override
	public String getCardType() {
		// TODO Auto-generated method stub
		return "HSBC Silver Card";
	}

}
