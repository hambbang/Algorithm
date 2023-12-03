package Bye;
import java.util.Scanner;
public class GoHome {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int[]score=new int[5];
		int su;
		int i;
		String []name=new String[5];
		for(i=0;i<5;i++) {
			System.out.print(i+1+"번 학생의 이름을 입력하십시오 : ");
			name[i]=sc.next();
			System.out.print(i+1+"번 학생의 점수를 입력하십시오 : ");
			score[i]=sc.nextInt();
		}
		while(true) {
			System.out.print("찾는 점수를 입력하십시오 : ");
			su=sc.nextInt();
			for(i=0;i<=4;i++) 
				if(score[i]==su) 
					break;
			i=i>4?4:i;
			if(score[i]==su) {
				System.out.println(su+"점 맞은 사람의 이름은 "+name[i]+" 입니다.");
				break;
			}
			System.out.println(su+"점 맞은 사람이 없습니다.");
		}
	}
}