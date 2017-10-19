package com.qshuoo.service.impl;

import com.qshuoo.dao.impl.StudentDaoImpl;
import com.qshuoo.pojo.Student;
import com.qshuoo.service.StudentService;

public class StudentServiceImpl implements StudentService {

	private StudentDaoImpl studentDaoImpl;
	
	
	public StudentDaoImpl getStudentDaoImpl() {
		return studentDaoImpl;
	}


	public void setStudentDaoImpl(StudentDaoImpl studentDaoImpl) {
		this.studentDaoImpl = studentDaoImpl;
	}


	@Override
	public void saveStudent(Student student) {
		studentDaoImpl.saveStudent(student);
	}

}
