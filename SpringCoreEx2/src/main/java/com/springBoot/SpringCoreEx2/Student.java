package com.springBoot.SpringCoreEx2;

public class Student {
  private int sId;
  private String sName;
  private String sEmail;
  private String sAddress;
public int getsId() {
	return sId;
}
public void setsId(int sId) {
	this.sId = sId;
}
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}
public String getsEmail() {
	return sEmail;
}
public void setsEmail(String sEmail) {
	this.sEmail = sEmail;
}
public String getsAddress() {
	return sAddress;
}
public void setsAddress(String sAddress) {
	this.sAddress = sAddress;
}
public Student(int sId, String sName, String sEmail, String sAddress) {
	super();
	this.sId = sId;
	this.sName = sName;
	this.sEmail = sEmail;
	this.sAddress = sAddress;
}
@Override
public String toString() {
	return "Student [sId=" + sId + ", sName=" + sName + ", sEmail=" + sEmail + ", sAddress=" + sAddress + "]";
}

}
