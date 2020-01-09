import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.navigate().to("https://www.google.com/search?q=twitter+login&oq=twitter+login&aqs=chrome." +
                ".69i57j0l5.10255j0j7&sourceid=chrome&ie=UTF-8");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(4000);
        driver.navigate().refresh();
    }
}
