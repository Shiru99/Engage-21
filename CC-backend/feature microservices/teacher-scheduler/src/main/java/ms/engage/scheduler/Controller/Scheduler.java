package ms.engage.scheduler.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ms.engage.scheduler.Model.CCResponse;
import ms.engage.scheduler.Model.Course;
import ms.engage.scheduler.Service.CourseService;


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

    @Autowired
    CourseService courseService;

    @PostMapping(value ="/addCourse",consumes = "application/json", produces = "application/json")
    public CCResponse signup(@RequestBody Course course) {
        System.out.println(course);
        return courseService.saveNewCourse(course);
    }
}
