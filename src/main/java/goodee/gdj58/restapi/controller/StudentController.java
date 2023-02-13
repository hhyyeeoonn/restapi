package goodee.gdj58.restapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import goodee.gdj58.restapi.vo.Student;

@Controller // 리턴타입은 뷰이름 (restcontroller면 json 객체가 리턴타입이 됨)
public class StudentController {
	@GetMapping("/addStudent")
	public String addStudent() {
		return "addStudent";
	}
	@PostMapping("/addStudent")
	public String addStudent(Student student) {
		return "redirect:/";
	}
}
