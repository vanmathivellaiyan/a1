package guviprogram;

import java.util.Scanner;

public class voulesNum {
	public static void main(String[] args){
	String str="";
	Scanner sc= new Scanner(System.in);
	str=sc.next();
    int s=Integer.parseInt(str);
	if(s==0){
		System.out.println("true");
	}
	else{
		System.out.println("false");
	}
}
}
