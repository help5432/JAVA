package Ch03;


public class C07StirngTypeChange {

	public static void main(String[] args) {
		/*----------------------------
		 * 문자열 + 문자열
		  ---------------------------*/
//			System.out.println("문자열1" + "문자열2");    			//문자열 + 문자열
//			System.out.println("문자열1" + ',' + "문자열2");			//문자열 + 문자 + 문자열 , 문자열로 자동 형변환 - 연결
//			System.out.println("문자열1" +2 );							//문자열 + 숫자 -> 숫자를 문자열로 형변환 - 연결
//			System.out.println("문자열"+','+'!');								//문자열과 만나서 문자열이되서 연결출력
//			System.out.println(','+',');					//문자열과의 접점이 없으므로 
			
			
		/*----------------------------
		 * 문자열 - > 숫자형 변환
		 * 문자열 - > 숫자형 변환(정수)
		 * int n1 = "10";
		  ---------------------------*/
//			
//			System.out.println("10"+"20");          //문자열 연결
//			
//			int n1 = Integer.parseInt("10");		// 웹개발코드시 폼으로부터 전달받은 값은 다 문자열임  integer 클래스자료형은 크기에 제한이 x
//														//Integer 형으로 추출                                     
//			int n2 = Integer.parseInt("20");				//자료같을것을 받으면 대부분 문자열이고 문자열 그대로 연산하면 값이 이상하게 나오기떄문에 문자열을 integer로 추출해서 연산
//			System.out.println(n1+n2);
		
			
		/*----------------------------
		 * 문자열 -> 숫자형으로 변환(실수)
		  ---------------------------*/
			
//			double n3 = Double.parseDouble("10.5");
//			double n4 = Double.parseDouble("20.5");
//			System.out.println(n3+n4);
//		
//			
//			short n5 = Short.parseShort("5");
//			short n6 = Short.parseShort("6");
//			
//			System.out.println(n5+n6);
			
			
		/*----------------------------
		 * 숫자형 -> 문자형 변환
		  ---------------------------*/
		int value1 = 10;
		double value2 = 3.14;
		
//		System.out.println(value1 + value2);  			// 연산 int4바이트 double 8바이트 즉 int 가 더 작으므로 double로 자동형변환이 된다.
		
//		String str1 = String.valueOf(value1);
//		String str2 = String.valueOf(value2);
		String str1 = value1+ "11";   				//문자열을 반환한다. 계산 x 문자열 이어붙이기
		String str2 = value2+ "11";
		System.out.println(str1 + str2);  				//문자열 붙이기 
		
	
		
	}

}
