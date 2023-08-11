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
		for(int i=0 ; i<studentArr.length ; i++) {
			
			if(studentArr[i] == null) {
				
				studentArr[i] = new Student(grade, ban, number, name);
				return true;
			}
		}
		
		return false;
		
		
	}

	
	public Student[] selectAll() {
		return studentArr;
	}

	
	
	public Student selectIndex(int index) {
		
		if(index < 0 || index >= studentArr.length || studentArr[index] == null ) {
			
			return null;
		}
		return studentArr[index];
		
	}

	
	public String selectScore(int index) {
		
		if( index < 0 || index >= studentArr.length || studentArr[index] == null) {
			
			return "해당 인덱스에 학생 정보가 존재하지 않습니다.";
		}
		Student s = studentArr[index];
		
		int sum = s.getKor() + s.getEng() + s.getMath();
		
		return String.format("[%s] 국어:%d, 영어: %d, 수학:%d, 합계:%d, 평균:%.1f",
				s.getName(), s.getKor(), s.getEng(), s.getMath(), sum, sum/3.0);
	}
	
	
	public void updateStudent(Student s, int kor, int eng, int math) {
		
		s.setKor(kor);
		s.setEng(eng);
		s.setMath(math);
		
	}

	public Student[] selectName(String name) {
		return null;
	}
	
	
	
	
}
