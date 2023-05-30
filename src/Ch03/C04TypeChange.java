package Ch03;

public class C04TypeChange {

	public static void main(String[] args) {
		/* 정수 연산식(int(8) 보다 작은 변수자료형(short(4) , char(4) , byte(1)))
		 * int(8)로 자동 형변환
		 */
		byte x =10;
		byte y = 20;
		byte result1 =(byte)(x+y);     		//정답 or int result1 = x + y;
		 		// 같은 타입인데 덧셈 오류가 발생하는 이유는??   x,y 값이 공간에서 꺼내와지는 과정에서 기본(int) 형으로바뀜, 공간(byte)차이로인해 오류발생
									// 명시적으로 덧셈하고난다음에 byte로 변경을 해준다
												//왼쪽 byte형으로 저장시 작은 공간에 큰 자료형타입넣으려면										
		System.out.println(result1);
		
		
		// 정수 연산식(int 보다 큰 변수자료형(long))
		//큰 타입으로 자동 형변환
		
		byte var1 = 10;
		int var2 = 100;
		long var3 = 1000L;
		// int result = (int)var1 = (int)var2 + (int)var3;
//		int result = var1 + var2 + var3;   // 오른쪽 변수들은 long으로 자동 형변환  // but 왼쪽 공간이 작은공간이기 떄문에 
		
		long result2 = var1 + var2 + var3;
		System.out.println(result2);
		
		
		
		
		//실수연산식
		//큰 타입으로 자동 형 변환시
		int intvar = 10;
		float flvar =3.3F;
		double dbvar =5.5;
		double result3 =intvar + flvar + dbvar;   // intvar ,flvar 가 각각 더하며서 기본값인 double 형으로 자동형변환
		// float result3 =intvar + flvar + dbvar ;   // 
		
		System.out.println(result3);
	}

}
