package fincom;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import party.IParty;
import party.Person;

public class PersonFactory extends PartyFactory{

	
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
			String date = properties.getProperty("dateOfBirth");
			
			DateFormat formatter = new SimpleDateFormat("d-MMM-yyyy");
			Date dateOfBirth = formatter.parse(date);
			
			return new Person(name,street,city,state,zip,email,dateOfBirth);
		
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

}
