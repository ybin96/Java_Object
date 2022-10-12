package study;

class Rectangle
{
	double width;
	double length;
	double calcArea(){
		double area = width * length;
		return area;
	}
}

class RectangleTest 
{
	public static void main(String[] args) 
	{
		Rectangle r1 = new Rectangle();
		r1.width = 20;
		r1.length = 10;
		double area = r1.calcArea();
		System.out.println("사각형의 넓이 : " + area);
	}
}
