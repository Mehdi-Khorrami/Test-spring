package ir.example.spring.modals.entitese;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "COURSE")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CoursesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "FILED")
    private String filed;

    @ManyToMany(mappedBy = "coursesEntities" , fetch = FetchType.EAGER ,cascade =  CascadeType.ALL)
    private List<StudentEntity> studentEntities;

    @ManyToMany(mappedBy = "coursesEntityList" , cascade = CascadeType.ALL ,fetch =  FetchType.EAGER)
    private List<TeacherEntity> teacherEntities;


    @Version
    private Integer version;
}
