package ms.engage.ccgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CcGatewayApplication {
	public static void main(String[] args) {
		SpringApplication.run(CcGatewayApplication.class, args);
	}

}
