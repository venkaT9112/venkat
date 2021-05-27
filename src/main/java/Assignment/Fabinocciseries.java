package Assignment;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fabinocciseries {
	
	public void loop()throws Exception
	{
		int a=1;
		int b=1;
		int d=3;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("  ");
		System.out.print("Enter your number ");

		
		String num=br.readLine();
		int c=Integer.parseInt(num);
		System.out.println(a);
		System.out.println(b);
		
		while(c>=d)
		{
			
			
		
			int e=a+b;
			a=b;
			b=e;
			
			System.out.println(b);
			d++;
			
		}
		System.out.println(c+"th numberer is "+b);
		
	}

	public static void main(String[] args) throws Exception {
		
		Fabinocciseries b=new Fabinocciseries();

		b.loop();
		
	}

}
