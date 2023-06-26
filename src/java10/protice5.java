package java10;
/* ArrayIndexOutOfBoundsException 예외 오류 특징)
 * 배열 주소 범위를 벗어나서 발생딘 예외 오류이다.
 * 
 */
public class protice5 {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		try {
			System.out.println("Test - 01");
			arr[3]=40;
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
