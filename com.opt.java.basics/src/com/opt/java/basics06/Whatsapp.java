package com.opt.java.basics06;


public class Whatsapp{
	ChatApplication refChatApplication;
	
	//getData method 1
//	public ChatApplication getRefChatApplication() {
//		return refChatApplication;
//	}
	//getData method 2
	@Override
	public String toString(){
		return refChatApplication.toString();
	}
	
	//setData method 1
//	public void setRefChatApplication(ChatApplication refChatApplication) {
//		this.refChatApplication = refChatApplication;
//	}
	
	//setData method 2
	Whatsapp(ChatApplication refChatApplication) {
		this.refChatApplication=refChatApplication;
	}
	
	
	
}
