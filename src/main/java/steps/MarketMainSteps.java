package steps;

import pages.MarketMainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MarketMainSteps {

    @Step("Нажата кнопка меню категорий")
    public void stepPressCategoryButton() {
        new MarketMainPage().pressCategoryButton();
    }

    @Step("Выбран раздел - {0}")
    public void stepSelectCategory(String category) {
        new MarketMainPage().selectCategory(category);
    }

    @Step("Выбран подраздел - {0}")
    public void stepSelectCategoryIssue(String issue) {
        new MarketMainPage().selectCategoryIssue(issue);
    }
}
