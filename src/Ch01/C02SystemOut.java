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
	   		System.out.printf("%d %d %d \n", 10,20,30);
	   		System.out.printf("%f %f %f \n", 10.1,20.1,30.1);
	   		System.out.printf("%c %c %c \n", 'A','B','C');
	   		System.out.printf("%s %s %s \n", "This is", "stirng" ,"test");
	   		System.out.printf("%d.%s : %d\n", 1, "국어",100);
	     
	   		
	   		
		    // 3.System.out.println()
	
	}

}
