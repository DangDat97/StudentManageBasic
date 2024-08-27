package eadtest.ead.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import eadtest.ead.entity.Student;
import org.springframework.ui.Model;
import eadtest.ead.repository.StudentRepository;
import eadtest.ead.service.StudentService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentService studentService;

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private HttpSession session;

    @GetMapping("/student/index")
    public String getListStudent(Model model) {

        List<Student> list = studentRepository.findAll();
        model.addAttribute("ds", list);

        return "layout-admin-bs4.html";
    }

}
