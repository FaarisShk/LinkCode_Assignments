import java.util.*;
public class Problem_6 {
	Scanner sc = new Scanner(System.in);
	private String MyString;
	
	public void getString() {
	System.out.println("Enter A String: ");
	MyString = sc.next();
	}
	
	public void display() {
		System.out.println(MyString);
		System.out.println("Lenght: " + MyString.length());
		System.out.println("UpperCase: " + MyString.toUpperCase());
	}

}

public class StringPalindrome {
	   {
		  public static PalindromeCheck() {
	      String myString = MyString;
	      StringBuffer buffer = new StringBuffer(myString);
	      buffer.reverse();
	      String data = buffer.toString();
	      if(myString.equals(data)){
	         System.out.println("Given String is palindrome");
	      } else {
	         System.out.println("Given String is not palindrome");
	      }
	      return 0;
		 }
	   }
}