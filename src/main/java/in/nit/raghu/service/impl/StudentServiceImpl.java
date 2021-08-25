package in.nit.raghu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import in.nit.raghu.repo.StudentRepository;
import in.nit.raghu.service.IStudentService;

public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentRepository studentRepo;

}
