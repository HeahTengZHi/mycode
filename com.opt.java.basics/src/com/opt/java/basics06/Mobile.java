package com.opt.java.basics06;

public class Mobile{
	Whatsapp refWhatsapp;

	//getData method 1
//	public Whatsapp getRefWhatsapp() {
//		return refWhatsapp;
//	}
	//getData method 2
	@Override
	public String toString(){
		return refWhatsapp.toString();
	}
	
	
	//setData method 1
//	public void setRefWhatsapp(Whatsapp refWhatsapp) {
//		this.refWhatsapp = refWhatsapp;
//	}
	
	
	//setData method 2
	Mobile(Whatsapp refWhatsapp){
		this.refWhatsapp = refWhatsapp;
	}

}
