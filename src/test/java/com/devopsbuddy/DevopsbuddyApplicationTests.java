package com.devopsbuddy;

import com.devopsbuddy.web.i18n.I18NService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevopsbuddyApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private I18NService i18NService;

    @Test
    public void testMessageByLocaleService() throws Exception {
        String expectedResult = "Bootstrap starter template";
        String messageId = "index.main.callout";
        String actual = i18NService.getMessage(messageId);
        Assertions.assertEquals(expectedResult, actual, "The actual and expected string don't match");
    }

}
