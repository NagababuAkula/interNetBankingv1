package utiliti_files;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {

	Properties pro;

	public Readconfig()
	{
		File src = new File("./Configurations/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("error message is"+e.getMessage());
		}
	}
	public String  getUserName()
	{
		String username = pro.getProperty("username");
		return username;
	}
	public String  getPassword()
	{
		String password = pro.getProperty("password");
		return password;
	}
	public String  getApplicatonUrl()
	{
		String baseUrl = pro.getProperty("baseUrl");
		return baseUrl;
	}
}
