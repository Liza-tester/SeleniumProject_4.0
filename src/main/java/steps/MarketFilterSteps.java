package steps;

import pages.MarketFilterPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MarketFilterSteps {

    @Step("Задан фильтр {0}: значение {1}")
    public void stepAddFilters(String key, String value) {
        new MarketFilterPage().AddFilters(key, value);
    }

    @Step("Нажата кнопка - Показать предложения")
    public void stepPressShowButton() {
        new MarketFilterPage().pressShowButton();
    }
}
