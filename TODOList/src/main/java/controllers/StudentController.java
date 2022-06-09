package controllers;

import models.Student;
import services.StudentService;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public String students (Model model){
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

    @GetMapping("/students/new")
    public String addStudent(Model model){
        Student student = new Student();
        model.addAttribute("student", student);
        return "new student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute Student student){
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("students/delete/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }

}
