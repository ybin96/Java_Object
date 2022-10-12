package study;

//질문) balance 에 초기값을 설정하지 않아도 잘 동작해요??
//답)   배열이 자동으로 초기값을 가지는 것 처럼
//		클래스의 맴버변수들오 자동으로 초기값을 가져요!


class BankAccount		//은행계좌를 위한 클래스
{
	private double balance; //잔액을 표시하는 맴버변수

	public void deposit(double amount){		//저금을 하는 메소드
		//balance = balacne + amount;
		balance += amount;
	}

	//인출을 하는 메소드
	//찾고자 하는 인출금액이 잔액보다 더 크다면 인출되지 않도록 합니다.
	public void withdraw(double amount){	
		if(amount > balance){
			System.out.println("찾고자 하는 금액:" + amount + "이며 잔액은 " + balance+"입니다.");
			System.out.println("잔액이 부족합니다.");
			return;
		}
		balance -= amount;
		return;
	}

	double getBalance(){						//현재 잔액을 반환하는 메소드
		return balance;
	}

	//현재 잔액을 출력하는 printBalance메소드를 구현
	public void printBalance(){
		System.out.println("현재잔액:" + balance);
		return ; 
	}

	//현재 잔액에 대하여 연 7.5%의 이자를 계산하여 추가하는 addInterest메소드를 구현
	public void addInterest(){
		//balance = balacne * 1.075;
		//balance = (int)(balance + (balance * 0.075));

		balance *= 1.075;  //이것은 자동 형변환 해 줍니다.
		return;
	}




}

class  BankAccountTest 
{
	public static void main(String[] args) 
	{
		//a1, a2 두개의 BankAccount 객체를 생성한다.
		BankAccount a1 = new BankAccount();
		BankAccount a2 = new BankAccount();

		//a1에 100원을 저금한다.
		a1.deposit(100);

		//a2에 50원을 저금한다.
		a2.deposit(50);

		//a1에서 60원을 인출한다.
		a1.withdraw(60);

		//a2에서 30원을 인출한다.
		a2.withdraw(30);

		//a1의 현재잔고를 얻어서 화면에 출력한다.
		System.out.println(a1.getBalance());	//40
		
		//a2의 현재잔고를 얻어서 화면에 출력한다.
		System.out.println(a2.getBalance());	//20

		
		//a1계좌의 잔고를 출력하는 메소드를 호출
		a1.printBalance();

		//a2계좌의 잔고츨 출력
		a2.printBalance();

		//a1계좌의 이자를 계산합니다.
		a1.addInterest();

		//a2계좌의 이자를 계산합니다.
		a2.addInterest();

		//a1계좌의 잔액을 출력합니다.
		a1.printBalance();		//43

		//a2계좌의 잔액을 출력합니다.
		a2.printBalance();		//21

		//a1의 계좌에서 100원을 인출합니다.
		a1.withdraw(100);

		//a2의 계좌에서 50원을 인출합니다.
		a2.withdraw(50);

		//a1의 잔액을 출력
		a1.printBalance();

		//a2의 잔액을 출력
		a2.printBalance();

	}
}
