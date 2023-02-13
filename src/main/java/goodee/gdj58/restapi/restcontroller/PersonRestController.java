package goodee.gdj58.restapi.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import goodee.gdj58.restapi.service.PersonService;

@RestController // 일반요청(뷰)은 불가 rest요청만 가능
//@Transactional // 서비스를 만들지 않고 컨트롤러에서 모두 처리
@CrossOrigin
public class PersonRestController {
	@Autowired PersonService personService;
	
	// 일반 타입의 리턴타입은 뷰의 이름
	// restController의 리턴타입은 모델객체 -> RestController 애노테이션에 의해서 JSON문자열로 변경
	@GetMapping("/personList")
	public List personList() {
		return personService.getPersonList(); // 리턴값이 RestController 애노테이션에 의해서 JSON문자열로 변경
	}
}
