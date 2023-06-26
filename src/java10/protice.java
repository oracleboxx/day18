package java10;

import java.util.Scanner;



public class protice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max, min, num1, num2;
		System.out.println("정수 입력");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		if (num1 > num2) {
			max = num1;
			min = num2;
			System.out.println("num1 max:" + max);
			System.out.println("num2 min:" + min);
		}
		else {
			max= num2;
			min= num1;
			System.out.println("num2  max:" + max);
			System.out.println("num1  min:" + min);
		}
		int num;
		num = scan.nextInt();
		if(num>100) {
			System.out.println(num+"100보다 크다");
		}
		else if(num>50) {
			System.out.println(num+"50보다 크다");
		}
	}

}
