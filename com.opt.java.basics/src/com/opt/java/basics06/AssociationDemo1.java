package com.opt.java.basics06;

public class AssociationDemo1 {

	public static void main(String[] args) {
		//Call Mobile => Whatsapp => ChatApplication
		//set the value and get the data
		
//		ChatApplication refChatApplication=new ChatApplication();
//		Whatsapp refWhatsapp=new Whatsapp();
//		Mobile refMobile=new Mobile();
//		
//		refChatApplication.setName("MyName");
//		refWhatsapp.setRefChatApplication(refChatApplication);
//		refMobile.setRefWhatsapp(refWhatsapp);
		
		
		
		//Method 2
		ChatApplication refChatApplication=new ChatApplication("MyName");
		Whatsapp refWhatsapp=new Whatsapp(refChatApplication);
		Mobile refMobile=new Mobile(refWhatsapp);
		
		
//		System.out.println(refMobile.getRefWhatsapp().getRefChatApplication().getName());
		System.out.println(refMobile.refWhatsapp.refChatApplication);
	}

}
