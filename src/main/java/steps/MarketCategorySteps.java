package steps;

import pages.MarketCategoryPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MarketCategorySteps {
    @Step("Выбран тип продукта - {0}")
    public void stepSelectProductType(String type) {
        new MarketCategoryPage().selectProductType(type);
    }
}
