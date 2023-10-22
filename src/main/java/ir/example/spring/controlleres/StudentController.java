package ir.example.spring.controlleres;

import ir.example.spring.modals.entitese.StudentEntity;
import ir.example.spring.repositoriese.StudentRepository;
import ir.example.spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentRepository studentRepository;


    @PostMapping
    public void save(@RequestBody StudentEntity student) {
        studentRepository.save(student);
    }


    @GetMapping
    public List<StudentEntity> findAllStudent() {
        return studentRepository.findAll();
    }

    @DeleteMapping
    public void deleteStudent(@RequestParam("id") Long id) {
        studentRepository.deleteById(id);
    }


    @PutMapping
    public ResponseEntity<StudentEntity> update(@RequestBody StudentEntity student){
        if(student.getId() != null ){
            studentRepository.save(student);
        }
        return ResponseEntity.ok(student);
    }

}

/*    @PostMapping("/student")
    public void insertData(@RequestBody StudentEntity student){
        studentService.print(student);
    }*/

/*    @PutMapping
    public ResponseEntity<StudentEntity> update(@RequestBody StudentEntity student){
        student.setName("ahmad");
        return ResponseEntity.ok(student);
    */

