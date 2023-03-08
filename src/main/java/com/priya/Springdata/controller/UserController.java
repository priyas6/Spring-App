package com.priya.Springdata.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.priya.Springdata.Repository.StudentRepository;
import com.priya.Springdata.entity.Student;
@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/api")
public class UserController 
{
    @Autowired
	StudentRepository stud;
    @GetMapping("/users")
    public List <Student> getuser()
    {
    	return stud.findAll();
    }
    @PostMapping("/users")
    public void postUser(@RequestBody Student users ) {
    	 stud.save(users);
    }
    @PostMapping("/users/{id}")
    public Optional<Student> findUserbyId(@PathVariable(value="id") int id)
    {
      return stud.findById(id);
    }
    
}
