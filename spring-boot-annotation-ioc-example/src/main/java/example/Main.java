package example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by liyikun on 2017/6/4.
 */
public class Main {

    /**
     * Hello di !   example.UseFunctionService@145eaa29
     * Hello 1231231 !   example.UseFunctionService@145eaa29
     * Hello 34534 !   example.UseFunctionService@145eaa29
     * Hello asdas !   example.UseFunctionService@145eaa29
     * */
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("di"));
        System.out.println(context.getBean(UseFunctionService.class).sayHello("1231231"));
        System.out.println(context.getBean(UseFunctionService.class).sayHello("34534"));
        System.out.println(context.getBean(UseFunctionService.class).sayHello("asdas"));
        context.close();
    }
}
