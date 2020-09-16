package com.springcore;

public class StudentInfo {
  private int studentId;
  private String studentName;
  private String studentAddress;
  private String studentClass;
  private String studentSchoolName;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentAddress() {
	return studentAddress;
}
public void setStudentAddress(String studentAddress) {
	this.studentAddress = studentAddress;
}
public String getStudentClass() {
	return studentClass;
}
public void setStudentClass(String studentClass) {
	this.studentClass = studentClass;
}
public String getStudentSchoolName() {
	return studentSchoolName;
}
public void setStudentSchoolName(String studentSchoolName) {
	this.studentSchoolName = studentSchoolName;
}
public StudentInfo(int studentId, String studentName, String studentAddress, String studentClass,
		String studentSchoolName) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentAddress = studentAddress;
	this.studentClass = studentClass;
	this.studentSchoolName = studentSchoolName;
}
public StudentInfo() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "StudentInfo [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
			+ ", studentClass=" + studentClass + ", studentSchoolName=" + studentSchoolName + "]";
}
  
}
