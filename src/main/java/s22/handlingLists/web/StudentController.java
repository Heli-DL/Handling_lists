package s22.handlingLists.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import s22.handlingLists.domain.Student;

@Controller
public class StudentController {

	@GetMapping("/hello")
	public String showStudents (Model model) {

		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Kate", "Cole"));
		students.add(new Student("Dan", "Brown"));
		students.add(new Student("Mike", "Mars"));
		
		model.addAttribute("studentlist", students);
		return "studentlist";
		}
	
}