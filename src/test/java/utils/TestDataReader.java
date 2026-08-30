package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class TestDataReader 
{
	private static Properties properties=new Properties();
	private	static FileInputStream fis;
	
	public static void loadproperties()
	{
		
		try 
		{
			fis = new FileInputStream("src/test/resources/testdata.properties");
            properties.load(fis);
            
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
    }
	
	public static String getProperty(String key)
	{
		return properties.getProperty(key);
		
	}
		
}
