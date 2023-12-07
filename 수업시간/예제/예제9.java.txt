package hi;
import java.util.Scanner;
class Human {
	String name;
	int key, mom, nay,no;
	boolean man;
	public double cul() {
		if(man) {
			return 66.47+(13.75*mom)+(5*key)-(6.76*nay);
		}
		else return 655.51+(9.56*mom)+(1.85*key)-(4.68*nay);
	}
	public Human(String name, int key, int mom, int nay, boolean man,int no) {
		this.name=name;
		this.key=key;
		this.mom=mom;
		this.nay=nay;
		this.man=man;
	}
	public void cc() {
		System.out.println("No."+(no+1)+" "+name+" "+
				key+"cm "+nay+"살 비만도"+
				cul());
	}
}
public class hihello {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("HUMAN은 총 몇 명 입니까? ");
		int n=sc.nextInt();
		Human[] huamns = new Human[n];
		String name=null;
		int key, mom=0, nay=0;
		boolean man;
		
		for(int i=0;i<n;i++){
			System.out.print("No."+(i+1)+"의 이름은 무엇입니까 : ");
			name=sc.next();
			System.out.print("No."+(i+1)+"의 키는 무엇입니까 : ");
			key=sc.nextInt();
			System.out.print("No."+(i+1)+"의 몸무게는 무엇입니까 : ");
			mom=sc.nextInt();
			System.out.print("No."+(i+1)+"의 나이는 무엇입니까 : ");
			nay=sc.nextInt();
			System.out.print("No."+(i+1)+"의 성별은 무엇입니까 : ");
			man=(sc.next()=="남성"?true:false);
			huamns[i]= new Human(name, key, mom, nay, man,i);
		}
		for(int i=0;i<n;i++) {
			huamns[i].cc();
		}
	}
}
