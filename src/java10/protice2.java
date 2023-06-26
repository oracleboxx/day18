package java10;

import java.util.Scanner;

public class protice2 {

	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		int cookie =2000;
		System.out.println("쿠키 개수 입력");
		num = scan.nextInt();
		if(num>10) {
			cookie= 1500*num;
			System.out.println("쿠키 가격:"+cookie+" 25% 할인");
		}
		else {
			System.out.println("쿠키 가격:"+cookie*num);
		}
		
	}

}
