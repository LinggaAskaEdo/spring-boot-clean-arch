package com.java.cleanarch.db;

import com.java.cleanarch.db.mapper.StudentMapper;
import com.java.cleanarch.db.model.StudentModel;
import com.java.cleanarch.entities.Student;
import com.java.cleanarch.usecases.adapter.StudentAdapter;

public class StudentAdapterImpl implements StudentAdapter
{
    private StudentRepository studentRepository;

    @Override
    public Student findByName(String name)
    {
        StudentModel findByName = studentRepository.findByName(name);

        return StudentMapper.toEntity(findByName);
    }
}