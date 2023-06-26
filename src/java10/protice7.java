package java10;
/* Exception 예외 처리 부모클래스를 상속 받아서 사용자 정의 예외 클래스 생성 
 * 
 * 
 */
class UserException extends Exception{
	public UserException() {
		
	}
	public UserException(String message) {
		super(message);//부모클래스 오버로딩 된 생성자 호출하면서 예외 오류 메세지를 생성
	}
}
public class protice7 {

	public static void main(String[] args) {
		try {
			int a =-11;
			if(a<=0) {
				throw new UserException("양수가 아닙니다!");
			}
		}
		catch(UserException e){
			System.out.println(e.getMessage()); //예외 오류  메세지 출력
		}
	}

}
