package com.app.entity;


import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name="Student")
public class Student {

    @Id
    @Column(name="studentId")
    private String studentId;

    @Column(name="name")
    private String name;

   @ManyToMany
   @JoinTable(name="student_class",joinColumns = {@JoinColumn(name="studentId")},inverseJoinColumns = {@JoinColumn(name="classId")})
    //@ManyToMany(targetEntity = Classes.class)
    private Set<Classes> classes=new HashSet<Classes>();

    public Set<Classes> getClasses() {
        return classes;
    }

    public void setClasses(Set<Classes> classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return studentId;
    }

    public void setId(String studentId) {
        this.studentId = studentId;
    }
}
