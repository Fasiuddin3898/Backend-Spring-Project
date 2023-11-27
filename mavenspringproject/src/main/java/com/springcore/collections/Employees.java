package com.springcore.collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employees {
	private String empName;
	private List<String> empPhones;
	private Set<String> empAddress;
	private Map<String,String> courses;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getEmpPhones() {
		return empPhones;
	}
	public void setEmpPhones(List<String> empPhones) {
		this.empPhones = empPhones;
	}
	public Set<String> getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(Set<String> empAddress) {
		this.empAddress = empAddress;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Employees(String empName, List<String> empPhones, Set<String> empAddress, Map<String, String> courses) {
		super();
		this.empName = empName;
		this.empPhones = empPhones;
		this.empAddress = empAddress;
		this.courses = courses;
	}
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
