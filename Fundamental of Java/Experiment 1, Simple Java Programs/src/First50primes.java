
import java.util.Scanner;

public class First50primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);



		int i,n,sum=0,avg,num;	
		System.out.println("Enter N to calculate Sum and average ");

		n=in.nextInt();

		for(i=1;i<=n;i++)
		{
			System.out.println("Enter Number"+i);
			num=in.nextInt();
			sum=sum+num;
		}

		avg=sum/n;
		System.out.println("Sum is:"+sum);
		System.out.println("Average is:"+avg);        

		//**************Factorial*********************************

		int fact=1;
		System.out.println("Enter Number to calculate Factorial");

		n=in.nextInt();

		for(i=1;i<=n;i++)
			fact=fact*i;

		System.out.println("Factorial is:"+fact);



		//**************Prime Number*********************************


		System.out.println("First 50 Prime numbers are:");
		int isPrime,j;
		num=2;
		int count=1;
		/* Finds First 50 Prime numbers  */
		while(count<=50);
		{

			/* Assume that the current number is Prime */
			isPrime = 1; 

			/* Check if the current number num is prime or not */
			for(j=2; j<=num/2; j++)
			{


				if(num%j==0)
				{
					isPrime = 0;
					num++;
					break;
				}
			}

			/* If the number is prime then print */
			if(isPrime==1)
			{
				count++;
				System.out.print(num+"\t");
				num++;
				if((count%10) == 0)
					System.out.println();
			}

		}
	}
}
