package com.app.entity;


import javax.persistence.*;

@Entity
@Table(name="Class")
public class Classes {

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Id
    @Column(name="classId")
    private String classId;

    @Column(name="name")
    private String className;


}
