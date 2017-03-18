/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sqldexter.organization;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author Chamith
 */
public class DataBaseConnector {

    private static SessionFactory factory = null;
// Creating SessionFactory using 4.2 version of Hibernate

    public static SessionFactory getSessionFactory()  {
    
            factory = new Configuration().configure().buildSessionFactory();
             return factory;
    }
}
