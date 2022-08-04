import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanH =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanH.getMessage());
        HelloWorld beanH1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanH1.getMessage());

        Cat beanC =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanC.getMessage());
        Cat beanC2 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanC2.getMessage());

        System.out.println("Первая пара - " + (beanH == beanH1));
        System.out.println("Вторая пара - " + (beanC == beanC2));
    }
}