package edu.kh.poly.model.service;

import edu.kh.poly.model.dto.Car;
import edu.kh.poly.model.dto.Porsche;
import edu.kh.poly.model.dto.Spark;

public class PolyService {
	
	// 객체 배열 == 객체 참조 변수의 묶음 ==> 각 요소 하나가 참조 변수
	private Car[] arr = {
			new Porsche(4, 2, "고급 휘발유", false) , 
			new Spark(4, 4, "휘발유", 0.5),
			new Porsche(6, 4, "경유", true),
			new Spark(4, 2, "가솔린", 0.7),
			new Car(8, 3, "경유")
	};
	
	// Car[] arr에서 index 번째 요소를 반환
	public Car selectOne(int index) {
		
		if(index >= 0 && index < arr.length) {// 정상 범위
			return arr[index]; 
		}
		
		return null; // 정상 범위가 아닐 때 
	}
	
	
	// arr에 있는 모든 요소의 toString() 호출
	public void printCar() {
		
		for(int i=0; i<arr.length ; i++) {
			
			// instanceof를 이용해서 차종 출력
			if(arr[i] instanceof Porsche) {
				System.out.print("포르쉬 : ");
			} else if(arr[i] instanceof Spark) {
				System.out.print("스파크 : ");
			} else {// Car
				System.out.println("자동차 : ");
			}
			
			// -----------------------------------
			
			// 배열 요소 toString()을 호출해서 출력
			 
			
			System.out.println(arr[i].toString());
			
			 
			 // -> Car 자료형(클래스)의 toString()으로만 연결
			// -> 왜? arr[i]의 자료형이 Car라서!
			// --> 정적 바인딩
			
			// bind : 묶다, 연결하다
			// 바인딩 : 메서드 호출부와 실제 실행되는 메서드 코드를 묶는 것
			
			// 정적 바인딩
			// - 프로그램 실행 전 (컴파일 단계)
			//   메서드 호출부와 메서드 코드를 묶는 것
			//   --> 참조변수의 자료형을 토대로 묶임
			
			// 동적 바인딩
			
		}
	}
	
	
}
