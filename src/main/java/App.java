import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanWorld =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanWorld.getMessage());
        HelloWorld beanWorld2=
                (HelloWorld)applicationContext.getBean("helloworld");
        System.out.println(beanWorld2.getMessage());

        Cat beanCat=(Cat) applicationContext.getBean("cat");
        System.out.println(beanCat.getMessage());

        Cat beanCat2=(Cat) applicationContext.getBean("cat");
        System.out.println(beanCat2.getMessage());

        System.out.println(beanWorld==beanWorld2);
        System.out.println(beanCat==beanCat2);
    }
}