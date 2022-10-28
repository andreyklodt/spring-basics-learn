package test.springbasicslearn.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.springbasicslearn.Service.StudentService;

@RestController
@RequestMapping("api/students")
public class StudentController {

    final
    StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public void getAllStudents(){

    }

}
