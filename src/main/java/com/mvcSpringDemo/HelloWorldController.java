package com.mvcSpringDemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    //need a controller method to the initial HTML form
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    //need a controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    //method to add data to the model
    @RequestMapping("/processFormTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){
        //read the request parameter from html form
        String theName = request.getParameter("studentName");
        theName = theName.toUpperCase();
        String result = "Yo! " + theName;
        //add the message to the model
        model.addAttribute("message", result);
        return "helloworld";
    }

    //method to add data to the model
    @RequestMapping("/processFormThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model){
        theName = theName.toUpperCase();
        String result = "Yo! " + theName;
        //add the message to the model
        model.addAttribute("message", result);
        return "helloworld";
    }
}
