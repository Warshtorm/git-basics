package services.impl;

import models.Student;
import repositorys.StudentRepository;
import services.StudentService;
import java.util.List;

@Service
public class StudentsServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentsServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents(){
        return studentRepository.getAllStudents();
    }

    @Override
    public Student saveStudent(Student student) {
        studentRepository.save(student);
        return student;
    }

    @Override
    public Boolean deleteStudentById(Long id) {
        return studentRepository.deleteById(id);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }
}
