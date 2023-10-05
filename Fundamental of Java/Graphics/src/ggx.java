	import java.util.*;
	
	public class main{
			public static void main(String[] args) {
				
					Scanner sc = new Scanner(System.in);
			        
					int i=0;
					int sum = 0;
					System.out.print("Enter size of array: ");
			        int size = sc.nextInt();
			        if (size > 0 && size <= 5) {
			        	System.out.println("The size of array is " + size);
			        } else {
			        	System.out.println(size + " is an invalid size");
			        }
			        
					int[] array = new int[size];
			        Scanner in = new Scanner(System.in);
			        System.out.println("Enter the elements of the array at " + i);
			        for (i = 0; i < size; i++) {
			            array[i] = in.nextInt();
			            if (array[i] < 0 || array[i] > 100) {
			            	System.out.println(array[i] + " is an invalid input");
			            }
			        }
			        
			        for (i = 0; i < array.length; i++) {
			            boolean isPrime = true;
			            if (array[i] == 1) {
			                isPrime = false;
			            }
			            else {
			                for (int j = 2; j <= array[i] / 2; j++) {
			                    if (array[i] % j == 0) {
			                        isPrime = false;
			                        System.out.println("There are no prime numbers in the array");
			                        break;
			                    }
			                }
			            }
			            if (isPrime) {
			                System.out.println(array[i] + " is a prime number in the array ");
			            	sum = sum + array[i];
			            }
			        }
			       System.out.println("The sum of all prime numbers is " + sum);
			}
	}