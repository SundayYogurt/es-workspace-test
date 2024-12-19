import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


class TestDriver {

	@Disabled
	void testSearchByKeyword() {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().setSize(new Dimension(1050, 840));
        driver.findElement(By.id("APjFqb")).sendKeys("scnpru");
        driver.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN);
//        driver.findElement(By.cssSelector("center:nth-child(1) > .gNO89b")).click();
       
        String actual = driver.findElement(By.xpath("/html/body/div[3]/div/div[12]/div/div[2]/div[2]/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/div/div/h2/span")).getText();
//        System.out.println("Result = " + a);
        String expected = "คณะวิทยาศาสตร์และเทคโนโลยี มหาวิทยาลัยราชภัฏนครปฐม";
        assertEquals(expected, actual);

        driver.close();

	}
	@Disabled
	void testSearchByKeyword2() {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().setSize(new Dimension(1050, 840));
        driver.findElement(By.id("APjFqb")).sendKeys("kru");
        driver.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN);
//        driver.findElement(By.cssSelector("center:nth-child(1) > .gNO89b")).click();
       
        String actual = driver.findElement(By.xpath("/html/body/div[3]/div/div[13]/div/div[2]/div[3]/div/div[3]/div/div/div[2]/div/div[2]/div[1]/div/div")).getText();
//        System.out.println("Result = " + a);
        String expected = "มหาวิทยาลัยราชภัฏกาญจนบุรี";
        assertEquals(expected, actual);

        driver.close();

	}
	@Test
	void testSearchByKeyword3() {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().setSize(new Dimension(1050, 840));
        driver.findElement(By.id("APjFqb")).sendKeys("7+5");
        driver.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN);
//        driver.findElement(By.cssSelector("center:nth-child(1) > .gNO89b")).click();
       
        String actual = driver.findElement(By.id("cwos")).getText();
//        System.out.println("Result = " + a);
        String expected = "12";
        assertEquals(expected, actual);

        driver.close();

	}
}


