package com.Railworld.SpringBootWeb1;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HomeController {

    @RequestMapping
    public String home(){
        System.out.println("Home method called");
        return "index";
    }

//    @RequestMapping("add")
//    public String add(HttpServletRequest request, HttpSession session){
//        int num1 = Integer.parseInt(request.getParameter("num1"));
//        int num2 = Integer.parseInt(request.getParameter("num2"));
//        int result = num1 + num2;
////        System.out.println(result); // prints data on console but if we want to print data on the page we use HttpSession
//        session.setAttribute("r1", result);
//        return "result.jsp";
//    }

//     @RequestMapping("add")
//    public String add(int num1, int num2, HttpSession session){ // its basically matching the num1 and num2 names in index.jsp
//      public String add(@RequestParam("num1") int number1, int num2, HttpSession session){ // if we have different names then we can use @RequestParam("originalName")
//        int result = number1 + num2;
//        session.setAttribute("r1", result);
//        return "result.jsp";
//    }

//     @RequestMapping("add")
//    public String add(int num1, int num2, Model model){
//
//        int result = num1 + num2;
//        model.addAttribute("r1",result);
//        return "result";
//    }

     @RequestMapping("add")
    public ModelAndView add(int num1, int num2, ModelAndView modelAndView){
        int result = num1 + num2;
        modelAndView.addObject("r1",result);
        modelAndView.setViewName("result");
        return modelAndView;
    }
}
