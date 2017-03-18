/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sqldexter.organization;

import com.sqldexter.organization.entity.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Chamith
 */
public class UserService {
     private static SessionFactory factory = DataBaseConnector.getSessionFactory();
    
   public static void saveUser(User user){
    
     
       Session session = factory.openSession();
       Transaction tx = null;
       try{
         tx = session.beginTransaction();
        
        session.save(user); 
         tx.commit();
         
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
        
      }finally {
         session.close(); 
      }
       
   }
   
    public static List<User> listallusers( ){
      Session session = factory.openSession();
      Transaction tx = null;
      List<User> users = new ArrayList<>();
      try{
         tx = session.beginTransaction();
        users = session.createQuery("FROM User").list(); 
         for (Iterator iterator = users.iterator(); iterator.hasNext();){
            User user = (User) iterator.next(); 
            
            System.out.println("  USer: " + user.getUsername()); 
         }
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
      return users;
   }
   
}
