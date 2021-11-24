package ms.engage.scheduler.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import ms.engage.scheduler.Model.CCResponse;
import ms.engage.scheduler.Model.Course;
import ms.engage.scheduler.Repository.CourseRepository;

@Service
public class CourseService {

    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    @Autowired
    CourseRepository courseRepository;

    public List<Course> getAllCourses() {
        return (List<Course>) courseRepository.findAll();
    }

    public CCResponse saveNewCourse(Course course) {

        CCResponse response = new CCResponse();

        Optional<Course> newCourse = courseRepository.findByCoursecode(course.getCoursecode());

        if (newCourse.isPresent()) {
            response.setStatus(false);
            response.setStatusMessage("Course Already Exists, Please verify Course-Code");
            return response;
        }

        courseRepository.save(course);

        response.setStatus(true);
        response.setStatusMessage("Course added successfully");
        return response;

    }

}