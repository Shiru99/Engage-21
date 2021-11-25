package ms.engage.scheduler.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ms.engage.scheduler.Model.EnrolledCourse;
import ms.engage.scheduler.Repository.EnrolledCourseRepository;

@Service
public class EnrolledCourseService {
    
    @Autowired
    EnrolledCourseRepository enrolledCourseRepository;

    public List<EnrolledCourse> getListOfEnrolledStudents(EnrolledCourse course) {
        return enrolledCourseRepository.findByCoursecode(course.getCoursecode());
    }
    
}
