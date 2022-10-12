package study;

class Employee
{
	private String name;
	private String phone;
	private int salary;

	//연봉을 변경하기 위한 메소드를 정의
	public void setSalary(int salary){
		this.salary = salary;
		return    ;
	}

	//연봉을 반환하기 위한 메소드를 정의
	public int getSalary(){
		return salary;
	}


	//전화번호를 바꾸기 위한 메소드를 정의
	public void setPhone(String phone){
		this.phone = phone;
		return;
	}

	//전화번호를 반환하는 메소드를 정의
	public String getPhone(){
		return phone;
	}

	//이름을 바꾸기 위한 메소드를 정의
	public void setName(String name){
		this.name = name;
		return;
	}

	//이름을 반환하는 메소드를 정의
	public String getName(){
		return name;
	}
}

class EmployeeTest {
	public static void main(String[] args) 
	{
		//객체참조변수를 선언하고 객체를 생성
		Employee kim = new Employee();
		
		//객체참조 변수를 통하여 이름을 변경시키기 위한 메소드를 호출
		kim.setName("김유신");

		//객체참조 변수를 통하여 전화번호를 변경시키기 위한 메소드를 호출
		kim.setPhone("01012345678");

		//객체참조 변수를 통하여 연봉열 변경시키기 위한 메소드를 호출
		kim.setSalary(5000);

		
		System.out.println("이름:" + kim.getName());  //객체참조변수를 통하여 이름을 읽어오는 메소는 호출합니다.
		System.out.println("전화번호:" + kim.getPhone());//객체참조변수를 통하여 전화번호를 읽어 오는 메소드를 호출하여 출력합니다.
		System.out.println("연봉:" + kim.getSalary()); //객체참조변수를 통하여 연봉을 읽어오는 메소드를 호출하여 출력합니다.
	}
}
