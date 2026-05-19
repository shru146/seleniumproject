package pom.common;


	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;

	import org.openqa.selenium.chrome.ChromeDriver;

	public class CommonMethod
	{
		public static void launchBrowser()
		{
			if(pom.configuration.Config.browser.equalsIgnoreCase("chrome")) 
			{
				pom.configuration.Driver.driver=new ChromeDriver();
			}
		}
		
		public static String[] readCsvFile(String fpath) throws IOException
		{
			BufferedReader br=new BufferedReader(new FileReader(fpath));
			String line=br.readLine();
			String[] data =line.split(",");
			return data;
		}
}
