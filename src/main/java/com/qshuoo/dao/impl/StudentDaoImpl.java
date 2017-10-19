package com.qshuoo.dao.impl;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.qshuoo.dao.StudentDao;
import com.qshuoo.pojo.Student;

public class StudentDaoImpl implements StudentDao{

	private HibernateTemplate hibernateTemplate;
	
	
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}




	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}




	@Override
	public void saveStudent(Student student) {
		hibernateTemplate.save(student);
		
	}

}
