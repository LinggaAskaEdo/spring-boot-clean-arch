package com.java.cleanarch.usecases.adapter;

import com.java.cleanarch.entities.Student;

public interface StudentAdapter
{
    Student findByName(String name);
}