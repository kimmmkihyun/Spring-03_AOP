package com.spring.ex4;

public class StudentImpl implements Student{

	private String name;
	private int age;
	private int gradeNum;
	private int classNum;
	
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
	public int getGradeNum() {
		return gradeNum;
	}
	public void setGradeNum(int gradeNum) {
		this.gradeNum = gradeNum;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	
	@Override
	public void getStudentInfo() { //�ٽɱ��
		System.out.println("�̸� : " + getName());
		System.out.println("���� : " + getAge());
		System.out.println("�г� : " + getGradeNum());
		System.out.println("�� : " + getClassNum());
	}
	
}