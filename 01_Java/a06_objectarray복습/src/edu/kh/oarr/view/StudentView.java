package edu.kh.oarr.view;

import java.util.Scanner;

import edu.kh.oarr.model.dto.Student;
import edu.kh.oarr.model.service.StudentService;

public class StudentView {

	private Scanner sc = new Scanner(System.in);
	private StudentService service = new StudentService();
	
	public void displayMenu() {
		
		int input = 0;
		
		do {
			System.out.println("\n----- 학생 관리 프로그램-----");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 전체 조회");
			System.out.println("3. 학생 1명 정보 조회(인덱스)");
			System.out.println("4. 학생 이름으로 조회");
			System.out.println("5. 학생 정보 수정(인덱스)");
			System.out.println("6. 학생 1명 점수 조회(점수, 합계, 평균)");
			System.out.println("7. 평균 최고점, 최저점 학생");
			
			System.out.println("0. 종료");
			
			System.out.print("메뉴 선택 : ");
			input = sc.nextInt();
			
			switch(input) {
			case 1 : System.out.println(addStudent()); break;
			case 2 : selectAll(); break;
			case 3 : selectIndex(); break;
			case 4 : //selectName(); break;
			case 5 : //updateStudent(); break;
			case 6 : //selectScore(); break;
			case 7 : break;
			
			case 0 : System.out.println("[프로그램 종료]"); break;
			default : System.out.println("잘못 입력");
			
			}
		} while(input != 0);
		
	}
	
	private String addStudent() {
		System.out.println("\n-----학생 추가-----");
		
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		
		System.out.print("반 : ");
		int ban = sc.nextInt();
		
		System.out.print("번호 : ");
		int number = sc.nextInt();
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		
		boolean result = service.addStudent(grade, ban, number, name);
		
		if(result) {
			
			return name + "학생이 추가되었습니다";
		} else {
			
			return "학생을 더 이상 추가할 수 없습니다";
			
		}
	}
	
	private void selectAll() {
		
		System.out.println("\n-----학생 전체 조회-----\n");
		
		Student[] arr = service.selectAll();
		
		for(Student s : arr) {
			
			if(s == null) {
				break;
			}
			
			System.out.println(s.toString());
		}
		
	}
	
	
	private void selectIndex() {
		System.out.println("\n-----학생 1명 정보 조회(인덱스)-----");
		
		System.out.print("조회할 학생의 인덱스 번호를 입력하세요 : ");
		int index = sc.nextInt();
		
		Student s = service.selectIndex(index);
		
		if(s == null) {
			System.out.println("해당 인덱스에 학생 정보가 존재하지 않습니다");
			return;
		}else {
			System.out.println("학년 : " + s.getGrade());
			System.out.println("반 : " + s.getBan());
			System.out.println("번호 : " + s.getNumber());
			System.out.println("이름 : " + s.getName());
			System.out.println("국어 점수 : " + s.getKor() + "점");
			System.out.println("영어 점수 : " + s.getEng() + "점");
			System.out.println("수학 점수 : " + s.getMath() + "점");
		}
		
	}
	
		
	private void selectScore() {
		System.out.println("\n-----학생 1명 점수 조회(점수, 합계, 평균)-----");
		
		System.out.print("점수를 조회할 학생의 인덱스 번호를 입력하세요 : ");
		int index = sc.nextInt();
		
		String str = service.selectScore(index);
		
		System.out.println(str);
		
		
	}
		
		
	private void updateStudent() {
		
		System.out.println("\n-----학생 정보 수정(인덱스)-----");
		
		System.out.println("수정할 학생의 인덱스 번호를 입력하세요 : ");
		int index = sc.nextInt();
		
		Student s = service.selectIndex(index);
		
		if(s == null) {
			System.out.println("해당 인덱스에 학생 정보가 존재하지 않습니다.");
			return;
		}
		System.out.print("수정할 국어 점수 : ");
		int kor = sc.nextInt(); 
		
		System.out.print("수정할 영어 점수 : ");
		int eng = sc.nextInt(); 
		
		System.out.print("수정할 수학 점수 : ");
		int math = sc.nextInt(); 
		
		service.updateStudent(s, kor, eng, math);
		
		System.out.println("수정되었습니다.");
	}
		
	
	public void selectName() {
		System.out.println("\n-----학생 이름으로 조회-----");
		
		System.out.println("조회할 학생 이름을 입력하세요 : ");
		
		String name = sc.next();
		
		// 이름이 일치하는 모든 학생을 조회하는 서비스 호출
		Student[] arr = service.selectName(name);
		
		if(arr == null) {
			System.out.println("일치하는 학생이 없습니다");
			return;
		}
		for(Student s : arr) {
			System.out.println(s.toString());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
		
	

	
	
}
