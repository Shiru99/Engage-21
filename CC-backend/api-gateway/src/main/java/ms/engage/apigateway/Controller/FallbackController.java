package ms.engage.apigateway.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ms.engage.apigateway.Model.CCResponse;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    CCResponse ccResponse = new CCResponse();
    
    @RequestMapping("/")
    public String hello() {
        return "Hello from College Connect - API Gateway Server";
    }

    @RequestMapping(value = "/hello-world-fallback", produces = "application/json")
    public CCResponse helloWorldFallback() {
        ccResponse.setStatus(false);
        ccResponse.setStatusMessage("Hello-World Service is taking too long to respond or is down. Please try again later");
        return ccResponse;
    }

    @RequestMapping(value = "/authentication-fallback", produces = "application/json")
    public CCResponse authenticationFallback() {
        ccResponse.setStatus(false);
        ccResponse.setStatusMessage("My-Authentication-Service is taking too long to respond or is down. Please try again later");
        return ccResponse;
    }

    @RequestMapping(value = "/scheduler-fallback", produces = "application/json")
    public CCResponse schedulerFallback() {
        ccResponse.setStatus(false);
        ccResponse.setStatusMessage("Class-Scheduler Service is taking too long to respond or is down. Please try again later");
        return ccResponse;
    }
}
