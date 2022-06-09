package services;

import models.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Boolean deleteStudentById(Long id);
    Student getStudentById(Long id);
}
