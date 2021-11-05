package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioSteps {

    YandexMainSteps yandexMainSteps = new YandexMainSteps();
    MarketMainSteps marketMainSteps = new MarketMainSteps();
    MarketCategorySteps marketCategorySteps = new MarketCategorySteps();
    MarketSearchSteps marketSearchSteps = new MarketSearchSteps();
    MarketFilterSteps marketFilterSteps = new MarketFilterSteps();

    @When("^выбран сервис - \"(.*)\"$")
    public void stepSelectService(String service) {
        yandexMainSteps.stepSelectService(service);
    }

    @When("^выбран раздел - \"(.*)\"$")
    public void stepSelectCategory(String category) {
        marketMainSteps.stepPressCategoryButton();
        marketMainSteps.stepSelectCategory(category);
    }

    @When("^выбран подраздел - \"(.*)\"$")
    public void stepSelectCategoryIssue(String issue) {
        marketMainSteps.stepSelectCategoryIssue(issue);
    }

    @When("^выбран тип продукта - \"(.*)\"$")
    public void stepSelectProductType(String type) {
        marketCategorySteps.stepSelectProductType(type);
    }


    @When("^в блоке 'Все фильтры' заданы фильтры:$")
    public void stepAddFilters(DataTable fields) {
        marketSearchSteps.stepPressAllFiltersButton();
        fields.asMap(String.class, String.class).forEach(
                (key, value) -> marketFilterSteps.stepAddFilters(key, value));
        marketFilterSteps.stepPressShowButton();
    }

    @Then("^на странице выводится по 48 товаров$")
    public void stepCheckResultItems() {
        marketSearchSteps.stepCheckResultItems();
    }

    @When("^найден товар, соответствующий фильтрам$")
    public void stepGetFirstResult() {
        marketSearchSteps.stepGetFirstResult();
    }

    @Then("^этот товар найден по наименованию$")
    public void stepCheckSearchResult() {
        marketSearchSteps.stepCheckSearchResult();
    }
}
