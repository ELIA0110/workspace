package edu.kh.oarr.view;

import java.util.Scanner;

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
			case 1 :  break;
			case 2 :  break;
			case 3 :  break;
			case 4 : break;
			case 5 : break;
			case 6 :  break;
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
	
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	

	
	
}
