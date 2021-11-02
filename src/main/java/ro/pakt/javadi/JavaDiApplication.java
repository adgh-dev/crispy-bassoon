package ro.pakt.javadi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import ro.pakt.javadi.controllers.MyController;

@SpringBootApplication
public class JavaDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(JavaDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);
	}

}
