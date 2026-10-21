package ch.toto.toolbox.sandboxspringjooq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <a href="https://www.baeldung.com/jooq-with-spring">Introduction to Jooq with Spring</a>
 * <a href="https://www.baeldung.com/spring-boot-support-for-jooq">Spring Boot Support for jOOQ</a>
 */
@SpringBootApplication
//@EnableTransactionManagement
public class SandboxSpringJooqApplication {

    public static void main(String[] args) {
        SpringApplication.run(SandboxSpringJooqApplication.class, args);
    }

}
