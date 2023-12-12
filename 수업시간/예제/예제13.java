package Hamcong;
import java.util.Scanner;
class Check{
	Scanner sc= new Scanner(System.in);
	String num;
	int want;
	boolean sex;//1이남자 트루가 여자
	String way;
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
		System.out.print("어떤 메소드, 어떤 제어문을 사용하겠습니까?");
		want=sc.nextInt();
		switch(want) {
			case 1: sex=One(num);
				way="charAt과 if문을 ";
				break;
			case 2: sex=Two(num);
				way="charAt과 switch문을 ";
				break;
			case 3: sex=Three(num);
				way="substring과 switch문을 ";
				break;
			case 4: sex=Four(num);
				way="substring과 if(조건문으로 equals)문을 ";
				break;
			case 5: sex=Five(num);
				way="substring과 if문, equals을 ";
				break;
		}
		String 성별=(sex) ? "여자" : "남자";
		System.out.println(way+"사용한 결과 이 사람은 "+성별+"입니다.\n");
	}
	boolean One(String num) {
		if(num.charAt(7)%2==0)
			return true;
		else return false;
	}
	boolean Two(String num) {
		switch(num.charAt(7)%2){
			case 0:return true;
			case 1:return false;
			default:return true;
		}
	}
	boolean Three(String num) {
		switch(Integer.parseInt(num.substring(7,8))%2){
			case 0:return true;
			case 1:return false;
			default:return true;
		}
	}
	boolean Four(String num) {
		if(num.substring(7,8).equals("2")||num.substring(7,8).equals("4"))
			return true;
		else
			return false;
	}
	boolean Five(String num) {
		if(Integer.parseInt(num.substring(7,8))%2==0)
			return true;
		else
			return false;
	}
}
public class Hambbang {
	public static void main(String[] args) {
		Check test =new Check();
	}
}
