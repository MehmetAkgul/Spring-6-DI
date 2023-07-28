/**
 * Created by Mehmet AKGUL on 7/28/23.
 */

package mak.springframework.Spring6DI.controllers.i18n;

import mak.springframework.Spring6DI.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyI18NController {
    final private GreetingService greetingService;

    public MyI18NController(@Qualifier("i18NService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
