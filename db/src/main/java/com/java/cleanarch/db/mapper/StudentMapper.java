package com.java.cleanarch.db.mapper;

import com.java.cleanarch.db.model.StudentModel;
import com.java.cleanarch.entities.Student;

public class StudentMapper
{
    private StudentMapper()
    {}

    public static Student toEntity(StudentModel model)
    {
        if (model == null)
        {
            return null;
        }

        Student student = new Student();
        student.setName(model.getName());
        student.setAge(model.getAge());

        return student;
    }
}