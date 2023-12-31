package java10;
/* throw 와 throws 차이점
 * 1. throw : 예외를 일부러 발생시킬 떄 사용하는 키워드(예약어)이다.
 * 	   형식) throw new 예외 클래스 생성자;
 * 2. throws : 발생된 예외를 자신이 직접 처리하는 것이 아니라 메서드를
 *  			호출한 곳으로 떠넘기면서 예외를 처리한다.
 *   	형식)
 *   		try{}catch{}문은 들어갈 필요가 없다.
 */          

public class protice6 {
	public static void exp(int ptr)throws NullPointerException{
		if(ptr ==0 ) {
			throw new NullPointerException();
		}
	}
	public static void main(String[] args) {
		try {
			System.out.println("예외 발생전");
			exp(0);
			System.out.println("예외 발생 후 : 이 문장 실행 안함");
			
		}
		catch(NullPointerException e) {
			System.out.println("예외 오류"+e);
		}
	}

}
