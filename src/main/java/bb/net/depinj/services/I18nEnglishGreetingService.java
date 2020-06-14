package bb.net.depinj.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN","default"})
@Service("I18nService")
public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String sayHi() {
        return "I18n greeting in english";
    }
}
