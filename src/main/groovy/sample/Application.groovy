package sample
import org.springframework.boot.SpringApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

/**
 * Created by tolkv on 11/22/2014.
 */
@ComponentScan
@Configuration
public class Application {
    public static void main(String[] args) {
        def application = new SpringApplication(Application.class, args);
        application.showBanner(false)
        application.run()
    }
}
