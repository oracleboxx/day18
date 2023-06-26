package java10;

public class protice9 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			
			
		}
		catch(Exception e){
			System.out.println(5); // 예외가 발생하지 않으면 실행안함
		}
		System.out.println(6);
	}

}
