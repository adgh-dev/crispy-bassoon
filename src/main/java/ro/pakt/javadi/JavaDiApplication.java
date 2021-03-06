package ro.pakt.javadi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import ro.pakt.javadi.controllers.ConstructorInjectedController;
import ro.pakt.javadi.controllers.MyController;
import ro.pakt.javadi.controllers.PropertyInjectedController;
import ro.pakt.javadi.controllers.SetterInjectedController;
import ro.pakt.javadi.controllers.I18nController;

@SpringBootApplication
public class JavaDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(JavaDiApplication.class, args);

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("------ Primary Bean");
		System.out.println(myController.sayHello());

		System.out.println("------ Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------ Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------ Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
