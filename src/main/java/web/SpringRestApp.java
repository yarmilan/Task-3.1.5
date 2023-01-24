package web;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import web.config.Config;
import web.consumer.ConsumerWebService;
import web.model.User;

public class SpringRestApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ConsumerWebService consumerWebService = context.getBean("consumerWebService", ConsumerWebService.class);
        consumerWebService.getAllUsers();
        consumerWebService.createUser(new User(3L   , "James", "Brown", (byte) 40));
        consumerWebService.editUser(new User(3L, "Thomas", "Shelby", (byte) 30));
        consumerWebService.deleteUser(3L);
        System.out.println(ConsumerWebService.result);
    }
}
