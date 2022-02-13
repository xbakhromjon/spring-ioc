package uz.bakhromjon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import uz.bakhromjon.service.UserService;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService ser = applicationContext.getBean(UserService.class);
        System.out.println(ser.getRepository());

    }
}
