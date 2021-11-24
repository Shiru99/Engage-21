package ms.engage.myauthenticationservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ms.engage.myauthenticationservice.Model.CCResponse;
import ms.engage.myauthenticationservice.Model.CCSignupUser;
import ms.engage.myauthenticationservice.Service.CCUserService;


@RestController
@RequestMapping("/api/authenticate")
public class AuthenticationController {

    @Autowired
    CCUserService ccUserService;

    @Value("${spring.application.name}")
    private String appName;

    @Value("${authentication.greetings}")
    private String greetings;
    
    @GetMapping("/")
    public String hello() {
        return greetings+" from "+appName;
    }

    @PostMapping(value ="/signup",consumes = "application/json", produces = "application/json")
    public CCResponse signup(@RequestBody CCSignupUser signupUser) {
        return ccUserService.saveNewUser(signupUser);
    }

    @PostMapping(value ="/login",consumes = "application/json", produces = "application/json")
    public CCResponse login(@RequestBody CCSignupUser signupUser) {
        return ccUserService.loginUser(signupUser);
    }
}
