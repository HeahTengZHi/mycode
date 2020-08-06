package abstractfactory;


//POJO
public class UOB implements DebitCard {

	@Override
	public int getCreditlimit() {
		// TODO Auto-generated method stub
		return 30000;
	}

	@Override
	public String getCardType() {
		// TODO Auto-generated method stub
		return "UOB Debit Card";
	}

}
