/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat; 

/* Name of the class has to be "Main" only if the class is public. */
class Simpstat
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int numberOfNumbers=0;
	    int numberOfIgnores=0;
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
	
		for(int i=0; i<testCases; i++){
		    ArrayList<Integer> numbers = new ArrayList();
		    double average = 0;
		    numberOfNumbers = scan.nextInt();
		    numberOfIgnores = scan.nextInt();
		    for(int j=0;j<numberOfNumbers;j++){
		        numbers.add(scan.nextInt());
		    }
		    for(int k=0;k<numberOfIgnores;k++){
		        numbers.remove(numbers.indexOf(Collections.max(numbers)));
		        numbers.remove(numbers.indexOf(Collections.min(numbers)));
		    }
		    for(int l=0;l<numbers.size();l++){
		        average += numbers.get(l);
			    
		    }
		    DecimalFormat formatter = new DecimalFormat("##.000000");
		    System.out.println(formatter.format(average/numbers.size()));
		}
	}
}
