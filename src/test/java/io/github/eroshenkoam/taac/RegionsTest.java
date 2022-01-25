package io.github.eroshenkoam.taac;

import io.github.eroshenkoam.taac.feature.ProjectStories;
import io.qameta.allure.Param;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static io.qameta.allure.Allure.step;
import static java.lang.String.format;

public class RegionsTest {

    @CsvSource({
            "Москва,Московская область",
            "Санкт-Петербург,Ленинградская область",
    })
    @ProjectStories.RegionOrder
    @DisplayName("Тестируем регион")
    @ParameterizedTest(name = "{displayName} {1}")
    public void testRegion(@Param("Город") String city,
                           @Param("Область") String region) {
        step("Открываем главную страницу");
        step("Нажимаем на кнопку выбора города");
        step(format("Выбираем город `%s`", city));
        step("Оформляем заказ ... через приложение");
        step(format("Проверяем что область доставки `%s`", region));
    }

}
