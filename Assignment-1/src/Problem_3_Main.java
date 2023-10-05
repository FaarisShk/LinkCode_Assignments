import java.util.*;
public class Problem_3_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Problem_3 p3 = new Problem_3();
		System.out.println("How many Books you want to create: ");
		int n = sc.nextInt();
		create(p3,n);
		display(p3,n);
	}

public static void create(Problem_3 px, int n) {
	int i;
	Scanner sc = new Scanner(System.in);
	for(i=0;i<n;i++) {
		System.out.println("Enter Book Name: ");
		String bookname = sc.next();
		px.setBookName(bookname);
		System.out.println("Enter Book Price: ");
		int price = sc.nextInt();
		px.setBookTitle(price);
		}
	
	}
public static void display(Problem_3 px,int n) {
	for(int i=0;i<n;i++)
	System.out.println("Book Name: " + px.getBookName());
	System.out.println("Book Price: " + px.getBookTitle());
}
}