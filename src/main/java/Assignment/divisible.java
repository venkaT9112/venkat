package Assignment;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class divisible {

	public static int calculateSum(int n)throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("n digit num is");
		String b=br.readLine();
		int num=Integer.parseInt(b);
		int sum=0;
		for(int i=0;i<=num;i++)
		{
			if(num%3==0 || num%5==0)
			{
			  sum=sum+num;
			  i--;
			}
			num--;
			
		}
		System.out.println(sum);
		
		return sum;
		
	}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
			calculateSum(10);
	}

}
