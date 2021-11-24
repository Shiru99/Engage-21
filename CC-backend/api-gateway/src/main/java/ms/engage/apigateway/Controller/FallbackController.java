package ms.engage.apigateway.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ms.engage.apigateway.Model.CCResponse;

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

    @RequestMapping(value = "/scheduler-teacher-fallback", produces = "application/json")
    public CCResponse schedulerTeacherFallback() {
        ccResponse.setStatus(false);
        ccResponse.setStatusMessage("Class-Scheduler for Teacher Service is taking too long to respond or is down. Please try again later");
        return ccResponse;
    }

    @RequestMapping(value = "/scheduler-student-fallback", produces = "application/json")
    public CCResponse schedulerStudentFallback() {
        ccResponse.setStatus(false);
        ccResponse.setStatusMessage("Class-Scheduler for Student Service is taking too long to respond or is down. Please try again later");
        return ccResponse;
    }
}
