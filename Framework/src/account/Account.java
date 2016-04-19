package account;

import java.util.ArrayList;

import party.IParty;

public abstract class Account implements IAccount {

	public IParty party;
	public ArrayList<Transaction> transaction;
	@Override
	public void addInterest() {
		// TODO Auto-generated method stub

	}

	@Override
	public double getCurrentBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void generateMonthlyReport() {
		// TODO Auto-generated method stub

	}

}
