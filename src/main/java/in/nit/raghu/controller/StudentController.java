package in.nit.raghu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import in.nit.raghu.service.IStudentService;

@Controller
public class StudentController {

	@Autowired
	private IStudentService service;

}
