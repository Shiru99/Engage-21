package ms.engage.scheduler.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import ms.engage.scheduler.Model.EnrolledCourses;

public interface EnrolledCoursesRepository extends CrudRepository<EnrolledCourses,Integer> {

    List<EnrolledCourses> findByUsername(String username);

    List<EnrolledCourses> findByCoursecode(String coursecode);

    Optional<EnrolledCourses> findByUsernameAndCoursecode(String username, String coursecode);
}
