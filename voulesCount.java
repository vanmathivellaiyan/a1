package guviprogram;

import java.util.Scanner;

public class voulesCount {
public static void main(String args[]){
	String str="";
	Scanner sc=new Scanner(System.in);
	str=sc.nextLine();
    int count=0;
	for(int i=0;i<str.length();i++){
		char ch=str.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
			count++;
	}
		//System.out.println(count);
	}
	System.out.println(count);
}

}