package com.springcore;

public class Teacher {
  private int teacherId;
  private String teacherName;
  private String teacherstate;
public int getTeacherId() {
	return teacherId;
}
public void setTeacherId(int teacherId) {
	this.teacherId = teacherId;
}
public String getTeacherName() {
	return teacherName;
}
public void setTeacherName(String teacherName) {
	this.teacherName = teacherName;
}
public String getTeacherstate() {
	return teacherstate;
}
public void setTeacherstate(String teacherstate) {
	this.teacherstate = teacherstate;
}
public Teacher(int teacherId, String teacherName, String teacherstate) {
	super();
	this.teacherId = teacherId;
	this.teacherName = teacherName;
	this.teacherstate = teacherstate;
}
public Teacher() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", teacherstate=" + teacherstate + "]";
}
  
}
