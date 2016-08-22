package guviprogram;

import java.util.Scanner;

public class sundayFalse {
public static void main(String args[]){
	String day="";
	Scanner sc= new Scanner(System.in);
	day=sc.nextLine();
	if(day.equalsIgnoreCase("sunday")){
		System.out.println("false");
	}
	else{
		System.out.println("true");
	}
}
}
