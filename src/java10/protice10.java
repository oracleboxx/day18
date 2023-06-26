package java10;
/* 문제) try{} 블록내에서 정수 숫자 5를 0으로 나눠서 예외를 발생 시켜서 실행순서를 1->2->3->4는 실행안하고
 * 		5->finally 문에서 6이 실행되게 만들어 보자.
 * 
 */
public class protice10 {

	public static void main(String[] args)	 {
		int a =0;
		int b =5;
		try {
			System.out.println(1);
			System.out.println(2);
			
			System.out.println(3);
			throw new Exception();
			
	
		}
		catch(Exception e) {
			System.out.println(5);
			
			
		}
		finally {
			System.out.println(6);
		}
	}

}
