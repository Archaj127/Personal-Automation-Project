package page;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Lulupage {
	WebDriver driver;
	String burl="https://www.luluhypermarket.in/en-in";
	
	By log=By.xpath("//*[@id=\"header\"]/section/div/div/div[4]/ul/li[3]/a/span/b");
	By email=By.xpath("//*[@id=\"emailAddress\"]");
	By pass=By.xpath("//*[@id=\"j_password\"]");
	By signin=By.xpath("//*[@id=\"loginForm\"]/div[8]/button");
	By Phone=By.xpath("/html/body/main/section[3]/section[1]/div/div[2]/div/div[4]/a/div[2]");
	By Smartphn=By.xpath("/html/body/main/section[3]/section[3]/div/div[2]/div/div[1]/div/div[3]/div/div[2]/a");
	By drop=By.xpath("//*[@id=\"dropdownMenuButton\"]");
	By dvalue=By.xpath("//*[@id=\"clp-container-fluid\"]/div/div/div[2]/div/div/div[1]/div[2]/form/div[2]/div/div/a[4]");
	By add=By.xpath("//*[@id=\"addToCartForm1482932\"]/div[2]/button");
	By phnname1=By.xpath("/html/body/main/section[4]/div/div/div[2]/div[1]/div[2]/div[2]/div/ul/li/div/ul/li[2]/div[2]/div/div/div[1]/div[2]/div[1]/div[1]/a");
	By cart=By.xpath("/html/body/main/header/section[2]/div[1]/section/div/div/div[4]/ul/li[4]/a[2]");
	By address=By.xpath("//*[@id=\"checkout-section\"]/div/div/div/div[1]/div[2]/div[2]/ul/li[1]/div/div/div/div");
	By location=By.xpath("//*[@id=\"pac-input\"]");
	By confirm=By.xpath("/html/body/main/section[4]/section/div/div/div[2]/div[1]/div[2]/div[1]/div[4]/button");
	By phno=By.xpath("//*[@id=\"address_mobilePhone\"]");
	By addline1=By.xpath("//*[@id=\"address.line1\"]");
	By addline2=By.xpath("//*[@id=\"address.line2\"]");
	By post=By.xpath("//*[@id=\"address.postalcode\"]");
	By area=By.xpath("//*[@id=\"address.areaName\"]");
	By district=By.xpath("//*[@id=\"address.districtName\"]");
	By state=By.xpath("//*[@id=\"address.stateName\"]");
	By checkout=By.xpath("//*[@id=\"checkoutitems\"]");
	By back=By.xpath("/html/body/main/header/section[2]/nav/div/div/div/div[1]/a");
	By remove=By.xpath("//*[@id=\"removeAllCartGroupItems\"]");
	By electronics=By.xpath("/html/body/main/header/section[2]/nav/div/div[1]/div[2]/div/ul/li[4]/a");
	By headphn=By.xpath("/html/body/main/header/section[2]/nav/div/div[1]/div[2]/div/ul/li[4]/div/div/div/div/div/div[3]/div[2]/ul/li[3]/span/a");
	By audio=By.xpath("//*[@id=\"category\"]/div/ul/li[1]/div/form/label");
	By search=By.xpath("//*[@id=\"js-site-search-input auto-search\"]");
	By sbutton=By.xpath("//*[@id=\"header\"]/section/div/div/div[3]/form/div[1]/span/button[2]");
	By wish=By.xpath("//*[@id=\"770247\"]");
	By createwish=By.xpath("//*[@id=\"wishListButton\"]");
	By newwish=By.xpath("//*[@id=\"AddToWhislistPopupModal\"]/div/div/div[2]/div/form/div[1]/div/div/a");
	By wname=By.xpath("//*[@id=\"listName\"]");
	By wadd=By.xpath("//*[@id=\"addBtn\"]");
	By profile=By.xpath("//*[@id=\"profile-dropdown\"]/span[1]");
	By wishlist=By.xpath("//*[@id=\"header\"]/section/div/div/div[4]/ul/li[3]/div/div/ul/li[4]/a");
	By wdrop=By.xpath("/html/body/main/section[4]/section/div/div/div[2]/div[2]/fieldset/div[1]/ul[2]/li/fieldset/div[1]/div/div[3]/span");
	By wremov=By.xpath("//*[@id=\"wishRemoveForm770247\"]/a");
	By logout=By.xpath("//*[@id=\"header\"]/section/div/div/div[4]/ul/li[3]/div/div/ul/li[9]/a");
	
	public Lulupage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void flipresponse() throws Exception
	{
		driver.manage().window().maximize();
		URL u=new URL(burl);
		HttpURLConnection con=(HttpURLConnection)u.openConnection();
		con.connect();
		int res=con.getResponseCode();
		int actualres=200;
		Assert.assertEquals(actualres, res);
		System.out.println("Response code is verified");
		}
	public void logclick()
	{
		driver.findElement(log).click();
	}
	public void login(String uname,String pwd)
	{
		
		driver.findElement(email).click();
		driver.findElement(email).sendKeys(uname);
		driver.findElement(pass).click();
		driver.findElement(pass).sendKeys(pwd);
		driver.findElement(signin).click();
	}
	
	public void logverify()
	{
		String ex="HomePage - LuLu Hypermarket India";
		String act=driver.getTitle();
		Assert.assertEquals(act, ex);
		System.out.println("Login Verified");
		
	}
	public void phclick()
	{
		driver.findElement(Phone).click();
	}
	public void smartclick()
	{
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Smartphn));
		driver.findElement(Smartphn).click();
	}
	public void dropclick()
	{
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(drop));
		driver.findElement(drop).click();
		driver.findElement(dvalue).click();
		
	}
	public void phnadd()
	{
		driver.findElement(add).click();
		
	}
	
	public void cartclick()
	{
		
		driver.findElement(cart).click();
		String s1="https://www.luluhypermarket.in/en-in/samsung-m53-8gb-128gb-mystique-green/p/1482932";
		String s=driver.findElement(phnname1).getAttribute("href");
		Assert.assertEquals(s1, s);
		System.out.println("Item added to the cart");
		}
	
	public void checkclick()
	{
		String s=driver.findElement(phnname1).getText();
		System.out.println(s);
		driver.findElement(checkout).click();
	}
	public void addressadd()
	{
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(address));
		driver.findElement(address).click();
	}
	public void addressclick(String l,String p,String a,String ad,String o,String r,String s)
	{
		driver.findElement(location).click();
		driver.findElement(location).sendKeys(l);
		driver.findElement(confirm).click();
		driver.findElement(phno).click();
		driver.findElement(phno).sendKeys(p);
		driver.findElement(addline1).click();
		driver.findElement(addline1).sendKeys(a);
		driver.findElement(addline2).click();
		driver.findElement(addline2).sendKeys(ad);
		driver.findElement(post).click();
		driver.findElement(post).sendKeys(o);
		driver.findElement(area).click();
		driver.findElement(area).sendKeys(r);
		driver.findElement(state).click();
		driver.findElement(state).sendKeys(s);
		}
	public void backward()
	{
		driver.navigate().back();
	}
	public void backclick()
	{
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(back));
		driver.findElement(back).click();
	}
	public void removeclick()
	{
		driver.findElement(remove).click();
	}
	public void elecclick()
	{
		WebElement e=driver.findElement(electronics);
		Actions a=new Actions(driver);
		a.moveToElement(e);
		a.perform();
	}
	public void hphnclick()
	{
		driver.findElement(headphn).click();
	}
	public void audioclick()
	{
		driver.findElement(audio).click();
	}
	public void searchclick(String s)
	{
		driver.findElement(search).click();
		driver.findElement(search).sendKeys(s);
		driver.findElement(sbutton).click();
		
	}
	public void wishclick()
	{
		driver.findElement(wish).click();
	}
	public void createclick()
	{
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(createwish));
		driver.findElement(createwish).click();
		driver.findElement(newwish).click();
		
	}
	public void wishname(String w)
	{
		driver.findElement(wname).click();
		driver.findElement(wname).sendKeys(w);
	}
	public void wadd()
	{
		driver.findElement(wadd).click();
		
	}
	public void proclick()
	{
		driver.navigate().refresh();
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(profile));
		driver.findElement(profile).click();
	}
	public void listclick()
	{
		driver.findElement(wishlist).click();
	}
	public void wremove()
	{
		driver.findElement(wdrop).click();
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(wremov));
		driver.findElement(wremov).click();
	}
	public void logoutclick()
	{
		driver.findElement(logout).click();
	}

}



