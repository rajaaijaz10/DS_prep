package ds.arrays;

import java.util.Scanner;

public class Day1_cnt {

	public static void main(String[] args) {
		// names; //reference
		String [] sports= {"Cricket","Football","Golf","Hockey","Volley"};
		 String names[]= new String[5]; //object creation
		System.out.println("Insert the names of 5 students");
		Scanner sc=new Scanner(System.in);
		//insertion into 1d array
		for(int i=0;i<5;i++) {
			names[i]=sc.next();
		}
		System.out.println("Finished \n");
		
		// Traversal /print elements of array
		for(int i=0;i<5;i++) {
			System.out.println(names[i]+" like to play "+sports[i]);
		}
		
	}

}
