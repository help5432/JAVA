package Ch03;

public class C02TypeChange {

	public static void main(String[] args) {
		/* 강제형변환
		 * 좁은범위공간에 큰값을 넣으려고 하는경우
		 * 기본적으로 불가능하기 떄문에 강제로 자료형을 바꾸어 전달한다  - 자동형변환
		 * 데이터 손실의 염려가 있다 - 명시적 형변환일경우에서 , 작은값(4바이트) - > 큰값(8바이트)로 변경하는 경우
		 */
		
		
		int intValue = 44032;  // int 정수 4바이트
		char charValue =(char)intValue; // !! 크기값이 작지만 char 문자형 2바이트 가능o - > 정수 44032가 유니코드인 '가' 로 변경
		System.out.println(charValue);
		
		long longValue = 500;  // long 정수 8바이트
		intValue = (int)longValue;   // 4바이트 정수형으로 변경가능한이유 = 값이 초과하지않고 int범위내에 있기떄문에 
		System.out.println(intValue);
		
		// 데이터 손실!
		double doubleValue = 3.14;  // 더블 8바이트 실수형
		intValue = (int)doubleValue; // 실수 -> 정수로(명시적형변환) 데이터손실발생 0.14~ 손실
		System.out.println(intValue);
		
		
		
	}

}
