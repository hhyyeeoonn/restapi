package goodee.gdj58.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import goodee.gdj58.restapi.mapper.StudentMapper;

@Service
public class StudentService {
	@Autowired StudentMapper studentMapper;
	public String getStudentId(String studentId) {
		
		String resultStr = "NO"; // 사용할 수 없는 아이디면 NO 반환
		
		if(studentMapper.selectStudentId(studentId) == null) {
			resultStr = "YES"; // 사용할 수 있는 아이디면 YES 반환
		}
		
		return resultStr;
	}
}
