package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketCategoryPage extends BasePage {

    @FindBy(xpath = "//*[@data-apiary-widget-name='@MarketNode/NavigationTree']")
    WebElement productTypes;

    public void selectProductType(String type) {
        productTypes.findElement(By.xpath(".//*[text()='" + type + "']")).click();

    }
}
