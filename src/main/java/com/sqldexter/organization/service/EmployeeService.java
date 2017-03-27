/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sqldexter.organization.service;

import com.sqldexter.organization.DataBaseConnector;
import com.sqldexter.organization.entity.Employee;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


/**
 *
 * @author ESOFT
 */
public class EmployeeService {
    
    
     private static SessionFactory factory = DataBaseConnector.getSessionFactory();
    
    public static List<Employee> listallEmployees( ){
      Session session = factory.openSession();
      Transaction tx = null;
      List<Employee> employees = new ArrayList<>();
      try{
         tx = session.beginTransaction();
        employees = session.createQuery("FROM Employee").list(); 
         for (Iterator iterator = employees.iterator(); iterator.hasNext();){
            Employee employee = (Employee) iterator.next(); 
            
            System.out.println(" Employee: " + employee.getFirstName()); 
         }
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
      return employees;
   }
    
    
    public boolean addEmployee(Employee employee){
        boolean status = false;
    
        Session session = factory.openSession();
       Transaction tx = null;
       try{
         tx = session.beginTransaction();
        
        session.save(employee); 
         tx.commit();
         status = true;
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
         
        
      }finally {
         session.close(); 
      }
        
    
        return status;
    }
    
    
}
