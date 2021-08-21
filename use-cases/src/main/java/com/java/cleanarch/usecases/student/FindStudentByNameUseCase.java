package com.java.cleanarch.usecases.student;

import com.java.cleanarch.entities.Student;
import com.java.cleanarch.usecases.adapter.StudentAdapter;

public class FindStudentByNameUseCase
{
    private final StudentAdapter studentAdapter;

    public FindStudentByNameUseCase(StudentAdapter studentAdapter)
    {
        this.studentAdapter = studentAdapter;
    }

    public Student find(String name)
    {
        return studentAdapter.findByName(name);
    }
}