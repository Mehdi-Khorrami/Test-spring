package ir.example.spring.controlleres;

import ir.example.spring.modals.ModalPrint;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

    @GetMapping("/printname/{name}")
    public void printName(@PathVariable String name){
        System.out.println(name);
    }

    @GetMapping("/age")
    public void printAge(@RequestParam("age") Integer age){
        System.out.println(age);
    }


    @GetMapping("/person")
    public void print(@RequestBody ModalPrint modalPrint){
        System.out.println(modalPrint);
    }

}
