package edu.kh.variable;

public class VariableEx8 {

	public static void main(String[] args) {
	
	
	/* 형변환(casting) : 값의 자료형을 변환하는 것
	 * 형변환이 왜 필요한가?
	 * ->컴퓨터의 값 처리 원칙을 위해하는 경우를 해결하기 위해 
	 *   (같은 자료형끼리 연산, 결과도 같은 자료형)
	 */
	
	/* 자동 형변환
	 * - [값의 범위]가 서로 다른 값의 연산 시 
	 *   <컴파일러(번역기)>가 자동으로 
	 *   [값의 범위]가 작은 자료형을 큰 자료형으로 변경
	 */   
	 
	// <자동 형변환 확인 1> 
	int num1 = 10;
	long num2 = 100L;
	
	long result1 = num1 + num2; 
	// 10(int) + 100L(long)
	// 10L(long) + 100L(long) == 110L(long)
	
	System.out.println("result1 : " + result1);
	
	// <자동 형변환 확인 2>
	int num3 = 300;
	double num4 = 12.3;
	
	double result2 = num3 + num4;
	// 300(int) + 12.3(double)
	// 300(double) + 12.3(double)
	
	// 300 + 12.3 = 312.3 출력
    System.out.println(num3 + " + " + num4 + " = " + result2);
	
	
	// <자동 형변화 확인 3> 
    
    char ch1 = 'A';
    // 문자 A가 저장되는게 아니라
    // 유니코드 표에서 A에 대응되는 값 65(u0041)가 저장됨
    
    int result3 = ch1 + 0;
    
    // (char)'A' + (int)0
    // (int) 65 + (int)0 = (int) 65
    
    System.out.println("result3 : " + result3);
    
    /* 강제 형변환
     * 1) 값의 범위가 큰 자료형을 값의 범위가 작은 자료형으로 변경
     * 2) 값의 범위 관계 없이 원하는 자료형으로 변경
     * 
     * 형변환 연산자 : (자료형)
     */
    
    // <강제 형변환 확인 1> : 실수 -> 정수 (데이터 손실)
    double test1 = 3.14;
    
    //int test2 = test1;
    //double 자료형을 int로 바꿀 수 없다.
    
    int test2 = (int)test1; // int로 강제 형변환
    // 실수 -> 정수 강제 형변환 시 소수점 아래를 버림 처리(데이터 손실)
    
    System.out.println("test1 : " + test1);
    System.out.println("test2 : " + test2);
    
    // <강제 형변환 확인 2> : 정수 -> 정수 (데이터 손실)
    
    int test3 = 290;
    byte test4 = (byte)test3; // byte로 강제 형변환
    
    System.out.println("test3 : " + test3);
    System.out.println("test4 : " + test4);
    // 결과 : 290이 34로 바뀜 (2의 8승이 날라가기 때문에) 
    
    // <강제 형변환 확인 3> : 실수 -> 실수 (데이터 손실)
    double test5 = 3.123456789;
    float test6 = (float)test5;
    
    System.out.println("test5 : " + test5);
    System.out.println("test6 : " + test6);
    // 결과 : 소수점 여덟번째 밑으로 자료가 손실된다.
    
    // <강제 형변환 확인 4> : 원하는 자료형으로 변경
    int test7 = 123;
    System.out.println("(double)test7 : " + (double)test7);
    //결과 : 정수형이 실수형 자료형으로 바뀌기 때문에 .0이 붙는다.
    
    
    // ctrl + alt + 아래 방향키 : 한 줄 복사
    // 블럭 지정 + ctrl + alt + 아래 방향키 : 범위 복사
    
    System.out.println('A'); //char
    System.out.println((int)'A'); // char -> int : 65
    System.out.println((char)66); // int -> char : B
    // 유니코드 표에서 66번에 해당하는 문자를 출력
    
    
    
    // 오버플로우 확인
    byte bNum1 = 127;
    byte bNum2 = (byte)(bNum1 + 1);
                       //byte + int -> int + int (자동 형변환)
                       //앞에 (byte)를 붙혀 int 결과를 byte로 강제 형변환
    System.out.println("bNum1 : " + bNum1);
    System.out.println("bNum2 : " + bNum2);
    
	}
}



