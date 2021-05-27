package Assignment;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class sumofcubes {
	
	public static void main(String [] args)throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("n digit num is");
		String b=br.readLine();
		int num=Integer.parseInt(b);
		int j;
		int s=0;
	if(num>=0)
		{
			for(int k=1;k<=num;k++)
			{
				j=k*k*k;
				s=s+j;
			}
			System.out.println("sum of cubes of "+ num +" digits are "+s);
		}
	}

}
