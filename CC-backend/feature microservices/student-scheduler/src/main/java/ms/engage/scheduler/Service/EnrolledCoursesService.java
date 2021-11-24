package ms.engage.scheduler.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
