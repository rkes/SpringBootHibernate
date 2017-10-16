package com.app.services;


import com.app.entity.Classes;
import com.app.entity.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Set;

@Service
public class SchoolService {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public  boolean addStudentToClass(Student student){
        Session session=sessionFactory.getCurrentSession();
        Transaction transaction=session.beginTransaction();

        for(Classes classes:student.getClasses())
            session.save(classes);

        session.save(student);
        transaction.commit();
        return true;
    }

}
