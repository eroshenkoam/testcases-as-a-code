package io.github.eroshenkoam.taac;

import io.github.eroshenkoam.taac.feature.ProjectStories;
import io.github.eroshenkoam.taac.step.WebSteps;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class CodeSearchTest {

    private WebSteps steps = new WebSteps();

    @Test
    @Manual
    @ProjectStories.CodeSearch
    @DisplayName("Поиск вхождения кода в файл")
    public void testCodeSearch() {
        step("Открываем главную страницу");
        steps.searchText("Allure");
        step("В поисковой выдаче я выбираю таб Code");
        step("Выбираю первый файл с кодм вхождения слова");
        step("Проверяю что в файл есть слово `Allure`");
    }

}
