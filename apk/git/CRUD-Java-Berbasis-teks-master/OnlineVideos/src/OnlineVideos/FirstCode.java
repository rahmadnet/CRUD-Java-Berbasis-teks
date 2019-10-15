package OnlineVideos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FirstCode 
{
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		
		/*int fnum, snum, answer;
		
		System.out.print("Enter first num	: ");
		fnum = scan.nextInt();
		System.out.print("Enter second num: ");
		snum = scan.nextInt();
		
		answer = fnum * snum;
		
		System.out.println("the results of the above summation " + "("+ answer + ")");*/
		
//		tuna t = new tuna();
//		t.simpleMessage();
		
		String firstArray[][] = {{"ID","Nama","Divisi","Usia"},{"01","Rahmad","Backend","24"}};
		String secondarray[][] = {{"ID","Nama","Divisi","Usia"},{"01","Rahmad","Backend","24"}};
		
		System.out.println("This is the first array");
		display(firstArray);
		System.out.println();
//		System.out.println("This is the second array");
//		display(secondarray);
	}
	
	public static void display(String x[][])
	{
		for(int row = 0;row<x.length;row++)
		{
			System.out.println();
			for(int column= 0; column<x[row].length;column++)
			{
				System.out.print(x[row][column] + "\t");
			}
			
			System.out.println();
		}
	}
}
