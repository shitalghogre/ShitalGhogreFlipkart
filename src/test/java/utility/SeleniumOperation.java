package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumbermap.ConfigReader;

public class SeleniumOperation 
{
	public static ConfigReader config;
	public static WebDriver driver=null;
	public static Hashtable<String,Object> outputParameters=new Hashtable<String, Object>();
	public static Hashtable<String,Object> browserLaunch(Object []inputParameters)
	{
		try
		{
		String bname=(String) inputParameters[0];
		
	
	if(bname.equalsIgnoreCase("chrome"))
	{
		config=new ConfigReader();
		System.setProperty("webdriver.chrome.driver",config.getDriverPathChrome());
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	}
	else if(bname.equalsIgnoreCase("FF"))
	{
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		System.setProperty("webdriver.geckodriver.driver",config.getDriverPathFF());
		 driver=new FirefoxDriver();
			driver.manage().window().maximize();
	}
	    outputParameters.put("STATUS", "PASS");
	    outputParameters.put("MESSAGE", "methodUsed: browserLaunch,Input Given"+inputParameters[0].toString());
	}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
		    outputParameters.put("MESSAGE", "methodUsed: browserLaunch,Input Given"+inputParameters[0].toString());
		}
		return outputParameters;
	}
	public static Hashtable<String,Object> openApplication()
	{
		try
		{
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		
		driver.get(config.getApplicationUrl());
		
		outputParameters.put("STATUS", "PASS");
	    outputParameters.put("MESSAGE", "methodUsed: OpenApplication,Input Given"+config.getApplicationUrl().toString());
	}
	catch(Exception e)
	{
		outputParameters.put("STATUS", "FAIL");
	    outputParameters.put("MESSAGE", "methodUsed: OpenApplication,Input Given"+config.getApplicationUrl().toString());
	}
		return outputParameters;
		
	}
	public static Hashtable<String,Object> clickOnWebElement(Object []inputParameters)
	{
		try{
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		String xpath=(String) inputParameters[0];
		driver.findElement(By.xpath(xpath)).click();
		
		outputParameters.put("STATUS", "PASS");
	    outputParameters.put("MESSAGE", "methodUsed: ClickOnWebElement,Input Given"+inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
		    outputParameters.put("MESSAGE", "methodUsed:ClickOnWebElement,Input Given"+inputParameters[0].toString());
		}
		return outputParameters;
	}

	public static Hashtable<String,Object> mouseOver(Object []inputParameters)
	{
		try{
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		String xpath= (String) inputParameters[0];
		Actions act=new Actions(driver);
		WebElement a=	driver.findElement(By.xpath(xpath));
		act.moveToElement(a).build().perform();
		
		outputParameters.put("STATUS", "PASS");
	    outputParameters.put("MESSAGE", "methodUsed: MouseOver,Input Given"+inputParameters[0].toString());
		}
	catch(Exception e)
	{

		outputParameters.put("STATUS", "FAIL");
	    outputParameters.put("MESSAGE", "methodUsed: MouseOver,Input Given"+inputParameters[0].toString());
	}
		return outputParameters;
	}
	public static Hashtable<String,Object> sendKey(Object []inputParameters)
	{
		try{
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		String key=(String) inputParameters[0];
		String value=(String) inputParameters[1];
		driver.findElement(By.xpath(key)).sendKeys(value);

		outputParameters.put("STATUS", "PASS");
	    outputParameters.put("MESSAGE", "methodUsed: SendKey,Input Given"+inputParameters[1].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
		    outputParameters.put("MESSAGE", "methodUsed: SendKey,Input Given"+inputParameters[1].toString());
		}
		return outputParameters;
	}
	public static Hashtable<String,Object> validation(Object []inputParameters)
	{
		try{
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		String xpath=(String) inputParameters[0];  //name xpath
		String text=(String) inputParameters[1];//name
		String actualText=driver.findElement(By.xpath(xpath)).getText();//name
		if(actualText.equalsIgnoreCase(text))
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case fail");
		}
		outputParameters.put("STATUS", "PASS");
	    outputParameters.put("MESSAGE", "methodUsed: Validation,Input Given"+inputParameters[1].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
		    outputParameters.put("MESSAGE", "methodUsed: Validation,Input Given"+inputParameters[1].toString());
		}
		return outputParameters;
	}
	public static Hashtable<String,Object> inValidation(Object []inputParameters)
	{
		try{
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		String xpath=(String) inputParameters[0];  //name xpath
		String text=(String) inputParameters[1];//name
		String actualText=driver.findElement(By.xpath(xpath)).getText();//name
		if(actualText.equalsIgnoreCase(text))
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case fail");
		}
		outputParameters.put("STATUS", "PASS");
	    outputParameters.put("MESSAGE", "methodUsed: InValidation,Input Given"+inputParameters[1].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
		    outputParameters.put("MESSAGE", "methodUsed: InValidation,Input Given"+inputParameters[1].toString());
		}
		return outputParameters;
	}
	public static Hashtable<String,Object> browserClose()
	{
		driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		driver.close();
		return outputParameters;
	}
}
