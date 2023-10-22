package ir.example.spring.repositoriese;

import ir.example.spring.modals.entitese.CoursesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CoursesEntity , Long> {
}
