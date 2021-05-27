package Assignment;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class primenumbers {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter your number ");
		
		
		String b=br.readLine();
		int num=Integer.parseInt(b);
		int a=1;
		while(num>=a)
		{
			{
			boolean flag = false;
			for(int i=2;i<=num/2;i++) {
				if(num % i == 0) {
					flag = true;
				}
				
			}
			if(flag)
				System.out.println("Number " + num + " is not prime");
			else
				System.out.println("Number " + num + " is prime");
			}
			num--;
			
	}
	}

}

