package repositorys;

import models.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class StudentRepository {
    private static List<Student> students;
    private static int id = 0;

    //TODO тут должна быть база данных
    public StudentRepository(){
        if (students == null){
            students = new ArrayList<>();
            students.add(new Student(Long.valueOf(++id), "Mark", "Polo", "MarkPolo@gmail.com"));
            students.add(new Student(Long.valueOf(++id), "Petr", "Putin", "PetrPut@mail.ru"));
            students.add(new Student(Long.valueOf(++id), "Marija", "Prohorova", "Marija@yandex.ru"));
        }
    }

    public List<Student> getAllStudents(){
        return students;
    }

    public Optional<Student> findById(Long id){
        for (Student student: students){
            if (student.getId() == id){
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }

    //TODO либо обработать вместо итератора через findById()
    public boolean deleteById(Long id){
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getId() == id){
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public void save(Student student){
    student.setId(Long.valueOf(++id));
    students.add(student);
    }
}
