package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
				(
					features="src/main/resources/BusinessLogin/ManageAddress.feature",
					tags="@SmokeTest",
					monochrome=true,
					plugin="pretty",
					//dryRun=true,
					glue="cucumbermap"	
						
						
				 )


public class RunnerTest 
{
 
  
  
}
