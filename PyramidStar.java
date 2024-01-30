package com.project;

public class PyramidStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter the Number of Pyramid ");


		int i;
		int j;
		int row=5;
		
		// int row = Integer.parseInt(sc.nextLine());
		
		for(i=0;i<row;i++) {
			 for(j=row-i;j>1;j--) {
				System.out.print(" ") ;
			}
			for(j=0;j<=i;j++) {
				System.out.print("* ") ;
			}
		System.out.println();
		}
    }
}
	



