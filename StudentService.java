package com.example.samplepost;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student addStudent(Student student){

        return studentRepository.save(student);
    }
    public List<Student> getStudentList(){
        return studentRepository.findAll();

    }

    public  Student getStudent(int studentID){

        return studentRepository.findById(studentID).orElse(null);
    }

    public void updateStudent(Student student){

        studentRepository.save(student);
    }
    public void deleteStudent(int studentId){

        studentRepository.deleteById(studentId);
    }
}
