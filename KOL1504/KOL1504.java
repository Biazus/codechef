/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat; 

/* Name of the class has to be "Main" only if the class is public. */
class KOL1504
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner(System.in);
	    
	    int numberOfLayers=0;
	    int numberD=0;
		int testCases = scan.nextInt();
		for(int i=0; i<testCases; i++){
		    String cake;
		    String modifiedCake;
		    int hasFound=0;
		    int hasFinished=0;
		    numberOfLayers = scan.nextInt();
		    numberD = scan.nextInt();
		    cake = scan.next();
		    modifiedCake = scan.next();
		    char[] first = cake.toCharArray();
		    char[] second = modifiedCake.toCharArray();
		    Arrays.sort(first);
            Arrays.sort(second);
            if((cake.equals(modifiedCake) || numberD==1)&&Arrays.equals(first, second)){
                System.out.println("Yes");
                hasFinished=1;
            }
            else if(Arrays.equals(first, second)){
    		    for (int j=0;j < cake.length();j++) 
                {   
                    if(cake.charAt(j) != modifiedCake.charAt(j)){ //error
                        hasFound=0;
                        for(int k=(j%numberD); k<cake.length();k+=numberD){
                            if(modifiedCake.charAt(k) == cake.charAt(j)  && k!=j && (k-j)%numberD==0){
                                hasFound=1;
                                break;
                            }
                        }
                        if(hasFound==0){
                            System.out.println("No");
                            hasFinished=1;
                            break;
                        }
                    }
                }
                if(hasFinished==0){
                    System.out.println("Yes");
                }
            }
            else{
                System.out.println("No");
                hasFinished=1;
            }
		    
		}
	}
}
