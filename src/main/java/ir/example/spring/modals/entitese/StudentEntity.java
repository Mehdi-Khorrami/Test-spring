package ir.example.spring.modals.entitese;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "STUDENT")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "AGE")
    private Integer age;

    @Column(name = "FATHER_NAME")
    private String fatherName;

    @Column(name = "NATION_CODE")
    private String nationCode;

    @ManyToMany(cascade = CascadeType.ALL ,fetch = FetchType.EAGER )
    private List<CoursesEntity> coursesEntities;

    @Version
    private Integer version;

}
