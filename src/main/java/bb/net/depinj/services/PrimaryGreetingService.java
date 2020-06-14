package bb.net.depinj.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayHi() {
        return "Hi guys - this is a PRIMARY bean";
    }
}
