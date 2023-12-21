package Hambbang;

import java.util.Scanner;

class Check {
	Scanner sc = new Scanner(System.in);
	String num;
	int hn;
	String hName[];
	int 김 = 0;
	int 이 = 0;
	int 박 = 0;
	int 최 = 0;
	int 정 = 0;
	int most = 0;
	char 최다성;

	Check() {
		Ask1();
	}

	void Ask1() {
		System.out.print("몇 명이 있습니까? ");
		num = sc.next();
		hn = Integer.parseInt(num.substring(0,1));
		hName = new String[hn];
		for (int i = 0; i < hn; i++) {
			System.out.println(i + 1 + "번 이름을 입력하시오: ");
			hName[i] = sc.next();
			switch (hName[i].charAt(0)) {
			case '김':
				김++;
				break;
			case '이':
				이++;
				break;
			case '박':
				박++;
				break;
			case '최':
				최++;
				break;
			case '정':
				정++;
				break;
			}
		}
		System.out.println("김씨는 " + 김 + "명/이씨는 " + 이 + "명/박씨는 " + 박 + "명/정씨는 " + 정 + "명/최씨는 " + 최 + "명");
		most=Math.max(김,Math.max(이,Math.max(박,Math.max(정,최 ) ) ) );
		if(most==김)
			최다성='김';
		else if(most==이)
			최다성='이';
		else if(most==박)
			최다성='박';
		else if(most==정)
			최다성='정';
		else if(most==최)
			최다성='최';
		System.out.println("제일 많은 성은 "+최다성+"씨 "+most+"명입니다.");
	}
}

public class Hamtua {
	public static void main(String[] args) {
		Check test = new Check();
	}
}
