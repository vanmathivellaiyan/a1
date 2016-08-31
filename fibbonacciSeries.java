package guviprogram;

import java.util.Scanner;

public class fibbonacciSeries {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int num=4;
	int rol = 1;
	int a = 0,b = 1,c=0;
	num=sc.nextInt();
	for(int i=1;i<num;i++){
		c=a+b;
		//System.out.println(c);
		a=b;
		b=c;
		rol+=b;
	}
	System.out.println(rol);
}
}
