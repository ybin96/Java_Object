package study;

class A
{
	int a = 5;
	final static int N = 100;  
	// final은 값을 변경할 수 없으니 굳이 객체마다 별도의 메모리를 확보할 필요가 없어요.
	// 모든 객체가 공동으로 사용하는 클래스변수로 만드는 것이 일반적입니다.
}

class FinalVariableTest 
{
	public static void main(String[] args) 
	{
		A ob = new A();
		ob.a = 6; //맴버변수는 필요에 따라 얼마든지 값을 변경시킬 수 있어요.

		System.out.println(ob.a);
		//A.N = 200;  // final 키워드가 붙은 상수는 변경할 수 없어요!
		System.out.println(ob.N);
	}	
}

/*
FinalVariableTest.java:15: error: cannot assign a value to final variable N
                A.N = 200;  // final 키워드가 붙은 상수는 변경할 수 없어요!
                 ^
1 error
*/


