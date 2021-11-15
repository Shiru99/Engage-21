package ms.engage.helloworld.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    
    @GetMapping("/")
    public String index() {
        return "Hello, World! from Spring Boot!";
    }
}
