package ir.example.spring.service;

import ir.example.spring.modals.entitese.StudentEntity;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public void  print(StudentEntity student){
        System.out.println(student);
    }
}
