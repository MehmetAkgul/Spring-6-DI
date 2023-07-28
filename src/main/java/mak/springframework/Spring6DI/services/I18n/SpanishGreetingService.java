/**
 * Created by Mehmet AKGUL on 7/28/23.
 */

package mak.springframework.Spring6DI.services.I18n;

import mak.springframework.Spring6DI.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18NService")
public class SpanishGreetingService implements GreetingService
{
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
