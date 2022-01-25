package io.github.eroshenkoam.taac;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class CodeSearchTest {

    @Test
    @Manual
    @Feature("Search")
    @Story("Code search")
    @Owner("eroshenkoam")
    @DisplayName("Поиск вхождения кода в файл")
    public void testCodeSearch() {
        step("Открываем главную страницу");
        step("Ищем по слову `Allure`", () -> {
            step("Нажимаем на поле поиска в шапке");
            step("Вводим текст `Allure`");
            step("Нажимаем Enter");
        });
        step("В поисковой выдаче я выбираю таб Code");
        step("Выбираю первый файл с кодм вхождения слова");
        step("Проверяю что в файл есть слово `Allure`");
    }

}
