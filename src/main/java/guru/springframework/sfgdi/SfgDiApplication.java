package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import guru.springframework.sfgdi.example.FakeDataSource;
import guru.springframework.sfgdi.example.FakeJmsBroker;
import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		System.out.println("----- Reading external property file ----");
		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUsername());

		System.out.println("----- Reading external property file ----");
		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
		System.out.println(fakeJmsBroker.getUsername());
		System.out.println("-----------------------------");

		System.out.println("-------- Primary Service Impl");
		MyController myController = (MyController) ctx.getBean("myController");
		// String helloMsg = myController.sayHello();
		System.out.println(myController.getGreeting());
		System.out.println("-----------------------------");

//		System.out.println("-------- Language Service Impl");
//		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
//		System.out.println(i18nController.getGreeting());
//		System.out.println("-----------------------------");
//
//		System.out.println("-------- Property Injected");
//		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
//		System.out.println(propertyInjectedController.getGreeting());
//		System.out.println("-----------------------------");
//
//		System.out.println("----- setter injected");
//		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
//		System.out.println(setterInjectedController.getGreeting());
//		System.out.println("-----------------------------");
//
//		System.out.println("---- constructor injected");
//		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
//		System.out.println(constructorInjectedController.getGreeting());
//		System.out.println("-----------------------------");
//
//		System.out.println("-------- user controller constructor injected");
//		UserNameController userController = (UserNameController) ctx.getBean("userNameController");
//		System.out.println(userController.showUser());
	}

}
