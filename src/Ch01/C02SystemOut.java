package Ch01;

public class C02SystemOut {

	public static void main(String[] args) {
	   
		
	/*  단축키
		  복사 : 컨 + 알 + 아래 
		
		system :os
		system.out : os 가 관리하는 표준 출력 스트림
		
		 <<<< escape 문자 >>>>    그래픽 , 제어문자(엔터 탭 esc)
		1. \n 줄바꿈
		2. \b 백스페이스
		3. \t 탭길이 (기본 8칸) 만큼 커서 이동                           */
		
		
		
		 //1.system.out.print()
	   		System.out.print("안녕하세요\n");   
	   		System.out.print("아령하세요\n");
	   		System.out.print("아룡하세요\n");
	   		System.out.print("아냥\t하\t세요");
	   
	     // 2.System.out.printf()
	   	 // format : 형식, 서식  서식이란? 
	   	 // %d : 10진수 정수 서식문자
	   	 // %f : 10진수 실수 서식문자
	   	 // %c : 한문자 서식문자
	   	 // %s : 문자열 서식문자
	   		
	   		System.out.printf("%d %d %d \n", 10,20,30);
	   		System.out.printf("%f %f %f \n", 10.1,20.1,30.1);
	   		System.out.printf("%c %c %c \n", 'A','B','C');
	   		System.out.printf("%s %s %s \n", "This is", "stirng" ,"test");
	   		System.out.printf("%d.%s : %d\n", 1, "국어",100);
	     
	   		
	   		
	     // 3.System.out.println() 역슬래쉬 n 이 기본으로 들어가있는 프린트
	   		System.out.println("안녕하세요");
	   		System.out.println("아령하세요");
	   		System.out.println("아룡하세요");
	   		
	   		
	   		System.out.println("아룡하세요  \"안녕\""); //단순 표시형 역슬래쉬 "" 표시

	   		
	   		
	   		
	   		
	}

}
