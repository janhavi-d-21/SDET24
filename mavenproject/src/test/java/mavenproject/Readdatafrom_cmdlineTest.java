package mavenproject;

import org.testng.annotations.Test;

public class Readdatafrom_cmdlineTest {
	@Test
	public void readData(){
		String URL=System.getProperty("url");
		System.out.println(URL);
		
		String BROWSER=System.getProperty("browser");
		System.out.println(BROWSER);
	}

}
