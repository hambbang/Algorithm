package Hambbang;
import java.util.*;
class Zoo{
	int older, olderFee=10000;
	int adult,adultFee=15000;
	int kid,kidFee=5000;
	static int Thu;
	static int Tmoney;
	static int i;
	StringTokenizer parse=new  StringTokenizer();
	Zoo(){
		this(10,3,6);
	}
	Zoo(int older, int adult){
		this(older,adult,2);
	}
	Zoo(int older, int adult, int kid){
		this.older=older;
		this.adult=adult;
		this.kid=kid;
		i++;
		System.out.print("팀"+i);
		print();
		if(i==3)
			Today();
	}
	String totCul(){
		int totFee=older*olderFee+adult*adultFee+kid*kidFee;
		Tmoney+=totFee;
		return totFee;
	}
	int totCul(int human){
		int tothu=older+adult+kid;
		Thu+=tothu;
		return tothu;
	}
	void print() {
		System.out.println("의 인원수는 "+totCul(1)+"명이고, 입장료는 "+totCul()+"원입니다.");
		
		
		
	}
	void Today() {
		System.out.println("오늘 Zoo의  총 인원수는 "+Thu+"명입니다.");
		System.out.println("오늘의  총 수익은 "+Tmoney+"원입니다.");
	}
	
}
public class ZooExample {

	public static void main(String[] args) {
		Zoo team1= new Zoo();
		Zoo team2= new Zoo(4,8);
		Zoo team3= new Zoo(3,8,4);
	}

}
