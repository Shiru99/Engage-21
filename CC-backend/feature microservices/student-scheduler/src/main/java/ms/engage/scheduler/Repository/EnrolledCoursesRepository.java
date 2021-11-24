package ms.engage.scheduler.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import ms.engage.scheduler.Model.EnrolledCourses;

public interface EnrolledCoursesRepository extends CrudRepository<EnrolledCourses,Integer> {
    List<EnrolledCourses> findByUsername(String username);
}
