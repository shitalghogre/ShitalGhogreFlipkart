package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperation;

public class Login 
{
	@When ("^user open \"(.*)\" browser with exe as$") 
	public void user_open_browser_with_exe(String bname) throws Throwable 
	{
		Object []input=new Object[2];
		input[0]=bname;
		
		SeleniumOperation.browserLaunch(input);
	    
	}

	@When ("^user enter URL as$") 
	public void user_enter_URL_as() throws Throwable {
		
		//Hashtable<String, Object>input320p=
				SeleniumOperation.openApplication();
		//HTMLReportGenerator.StepDetails(input320p.get("STATUS").toString(),"^user enter URL as$",input320p.get("MESSAGE").toString() );
	}

	@When("^user cancle initial Login window$")
	public void user_cancle_initial_Login_window() throws Throwable {
		Object []input2=new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		Hashtable<String, Object>input220p=SeleniumOperation.clickOnWebElement(input2);
		//Hashtable<String, Object>input20p=new Hashtable<String, Object>();
		HTMLReportGenerator.StepDetails(input220p.get("STATUS").toString(),"^user cancle initial Login window$",input220p.get("MESSAGE").toString() );
	}

	@When("^user navigate on Login button$")
	public void user_navigate_on_Login_button() throws Throwable {
		Object []input3=new Object[1];
		input3[0]="//*[text()='Login']";
		SeleniumOperation.mouseOver(input3);
		//Hashtable<String, Object>input30p=new Hashtable<String, Object>();
		//HTMLReportGenerator.StepDetails(input30p.get("STATUS").toString(),"^user navigate on Login button$",input30p.get("MESSAGE").toString() );
	}

	@When("^user click on MyProfile$")
	public void user_click_on_MyProfile() throws Throwable {
		Thread.sleep(8000);
		Object []input12=new Object[1];
		input12[0]="//*[text()='My Profile']";
		SeleniumOperation.clickOnWebElement(input12); 
		//Hashtable<String, Object>input40p=new Hashtable<String, Object>();
		//HTMLReportGenerator.StepDetails(input40p.get("STATUS").toString(),"^user click on MyProfile$",input40p.get("MESSAGE").toString() );
	}

	@When("^user enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String uname) throws Throwable {
		Thread.sleep(8000);
		Object []input4=new Object[2];
		input4[0]="(//*[@type='text'])[2]";
		input4[1]=uname;
		Hashtable<String, Object>input50p=SeleniumOperation.sendKey(input4);
		//Hashtable<String, Object>input50p=new Hashtable<String, Object>();
		HTMLReportGenerator.StepDetails(input50p.get("STATUS").toString(),"^user enter \"([^\"]*)\" as username$",input50p.get("MESSAGE").toString() );
	}
	

	@When("^user enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String pass) throws Throwable {
		Object []input5=new Object[2];
		input5[0]="//*[@type='password']";
		input5[1]=pass;
		Hashtable<String, Object>input60p=SeleniumOperation.sendKey(input5); 
		//Hashtable<String, Object>input60p=new Hashtable<String, Object>();
		HTMLReportGenerator.StepDetails(input60p.get("STATUS").toString(),"^user enter \"([^\"]*)\" as password$",input60p.get("MESSAGE").toString() );
	}

	@When("^user click on Login button$")
	public void user_click_on_Login_button() throws Throwable {
		Object []input6=new Object[1];
		input6[0]="(//*[@type='submit'])[2]";
		Hashtable<String, Object>input70p=SeleniumOperation.clickOnWebElement(input6);	
		//Hashtable<String, Object>input70p=new Hashtable<String, Object>();
		HTMLReportGenerator.StepDetails(input70p.get("STATUS").toString(),"^user click on Login button$",input70p.get("MESSAGE").toString() );
	}

	@Then("^Application shows user profile to user$")
	public void valid() throws Throwable
	{
		Thread.sleep(5000);
		Object []input8=new Object[2];
		input8[0]="//*[text()='Shital Ghogre']";
		input8[1]="Shital Ghogre";
		Hashtable<String, Object>input80p=SeleniumOperation.validation(input8); 
		//Hashtable<String, Object>input80p=new Hashtable<String, Object>();
		HTMLReportGenerator.StepDetails(input80p.get("STATUS").toString(),"^Application shows user profile to user$",input80p.get("MESSAGE").toString() );
	}
	@Then ("^Application shows appropriate error message$")
	public void inValid() throws Throwable
	{
		Thread.sleep(5000);
		Object []input9=new Object[2];
		input9[0]="(//*[text()='Login'])[2]";
		input9[1]="Login";
		Hashtable<String, Object>input90p=SeleniumOperation.inValidation(input9);  
		//Hashtable<String, Object>input90p=new Hashtable<String, Object>();
		HTMLReportGenerator.StepDetails(input90p.get("STATUS").toString(),"^Application shows appropriate error message$",input90p.get("MESSAGE").toString() );
	}
	
	@Then ("^browser close$")
	public void bclose()
	{
		
		Hashtable<String, Object>input20p=SeleniumOperation.browserClose();
		
		HTMLReportGenerator.StepDetails(input20p.get("STATUS").toString(),"^browser close$",input20p.get("MESSAGE").toString() );
	}
	@When ("^user enters (.+) as username$")
	public void unamePara(String given)
	{
		
		Object []input10=new Object[2];
		input10[0]="(//*[@type='text'])[2]";
		input10[1]=given;
		Hashtable<String, Object>input10p=SeleniumOperation.sendKey(input10);
		//Hashtable<String, Object>input10p=new Hashtable<String, Object>();
		HTMLReportGenerator.StepDetails(input10p.get("STATUS").toString(),"^user enters (.+) as username$",input10p.get("MESSAGE").toString() );
		
	}
	@When ("^user enters (.+) as password$")
	public void pass(String pas)
	{
		Object []input11=new Object[2];
		input11[0]="//*[@type='password']";
		input11[1]=pas;
		Hashtable<String, Object>input200p=SeleniumOperation.sendKey(input11);
		//Hashtable<String, Object>input200p=new Hashtable<String, Object>();
		HTMLReportGenerator.StepDetails(input200p.get("STATUS").toString(),"^user enters (.+) as password$",input200p.get("MESSAGE").toString() );
		
	}

}
