package com.java.cleanarch.db.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "student")
@Entity
@Data
public class StudentModel implements Serializable
{
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private int age;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}