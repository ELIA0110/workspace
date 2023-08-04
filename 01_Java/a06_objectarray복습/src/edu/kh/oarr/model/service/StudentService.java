package edu.kh.oarr.model.service;

import java.util.Random;

import edu.kh.oarr.model.dto.Student;

public class StudentService {

	private Student[] studentArr = new Student[10];
	
	public StudentService() {
		
		studentArr[0] = new Student(1,2,3, "홍길동");
		studentArr[1] = new Student(2,3,4, "박철수");
		studentArr[2] = new Student(3,4,5, "최미영");
		
		Random random = new Random();
		
		for(int i=0 ; i<studentArr.length ; i++) {
			
			if(studentArr[i] == null) {
				break;
			}
			
			studentArr[i].setKor(random.nextInt(101));
			studentArr[i].setEng(random.nextInt(101));
			studentArr[i].setMath(random.nextInt(101));
		}
	}

	public boolean addStudent(int grade, int ban, int number, String name) {
		// TODO Auto-generated method stub
		for(int i=0 ; i<studentArr.length ; i++) {
			
			if(studentArr[i] == null) {
				
				studentArr[i] = new Student(grade, ban, number, name);
				return true;
			}
		}
		
		return false;
		
		
	}
	
	
	
	
	
	
}
