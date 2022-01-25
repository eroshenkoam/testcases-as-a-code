package io.github.eroshenkoam.taac;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class SearchIssueTest {

    @Test
    @Manual
    @AllureId("91456")
    @Owner("eroshenkoam")
    @Feature("Issues")
    @Story("Issue search")
    @Tags({@Tag("web"), @Tag("smoke")})
    @DisplayName("Поиск Issue по номеру в репозитории")
    public void testIssueSearch() {
        step("Открываем главную страницу");
        step("Ищем репозиторий eroshenkoam/allure-example", () -> {
            step("Нажимаем на поле поиска в шапке");
            step("Вводим текст eroshenkoam/allure-example");
            step("Нажимаем Enter");
        });
        step("В поисковой выдаче выбираем репозиторий eroshenkoam/allure-example");
        step("На странице репозитория переходи в Tab Issues");
        step("Проверяем что Issue с номером #68 существует");
    }

}
