package com.student.records;

public class StudentRegistrationReply {
	
	String name;
    int age;
    String id;
    String regNumber;
    String registrationStatus;
    public String getName() {
    return name;
    }
    public void setName(String name) {
    this.name = name;
    }
    public int getAge() {
    return age;
    }
    public void setAge(int age) {
    this.age = age;
    }
    public String getRegNumber() {
    return regNumber;
    }
    public void setRegNumber(String regNumber) {
    this.regNumber = regNumber;
    }
    public String getRegistrationStatus() {
    return registrationStatus;
    }
    public void setRegistrationStatus(String registrationStatus) {
    this.registrationStatus = registrationStatus;
    }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}


}
