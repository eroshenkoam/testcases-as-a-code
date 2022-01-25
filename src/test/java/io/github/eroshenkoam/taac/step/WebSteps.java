package io.github.eroshenkoam.taac.step;

import io.qameta.allure.Step;

import static io.qameta.allure.Allure.step;
import static java.lang.String.format;

public class WebSteps {

    @Step("Ищем по слову `{query}`")
    public void searchText(String query) {
        step("Нажимаем на поле поиска в шапке");
        step(format("Вводим текст `%s`", query));
        step(format("Вводим текст `%s`", query));
        step("Нажимаем Enter");
    }

    @Step("Открываем таб `{name}` в репозитории")
    public void openRepositoryTab(String name) {
    }
}
