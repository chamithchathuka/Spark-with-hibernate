/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sqldexter.organization;


import com.google.gson.Gson;
import com.sqldexter.organization.entity.Employee;
import com.sqldexter.organization.entity.User;
import com.sqldexter.organization.service.EmployeeService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import jdk.nashorn.internal.objects.NativeArray;
import spark.Request;
import spark.Response;
import spark.Route;

import static spark.Spark.*;
/**
 *
 * @author Chamith
 */
public class Controller {
    public static void main(String[] args) {
        
        get("/hello", (request, response) -> {
                return "hello world";
        });

        post("/hello", (request, response) -> "Hello World: " + request.body());

       
         get("/viewall",new Route() {
            @Override
            public Object handle(Request request, Response response) {
                            String json = new Gson().toJson(UserService.listallusers());
                         response.type("application/json");
                return  json;
            }
        });    
         
         get("/employee/viewall",new Route() {
            @Override
            public Object handle(Request request, Response response) {
                         String json = new Gson().toJson(EmployeeService.listallEmployees());
                         response.type("application/json");
                return  json;
            }
        });    
        
        
        get("/private", (request, response) -> {
            response.status(401);
            return "Go Away!!!";
        });

        post("/users/", (request, response) -> {
    
             User user = (User) JsonUtil.fromJson(request.body(),User.class);
             return user.toString();
            
        });
        
        post("/employee/", (request, response) -> {
    
             Employee employee = (Employee) JsonUtil.fromJson(request.body(),Employee.class);
             return employee.toString();
            
        });
        
        

        get("/news/:section", (request, response) -> {
            response.type("text/xml");
            return "<?xml version=\"1.0\" encoding=\"UTF-8\"?><news>" + request.params("section") + "</news>";
        });

        get("/protected", (request, response) -> {
            halt(403, "I don't think so!!!");
            return null;
        });
        
      

        get("/", (request, response) -> "root");

    }
    

 
}
