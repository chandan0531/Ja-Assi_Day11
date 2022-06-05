package com.Assi.Q3;

import java.util.Scanner;
public class IPL {
	
	void homeTeamStadium(Stadium stadium) {


		if( Stadium.EDEN_GARDENS_STADIUM == stadium)
			{
			System.out.println("This is the home ground of KKR"); 
			}
		else if(Stadium.WANKHEDE_STADIUM == stadium)
		{
			System.out.println("This is the home ground of Mumbai Indians");
		}
		else if(Stadium.CHIDAMBARAM_STADIUM == stadium)
		{
			System.out.println("This is the home ground of CSK");
		}
		else if(Stadium.M_CHINNASWAMY_STADIUM == stadium)
		{
			System.out.println("This is the home ground of RCB");
		}
		
		else
		{
			System.out.println("Put vaild stadius");
		}
		
	
	}
	
	
	public static void main(String[] args) {
		IPL ipl = new IPL();
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter stadium name");
		String str = scn.nextLine();
	
		Stadium std = Stadium.valueOf(str);
//		Stadium std = Stadium.EDEN_GARDENS_STADIUM;
		
		ipl.homeTeamStadium(std);
	}
}
