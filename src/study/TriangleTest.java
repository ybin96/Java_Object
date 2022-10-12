package study;

class Triangle
{
	private double width;
	private double height;
	private double area;   // 면적은 밑변과 높이에 의해서 계산되어 지므로 따로 setter를 만들지 않아요.

	public void setWidth(double width){
		this.width = width;
		return;
	}

	public void setHeight(double height){
		this.height = height;
		return;
	}

	public double getWidth(){
		return width;
	}

	public double getHeight(){
		return height;
	}

	public double getArea(){
		area = width * height/2;
		return area;
	}

}

class TriangleTest 
{
	public static void main(String[] args) 
	{
		Triangle t = new Triangle();
		t.setWidth(10);
		t.setHeight(20);
		double area = t.getArea();
		System.out.println("삼각형의 면적 : " + area);
		t.setWidth(20);
		System.out.println("변경된 삼각형의 면적:" + t.getArea());
	}
}
