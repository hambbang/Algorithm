package happyhappy;
import java.util.Scanner;
class Point{
	Scanner sc = new Scanner(System.in);
	private int x=0,y=0;
	private static int t1=0,t2=0;
	void setXPoint(int x){
			if( x<11 && x>0) {
				this.x = x;
				t1++;
			}else {
				System.out.println("범위를 벗어났습니다. 다시 입력하시오.");
				x=0;
			}
	}
	void setYPoint(int y){
			if( y<11 && y>0) {
				this.y = y;
				t2++;
			}else {
				System.out.println("범위를 벗어났습니다. 다시 입력하시오.");
				y=0;	
			}
	}
	int getXpoint() {
		return x;
	}
	int getYpoint() {
		return y;
	}
	void printPoint() {
		System.out.println("현재 기본 값은 ("+x+","+y+")입니다.");
		System.out.println("X의 좌표를 입력하시오(1~10)");
		while(t1==0) {
			setXPoint(sc.nextInt());
		}
		System.out.println("Y의 좌표를 입력하시오(1~10)");
		while(t2==0) {
			setYPoint(sc.nextInt());
		}
	}
}
class ColorPoint extends Point{
	private int color;
	private static int t3=0;
	void setColor(int color) {
		if(color<7&&color>0) {
			this.color = color;
			t3++;
		}else {
			System.out.println("잘못 입력하였습니다. 다시 입력하시오.");
		}
	}
	String getColor(){
		switch(color) {
		case 1:
			return "빨강";
		case 2:
			return "분홍";
		case 3:
			return "노랑";
		case 4:
			return "초록";
		case 5:
			return "파랑";
		case 6:
			return "검정";
		default:
			return "오류";
		}
	}
	void print() {
		System.out.println("1.빨강  2.분홍  3.노랑  4.초록  5.파랑  6.검정");
		while(t3==0) {
			setColor(sc.nextInt());
		}
		System.out.println("좌표의 위치: ("+getXpoint()+","+getYpoint()+")");
		System.out.println("좌표의 색생: "+getColor());
		
		
	}
}

public class happy {
	public static void main(String args[]) {
		
		ColorPoint a = new ColorPoint();
		a.printPoint();
		a.print();
		
	}
}
