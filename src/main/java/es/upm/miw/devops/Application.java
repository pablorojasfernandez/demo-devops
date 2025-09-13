package es.upm.miw.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class}) // Not API: /error
public class Application {
    // Commit 4
    // Issue 2 - Commit 4
    // Issue 2 - Commit 2
    // Issue 3 - Commit 1
    // Issue 6 - Commit 1
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);// mvn clean spring-boot:run
    }
}
