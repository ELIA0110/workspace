package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	// 실습 문제 1
	/* 키보드로 입력 받은 정수가 양수이면서 짝수일 때만 “짝수입니다.”를 출력하고
	   짝수가 아니면 “홀수입니다.“를 출력하세요.
	   양수가 아니면 “양수만 입력해주세요.”를 출력하세요.

		[실행 화면 1]
		숫자를 한 개 입력하세요 : 8
		짝수입니다.

		[실행 화면 2]
		숫자를 한 개 입력하세요 : 17
		홀수입니다.

		[실행 화면 3]
		숫자를 한 개 입력하세요 : -3
		양수만 입력해주세요.
	 */
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num1 = sc.nextInt();
		
		if(num1 <= 0) {
			System.out.println("양수만 입력해주세요.");
		} else if(num1 % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		/* if(input >0 && input %2 == 0) {
		 * System.out.println("짝수입니다.");
		 * }
		 * else if(input > 0 && input % 2 != 0) {
		 * System.out.println("홀수입니다.");
		 * } else {
		 * System.out.println("양수만 입력해주세요.");
		 * }
		 */
	}
	
	// 실습 문제 2
		/* 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		   합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
			(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)

			합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
			불합격인 경우에는 “불합격입니다.”를 출력하세요.
		 * 
		 * [실행화면 1] 		[실행화면 2]
			국어점수 : 88 		국어점수 : 88
			수학점수 : 50 		수학점수 : 50
		    영어점수 : 40 		영어점수 : 45
			불합격입니다. 		국어 : 88
								수학 : 50
								영어 : 45
								합계 : 183
								평균 : 61.0
								축하합니다, 합격입니다!
		 */
	
		public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
			
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
			
		System.out.print("수학점수 : ");
		int mat = sc.nextInt();
		
		int sum = kor + eng + mat;
		double avg = sum / 3;
		
		if(kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60) {
			System.out.println("국어 : " + kor);
			System.out.println("영어 : " + eng);
			System.out.println("수학 : " + mat);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
			
		} else {
			System.out.println("국어 : " + kor);
			System.out.println("영어 : " + eng);
			System.out.println("수학 : " + mat);
			System.out.println("불합격입니다.");
		}
			
	}
		
	// 실습 문제 3
	/* 1~12 사이의 수를 입력 받아 해당 달의 일수를 출력하세요.(2월 윤달은 생각하지 않습니다.)
		잘못 입력한 경우 “OO월은 잘못 입력된 달입니다.”를 출력하세요. (switch문 사용)

		[실행화면 1]
		1~12 사이의 정수 입력 : 8
		8월은 31일까지 있습니다.
		[실행화면 2]
		1~12 사이의 정수 입력 : 99
		99월은 잘못 입력된 달입니다.
	 */
		
		
		public void practice3() {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		int day;
		
		switch(month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :day = 31; break;
		case 4 : case 6 : case 9 : case 11 : day = 30; break;
		default : day = 0; // 요부분 헷갈리니까 중요!! int day = 0;로 설정할거면 default는 안써도된다.
		}
		
		if(day != 0) {
			System.out.printf("%d월은 %s일까지 있습니다 ",month,day);
		} else {
			System.out.printf("%d월은 잘못 입력된 달입니다.",month);
		}
		
		
		
		
	}	
	// 실습 문제 4
	/* 키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
		저체중/정상체중/과체중/비만을 출력하세요.

		BMI = 몸무게 / (키(m) * 키(m))
		BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
		BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
			BMI가 30이상일 경우 고도 비만

		[실행 화면]
		키(m)를 입력해 주세요 : 1.65
		몸무게(kg)를 입력해 주세요 : 58.4
		BMI 지수 : 21.45087235996327
		정상체중
	 * 
	 */
		
		public void practice4() {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("키를 입력해주세요 : ");
		double h = sc.nextDouble();
		
		System.out.print("몸무게를 입력해주세요 : ");
		int w = sc.nextInt();
		
		double BMI = w / (h * h);
		
		String con;
		if(BMI >= 30) {
			con = "고도 비만";
		} else if(BMI >= 25) {
			con = "비만" ;
		} else if(BMI >= 23) {
			con = "과체중";
		} else if(BMI >= 18.5) {
			con = "정상체중";
		} else  {
			con = "저체중";
		}
		System.out.println("BMI 지수 : " + BMI);
		System.out.println(con);
		
		
	}	
	// 실습 문제 5
	/* 중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 Pass 또는 Fail을 출력하세요.
		평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
		이 때, 출석 횟수는 총 강의 횟수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
		70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
	 * 
	 * [실행 화면 1]
		중간 고사 점수 : 80
		기말 고사 점수 : 30	
		과제 점수 : 60
		출석 횟수 : 18
		================= 결과 =================
		중간 고사 점수(20) : 16.0
		기말 고사 점수(30) : 9.0
		과제 점수 (30) : 18.0
		출석 점수 (20) : 18.0
		총점 : 61.0
		Fail [점수 미달]
	 */
		
		public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int mid = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		int fin = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int work = sc.nextInt();
		
		System.out.print("출석 횟수 : ");
		int att = sc.nextInt();
		
		System.out.println("================결과================");
		
		// 출석 횟수가 부족한 경우 
		if(att <= 14) {
			System.out.printf("Fail [출석 횟수 부족(%d/20)]",att);
		} else { // 출석은 잘 했을 때
			double midScore = mid * 0.2;
			double finScore = fin * 0.3;
			double workScore = work * 0.3;
			double attScore = att;
			
			double sum = midScore + finScore + workScore + attScore;
			
			System.out.println("중간 고사 점수 (20) : " + midScore);
			System.out.println("기말 고사 점수 (30) : " + finScore);
			System.out.println("과제 점수 (30) : " + workScore);
			System.out.println("출석 점수 (20) : " + attScore);
			System.out.println("총점 : " + sum);
			
			if(sum >= 70) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail [점수미달]");
			}
		}
		
		
		
		
		
	}	




}
