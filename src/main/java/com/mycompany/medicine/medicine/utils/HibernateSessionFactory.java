package com.mycompany.medicine.medicine.utils;

import com.mycompany.medicine.medicine.model.Doctor;
import com.mycompany.medicine.medicine.model.Records;
import com.mycompany.medicine.medicine.model.Speciality;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory {
    private static SessionFactory sessionFactory;

    private HibernateSessionFactory() {}

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(Doctor.class);
                configuration.addAnnotatedClass(Speciality.class);
                configuration.addAnnotatedClass(Records.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());

            } catch (Exception e) {
                System.out.println("Внимание! Исключение!" + e);
            }
        }
        return sessionFactory;
    }
}
