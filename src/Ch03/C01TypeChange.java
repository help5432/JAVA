package Ch03;

public class C01TypeChange {

	public static void main(String[] args) {
		/*           <<<< (자료)형변환 >>>> ,
		 * 		연산시 일치하지 않는 자료형을 일치시키는 작업 (자동 or 자동 )
				자동형변환(암시적 형변환) : 컴파일러에 의해 자동 형변환
				강제형변환(명시적 형변환) : 프로그래머에 의해 강제 형변환
					
				자동형변환 (=)
				범위가 넓은 공간에 작은값이 대입되는 경우
				byte(1 byte) > char,short(2) > long(8) > float(4) > double(8)
				!!!!!정수에서 실수값 o  , 실수에서 정수 o but (데이터 손실)!!!!
		*/
		//int num = 10.5; 				//자동형변환 x 공간도다르고 타입도 다르기떄문에
		//int num = (int)10.5; 					// 강제형변환 = 명시적 형변환  
		
		/*----------------------------------------------------------------------------------------------
	  	  ------	
	  	  ----------------------------------------------------------------------------------------------
	  	*/ 
		byte byteValue = 10;  // 1byte 127 ~ -128 까지의 수를 표현한다 . 자동형변환 byte -> int
		int intValue = byteValue;
		System.out.println("intValue:" + intValue);
		
		char charValue = '가';     // char 문자한개 2바이트 (char, short)
		intValue = charValue;      		// intvalue 는 4바이트 이므로 넣을떄 자동형변환되어 int 형으로 자동변경
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;  // 지금 인트형
		long longValue = intValue;  // 참고로 long은 8바이트 정수형이다 ,  그래서 long으로 자동형변환
		System.out.println("longValue:"+ longValue);
		
		longValue = 100;
		float floatValue = longValue;   // 정수 vs 실수 , 정수에서 -> 실수 o , long 8바이트 float 4바이트 // 실수 -> 정수 o but (데이터 손실) 
		System.out.println("floatValue:" + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue; 
		System.out.println("doubleValue:" + doubleValue);
	}

}
