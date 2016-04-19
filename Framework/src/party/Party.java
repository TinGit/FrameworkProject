package party;

import java.util.ArrayList;
import java.util.List;

public abstract class Party implements IParty{

	private String name;
	private String street;
	private String city;
	private String zip;
	private String state;
	private String email;

	
	public Party(String name,String street,String city,String zip,String state,String email){
		this.name = name;
		this.street = street;
		this.city =city;
		this.zip =zip;
		this.state =state;
		this.email = email;
	}
	

}
