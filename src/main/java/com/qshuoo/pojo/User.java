package com.qshuoo.pojo;

import java.util.List;
import java.util.Map;

public class User {
	
	private int id;
	private String name;
	private School school;
	private List<String> lesson;
	private Map<String, Integer> grade;
	public User() {
		super();
	}


	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	

	public School getSchool() {
		return school;
	}


	public void setSchool(School school) {
		this.school = school;
	}


	public List<String> getLesson() {
		return lesson;
	}


	public void setLesson(List<String> lesson) {
		this.lesson = lesson;
	}


	public Map<String, Integer> getGrade() {
		return grade;
	}


	public void setGrade(Map<String, Integer> grade) {
		this.grade = grade;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", school=" + school + ", lesson=" + lesson + ", grade=" + grade
				+ "]";
	}


	
	

}
