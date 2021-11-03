import org.junit.Test;

public class Runs extends Methods{
    @Test
   public void Runs() throws InterruptedException {
        checkHomePage();
        goToLogin();
        login();
        search();
        moreLook();
        randomProduct();
        selectSize();
        addToBasket();
        checkPrice();
        selectAmount();
        delete();
        closeApp();
    }
}