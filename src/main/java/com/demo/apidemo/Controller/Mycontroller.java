package com.demo.apidemo.Controller;

import com.demo.apidemo.model.Student;
import com.demo.apidemo.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class Mycontroller {
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        Student save = this.studentRepository.save(student);
        return ResponseEntity.ok(save);
    }
    @GetMapping("/")
    public ResponseEntity<List<Student>> getStudent() {
        return ResponseEntity.ok(this.studentRepository.findAll());
    }



}
