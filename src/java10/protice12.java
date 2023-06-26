package java10;

import java.io.PrintWriter;
import java.util.ArrayList;

/* jdk 1.7(자바 7)에서 추가된 autoCloseable 인터페이스를 구현 상속받은 자손 클래스는 try() 내에서 객체를 생성하면
 * finally문에서 명시적으로 close()하지 않아도 자도으로 닫힌다.
 * 
 * 
 */
public class protice12 {
	public static void main(String[] args) throws Exception {
		ArrayList<String> nameList = new ArrayList<>();
		nameList.add("lee");
		nameList.add("park");
		nameList.add("chol");
		
		try{
			PrintWriter output =new PrintWriter("./src/out.txt");
	
			for(String name:nameList) {
				output.println(name.toUpperCase());// out.txt파일에 영문대문자로 기록
			}
		}
		
	}
}
