package javaTime;

class Height{
	int 키;
}

class 깅진싱 extends Height{
	깅진싱(){
		키=187;
	}
}
class 엠파라찌 extends Height{
	엠파라찌(){
		키=173;
	}
}
class 보건실{
	void 키재기(Height 살암) {
		if(살암 instanceof 깅진싱) {
			System.out.println("깅진싱의 키는 "+살암.키+"임니디");
		}
		if(살암 instanceof 엠파라찌) {
			System.out.println("엠파의 키는 "+살암.키+"입니디");
		}
	}
	
}
public class St {

	public static void main(String[] args) {
		보건실 보건시리=new 보건실();
		깅진싱 강진성 = new 깅진싱();
		엠파라찌 엠파= new 엠파라찌();
		보건시리.키재기(강진성);
		보건시리.키재기(엠파);
	}

}
