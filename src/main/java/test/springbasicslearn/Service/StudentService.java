package test.springbasicslearn.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import test.springbasicslearn.Repository.StudentRepository;

@Bean
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void getStudents() {
        try {

        } catch (Exception e) {

        }
    }
}
