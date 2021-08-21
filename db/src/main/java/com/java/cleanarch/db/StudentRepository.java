package com.java.cleanarch.db;

import com.java.cleanarch.db.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel, Long>
{
    StudentModel findByName(String name);
}