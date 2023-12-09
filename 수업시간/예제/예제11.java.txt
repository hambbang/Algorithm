package hihi;
import java.util.Scanner;
class BBUBBU{
	Scanner sc= new Scanner(System.in);
	int seoul=0;
	int daejeon=50;
	int busan=200;
	int mokpo=150;
	int dongjin=100;
	int start=0;
	int arrive=0;
	int distance;
	static int su;
	void select() {
		System.out.println("1.서울역, 2.대전역, 3.부산역, 4.목포역, 5.정동진역");
		do{
			if(start!=0)System.out.println("제대로 쓰세요");
			System.out.print("출발역을 입력하십시오:");
			start=sc.nextInt();
		}while(start>6);
		switch(start){
			case 1: start=0;break;
			case 2: start=50;break;
			case 3: start=200;break;
			case 4: start=150;break;
			case 5: start=100;break;
		}
		do{	
			if(arrive!=0)System.out.println("제대로 쓰세요");
			System.out.print("도착역을 입력하십시오:");
			arrive=sc.nextInt();
		}while(arrive>6);
		switch(arrive){
			case 1: arrive=0;break;
			case 2: arrive=50;break;
			case 3: arrive=200;break;
			case 4: arrive=150;break;
			case 5: arrive=100;break;
		}
		distance=start>arrive?start-arrive:arrive-start;
		print(++su,distance,cir(distance));
	}
	int cir(int distance) {
		return distance*500;
	}
	void print(int su, int distance, int cost) {
		System.out.println("사람"+this.su+"의 주행거리는 "+this.distance+
				"km 이고 가격은 "+cost+"원입니다.");
	}
}
public class ex5 {
	public static void main(String[] args) {
		BBUBBU people1=new BBUBBU();
		BBUBBU people2=new BBUBBU();
		BBUBBU people3=new BBUBBU();
		people1.select();
		people2.select();
		people3.select();
	}

}
