package Ch02;

public class C04자료형 {

	public static void main(String[] args) {
		/*
		 * int a,b,c = 1 ; c변수만 1로 초기화하고 a,b는 초기값 x
		 * 
		 * boolean , byte = 1바이트 bb 
		 * char, short = 2바이트 차숏 
		 * int , float = 4바이트 인프 
		 * long,double = 8바이트 ld 
		 * 1바이트 = 8비트 , int 4바이트 = 32비트
		 * 
		 * 
		 * 정수 = byte , char , short ,int , long 
		 * 실수 = float , double 
		 * 논리형 boolean(true, false)
		 * 
		 * --------------------
		 * -- 정수  int-4byte 정수부호 o
		 * ---------------------- 
		 */
//			int n1 = 0b10101101;    //2진수값
//			int n2 = 173; 			//10진정수값
//			int n3 = 0255;  		//8진수
//			int n4 = 0xad;			//16진수
//			System.out.printf("%d %d %d %d\n", n1,n2,n3,n4);
			
		  //
		  //정수 byte-1byte 정수 부호 o
		  //
//			System.out.println("---------------------------");
//			byte n5 = -129;
//			byte n6 = -30;
//			byte n7 = 30;
//			byte n8 = 127;
//			byte n9 = (byte)129;     //문제발생 왜?? 강제 형변환 = 음수값으로 나옴 -128 + 1 으로 10000001
//			System.out.println(0b10101101); // 왜 음수 아냐?? 가본사이즈가 4바이트이기떄문에
//			System.out.printf("%d\n", n5); //왜??
//			System.out.println(integer.tobinarysting(-129));
			
		
			
//		 	* --------------------
//		 	* --정수 short-2byte 정수 부호 o | char-2byte정수 부호 x(양수만)
//		 	* ---------------------- 
//		
//			char n1 = 65535;	//(0~2^16-1) (0~65535)
//			short n2 = 32767;	//(-2^15 ~ +2^15-1) ( -32768 ~ +32768) 정수범위
//			
//			char n3=60000;
//			short n4 =(short)n3;  		// 문제발생 ... 왜? 
			
//			System.out.printf("%d\n",n4);
			
			//----------------------------
			//정수 long-8byte 정수 부호 o
			//---------------------------
//			long n1 = 10;
//			long n2 = 20L;  // L,1 (리터럴 접미사) : long 자료형사용하여 값 지정 
//			
//			long n3 = 10000000000; //문제발생 .. 왜? , 8바이트 00000000x8 -> int 4바이트에 저장할수 x  // 큰공간8바이트  -> 기본 작은공간4바이트로 불가능
//			long n4 = 10000000000L;  // long 형태로 저장한다는 뜻 L 
			
			/* 유리수와 무리수의 통칭
			 * 소숫점 이하값을 가지는 수 123.456
			 * float : 4byte 실수(6~9자리)
			 * double : 8byte 실수(15~18자리) , 기본자료형 ,배정밀도
			 * 
			 * 정밀도 확인
			 */
//			float n1 = 0.123456788123456789F;		//0.12345679 까지 표현 
//			double n2 = 0.123456788123456789;  //기본이 더블임 
//		
//			System.out.println(n1);
//			System.out.println(n2);
			
			
			//단일문자 char 2byte 정수 , char (unsigned 양수만)  , 영어문자 아스키코드 ,한글 유니코드사용
		
//			char ch1 = 'a'; 
//			System.out.println(ch1);
//			System.out.println((int)ch1); //011000001
//  			
//			char ch2 = 98; 
//			System.out.println(ch2);
//			System.out.println((int)ch2); //011000010
//			
//			char ch3 = 'b'+1; 
//			System.out.println(ch3);
//			System.out.println((int)ch3); //011000011
//			
//			byte ch4 = 'c'+2; 
//			System.out.println((char)ch4);
//			System.out.println(ch4); //011000011
			
			char ch5 = 0xac00;
			char ch6 = 44032;
			System.out.println(ch5);
			System.out.println(ch6);
			
			
//			char ch6 = 0xac00+1;
//			System.out.printf("%c %c \n", ch5,ch6); //011000001
//			
//			// \\u : 유니코드값 이스케이프문자
//			System.out.printf("%c\n", '\uAC80');
//			
//			System.out.printf("TEST : %c\n", '\ud7fb');
			
			
//			char n = 10;
//			System.out.printf("hellow %c world", n);
			
			
			//
			//문자열 : stirng (클래스 자료형)
			//
			
			//기본자료형 (원시타입)
//			byte n1;
//			short n2;
//			double n3;
//			long n4;
			
			//클래스 자료형
			//클래스 자료형으로 만든 변수는 '참조변수' 라고 하고
			//참조변수는 데이터가 저장된 위치정보(메모리 주소값) 이 저장된다.
			
			int n1 =10;
			byte n2 = 20;
			char n3 = 40;
			String name = "홍길동";  //Stirng클래스  값이있는 위치정보를 담는다 . = 신발장키랑 같다고 생각하면된다. -> 번호로가면 신발이있다 . 
			String job = "프로그래머";
			System.out.println(name);
			System.out.println(job);
			
			
			//boolean : 논리형 ( true/false 저장)
			
			boolean flag = (10>5); // 참 (긍정) true if 참실행 아니면 else 실행
			if(flag)
			{
				System.out.println("참인 경우 실행");
				
			}
			else
			{
				System.out.println("거짓인 경우 실행");
			}
			
	}

}
