package com.deeptech.spring1;

public class Student {
private int studentid;
private String student_name;
public int getStudentid() {
	return studentid;
}
public void setStudentid(int studentid) {
	this.studentid = studentid;
}
public String getStudent_name() {
	return student_name;
}
public void setStudent_name(String student_name) {
	this.student_name = student_name;
}
void display() {
	System.out.println("student id "+studentid);
	System.out.println("student name "+student_name);
}
}
