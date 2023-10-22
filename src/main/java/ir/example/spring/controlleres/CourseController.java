package ir.example.spring.controlleres;

import ir.example.spring.modals.entitese.CoursesEntity;
import ir.example.spring.modals.entitese.StudentEntity;
import ir.example.spring.repositoriese.CourseRepository;
import ir.example.spring.repositoriese.StudentRepository;
import ir.example.spring.service.CourseService;
import ir.example.spring.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @Autowired
    private CourseRepository courseRepository;


    @PostMapping
    public void save(@RequestBody CoursesEntity courses) {
        courseRepository.save(courses);
    }


    @GetMapping
    public List<CoursesEntity> findAllStudent() {
        return courseRepository.findAll();
    }

    @DeleteMapping
    public void deleteCourse(@RequestParam("id") Long id) {
        courseRepository.deleteById(id);
    }


    @PutMapping
    public ResponseEntity<CoursesEntity> update(@RequestBody CoursesEntity courses){
        return ResponseEntity.ok(courses);
    }

/*    @PostMapping("/courses")
    public void insertData(@RequestBody CoursesEntity courses){
        courseService.print(courses);
    }*/
}
