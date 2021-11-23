package ms.engage.myauthenticationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@EnableJpaRepositories(basePackages = "ms.engage")
@SpringBootApplication
@EnableEurekaClient
@RefreshScope
public class MyAuthenticationServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(MyAuthenticationServiceApplication.class, args);
	}
}
