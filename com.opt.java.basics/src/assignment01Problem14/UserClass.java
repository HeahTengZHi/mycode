package assignment01Problem14;

class UserClass {
	private String email;
	private String password;
	private double balance;
	private String securityKey;
	
	UserClass(String email,String password,double balance,String securityKey){
		this.email=email;
		this.password=password;
		this.balance=balance;
		this.securityKey=securityKey;
	}


	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getSecurityKey() {
		return securityKey;
	}
	public void setSecurityKey(String securityKey) {
		this.securityKey = securityKey;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
