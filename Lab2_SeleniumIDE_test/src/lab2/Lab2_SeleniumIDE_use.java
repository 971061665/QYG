package lab2;

import static org.junit.Assert.*;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lab2_SeleniumIDE_use {
	private WebDriver driver;
	private String baseUrl;
	@Before
	public void setUp(){
		 System.setProperty("webdriver.firefox.bin","E:\\firefox-47.0.1.win64.sdk\\firefox-sdk\\bin\\firefox.exe");
		  	System.setProperty("webdriver.firefox.marionette","E:\\学习1\\软件测试\\geckodriver-v0.9.0-win64\\geckodriver.exe");
		    driver = new FirefoxDriver();
	    baseUrl = "http://121.193.130.195:8080";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		List<String> dataList=CSVUtils.importCsv(new File("E:\\学习1\\软件测试\\inputgit.csv"));
        if(dataList!=null && !dataList.isEmpty()){
        	int i = 0;
            for(String data : dataList){
            	i++;
            	if(i == 1)
            		continue;
                int a = 11 ,b = 12;
                while(b<data.length()){
                	if(data.charAt(b) == ','){
    	                break;
                	}
                		
                	b++;
                }
                driver.get(baseUrl + "/");
                driver.findElement(By.id("name")).clear();
                driver.findElement(By.id("name")).sendKeys(data.substring(0,10));
                driver.findElement(By.id("pwd")).clear();
                driver.findElement(By.id("pwd")).sendKeys(data.substring(4,10));
                driver.findElement(By.id("submit")).click();
                String github = driver.findElement(By.xpath("//tr[3]/td[2]")).getText();
                String name = driver.findElement(By.xpath("//tr[1]/td[2]")).getText();
//                assertEquals(data.substring(a,b),name);
                assertEquals(data.substring(b+1),github); 
            }
        }
}
	  @After
	  public void tearDown(){
	    driver.quit();
	    
	    }
	  


	}


