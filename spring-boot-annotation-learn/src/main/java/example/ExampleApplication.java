package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by liyikun on 2017/6/18.
 * Indicates a configuration class that declares one or more @Bean methods and
 * also triggers auto-configuration and component scanning.
 * This is a convenience annotation that is equivalent to declaring @Configuration,
 * @EnableAutoConfiguration and @ComponentScan.
 */
@SpringBootApplication
public class ExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
    }
}
