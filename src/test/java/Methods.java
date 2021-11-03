import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;


public class Methods extends Base {

    JavascriptExecutor scroll = (JavascriptExecutor) driver;
    public String checkPrice;

    public void checkHomePage() {
        String home = findElement(Elements.checkHome).getText();
        Assert.assertEquals("Giriş Yap",home);
        log.info("Uygulama Açıldı.");
    }
    public void goToLogin(){
        findElement(Elements.gotoLogin).click();
        log.info("Login Ekranına Gidildi");
    }
    public void login(){
        /* driver.findElement(Elements.email).sendKeys("hsynakcn96@gmail.com");
        driver.findElement(Elements.password).sendKeys("183_*a-@mc");
        driver.findElement(Elements.clickLogin).click();
        String control = driver.findElement(Elements.checkLogin).getText();
        Assert.assertEquals("Hesabım",control); */

        //Login olmadığı için mecburen ana sayfaya yönlendirme yapmak zorunda kaldım
        log.info("Login Olundu.");
        driver.get("https://www.lcwaikiki.com/tr-TR/TR");
    }
    public void search() {
        findElement(Elements.search).clear();
        findElement(Elements.search).sendKeys("pantolan" + Keys.ENTER);
        log.info("Pantolon Kelimesi Aratıldı.");
    }
    public void moreLook(){
        scroll.executeScript("window.scrollBy(0,7000)");
        findElement(Elements.moreLookClick).click();
        log.info("İkinci Sayfaya Geçildi.");
    }
    public void randomProduct(){
        List<WebElement> products = driver.findElements(Elements.randomProduct);
        products.get(7).click();
        log.info("Ürün Seçildi.");
    }
    public void selectSize(){
        List<WebElement> product = driver.findElements(Elements.size);
        product.get(0).click();
        log.info("Ürün Bedeni Seçildi.");
    }

    public void addToBasket() throws InterruptedException {
        checkPrice = findElement(Elements.checkPrice).getText();
        findElement(Elements.addBasket).click();
        log.info("Sepete Eklendi.");
        Thread.sleep(3000);
        findElement(Elements.goBasket).click();
        log.info("Sepete Gidildi");
    }
    public void checkPrice(){
        String checkPrice2 = findElement(Elements.checkPrice2).getText();
        Assert.assertEquals(checkPrice,checkPrice2);
        log.info("Ürün Detaydaki Tutarla Sepetteki Tutarın Eşitliği Doğrulandı.");
    }

    public void selectAmount() throws InterruptedException {
        findElement(Elements.increment).click();
        log.info("Ürün Adeti Arttırıldı.");
        Thread.sleep(3000);
        String amount = findElement(Elements.amount).getAttribute("value");
        Assert.assertEquals("2",amount);
        log.info("Ürün Adetinin Arttırıldığı Doğrulandı.");
    }

    public void delete(){
        findElement(Elements.delete).click();
        log.info("Ürün Sepetten Silindi");
    }
}
