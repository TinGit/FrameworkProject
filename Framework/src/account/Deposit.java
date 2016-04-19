package account;

import java.util.Date;

public class Deposit extends Transaction{

	Deposit(String name, double amount, Date date){
		this.name = name;
		this.amount = amount;
		this.date = date;
	}
	
	@Override
	public void handle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyCustomer() {
		// TODO Auto-generated method stub
		
	}
	
}
