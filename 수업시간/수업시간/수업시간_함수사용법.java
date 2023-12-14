package Hambbang;

import java.util.StringTokenizer;

public class Hamtua {

	public static void main(String[] args) {
		String line;
		String tmpStr="hong 용산구   10.5 20.5";
		StringTokenizer parse = new StringTokenizer(tmpStr);
		String name;
		String adress;
		double math;
		double english;
		double total;
		double avg;
		name=parse.nextToken();
		adress=parse.nextToken();
		math=Double.valueOf(parse.nextToken()).doubleValue();
		english=Double.valueOf(parse.nextToken()).doubleValue();
		total=math+english;
		avg=total/2.0;
		System.out.println(name+"\t"+adress+"\t"+math+"\t"+english+"\t"+
				total+"\t"+avg);
	}

}
