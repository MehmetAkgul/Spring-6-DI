package mak.springframework.Spring6DI;

import mak.springframework.Spring6DI.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6DiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Spring6DiApplication.class, args);

        MyController myController = ctx.getBean(MyController.class);

        System.out.println("In Main Method");
        System.out.println(myController.sayHello());
    }

}
