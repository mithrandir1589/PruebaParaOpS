package mquint2.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import mquint2.springframework.controllers.GreetingController;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
		
		GreetingController controller = (GreetingController) ctx.getBean("greetingController");
		
		controller.sayHello();
	}
}
