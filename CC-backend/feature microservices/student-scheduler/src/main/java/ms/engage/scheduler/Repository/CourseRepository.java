package ms.engage.scheduler.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ms.engage.scheduler.Model.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course,Integer> {
    Optional<Course> findByCoursecode(String coursecode);
}