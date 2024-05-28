import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        System.setProperty("webdriver.chrome.driver", "C://Users//Tosic//Desktop//Testing//Driver.exe");
        driver.get("https://www.momondo.com/");

        driver.manage().window().maximize();

        Thread.sleep(2000L);

        driver.findElement(By.xpath("//div[@class='RxNS-button-content'][normalize-space(.)='Accept all']")).click();
        Thread.sleep(2000L);


        //Registracija

        driver.findElement(By.cssSelector("span[class='J-sA-label']")).click();
        Thread.sleep(2000L);
        driver.findElement(By.cssSelector("div[class='social-button-content']")).click();
        Thread.sleep(3000L);


        Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentid = it.next();
        String childid = it.next();
        driver.switchTo().window(childid);
        System.out.println(driver.getTitle());

        driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("djordjetest97@gmail.com");
        Thread.sleep(2000L);

        driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/span")).click();
        Thread.sleep(4000L);

        driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("djordjetesting1997");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id='passwordNext']/div/button/span")).click();
        Thread.sleep(2000L);
        driver.switchTo().window(parentid);
        System.out.println(driver.getTitle());
        Thread.sleep(3000L);


        // Pretraga

        driver.findElement(By.xpath("//div[contains(@class,'zEiP-origin')]//div[contains(@class,'pM26')]//input")).sendKeys("BER");
        Thread.sleep(2000L);
        for (int i = 0; i < 4; i++) {
            driver.findElement(By.xpath("//div[contains(@class,'zEiP-origin')]//div[contains(@class,'pM26')]//input")).sendKeys(Keys.ARROW_DOWN);
        }
        Thread.sleep(3000L);
        driver.findElement(By.xpath("//div[contains(@class,'zEiP-origin')]//div[contains(@class,'pM26')]//input")).sendKeys(Keys.ENTER);


        driver.findElement(By.xpath("//div[contains(@class,'zEiP-destination')]//div[contains(@class,'pM26')]//input")).sendKeys("BEL");
        Thread.sleep(2000L);
        for (int i = 0; i < 3; i++) {
            driver.findElement(By.xpath("//div[contains(@class,'zEiP-destination')]//div[contains(@class,'pM26')]//input")).sendKeys(Keys.ARROW_DOWN);
        }
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//div[contains(@class,'zEiP-destination')]//div[contains(@class,'pM26')]//input")).sendKeys(Keys.ENTER);

        Thread.sleep(3000L);
        driver.findElement(By.cssSelector("span[class='S9tW-title']")).click();
        Thread.sleep(2000L);
        for (int i = 0; i < 3; i++) {
            driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div[1]/div/button[2]")).click();
        }
        Thread.sleep(1000L);


//Kalendar
        driver.findElement(By.cssSelector("div[class='JONo-button']")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//td//div[contains(@aria-label, 'June 18, 2024')]")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//td//div[contains(@aria-label, 'July 5, 2024')]")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//div[contains(@class, 'zEiP-formContainer')]//button//span[normalize-space()='Search']//ancestor::button")).click();
        Thread.sleep(6000L);

        driver.quit();
    }
}
