package party;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import fincom.IAccount;

public class Person extends Party implements IPerson{

	private Date dateOfBirth;
	private List<IAccount> accountList = new ArrayList<IAccount>();
	
	public Person(String name, String street, String city, String zip, String state, String email, Date dob) {
		super(name, street, city, zip, state, email);
		this.dateOfBirth = dob;
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
