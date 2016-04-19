package party;

import java.util.ArrayList;
import java.util.List;

import fincom.IAccount;

public class Organization extends Party implements IOrganization{

	private List<IAccount> accountList = new ArrayList<IAccount>();
	private int noOfEmployees;
	
	public Organization(String name, String street, String city, String zip, String state, String email,int noOfEmployees) {
		super(name, street, city, zip, state, email);
		this.noOfEmployees = noOfEmployees;
	}

	@Override
	public void addAccount(IAccount account) {
		accountList.add(account);
	}

	@Override
	public void removeAccount(IAccount account) {
		accountList.remove(account);
	}

}
