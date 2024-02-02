package exercises.students.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import exercises.students.domain.Student;

@Controller
public class StudentController {

    @GetMapping("/hello")
    public String showStudents(Model model) {

        // We don't have database so lets hard code some values
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kate", "Cole"));
        students.add(new Student("Dan", "Brown"));
        students.add(new Student("Mike", "Mars"));

        model.addAttribute("students", students);
        return "studentList";

    }
}
