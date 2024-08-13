package com.example.samplepost;


import ch.qos.logback.core.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping("/api")
    @ResponseBody
    public String index(){
        return "Welcome to studnet API";
    }

    @PostMapping("/addstudent")
    @ResponseBody
    public String addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return "Student Added";

    }

    @PostMapping("/updatestudent")
    @ResponseBody
    public String UpdateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
        return "Student Updated";
    }

    @RequestMapping("/getstudentlist")
    @ResponseBody
    public List<Student> getStudentList(){
        return studentService.getStudentList();

    }

    @RequestMapping("/getstudent/{studentId}")
    @ResponseBody
    public Student getstudent(@PathVariable int studentId){

        return studentService.getStudent(studentId);
    }
//    @Controller
//    @RequestMapping("/")
//    public class StudentWebController {
//        @RequestMapping(value = "/welcome")
//        public String homePage(Model model) {
//            model.addAttribute("appName", "This is Sample Thymeleaf APP");
//            return "welcome";
//        }
    @RequestMapping("/home")
    public String home(){

        return "index";
    }

    @RequestMapping("/home")
            public String home(Model model) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        model.addText("appVersion");
        model.addText("date");
        return "index";
    }
}
