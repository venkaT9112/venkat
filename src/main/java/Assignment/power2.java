package Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class power2 {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number:");
		String num=br.readLine();
		int number=Integer.parseInt(num);
		
		 if (checkNumber(number)) {
		      System.out.println("yes");
		    } else {
		      System.out.printf("no");
		    }

	}
	private static boolean checkNumber(int number) {

	    if (number % 2 != 0) {
	      return false;
	    }
	    else {

	      for (int i = 0; i <= number; i++) {

	        if (Math.pow(2, i) == number) return true;
	      }
	    }
	    return false;
	  }
}