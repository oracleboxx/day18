package java10;




public class protice8 {

	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		for(int i =0; i<=10 ; i++) {
			try {
				result = number/(int)(Math.random()*10);
				System.out.println(result); //정수 숫자 난수가 0이 아닐 떄 나눈 정수몫이 출
			}
			catch(ArithmeticException e){
				System.out.println("0");
			}
		}
	}

}
