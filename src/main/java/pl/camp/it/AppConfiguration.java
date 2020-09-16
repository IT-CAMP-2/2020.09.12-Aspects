package pl.camp.it;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.camp.it.aspects.UserServiceAspect;

@Configuration
@ComponentScan("pl.camp.it")
public class AppConfiguration {

    /*@Bean
    public UserServiceAspect userServiceAspect() {
        return new UserServiceAspect();
    }*/
}
