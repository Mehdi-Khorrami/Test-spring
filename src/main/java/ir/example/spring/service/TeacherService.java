package ir.example.spring.service;

import ir.example.spring.modals.entitese.TeacherEntity;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    public void print(TeacherEntity teacher){
        System.out.println(teacher);
    }
}
