package java10;
class Member04{
	String id ="abc56789";
	String name = "홍길동";
	String addr = "서울시 종로구";
}
public class protice4 {
 public static void main(String[] args) {
	Member04 m =null;
	try {
		System.out.println("아이디:"+m.id);
		System.out.println("아이디:"+m.name);
		System.out.println("아이디:"+m.addr);
		
	}
	catch(Exception e){
		System.out.println("예외 발생:"+e);
		m=new Member04(); // 객체주소가 저장된 참조변수(래퍼런스 변수) = > m객체 생성
		System.out.println(m.id);
		System.out.println(m.name);
		System.out.println(m.addr);
		
	}
}
}
