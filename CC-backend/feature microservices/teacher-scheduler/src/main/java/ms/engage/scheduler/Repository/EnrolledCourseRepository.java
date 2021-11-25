package ms.engage.scheduler.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ms.engage.scheduler.Model.EnrolledCourse;

public interface EnrolledCourseRepository extends CrudRepository<EnrolledCourse,Integer> {

    List<EnrolledCourse> findByCoursecode(String coursecode);
}

