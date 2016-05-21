package laddu;

import java.io.Console;
//import java.util.HashMap;
//import java.util.Map;
import java.util.Scanner;

public class laddu {

	public static void main(String[] args) {
		final String INDIAN = "INDIAN";
		final String CONTEST_WON = "CONTEST_WON";
		final String TOP_CONTRIBUTOR = "TOP_CONTRIBUTOR";
		final String BUG_FOUND = "BUG_FOUND";
		final String CONTEST_HOSTED = "CONTEST_HOSTED";
		//Map<String, Integer> map = new HashMap<String, Integer>();

		Scanner scan = new Scanner(System.in);
		boolean isIndian;
		
		int testCases = scan.nextInt();
		int numberOfActivities=0;
		int totalLaddu;
		
		for(int i=0;i<testCases;i++){
			numberOfActivities = scan.nextInt();
			totalLaddu = 0;
			if(scan.next().equals(INDIAN)){
				isIndian=true;
			}else isIndian=false;
			
			for(int j=0; j<numberOfActivities; j++){
				String activity=scan.next();
				if(activity.equals(CONTEST_WON)){
					totalLaddu += Math.max(300+(20 - scan.nextInt()), 300);
				}
				else if(activity.equals(TOP_CONTRIBUTOR)){
					totalLaddu += 300;
				}
				else if(activity.equals(BUG_FOUND)){
					totalLaddu += scan.nextInt();
				}
				else if(activity.equals(CONTEST_HOSTED)){
					totalLaddu += 50;
				}
			}
			if(isIndian){
				System.out.println(totalLaddu/200);
			}
			else{
				System.out.println(totalLaddu/400);
			}
		}
	}
}