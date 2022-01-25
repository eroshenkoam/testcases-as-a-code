package io.github.eroshenkoam.taac;

import io.github.eroshenkoam.taac.feature.ProjectStories;
import io.github.eroshenkoam.taac.step.WebSteps;
import io.qameta.allure.AllureId;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class SearchIssueTest {

    private WebSteps steps = new WebSteps();

    @Test
    @AllureId("91456")
    @ProjectStories.IssuesSearch
    @Tags({@Tag("web"), @Tag("smoke")})
    @DisplayName("Поиск Issue по номеру в репозитории")
    public void testIssueSearch() {
        step("Открываем главную страницу");
        steps.searchText("eroshenkoam/allure-example");
        step("В поисковой выдаче выбираем репозиторий eroshenkoam/allure-example");
        steps.openRepositoryTab("Issues");
        step("Проверяем что Issue с номером #68 существует");
    }

}
