package ms.engage.apigateway.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @RequestMapping("/")
    public String hello() {
        return "Hello from College Connect - API Gateway Server";
    }

    @RequestMapping("/hello-world-fallback")
    public Mono<String> helloWorldFallback() {
        System.out.println("Fallback method called...");
        return Mono.just("Hello-World Service is taking too long to respond or is down. Please try again later");
    }
}
