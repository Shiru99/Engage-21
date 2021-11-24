package ms.engage.scheduler.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ms.engage.scheduler.Model.CCResponse;
import ms.engage.scheduler.Model.EnrolledCourses;
import ms.engage.scheduler.Model.Student;
import ms.engage.scheduler.Repository.EnrolledCoursesRepository;

@Service
public class EnrolledCoursesService {
    
    @Autowired
    EnrolledCoursesRepository enrolledCoursesRepository;

    public List<EnrolledCourses> getCourseIdsByStudent(Student student) {
        return enrolledCoursesRepository.findByUsername(student.getName());
    }

    public CCResponse enrollTheCourse(EnrolledCourses courseToEnroll) {

        boolean isEnrolled = enrolledCoursesRepository.findByUsernameAndCoursecode(courseToEnroll.getUsername(), courseToEnroll.getCoursecode()).isPresent();

        if(isEnrolled) {
            return new CCResponse(false, "You are already enrolled in this course");
        } else {
            enrolledCoursesRepository.save(courseToEnroll);
            return new CCResponse(true, "You have successfully enrolled in this course");
        }
        
    }

    public List<EnrolledCourses> getListOfEnrolledStudents(EnrolledCourses course) {
        return enrolledCoursesRepository.findByCoursecode(course.getCoursecode());
    }
    
}
