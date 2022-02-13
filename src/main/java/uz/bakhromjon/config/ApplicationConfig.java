package uz.bakhromjon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import uz.bakhromjon.repository.UserRepository;
import uz.bakhromjon.service.UserService;

@Configuration
public class ApplicationConfig {

    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }

    @Bean
    public UserService userService() {
        return new UserService(userRepository());
    }
}
