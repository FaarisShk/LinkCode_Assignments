class Rectangle{
	public double width;
	public double length;
	public double area;
	public String color;
	
	Rectangle(double l, double w, String c){
		width = w;
		length = l;
		color = c;
	}
	
	double get_length(){
		return length;
	}
	double get_width() {
		return width;
	}
	double find_area() {
		return length * width;
	}
}

public class expt3{
	public static void main(String[]args) {
		Rectangle r1 = new Rectangle(10,10,"Red");
		Rectangle r2 = new Rectangle(10,10,"Red");
		
		if (r1.find_area()==r2.find_area() && r1.color == r2.color){
			System.out.println("Matching Rectangles");
		}
		else {
			System.out.println("Non matching Rectangles");
		}
	}
}