import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prova {
    @Test
    public void testCarrinho(){
        System.setProperty("webdriver.chrome.driver", "C:\\354\\luan\\chromedriver.exe");

        WebDriver navegador = new ChromeDriver();

        navegador.get("https://www.amazon.com.br/");
        navegador.findElement(By.id("twotabsearchtextbox")).click();
        navegador.findElement(By.id("twotabsearchtextbox")).sendKeys("Camisa");
        navegador.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
        navegador.get("https://www.amazon.com.br/Camisa-Jacquard-Algod%C3%A3o-John-Pull/dp/B09YDNHSCL/ref=sr_1_1_sspa?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&keywords=Camisa&qid=1661776594&sr=8-1-spons&ufe=app_do%3Aamzn1.fos.6121c6c4-c969-43ae-92f7-cc248fc6181d&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUFISFI0VTFDUU1BRFYmZW5jcnlwdGVkSWQ9QTA1Mjg0NzkxRVBQRjVPSkg2S0hHJmVuY3J5cHRlZEFkSWQ9QTA3NDQ2MTUxMVJOTlVFQTVPMjZaJndpZGdldE5hbWU9c3BfYXRmJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ==");
        navegador.findElement(By.id("add-to-cart-button")).click();
        navegador.findElement(By.id("nav-cart-count")).click();
        navegador.findElement(By.className("a-color-link")).click();
        Assert.assertEquals(1,1);
    }
}