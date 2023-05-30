package Ch03;

public class C03Typechange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 129;					//4byte(32bit) 00000000 00000000 0000000 10000001 
		int num2 = 130;						//4byte(32bit) 00000000 00000000 0000000 10000010
		byte ch1 = (byte)num1;			//마지막 1byte(8bit) 만 존재 10000001  
									//int - > byte 가능 byte는 -128 ~ 127 까지표현가능하지만 초과할경우 -128 + 1 = 127 이나온다 10000001
		byte ch2 = (byte)num2;			//마지막 1byte(8bit) 만 존재 10000010 , 1,2,4,8,16,32,64,128   
		
		System.out.printf("%d\n", ch1);
		System.out.printf("%d\n", ch2);
		
		
		
	}

}
