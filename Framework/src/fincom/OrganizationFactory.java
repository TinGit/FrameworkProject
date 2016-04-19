package fincom;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import party.IParty;
import party.Organization;

public class OrganizationFactory extends PartyFactory{

	@Override
	public IParty createClient() {
		ManageProperties obj = new ManageProperties();
		try {
			Properties properties = obj.getPropertyDetails();
			String name = properties.getProperty("name");
			String street = properties.getProperty("street");
			String city = properties.getProperty("city");
			String state = properties.getProperty("state");
			String zip = properties.getProperty("zip");
			String email = properties.getProperty("email");
			String noOfEmployees = properties.getProperty("noOfEmployees");
			
			return new Organization(name,street,city,state,zip,email,Integer.parseInt(noOfEmployees));
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
