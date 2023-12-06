package Bye;
import java.util.Scanner;
public class hihi {
	public static void main(String args[]) {
		Scanner sr=new Scanner(System.in);
		int[][]a= {{20105,178,85},{20108,170,89},{20203,165,98},{20208,168,50},{20214,188,73}};
		int i=0;
		char j[]=new char[5];
		for(i=0;i<5;i++) {
			System.out.print(a[i][0]+" 학번의 학생의 키는 "+a[i][1]+""
					+"cm이고 자바 점수는 "+a[i][2]+"으로 ");
			switch(a[i][2]/10) {
			case 10:	
			case 9: System.out.println("A등급입니다.");j[i]='A';break;
			case 8: System.out.println("B등급입니다.");j[i]='B';break;
			case 7: System.out.println("C등급입니다.");j[i]='C';break;
			default:System.out.println("D등급입니다.");j[i]='D';
			}
		}
		for(i=65;i<=68;i++) {
			System.out.print((char)i+"등급인 학생 :");
			for(int aa=0;aa<5;aa++) 
				if(i==j[aa]) 
					System.out.print(" "+a[aa][0]);
			System.out.println();
		}	
	}
}
