package Ch03;

public class C05TypeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10 , num2 =4;
		double dnum1 = num1 / num2;  				//피연산자 num1 int 형이기떄문에 연산후에 소수점을 담을수가 없음 그래서 데이터 손실이발생해서 2가나온다
		
		double dnum2 = (double)num1 / num2;		//나누는 수를 double 형으로 강제 형변환함으로서 연산결과즉 소수점을 담을수가있음 데이터손실 발생 x or (num1*1.0) /num2
																//소수점을 표현할 공간을 마련 
		double dnum3 = (1.0*num1) / num2;		
		System.out.println("dnum1 : " +dnum1);
		System.out.println("dnum2 : " +dnum2);
		System.out.println("dnum3 : " +dnum3);

	}

}
