package Hamcong;
import java.util.Scanner;
class Check{
	Scanner sc= new Scanner(System.in);
	String num;
	boolean wwhile=false;
	Check(){
		while(true) {
			Ask1();
			if(wwhile==true) {
				break;
			}
			Ask2();
		}
	}
	void Ask1() {
		System.out.print("주민등록 번호를 입력하시오: ");
		num=sc.next();
		if(num.equals("종료"))
			wwhile=true;
	}
	
	void Ask2(){
		if(num.length()==14&&num.charAt(6)=='-') {
			System.out.println("정상입니다.\n");
		}
		else System.out.println("잘못 입력하였습니다. 다시 입력하십시오.");
	}
}
public class Hambbang {
	public static void main(String[] args) {
		Check test =new Check();
	}
}
