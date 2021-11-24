package ms.engage.scheduler.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ms.engage.scheduler.Model.Course;
import ms.engage.scheduler.Model.EnrolledCourses;
import ms.engage.scheduler.Model.Student;
import ms.engage.scheduler.Repository.CourseRepository;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    EnrolledCoursesService enrolledCoursesService;

    public List<Course> getAllCourses() {
        return (List<Course>) courseRepository.findAll();
    }

    public List<Course> getAllCourseByStudent(Student student) {

        List<Course> courses = new ArrayList<>();

        List<EnrolledCourses> enrolledCourses = enrolledCoursesService.getCourseIdsByStudent(student);
        
        for (EnrolledCourses enrolledCourse : enrolledCourses) {
            System.out.println(enrolledCourse.getCoursecode());
            Optional<Course> course = courseRepository.findByCoursecode(enrolledCourse.getCoursecode());

            course.ifPresent(courses::add);
        }

        return courses;
    }

    

}