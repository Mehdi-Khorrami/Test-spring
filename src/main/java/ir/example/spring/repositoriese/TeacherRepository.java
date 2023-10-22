package ir.example.spring.repositoriese;

import ir.example.spring.modals.entitese.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<TeacherEntity ,Long > {
}
