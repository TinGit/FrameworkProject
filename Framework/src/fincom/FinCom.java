package fincom;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import party.IParty;

public class FinCom {

	List<IParty> partyList = new ArrayList<IParty>();
	
	public static void main(String[] args) throws IOException, InstantiationException, IllegalAccessException {
		
		FinCom obj = new FinCom();
		
		//obj.createCustomer();//account);
		
		System.out.println("Fincom started");
	}

	public void createCustomer(IAccount account) throws InstantiationException, IllegalAccessException, IOException{
		ManageProperties obj = new ManageProperties();
		IPartyFactory factoryObject = obj.getPropertyValue();
		IParty concreteParty = factoryObject.createClient(); //creating concrete party
		
		partyList.add(concreteParty); //adding party into the list
		concreteParty.addAccount(account); //adding account for the concrete party
	}
	
}
