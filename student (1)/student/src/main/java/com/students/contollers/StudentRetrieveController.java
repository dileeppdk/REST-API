package com.students.contollers;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.student.records.Student;
import com.student.records.StudentRegistration;

@Controller
public class StudentRetrieveController {
	
	@RequestMapping(method = RequestMethod.GET, value="/student/allstudent")
	  @ResponseBody
	  public List<Student> getAllStudents() {
		return StudentRegistration.getInstance().getStudentRecords();
	 
	  }

}
