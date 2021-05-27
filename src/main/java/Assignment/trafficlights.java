package Assignment;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class trafficlights {
	

	public static void main(String [] args)throws Exception
	{
		String a="yes";
		while(a.equals("yes"))
		{
		System.out.println("*********TRAFFIC LIGHTS : **********");
		System.out.println(" ");
		System.out.println("1) for red");
		System.out.println("2) for yellow");
		System.out.println("3) for green");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("  ");
		System.out.println("Enter your light number ");
		System.out.println("  ");
		
		String b=br.readLine();
		int c=Integer.parseInt(b);
		switch(c)
		{

	
		case 1:
			System.out.println("  ");
			System.out.println("stop");
			break;
			
		case 2:
			System.out.println("  ");
			System.out.println("ready");
			break;
			
		case 3:
			System.out.println("  ");
			System.out.println("go");
			break;
			
		
		}
		
		System.out.println("  ");
		System.out.println("To continue press yes");
		a=br.readLine();
		
	}

	}
}
