package fincom;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ManageProperties {

	public IPartyFactory getPropertyValue() throws IOException, InstantiationException, IllegalAccessException{
		Properties properties = new Properties();
		String propFileName = "config.properties";
		 
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
		if (inputStream != null) {
			properties.load(inputStream);
		} else {
			throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
		}
		
		String value = properties.getProperty("PartyFactory");
		
		try {
			Class<IPartyFactory> classObj = (Class<IPartyFactory>) Class.forName(value);
			IPartyFactory factoryObject = classObj.newInstance();
			System.out.println(value);
			inputStream.close();
			return factoryObject;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Properties getPropertyDetails() throws IOException{
		Properties properties = new Properties();
		String propFileName = "config.properties";
		 
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
		if (inputStream != null) {
			properties.load(inputStream);
		} else {
			throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
		}
		//inputStream.close();
		return properties;
	}
}
