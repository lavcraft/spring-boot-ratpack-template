package sample
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import sample.module.SomeBean
import sample.module.Voter

/**
 * Created by tolkv on 11/22/2014.
 */
@ComponentScan
@Configuration
@EnableAutoConfiguration
public class Application {
    @Bean
    Voter voter(){
        return new SomeBean()
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
