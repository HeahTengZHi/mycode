package com.opt.java.basics10;

interface Loan{
	void homeLoanPlan();
	void carLoanPlan();
}

interface Insurance{
	void individualPlan();
	void corporatePlan();
}


//Enum also helps to reduce memory
class MyApplication{
	
	enum LoanInsurance implements Loan,Insurance{
		PlanA,PlanB,PlanC,PlanD;
		
		@Override
		public void individualPlan() {
			
			System.out.println("IndividualPlan");
		}

		@Override
		public void corporatePlan() {
			// TODO Auto-generated method stub
			System.out.println("corporatePlan");
		}

		@Override
		public void homeLoanPlan() {
			// TODO Auto-generated method stub
			System.out.println("homeLoanPlan");
		}

		@Override
		public void carLoanPlan() {
			// TODO Auto-generated method stub
			System.out.println("carLoanPlan");
		}
		
	}
	
	void getEnumData() {
		LoanInsurance.PlanA.homeLoanPlan();
		LoanInsurance.PlanA.individualPlan();
	}
}

public class EnumDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyApplication().getEnumData();
	}

}
