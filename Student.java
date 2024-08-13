package com.example.samplepost;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity(name= "student_data")
@Table



public class Student {
    @Id
    @SequenceGenerator(name = "student_seq" ,sequenceName="student_seq" , initialValue= 100001)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
     int studentId;
     String studentName;
     String studentEmail;

     public Student(){

     }

    public Student(int studentId, String studentName, String studentEmail) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
    }

    public int getStudentId() {

         return studentId;
    }

    public void setStudentId(int studentId) {

         this.studentId = studentId;
    }

    public String getStudentName() {

         return studentName;
    }

    public void setStudentName(String studentName) {

         this.studentName = studentName;
    }

    public String getStudentEmail() {

         return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {

         this.studentEmail = studentEmail;
    }

}

