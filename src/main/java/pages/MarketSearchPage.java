package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class MarketSearchPage extends BasePage {

    @FindBy(xpath = "//*[text()='Все фильтры']")
    WebElement allFiltersButton;

    @FindBy(xpath = "//*[@placeholder='Искать товары']")
    WebElement searchLine;


    public void pressAllFiltersButton() {
        scrollAndClick(allFiltersButton);
    }

    public void checkResultItems() {

        int buttonCounter = driver.findElements(By.xpath("//button[text()='Показать ещё']")).size();
        int itemNumber = driver.findElements(By.xpath("//*[@data-tid='ce80a508']")).size();
        if (buttonCounter > 0) Assert.assertEquals(48, itemNumber);
        else Assert.assertTrue(itemNumber < 49);

    }

    public String getFirstResult() {
        ArrayList<WebElement> resultItems =
                (ArrayList<WebElement>) driver.findElements(By.xpath("//*[@data-tid='ce80a508']"));
        return resultItems.get(0).getText();

    }

    public void checkSearchResult(String value) {
        setField(searchLine, value);
        searchLine.sendKeys(Keys.ENTER);
        WebElement element = driver.findElement(By.xpath("//*[@data-tid='ce80a508']/parent::*"));
        Assert.assertEquals(value, element.getText());
    }
}
