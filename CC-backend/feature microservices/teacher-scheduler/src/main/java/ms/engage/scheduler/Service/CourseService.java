package ms.engage.scheduler.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ms.engage.scheduler.Model.CCResponse;
import ms.engage.scheduler.Model.Course;
import ms.engage.scheduler.Model.Instructor;
import ms.engage.scheduler.Repository.CourseRepository;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public List<Course> getAllCourses() {
        return (List<Course>) courseRepository.findAll();
    }

    public List<Course> getAllCourseByInstructor(Instructor instructor) {
        return courseRepository.findByInstructor(instructor.getName());
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