package org.giri;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MatriMony {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver d = new EdgeDriver();
		d.navigate().to("http://www.flipkart.com");
		d.manage().window().maximize();
		
		d.findElement(By.xpath("//*[text()='✕']")).click();   
		
		WebElement search = d.findElement(By.name("q"));
		search.sendKeys("redmi mobiles",Keys.ENTER);
		WebElement one = d.findElement(By.xpath("(//*[@class='_4rR01T'])[1]"));
		
		
		JavascriptExecutor j = (JavascriptExecutor)d;
		j.executeScript("arguments[0].click()", one);
		
		
		
		String parent = d.getWindowHandle();
		d.switchTo().window(parent);
		Thread.sleep(2000);
		d.findElement(By.xpath("(//*[@class='_4rR01T'])[2]")).click();
		d.switchTo().window(parent);
		d.findElement(By.xpath("(//*[@class='_4rR01T'])[3]")).click();
		d.switchTo().window(parent);
		d.findElement(By.xpath("(//*[@class='_4rR01T'])[4]")).click();
		d.switchTo().window(parent);
		
		
	Set<String> child = d.getWindowHandles();
	
	for ( String x  : child) {
		if(!parent.equals(x)) {
			d.switchTo().window(x);
			WebElement text = d.findElement(By.xpath("//*[@class='B_NuCI']"));
			String tt = text.getText();
			System.out.println(tt);
		}
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		
		d.quit();
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}   

}
