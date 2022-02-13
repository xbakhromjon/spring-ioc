package uz.bakhromjon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import uz.bakhromjon.repository.UserRepository;
import uz.bakhromjon.service.UserService;

@Configuration
@ComponentScan(basePackages = "uz.bakhromjon")
public class ApplicationConfig {

}
