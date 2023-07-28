/**
 * Created by Mehmet AKGUL on 7/28/23.
 */

package mak.springframework.Spring6DI.services.I18n;


import mak.springframework.Spring6DI.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN","default"})
@Service("i18NService")
public class EnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
