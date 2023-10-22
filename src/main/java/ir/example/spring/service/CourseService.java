package ir.example.spring.service;

import ir.example.spring.modals.entitese.CoursesEntity;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    public void  print(CoursesEntity courses) {
        System.out.println(courses);
    }

}
