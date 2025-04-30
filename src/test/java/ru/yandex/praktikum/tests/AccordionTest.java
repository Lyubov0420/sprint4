package ru.yandex.praktikum.tests;

import org.junit.jupiter.api.Test;
import ru.yandex.praktikum.pages.MainPage;

public class AccordionTest extends BaseTest {
    @Test
    public void testFAQ() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.scrollToFAQ();
    }
}