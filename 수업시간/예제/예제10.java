package hi;
import java.util.Scanner;
class Bank{
	Scanner sc=new Scanner(System.in);
	private String name;
	private int password;
	private String ID;
	public int bal;
	String string;
	int Int;
	public void setn(String name) {
		this.name=name;
	}
	public void setp(int password) {
		this.password=password;
	}
	public void seti(String ID) {
		this.ID=ID;
	}
	public String getn() {
		return name;
	}
	
	public int getp() {
		return password;
	}
	
	public String geti() {
		return ID;
	}
	public void a1() {
		System.out.println("얼마를 입금하시겠습니까? ");
		Int=sc.nextInt();
		bal+=Int;
		System.out.println("잔액은 "+bal+"원입니다.");
	}
	public int a2() {
		if(bal<=0) {
			System.out.println("출금할 수 있는 금액이 없습니다.");
			return 0;
		}
		do {
			System.out.println("얼마를 출금하시겠습니까? ");
			Int=sc.nextInt();
			if(bal-Int<0) {
				System.out.println("잔액을 초과하였습니다. 다시 입력해주세요.");
			}
			else break;
		}while(true);
		bal-=Int;
		System.out.println("잔액은 "+bal+"원입니다.");
		return 0;
	}
	public void a3() {
		System.out.println("예금주 이름 : "+name);
		System.out.println("잔액 : "+bal+"원");
	}
}
public class wq {
	public static void main(String[] args) {
		String string;
		int Int;
		Scanner sc=new Scanner(System.in);
		Bank hi=new Bank();
		hi.setn("정명민");
		hi.setp(1122);
		hi.seti("0512103123456");
		while(true) {
			System.out.print("이름을 입력하십시오:");
			string=sc.next();
			if(hi.getn().equals(string))break;
			System.out.println("이름이 잘못되었습니다.");
		}
		while(true) {
			System.out.print("비밀번호를 입력하십시오:");
			Int=sc.nextInt();
			if(hi.getp()==Int)break;
			System.out.println("비밀번호가 잘못되었습니다.");
		}
		while(true) {
			System.out.print("주민등록번호를 입력하십시오:");
			string=sc.next();
			if(hi.geti().contentEquals(string))break;
			System.out.println("주민등록번호가 잘못되었습니다.");
		}
		System.out.println("1번을 누르면 입금하기");
		System.out.println("2번을 누르면 출금하기");
		System.out.println("3번을 누르면 계좌정보 출력하기");
		System.out.println("4번을 누르면 종료");
		while(true) {
			System.out.print("무엇을 선택하시겠습니까? ");
			Int=sc.nextInt();
			switch(Int) {
				case 1:hi.a1();
					break;
				case 2:hi.a2();
					break;
				case 3:hi.a3();
					break;
				case 4: System.out.println("종료되었습니다.");
					string="end";
			}
			if(string=="end")break;
		}
	}
}