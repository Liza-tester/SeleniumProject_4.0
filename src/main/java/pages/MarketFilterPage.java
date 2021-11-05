package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketFilterPage extends BasePage {

    @FindBy(xpath = "//*[@class='_307sS _2k6P8']//*[@data-prefix = 'от']//*[@class='_2xtC2']")
    WebElement minPrice;
    @FindBy(xpath = "//*[@data-filter-id='7893318' and @data-tid='492efb0a']")
    WebElement producersList;
    @FindBy(xpath = "//a[contains(text(),'предложен')]")
    WebElement showButton;

    public void SetMinPrice(String price) {
        setField(minPrice, price);
    }

    public void SelectProducer(String names) {
        String[] namesArray = names.split(",");
        for (String name : namesArray) {
            scrollAndClick(producersList.findElement(
                    By.xpath(".//*[text()='" + name + "']")));
        }

    }

    public void AddFilters(String key, String value) {
        switch (key) {
            case "Цена от": {
                SetMinPrice(value);
                break;
            }
            case "Производитель": {
                SelectProducer(value);
                break;
            }
            default:
                break;
        }
    }

    public void pressShowButton() {
        showButton.click();
    }
}
