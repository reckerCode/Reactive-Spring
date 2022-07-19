package io.spring.reactive.reactiveSpring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Once the service has started, you can see the output at localhost:8080/hello
 * The output comes from the reactive content being consumed by the
 * WebClient.
 */
@SpringBootApplication
@Slf4j
public class ReactiveSpringApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ReactiveSpringApplication.class, args);
        GreetingClient greetingClient = context.getBean(GreetingClient.class);
        // We need to block for the content here or the JVM might exit before the message is logged
        log.info(">> message = {} ", greetingClient.getMessage().block());
    }

}
