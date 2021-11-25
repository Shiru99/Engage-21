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
import ms.engage.scheduler.Model.EnrolledCourses;
import ms.engage.scheduler.Model.Student;
import ms.engage.scheduler.Service.CourseService;
import ms.engage.scheduler.Service.EnrolledCoursesService;


@RestController
@RequestMapping("/api/scheduler-student")
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
    public List<Course> getCoursesByInstructor(@RequestBody Student student) {
        return courseService.getAllCourseByStudent(student);
    }

    @PostMapping(value ="/getCourseDetails",consumes = "application/json", produces = "application/json")
    public Course getCourseDetails(@RequestBody Course course) {
        return courseService.getCourseDetails(course);
    }

    @Autowired
    EnrolledCoursesService enrolledCoursesService;
    
    @PostMapping(value ="/enrollCourse",consumes = "application/json", produces = "application/json")
    public CCResponse getEnrollCourse(@RequestBody EnrolledCourses courseToEnroll) {
        return enrolledCoursesService.enrollTheCourse(courseToEnroll);
    }

    @PostMapping(value ="/enrolledStudents",consumes = "application/json", produces = "application/json")
    public List<EnrolledCourses> getEnrolledStudents(@RequestBody EnrolledCourses course) {
        return enrolledCoursesService.getListOfEnrolledStudents(course);
    }

    
}
