package steps;

import pages.YandexMainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class YandexMainSteps {

    @Step("Нажата кнопка - {0}")
    public void stepSelectService(String service) {
        new YandexMainPage().SelectService(service);
    }
}
