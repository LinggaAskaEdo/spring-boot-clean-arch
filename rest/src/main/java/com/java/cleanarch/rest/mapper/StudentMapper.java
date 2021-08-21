package com.java.cleanarch.rest.mapper;

import com.java.cleanarch.entities.Student;
import com.java.cleanarch.rest.dto.StudentDto;

public class StudentMapper
{
    private StudentMapper()
    {}

    public static StudentDto toDto(Student entity)
    {
        if (entity == null)
        {
            return null;
        }

        StudentDto studentDto = new StudentDto();
        studentDto.setName(entity.getName());
        studentDto.setAge(entity.getAge());

        return studentDto;
    }
}