package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.Lulupage;


public class Lulutest {
	WebDriver driver;
	String baseurl="https://www.luluhypermarket.in/en-in";
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
   @Test
   public void fliptest() throws Exception
   {
	   
	   Lulupage l=new Lulupage(driver);
	   l.flipresponse();
	   l.logclick();
	   l.login("archanajain12995@gmail.com","Myshopping123*" );
	   l.logverify();
	   l.phclick();
	   l.smartclick();
	   l.dropclick();
	   l.phnadd();
	   l.cartclick();
	   l.checkclick();
	   l.addressadd();
	   l.addressclick("kakkanad", "8156789087", "Rose villa", "pallipadi", "689504", "idachira", "Kerala");
	   l.backward();
	   l.backclick();
	   l.removeclick();
	   l.elecclick();
	   l.hphnclick();
	   l.audioclick();
	   l.searchclick("Coconut oil");
	   l.wishclick();
	   l.createclick();
	   l.wishname("My wishlist");
	   l.wadd();
	   l.proclick();
	   l.listclick();
	   l.wremove();
	   l.proclick();
	   l.logoutclick();
	  
	   
}

}
