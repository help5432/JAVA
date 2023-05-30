package Ch03;

public class Ch06TypeChange {

	public static void main(String[] args) {
		// short vs char
		
		char n1 = 60000;
		short n2 = (short)n1;   // char 와 short는 같은 바이트(2byte) 를 가지나 short는 양 ,!!음수!! 를 지원 / char는 양수만지원 
								//short char 간의 데이터교환시 동일한 값을 저장하더라도 표현하는 범위(양수,음수)가 다르기 떄문에 각각 다른 값이 나올수도있다 .
		System.out.println(n2);
//		short n2 = n1;   //
		
		int n3 = (short)n2;  // 명시적으로 short , char 를 넣어서 비교를 해본다 .
		System.out.println((int)n3);
	}

}
