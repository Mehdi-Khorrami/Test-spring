package ir.example.spring.modals.entitese;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "TEACHER")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TeacherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String Name;

    @Column(name = "FAMILY")
    private String family;

    @ManyToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    private List<CoursesEntity> coursesEntityList;

    @Version
    private Integer version;
}
