package hiru;
class Trip{
	String teamName;
	double meat;
	int ramen;
	int mCo,rCo;
	Trip(){
		this("강진성",2.5,6);
	}
	Trip(String teamName,double meat){
		this(teamName,meat,3);
	}
	Trip(String teamName, double meat, int ramen){
		this.teamName=teamName;
		this.meat=meat;
		this.ramen=ramen;
		mCo=(int)(meat*13340);
		rCo=ramen*700;
	}
	int cir(int mCo, int rCo) {
		return mCo+rCo;
	}
	void printt() {
		System.out.println("팀명은 "+teamName+"이고 고기 "+meat+"kg에 "+mCo+
				"원, 라면 "+ramen+"개에 "+rCo+"원 총 "+cir(mCo,rCo)+"원입니다.");
	}
	
}
public class TripExample {

	public static void main(String[] args) {
		Trip team1=new Trip();
		Trip team2=new Trip("약진성",1);
		Trip team3=new Trip("강이긴성",3,5);
		team1.printt();
		team2.printt();
		team3.printt();
	}

}
