package edu.kh.variable;

public class VariableEx6 {
    
	// main method : 자바 프로그램 실행용 구문 
	public static void main(String[] args) {
		/* 자바의 기본 자료형 8가지
		 * 논리형 - boolean(1byte)
		 * 정수형 - byte(1byte)
		 *      - short(2byte)
		 *      - int(4byte) : 정수 기본형
		 *      - long(8byte)
		 * 실수형 - float(4byte)
		 *      - double(8byte) : 실수 기본형
		 * 문자형 - char(2byte, 유니코드(UTF-16))          
		 */
		
		// String (문자열)
		// - 문자열을 저장하고 다루기 위해 Java에서 제공하는 자료형
		// - 기본 자료형이 아니다.
		// -> Java에서는 기본 자료형이 아닌 것들을 모두 참조형이라고 지칭함.
		// - String의 리터럴 표기법 : " "(쌍따옴표)
		
		int number1; // int 정수 자료형 변수 선언 (4byte)
		
		String str1; // String 자료형(문자열) 변수 선언
		             // "" ~ "동해물과 백두산이" <-글자 하나당 2byte이므로
		             // 총 18byte이다. (빈칸 포함)
		             // - 기본 자료형처럼 크기가 지정되어 있지 않고 값에 따라 달라짐.
		
		str1 = "Hello";
		
		String str2 = "World";
		// String 변수 선언과 동시에 초기화
		// 화면에 HelloWorld가 출력됐으면 좋겠다면?
		
		System.out.println(str1 + str2);
		// 문자열끼리 +하면 이어져서 나온다.
		
	}
}
