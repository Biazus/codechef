/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Smallest
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		int[] notes={100, 50, 10, 5, 2, 1};
		for(int i=0; i<testCases; i++){
		    int totalNotes=0;
		    int value = scan.nextInt();
		    for(int j=0;j<notes.length;j++){
    		    if(value>=notes[j]){
    		        int tempValue = value/notes[j];
    		        totalNotes += tempValue;
    		        value=value%notes[j];
    		    }
		    }
		    System.out.println(totalNotes);
		}
	}
}
