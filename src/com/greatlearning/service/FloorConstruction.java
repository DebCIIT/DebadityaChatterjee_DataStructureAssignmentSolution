package com.greatlearning.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class FloorConstruction {
	
	static ArrayList<Integer> floorlist = new ArrayList<Integer>();
	static Stack<Integer> assembledfloors = new Stack<Integer>();
	static int no_of_floors;
	static Scanner scan = new Scanner(System.in);
	
	public static void getFloorNumber()
	{
		System.out.println("Enter the total no of floors in the building : ");
		no_of_floors = scan.nextInt();
	}
	public static void construction()
	{
		int totalfloors = no_of_floors;  // 5
		int floorsize;
		int[] list = new int[no_of_floors];
		
		for(int i = 0; i < no_of_floors ; i++)
		{
			System.out.println("Enter the floor size given on day : " + (i+1));
			
			list[i] = scan.nextInt();
		}
		
		System.out.println("The order of construction is as follows");
		
		for(int i = 0; i < no_of_floors ; i++)
		{
			  floorsize = list[i];
			  
			System.out.println("Day : " + (i + 1));
			
				floorlist.add(floorsize);
				
				Collections.sort(floorlist, Collections.reverseOrder()); //  4
				
				
				int index = 0;
				
				while(index < floorlist.size())  // size = 2
				{
					
					if(totalfloors == floorlist.get(index))  // floors = 5,4
					{
						assembledfloors.push(floorlist.get(index)); // 5
						System.out.print(floorlist.get(index) + " ");
					
						floorlist.remove(index); //
						totalfloors--;
						
					}
					else
						index++;
					
				}
				
				System.out.println();
		}
	}

}
