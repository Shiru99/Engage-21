package ms.engage.scheduler.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ms.engage.scheduler.Model.CCResponse;
import ms.engage.scheduler.Model.Course;
import ms.engage.scheduler.Model.Instructor;
import ms.engage.scheduler.Service.CourseService;


@RestController
@RequestMapping("/api/scheduler-teacher")
public class SchedulerController {

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

    @PostMapping(value ="/getCourses",consumes = "application/json", produces = "application/json")
    public List<Course> getCoursesByInstructor(@RequestBody Instructor Instructor) {
        return courseService.getAllCourseByInstructor(Instructor);
    }

    @PostMapping(value ="/addCourse",consumes = "application/json", produces = "application/json")
    public CCResponse addCourse(@RequestBody Course course) {
        return courseService.saveNewCourse(course);
    }

    @PostMapping(value ="/getCourseDetails",consumes = "application/json", produces = "application/json")
    public Course getCourseDetails(@RequestBody Course course) {
        System.out.println(course);
        return courseService.getCourseDetails(course);
    }

    
}
