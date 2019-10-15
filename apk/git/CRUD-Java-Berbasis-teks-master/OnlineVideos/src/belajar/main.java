package belajar;

import java.util.Scanner;

public class main {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		while (true)
		{
			System.out.print("Masukkan jari 	: ");
			int r = scan.nextInt();
			System.out.print("Masukkan Tinggi : ");
			int t = scan.nextInt();
		
			double phi1= 3.14;
			int pi = 22/7;
			double volume1 = phi1 * r * r * t * 3;
			int volume2 =  pi * r * r * t * 3;
		
		
			if (r % 7 ==0) 
			{ 
				System.out.println("\nnilai volume kerucut adalah " + "( " +volume2 + " )" + " mengunakan phi 22/7 ");
			}
			else 
			{
				System.out.println("\nnilai volume kerucut adalah " + "( " + volume1 + " )" + " mengunakan phi 3.14");
			}
			
			System.out.println("");
			
//			for(int i=1;i<=9;i++)
//			{
//				
//				for (int j=1;j<=9;j++)
//				{
//					if(j==i)
//					{
//						System.out.print("*");
//					}
//					else if(9+1-j == i)
//					{
//						System.out.print("*");
//					}
//					else if(9/2+1 == j)
//					{
//						System.out.print("*");
//					}
//					else if (9/2+1==i)
//					{
//						System.out.print("*");
//					}
//					else
//					{
//						System.out.print("-");
//					}
//				}
//				System.out.println();
//			}
		}

	}

}
