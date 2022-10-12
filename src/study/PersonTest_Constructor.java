package study;

/*
사람 Person
	속성(맴버변수) : 
		이름	String name
		나이	int age

	동작(맴버메소드) : 
		먹는다	void eat(String food)
		가다		void go(String anywhere)
*/

class Person{
	private String name;
	private int age;
	
	// 생성자의 정의
	public Person(String name, int age){
		System.out.println("생성자가 동작합니다.");
		this.name = name;
		this.age = age;
	}

	public Person(){
		name = "김동민";
		age = 27;
	}
	
	public Person(String name){
		this.name = name;
		age = 27;
	}

	public Person(int age){
		name = "김동민";
		this.age = age;
	}

	public void setName(String n){
		name = n;		
	}
	public String getName(){
		return name;	
	}
	public void setAge(int a){
		age = a;
	}
	public int getAge(){
		return age;
	}

	public void eat(String food){
		System.out.println(age+"살"+name+"이(가) "+ food+"를(을) 먹어요");
	}
	public void go(String anywhere){
		System.out.println(age+"살"+name+"이(가) " + anywhere+"(으)로 가요");
	}
}

class  PersonTest_Constructor{
	public static void main(String[] args) {
		Person p1 = new Person();				//김동민, 27
		Person p2 = new Person("김유신", 40);		//김유신, 40
		Person p3 = new Person("김유신");			//김유신, 27
		Person p4 = new Person(40);				//김동민, 40			
		
		p1.eat("콜라");
		p2.eat("콜라");
		p3.eat("콜라");
		p4.eat("콜라");

		
	}
}

