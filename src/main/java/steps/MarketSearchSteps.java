package steps;

import pages.MarketSearchPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MarketSearchSteps {

    String productName;

    @Step("Нажата кнопка - Все фильтры")
    public void stepPressAllFiltersButton() {
        new MarketSearchPage().pressAllFiltersButton();
    }

    @Step("Проверка количества товаров на странице: не более 48")
    public void stepCheckResultItems() {
        new MarketSearchPage().checkResultItems();
    }

    @Step("Получено наименование первого отфильтрованного товара")
    public void stepGetFirstResult() {
        productName = new MarketSearchPage().getFirstResult();
    }

    @Step("Поиск по наименованию: товар найден")
    public void stepCheckSearchResult() {
        new MarketSearchPage().checkSearchResult(productName);
    }
}
