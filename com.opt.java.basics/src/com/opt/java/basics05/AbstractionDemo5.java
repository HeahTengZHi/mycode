package com.opt.java.basics05;

interface FrontendDeveloper{
	void skillsFrontendDeveloper();
}//end of FrontendDeveloper


interface BackendDeveloper extends FrontendDeveloper{
	void skillsBackendDeveloper();
}//end of BackendDeveloper


class MySkills implements BackendDeveloper{


	@Override
	public void skillsBackendDeveloper() {
		// TODO Auto-generated method stub
		System.out.println("Java, Spring Boot,Maven,Rest API..");
	}

	@Override
	public void skillsFrontendDeveloper() {
		// TODO Auto-generated method stub
		System.out.println("HTML,CSS,JavaScript, React JS,Rest API..");
	}
	
}

public class AbstractionDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySkills ms=new MySkills();
		ms.skillsBackendDeveloper();
		ms.skillsFrontendDeveloper();
	}

}
