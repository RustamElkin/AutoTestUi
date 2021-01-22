package testconfigs;

import com.codeborne.selenide.Configuration;

public class AppConfig {

    static {

        Configuration.pageLoadStrategy = "eager";
        Configuration.startMaximized = true;
        Configuration.baseUrl = "https://college.dev-snation.kz/ru";
        Configuration.timeout = 30000;
        Configuration.pageLoadTimeout = 30000;

    }

}
