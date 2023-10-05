import java.util.*;
class player{
	int age;
	int weight;
	double height;
	Scanner sc = new Scanner(System.in);
	
	void getinfo() {
		System.out.println("Enter age: ");
		age = sc.nextInt();
		System.out.println("Enter weight: ");
		weight = sc.nextInt();
		System.out.println("Enter height: ");
		height = sc.nextDouble();
	}
	void displayinfo() {
		System.out.println("Age is " + age);
		System.out.println("Weight is " + age);
		System.out.println("Height is " + height);
	}	
}

class Cricket_player extends player{
	int matches;
	int highestscore;
	
	void getinfo() {
		super.getinfo();
		System.out.println("Enter number of matches played: ");
		matches = sc.nextInt();
		System.out.println("Enter highest score: ");
		highestscore = sc.nextInt();
	}
	
	void display() {
		super.displayinfo();
		System.out.println("The number of matches played is: " + matches);
		System.out.println("The highest score is: " + highestscore);
	}
}

class Football_player extends player{
	int matches;
	int highestgoals;
	Scanner sc = new Scanner(System.in);
	void getinfo() {
		super.getinfo();
		System.out.println("Enter number of matches played: ");
		matches = sc.nextInt();
		System.out.println("Enter highest score: ");
		highestgoals = sc.nextInt();
	}
	
	void display() {
		super.displayinfo();
		System.out.println("The number of matches played is: " + matches);
		System.out.println("The highest goals is: " + highestgoals);
	}
}

public class inheritance {

	public static void main(String[] args) {
		
	Cricket_player cp = new Cricket_player();
	cp.getinfo();
	cp.display();
	
	Football_player fp = new Football_player();
	fp.getinfo();
	fp.display();
	}
}
