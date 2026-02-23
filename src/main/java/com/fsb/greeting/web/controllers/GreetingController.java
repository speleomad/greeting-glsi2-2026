package com.fsb.greeting.web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.http.HttpStatus;

import com.fsb.greeting.web.models.User;

@Controller
public class GreetingController {
    
    //@RequestMapping("/greeting") //Get  http://localhost:8080/greeting?name="demo"&age="20"
     @RequestMapping({"/","/greeting"}) 
   // @ResponseBody
    public String greeting(@RequestParam(value="name", required=false, defaultValue = "world") String otherName, 
                           @RequestParam() int age, // par defaut age est obligatoir
                           Model model){
          String name="Demo";
          String [] names=new String[]{"Sabri","Islem","Toto"};
          List<User> users=new ArrayList<>();
          users.add(new User("demo1","super-admin"));
          users.add(new User("demo2","admin"));
          users.add(new User("demo3","user"));


         // model.addAttribute("myName", name);
         model.addAttribute("myName", otherName);
         model.addAttribute("age", age);
         model.addAttribute("names", names);
         model.addAttribute("users", users);
       // return "<h1>"+ name+"</h1>";
        return "greeting-view";
    }
       
    @RequestMapping("/products") //Get  http://localhost:8080/products
    public String getAllProduct(){

        //todo
        return "products";
    }


}