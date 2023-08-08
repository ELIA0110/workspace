package edu.kh.arrary.practice;

import java.util.Scanner;

public class ArrayPractice {

	public void ex1() {
//      길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
//      순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
//      짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
//
//      [실행 화면]
//      1 2 3 4 5 6 7 8 9
//      짝수 번째 인덱스 합 : 25
      int[] arr = new int[9];
      int sum = 0;
      
      for(int i=0 ; i < arr.length ; i++) {
         arr [i] = i +1;
         
         System.out.print(arr[i] + " ");
         
         if(i % 2 == 0) {
            sum += arr[i];
         }
      }
      System.out.print("\n짝수 번째 인덱스 합 : ");
      System.out.println(sum);
   }
   
   
   public void ex2() {
//      길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
//      순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
//      홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
//
//      [실행 화면]
//      9 8 7 6 5 4 3 2 1
//      홀수 번째 인덱스 합 : 20
      int[] arr = new int[9];
      int sum = 0;
      
      for(int i = arr.length -1 ; i>=0; i--) {
         arr [i] = i + 1;
         
         System.out.print(arr[i] + " ");
         
         if(i % 2 != 0) {
            sum += arr[i];
         }
      }
      System.out.print("\n홀수 번째 인덱스 합 : ");
      System.out.println(sum);
      
      
   }
   
   public void ex3() {
         /* 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
            1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.

            [실행 화면]
            양의 정수 : 5
            1 2 3 4 5

            [실행 화면]
            양의 정수 : 8
            1 2 3 4 5 6 7 8
            */
         Scanner sc = new Scanner(System.in);
         
         System.out.print("양의 정수 : ");
         int num = sc.nextInt();
         
         int[] arr = new int[num];
         
         for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            
            System.out.print(arr[i] + " ");
         }
      }
      
      public void ex4() {
         /* 정수 5개를 입력 받아 배열을 초기화 하고
            검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
            배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력

            [실행 화면 1]
            입력 0 : 5
            입력 1 : 8
            입력 2 : 9
            입력 3 : 10
            입력 4 : 4
            검색할 값 : 8
            인덱스 : 1

            [실행 화면 2]
            입력 0 : 5
            입력 1 : 8
            입력 2 : 9
            입력 3 : 10
            입력 4 : 4
            검색할 값 : 1
            일치하는 값이 존재하지 않습니다.
          */   
         Scanner sc = new Scanner(System.in);
         
         System.out.print("입력 0 : ");
         int num1 = sc.nextInt();
         System.out.print("입력 1 : ");
         int num2 = sc.nextInt();
         System.out.print("입력 2 : ");
         int num3 = sc.nextInt();
         System.out.print("입력 3 : ");
         int num4 = sc.nextInt();
         System.out.print("입력 4 : ");
         int num5 = sc.nextInt();
         
         int[] arr = {num1, num2, num3, num4, num5};
         
         System.out.print("검색할 값 : ");
         int input = sc.nextInt();
         
         boolean flag = true;
         
         for(int i = 0; i <= 4; i++) {
            
            if( input == arr[i]) {
               System.out.print("인덱스 : " + i);
               flag = true;
            } 
         }
         if(flag = false) {
            System.out.println("일치하는 값이 존재하지 않습니다.");
         }
         
      }

      public void ex5() {
//    	  문자열을 입력 받아 문자 하나 하나를 char배열에 대입하고
//    	  검색할 문자가 문자열에 몇 개 들어가 있는지, 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
//
//    	  [실행 화면]
//    	  문자열 : application
//    	  문자 : i
//    	  application에 i가 존재하는 위치(인덱스) : 4 8
//    	  i 개수 : 2 
    	  Scanner sc = new Scanner(System.in);
    	  
    	  System.out.print("문자열 : ");
    	  String input = sc.next();
    	  
    	  int num = input.length();
    	  char[] arr = new char[num];
    	     	  
    	  for(int i=0 ; i < arr.length ; i++) {
    		  arr[i] = input.charAt(i);
    	  }
    	  System.out.print("문자 : ");
    	  char input2 = sc.next().charAt(0);
   	  
    	  if(input2 == arr[num]) {
    		  
    	  }
    	  
    		
    	  
      }
      public void ex6() {
//    	  사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//    	  배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
//    	  그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
//
//    	  [실행 화면]
//    	  정수 : 5
//    	  배열 0번째 인덱스에 넣을 값 : 4
//    	  배열 1번째 인덱스에 넣을 값 : -4
//    	  배열 2번째 인덱스에 넣을 값 : 3
//    	  배열 3번째 인덱스에 넣을 값 : -3
//    	  배열 4번째 인덱스에 넣을 값 : 2
//    	  4 -4 3 -3 2
//    	  총 합 : 2  
    	  
    	  Scanner sc = new Scanner(System.in);
    	   
    	  System.out.print("정수 : ");
    	  int num = sc.nextInt();
    	  
    	  int[] arr = new int[num];
    	  
    	  int sum = 0;
    	  for(int i=0; i<arr.length; i++) {
    		  System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
    		  arr[i] = sc.nextInt();
    		  sum += arr[i];
    		  
    	  }
    	  for(int i=0; i<arr.length; i++) {
    		  System.out.print(arr[i] + " ");
    	  }
    	  
    	  System.out.println(sum);
    	  
    	  
    	  
      }
      public void ex7() {
    	  
      }
      public void ex8() {
    	  
      }
      public void ex9() {
    	  
      }
      public void ex10() {
    	  
      }
      public void ex11() {
    	  
      }
      public void ex12() {
    	  
      }
      public void ex13() {
    	  
      }
      
      
      
      
      
      
      
      
      
}      