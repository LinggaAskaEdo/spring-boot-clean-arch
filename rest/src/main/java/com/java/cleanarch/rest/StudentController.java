package com.java.cleanarch.rest;

import com.java.cleanarch.entities.Student;
import com.java.cleanarch.rest.dto.StudentDto;
import com.java.cleanarch.rest.mapper.StudentMapper;
import com.java.cleanarch.usecases.student.FindStudentByNameUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController
{
    private final FindStudentByNameUseCase findStudentByNameUseCase;

    @Autowired
    public StudentController(FindStudentByNameUseCase findStudentByNameUseCase)
    {
        this.findStudentByNameUseCase = findStudentByNameUseCase;
    }

    @GetMapping("/find")
    public ResponseEntity<StudentDto> findByName(@RequestParam String name)
    {
        Student student = findStudentByNameUseCase.find(name);

        return new ResponseEntity<>(StudentMapper.toDto(student), HttpStatus.OK);
    }
}