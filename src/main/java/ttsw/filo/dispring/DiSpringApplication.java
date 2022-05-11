package ttsw.filo.dispring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ttsw.filo.dispring.controllers.ConstructorInjectedController;
import ttsw.filo.dispring.controllers.GetterInjectedController;
import ttsw.filo.dispring.controllers.MyController;
import ttsw.filo.dispring.controllers.PropertyInjectedController;

@SpringBootApplication
public class DiSpringApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiSpringApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }

}
