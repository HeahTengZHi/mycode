package com.opt.java.basics11;

@SuppressWarnings("serial")
class MyClass2 extends Exception{
	@SuppressWarnings("finally")
	int getID() throws MyClass2 {
		int number =10;
		try {
			
			MyClass2 refMyClass2=new MyClass2();
			//Go to catch
			throw refMyClass2;
		}catch(Exception e) {
			System.out.println("Catch");
			//Add 8
			return number+=8;
		
		}finally {
			System.out.println("Final");
			//Add 8 again
			return number+=8;
		}
	
		//Since u want to return number from finally so i remove outside return
		//return number;
	}
}

public class ExceptionDemo5 {

	public static void main(String[] args) throws MyClass2 {
			//Print out
			System.out.println(new MyClass2().getID()); 
		
	}

}
