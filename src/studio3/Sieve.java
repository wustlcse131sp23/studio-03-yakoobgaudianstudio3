package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How long do you want array?");
		int n= in.nextInt(); 
		boolean [] prime = new boolean [n+1];

		
		
		for(int num= 2; num<n+1; num=num+1)
		{


			for(int i=2*num; i<=n; i=num+i)
			{


				prime[i]= true ; 



			}

		}

		for(int y =2; y<=n; y++)
		{
			if (prime[y]==false)
			{
				System.out.println(y);


			}


		}
	}
}
