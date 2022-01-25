package io.github.eroshenkoam.taac;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static io.qameta.allure.Allure.step;

public class RandomDataTest {

    private Faker faker = new Faker(new Locale("ru", "RU"));

    @Test
    public void testUserRegistration() {
        step("Открываем главную страницу");
        step("Нажимаем кнопку `Регистрация пользователя`");
        step("Заполняем форму регистрации", () -> {
            step("Логин: " + faker.name().username());
            step("Фамилия: " + faker.name().lastName());
            step("Имя: " + faker.name().firstName());
            step("Email: " + faker.internet().emailAddress());
        });
    }

}
