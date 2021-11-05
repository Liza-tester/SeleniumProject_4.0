package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YandexMainPage extends BasePage {

    @FindBy(xpath = "//*[@class='services-new__list']")
    WebElement servicesList;

    public void SelectService(String service) {
        servicesList.findElement(By.xpath(".//*[text() = '" + service + "']")).click();
        switchTab(service);
    }
}
