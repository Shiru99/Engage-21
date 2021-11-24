package ms.engage.scheduler.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/scheduler-teacher")
public class Scheduler {

    @Value("${spring.application.name}")
    private String appName;

    @Value("${schedule.greetings}")
    private String greetings;
    
    @GetMapping("/")
    public String index() {
        return greetings+" from "+appName;
    }
}
