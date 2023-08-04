package edu.kh.arrary.practice;

public class ArrayPractice {

	public void ex1() {
		
		int array[] = new int[9];
		
		int sum = 0;
		
		for(int i=0 ; i < array.length ; i++ ) {
			array [i] = i + 1;
			System.out.print(array [i] + " ");
			
			if(i % 2 == 0) {
				sum += array[i];
			}
			
		}	
		System.out.print("\n짝수 번째 인덱스 합 : " + sum);
	}
}

