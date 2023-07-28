package mak.springframework.Spring6DI.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

//@ActiveProfiles("EN")
@SpringBootTest
class MyI18NControllerTestEN {

    @Autowired
    MyI18NController myI18NController;

    @Test
    void sayHello() {
        System.out.println(myI18NController.sayHello());
    }
}