package com.simbirsoft.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {
    @BeforeEach
    public void helperDriver() {
        Configuration.browser = "Firefox";
        Configuration.startMaximized = true;
    }
}
