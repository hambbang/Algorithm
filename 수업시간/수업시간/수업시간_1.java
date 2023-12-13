package hi;
class people {
	String name="류찬열";
	int nay=25,key=190;
	String print1(){
		return ("이름은 "+name+", 나이는 "+nay+"살,"+
				"키는 "+key+".\n");
	}
}
class Student extends people{
	String hak="서울예대",jun="연영";
	int ban=11, bun=201316;
	void print2() {
		System.out.println("student의 "+print1()+hak+
				"에 다니며 "+jun+"과 "+
				+ban+"반 "+bun+"번입니다.");
	}
	Student(String name,int nay, int key){
		this.name=name;
		this.nay=nay;
		this.key=key;
	}
}
class police extends people {
	String chi="힙합듣기";
	void print2(){
		System.out.println("police의 "+print1()+"취미는 "
				+chi+"입니다.");
	}
	police(String name,int nay, int key){
		this.name=name;
		this.nay=nay;
		this.key=key;
	}
}
public class wq {
	public static void main(String[] args) {
		Student hi=new Student("아기토끼",25,178);
		police he=new police("악상",30,178);
		hi.print2();
		he.print2();
	}
}