package com.java.cleanarch.config;

import com.java.cleanarch.db.StudentAdapterImpl;
import com.java.cleanarch.usecases.adapter.StudentAdapter;
import com.java.cleanarch.usecases.student.FindStudentByNameUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig
{
    @Bean
    public FindStudentByNameUseCase findStudentByNameUseCase(StudentAdapter studentAdapter)
    {
        return new FindStudentByNameUseCase(studentAdapter);
    }

    @Bean
    public StudentAdapter studentAdapter()
    {
        return new StudentAdapterImpl();
    }
}