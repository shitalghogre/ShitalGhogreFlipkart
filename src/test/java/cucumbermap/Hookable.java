package cucumbermap;

import java.net.UnknownHostException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utility.HTMLReportGenerator;

public class Hookable 
{
	@Before
	public void before(Scenario scenario) throws UnknownHostException
	{
		HTMLReportGenerator.TestSuiteStart("E:\\Report\\flipkart.html", "Flipkart");
		HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus());
		
		System.out.println("....................scenario start........................");
	}
	
	@After
	public void aefore(Scenario scenario)
	{
		System.out.println("...........................scenario end...........................");
		HTMLReportGenerator.TestCaseEnd();
		HTMLReportGenerator.TestSuiteEnd();
	}

}
