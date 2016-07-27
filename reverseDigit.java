package logicbuilding;

import java.util.Scanner;

public class reverseDigit {
public static void main(String[] args){
	int n ;
	int rev = 0;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	while (n != 0) {
	    rev = rev* 10 + n % 10;
	    n = n / 10;   
	}
	System.out.println(rev);
}
}
