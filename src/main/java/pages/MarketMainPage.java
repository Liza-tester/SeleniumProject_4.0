package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import steps.BaseSteps;

public class MarketMainPage extends BasePage {

    @FindBy(xpath = "//*[text() = 'Каталог']/parent::*")
    WebElement categoryButton;
    @FindBy(xpath = "//*[@class='_45DYw _1HhK9']")
    WebElement categoryMenu;

    public void pressCategoryButton() {
        categoryButton.click();
    }

    public void selectCategory(String category) {
        Actions builder = new Actions(BaseSteps.getDriver());
        WebElement element = categoryMenu.findElement(By.xpath("//*[@class='_45DYw _1HhK9']//*[text()='" + category + "']"));
        builder.moveToElement(element).build().perform();
    }

    public void selectCategoryIssue(String issue) {
        driver.findElement(By.xpath("//*[text()='" + issue + "']")).click();
    }


}
