package ir.example.spring.repositoriese;

import ir.example.spring.modals.entitese.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity , Long> {
}
