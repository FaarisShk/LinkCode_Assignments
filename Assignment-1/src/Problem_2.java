/*
 * 2.	Define a class Rectangle with its length and breadth. Provide appropriate constructor(s),
 *  which gives facilty of constructing rectangle object with default values of length pf breadth 
 *  as 0 or passing value of length and breadth externally to constructor. Provide appropriate 
 *  accessor & mutator methods to Rectangle class. Provide methods to calculate area & to display
 *  all information of Rectangle. Design different class TestRectangle class in separate source 
 *  file, which will contain main function. From this main function, create 5 Rectangle objects 
 *  by taking all necessary information from the user.
 */
import java.util.*;
public class Problem_2 {
	Scanner sc = new Scanner(System.in);
	
	private float length =1 ;
	private float width = 1;
	private float area;
	private float perimeter;
	private int flag;
	public void getpara() {
		do{System.out.println("Enter Length: ");
		length = sc.nextInt();
		System.out.println("Enter Breadth: ");
		width = sc.nextInt();
		if(length < 0 || length > 20 || width < 0 || width > 20 ) {
			System.out.println("Please enter value less than 20 and greater than 20");
			break;
			} else {
				continue;
			}
		} while(length!=0);
	}
	public float getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public float getwidth() {
		return width;
	}
	public void setwidth(int width) {
		this.width = width;
	}
	public void calculate(){
		area = length*width;
		perimeter = 2*(length*width);
	}
	
	public void display() {
		System.out.println("The area of rectangle is: " + area);
		System.out.println("The Preimeter of rectangle is: " + perimeter);
	}
}
