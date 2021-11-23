package ms.engage.myauthenticationservice.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ms.engage.myauthenticationservice.Model.CCSignupUser;
import ms.engage.myauthenticationservice.Service.CCSignupUserService;


@RestController
@RequestMapping("/api/authenticate")
public class AuthenticationController {

    @Value("${spring.application.name}")
    private String appName;

    @Value("${authentication.greetings}")
    private String greetings;
    
    @GetMapping("/")
    public String hello() {
        return greetings+" from "+appName;
    }

    // , produces = "application/json"
    @PostMapping(value ="/signup",consumes = "application/json")
    public String signup(@RequestBody CCSignupUser signupUser) {

        CCSignupUserService signupUserService = new CCSignupUserService();
        signupUserService.addSignupUser(signupUser);
        System.out.println("Signup User: "+signupUserService.getAllSignupUsers());
        return signupUser.toString();
    }
}
