package hi;
import java.util.Scanner;
class Point{
	private int x,y,su;
	Scanner sc= new Scanner(System.in);
	String getprint() {
		return "좌표의 위치: ("+x+", "+y+")";
	}
	void setterX(int x) {
		if(su>0&&su<11)
			this.x=x;
		else
			System.out.println("범위를 벗어났습니다. 다시 입력하시오.");
	} 
	void setterY(int y) {
		if(su>0&&su<11)
			this.y=y;
		else
			System.out.println("범위를 벗어났습니다. 다시 입력하시오.");
	} 
	void while1() {
		System.out.println("현재 기본 값은 (0, 0)입니다.\n");
		while(true) {
			System.out.print("X 좌표의 위치를 입력하십시오(1~10): ");
			su=sc.nextInt();
			setterX(su);
			if(x!=0)break;
		}
		while(true) {
			System.out.print("Y 좌표의 위치를 입력하십시오(1~10): ");
			su=sc.nextInt();
			setterY(su);
			if(y!=0)break;
		}
	}
}
class ColorPoint extends Point{
	private int setColor;
	private String 색;
	void 판단() {
		switch(setColor) {
			case 1:색="빨강색";break;
			case 2:색="분홍색";break;
			case 3:색="노랑색";break;
			case 4:색="초록색";break;
			case 5:색="파랑색";break;
			case 6:색="검정색";break;
			default:setColor=0;
		}
	}
	String getprint2() {
		System.out.println();
		return getprint()+"\n좌표의 색상: "+색;
	}
	void while2() {
		System.out.println();
		System.out.println("1. 빨강 2. 분홍 3. 노랑 4. 초록 5. 파랑 6. 검정");
		while(true) {
			System.out.print("원하는 점의 색상을 선택하시오: ");
			setColor=sc.nextInt();
			판단();
			if(setColor!=0)
				break;
			System.out.println("잘못 입력하였습니다. 다시 입력하시오.");
		}
		System.out.println(getprint2());
	}
}
public class c1 {
	public static void main(String[] args) {
		ColorPoint cp= new ColorPoint();
		cp.while1();
		cp.while2();
	}
}
