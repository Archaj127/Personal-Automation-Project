package test;
import java.net.HttpURLConnection;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
	   URL u=new URL(baseurl);
	   HttpURLConnection con=(HttpURLConnection)u.openConnection();
	   con.connect();
	   int res=con.getResponseCode();
	   int actualres=200;
	   Assert.assertEquals(actualres, res);
	   System.out.println("Response code is verified");
	   l.logclick();
	   l.login("archanajain12995@gmail.com","Myshopping123*" );
	   String ex="HomePage - LuLu Hypermarket India";
	   String act=driver.getTitle();
	   Assert.assertEquals(act, ex);
	   System.out.println("Login Verified");
	   l.phclick();
	   l.smartclick();
	   l.dropclick();
	   l.phnadd();
	   l.cartclick();
	   String s1="https://www.luluhypermarket.in/en-in/samsung-m53-8gb-128gb-mystique-green/p/1482932";
	   String k=l.k;
	   Assert.assertEquals(s1,k);
	   System.out.println("Item added to the cart");
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
