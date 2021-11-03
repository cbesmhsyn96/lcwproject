import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Elements {
    public static By checkHome = By.cssSelector("a[href='https://www.lcwaikiki.com/tr-TR/TR/giris']>span");
    public static By gotoLogin = By.cssSelector("div[class='dropdown cart-dropdown']>a[href='https://www.lcwaikiki.com/tr-TR/TR/giris']");
    public static By email = By.id("LoginEmail");
    public static By password = By.id("Password");
    public static By clickLogin = By.id("loginLink");
    public static By checkLogin = By.cssSelector("button[class='dropdown-toggle striped-button']>span");
    public static By search = By.id("search_input");
    public static By clickSearch = By.cssSelector("div[class='header-center d-none d-md-block']>div>div>div>div[class='input-field second-wrap']>button[class='btn-search']");
    public static By moreLookClick = By.cssSelector("a[class='lazy-load-button']");
    public static By randomProduct = By.cssSelector("div[class='col-xs-6 col-sm-6 col-md-3 four-column c-item product-item-wrapper']");
    public static By size = By.cssSelector("div[class='option-size']>a");
    public static By addBasket = By.id("pd_add_to_cart");
    public static By checkPrice = By.cssSelector("div[style='display: flex']>div>span[class='price']");
    public static By goBasket = By.cssSelector("a[data-tracking-label='Sepetim']");
    public static By checkPrice2 = By.cssSelector("span[class='rd-cart-item-price mb-15']");
    public static By amount = By.cssSelector("input[class='item-quantity-input ignored']");
    public static By increment = By.cssSelector("a[class='oq-up plus']");
    public static By delete = By.cssSelector("a[class='cart-square-link']");
}
