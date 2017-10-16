package com.app.config;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.internal.SessionFactoryBuilderImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.internal.SessionFactoryImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import javax.validation.Valid;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;


@Configuration
//@PropertySource(value = {"classpath:application.properties"})
public class Database {

    @Bean
    SessionFactory sessionFactory(EntityManagerFactory entityManagerFactory) throws IOException{
        HibernateJpaSessionFactoryBean sessionFactory=new HibernateJpaSessionFactoryBean();
        sessionFactory.setEntityManagerFactory(entityManagerFactory);
        return sessionFactory.getObject();
    }

}
