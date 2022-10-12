package study;
class Book
{
	private String title;
	private String author;
	public void setTitle(String title){  //메소드의 이름을 의미 있는 이름으로 정해 주다 보면 
		this.title = title;	//맴버변수의 이름과 동일하게 되고, 메소안에서는 매개변수명이 우선순위 높아요.
							//맴버변수에 값이 저장되지 않아요!
							//맴버자신을 구별할 목적으로 this를 사용합니다.
	}
	public void setAuthor(String author){
		this.author = author;
	}
	public String getTitle(){
		return title;
	}
	public String getAuthor(){
		return author;
	}
}

class BookTest
{
	public static void main(String[] args) 
	{
		Book myBook = new Book();
		//myBook.title = "Great Java";
		myBook.setTitle("Great Java");
		myBook.setAuthor("bob");
		System.out.println(myBook.getTitle());
		System.out.println(myBook.getAuthor());
	}
}
