package org.hibernate.tutorial.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.internal.StandardServiceRegistryImpl;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
    private static SessionFactory sessionFactory = buildSessionFactory();
    public static final String CFG_XML = "/hibernate.cfg.xml";
    private static SessionFactory buildSessionFactory() {
        Configuration configuration = new Configuration().configure(CFG_XML);
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        StandardServiceRegistryImpl registry = (StandardServiceRegistryImpl) builder.build();
        SessionFactory sessionFactory = configuration.buildSessionFactory(registry);

        return  sessionFactory;
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    public static Session getSession(){
        return  sessionFactory.openSession();
    }
    public static void shutdown() {
        getSession().close();
       // getSessionFactory().close();
    }
}