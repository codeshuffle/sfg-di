package bb.net.depinj;

import bb.net.depinj.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DepinjApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DepinjApplication.class, args);
		MyController my = (MyController) ctx.getBean("myController");
		//my.SayHello();

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		PropertyInjectedController propertyInjectedController= (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting() + " property controller");

		SetterInjectedController setterInjectedController= (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(propertyInjectedController.getGreeting() + " setter controller");

		ConstructorInjectedController constructorInjectedController =(ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(propertyInjectedController.getGreeting() + " constructor controller");
	}

}
