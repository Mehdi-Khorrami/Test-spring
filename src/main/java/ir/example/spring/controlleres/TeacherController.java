package ir.example.spring.controlleres;

import ir.example.spring.modals.entitese.TeacherEntity;
import ir.example.spring.repositoriese.TeacherRepository;
import ir.example.spring.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private TeacherRepository teacherRepository;


    @PostMapping
    public void save(@RequestBody TeacherEntity teacher) {
        teacherRepository.save(teacher);
    }


    @GetMapping
    public List<TeacherEntity> findAllStudent() {
        return teacherRepository.findAll();
    }

    @DeleteMapping
    public void deleteStudent(@RequestParam("id") Long id) {
        teacherRepository.deleteById(id);
    }


    @PutMapping
    public ResponseEntity<TeacherEntity> update(@RequestBody TeacherEntity teacher){
        return ResponseEntity.ok(teacher);
    }

/*    @PostMapping("/teacher")
    public void insertData(@RequestBody TeacherEntity teacher){
        teacherService.print(teacher);
    }*/
}
