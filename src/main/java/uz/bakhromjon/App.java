package uz.bakhromjon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import uz.bakhromjon.config.ApplicationConfig;
import uz.bakhromjon.service.UserService;
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        UserService ser = applicationContext.getBean(UserService.class);
        System.out.println(ser.getRepository());
    }
}
