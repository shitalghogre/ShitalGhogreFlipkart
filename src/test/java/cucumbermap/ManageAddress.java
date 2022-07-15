
package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperation;

public class ManageAddress 
{
	@When("^user click on manage address$")
	public void user_click_on_manage_address() throws Throwable 
	{
		Thread.sleep(5000);
		Object[]input4= new Object[1];
		input4[0]="(//*[@class='NS64GK'])[1]";
		Hashtable<String,Object> output4=SeleniumOperation.clickOnWebElement(input4);
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "^user click on manage address$",output4.get("MESSAGE").toString());
		
	}

	@When("^user click on add new address$")
	public void user_click_on_add_new_address() throws Throwable 
	{
		Thread.sleep(5000);
		Object[]input4= new Object[1];
		input4[0]="//*[@class='_1QhEVk']";
		Hashtable<String,Object> output4=SeleniumOperation.clickOnWebElement(input4);
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "^user click on add new address$",output4.get("MESSAGE").toString());  
	}

	@When("^user enter \"([^\"]*)\" as a name$")
	public void user_enter_as_a_name(String name) throws Throwable 
	{
		Object[]input14= new Object[2];
		input14[0]="//*[@tabindex='1']";
		input14[1]=name;
		Hashtable<String,Object> output14=SeleniumOperation.sendKey(input14);
		HTMLReportGenerator.StepDetails(output14.get("STATUS").toString(), "^user enter \"([^\"]*)\" as a name$",output14.get("MESSAGE").toString());  
	}

	@When("^user enter \"([^\"]*)\" as mobile number$")
	public void user_enter_as_mobile_number(String mobileno) throws Throwable
	{
		Object[]input15= new Object[2];
		input15[0]="//*[@tabindex='2']";
		input15[1]=mobileno;
		Hashtable<String,Object> output15=SeleniumOperation.sendKey(input15);
		HTMLReportGenerator.StepDetails(output15.get("STATUS").toString(), "^user enter \"([^\"]*)\" as mobile number$",output15.get("MESSAGE").toString());  
	}

	@When("^user enter \"([^\"]*)\" as pincode$")
	public void user_enter_as_pincode(String pincode) throws Throwable 
	{
		Object[]input16= new Object[2];
		input16[0]="//*[@tabindex='3']";
		input16[1]=pincode;
		Hashtable<String,Object> output16=SeleniumOperation.sendKey(input16);
		HTMLReportGenerator.StepDetails(output16.get("STATUS").toString(), "^user enter \"([^\"]*)\" as pincode$",output16.get("MESSAGE").toString());   
	}

	@When("^user enter \"([^\"]*)\" as locality$")
	public void user_enter_as_locality(String locality) throws Throwable 
	{
		Object[]input17= new Object[2];
		input17[0]="//*[@tabindex='4']";
		input17[1]=locality;
		Hashtable<String,Object> output17=SeleniumOperation.sendKey(input17);
		HTMLReportGenerator.StepDetails(output17.get("STATUS").toString(), "^user enter \"([^\"]*)\" as locality$",output17.get("MESSAGE").toString());
	}

	@When("^user enter \"([^\"]*)\" as address$")
	public void user_enter_as_address(String address) throws Throwable 
	{
		Object[]input18= new Object[2];
		input18[0]="//*[@tabindex='5']";
		input18[1]=address;
		Hashtable<String,Object> output18=SeleniumOperation.sendKey(input18);
		HTMLReportGenerator.StepDetails(output18.get("STATUS").toString(), "^user enter \"([^\"]*)\" as address$",output18.get("MESSAGE").toString());   
	}

	@When("^user select Home as address type$")
	public void user_select_Home_as_address_type() throws Throwable 
	{
		Object[]input19= new Object[1];
		input19[0]="//*[text()='Home']";
		Hashtable<String,Object> output19=SeleniumOperation.clickOnWebElement(input19);
		HTMLReportGenerator.StepDetails(output19.get("STATUS").toString(), "^user select Home as address type$",output19.get("MESSAGE").toString());   
	}

	@When("^user click on save button$")
	public void user_click_on_save_button() throws Throwable
	{
		Object[]input20= new Object[1];
		input20[0]="//*[@tabindex='10']";
		Hashtable<String,Object> output20=SeleniumOperation.clickOnWebElement(input20);
		HTMLReportGenerator.StepDetails(output20.get("STATUS").toString(), "^user click on save button$",output20.get("MESSAGE").toString());     
	}
	
	@Then("^address saved successfully$")
	public void address_saved_successfully() throws Throwable 
	{
		Object[]input21= new Object[1];
		input21[0]="//*[@tabindex='10']";
		Hashtable<String,Object> output21=SeleniumOperation.clickOnWebElement(input21);
		HTMLReportGenerator.StepDetails(output21.get("STATUS").toString(), "^address saved successfully$^user click on add new address$",output21.get("MESSAGE").toString());     
	}

	

	
}

