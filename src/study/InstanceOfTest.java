package study;

class Aaa{		
	public void hello(){
		System.out.println("A의 hello");
	}
}

class B extends Aaa{
	public void hello(){
		System.out.println("B의 hello");
	}
	public void test_b(){
		System.out.println("test_b입니다");
	}
}

class C extends Aaa{
	public void hello(){
		System.out.println("C의 hello");
	}
	public void test_c(){
		System.out.println("test_c입니다.");
	}
}


class InstanceOfTest {
	public static void main(String[] args) {
		Aaa []arr = {new B(), new B(), new C()};

		for(int i=0; i<arr.length; i++){
			if( arr[i] instanceof B){ //arr[i]가 B클래스의 객체 입니까?
				((B)arr[i]).test_b();
			}
			if( arr[i] instanceof C){
				((C)arr[i]).test_c();
			}
		}

	}	
}

