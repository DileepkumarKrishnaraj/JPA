package com.samco.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student") 
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int stuId;
	@Column(name = "name")
	private String stuName;
	@Column(name = "department")
	private String stuDep;
	@Column(name = "collegeyear")
	private int stuYear;
	public Student(String stuName, String stuDep, int stuYear) {
		super();
		
		this.stuName = stuName;
		this.stuDep = stuDep;
		this.stuYear = stuYear;
	}
	
	public Student() {
		super();
	}
	
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuDep() {
		return stuDep;
	}
	public void setStuDep(String stuDep) {
		this.stuDep = stuDep;
	}
	public int getStuYear() {
		return stuYear;
	}
	public void setStuYear(int stuYear) {
		this.stuYear = stuYear;
	}
}