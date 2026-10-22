
public class LiteralTest {

	public static void main(String[] args) {
		// Data : Literal 상수
		int 	num     = 28;
		String  name    = "이혜인"; //문자열
		double	height  = 167.3;
		float   weight  = 48.5f;
		int 	bYear   = 2003;
		int		tYear   = 2026;
		String  address = "서울시"; 
		char    grade   = 'A';
		boolean adult   = true;
		boolean male    = false;
		long 	lBlance  =   100000000200l   ;
		
			System.out.println("번호:" + num );
			System.out.println("이름:" + name );
			System.out.println("생년:" + bYear );
			
		int data = 65;
		System.out.printf("문자:%c 숫자:%d" , data, data); //%c :char %d : decimal int 정수 %x : 16진수
			
	}

}
