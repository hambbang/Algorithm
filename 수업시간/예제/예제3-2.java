package hiru;
class Trip{
	String teamName;
	double meat;
	int ramen;
	int mCo;
	int rCo;
	void setting(String teamName,double meat, int ramen) {
		this.teamName=teamName;
		this.meat=meat;
		this.ramen=ramen;
	}
	int cir(int mCo, int rCo) {
		return (mCo+rCo);
	}
	void CoCo() {
		mCo=(int)(meat*13340);
		rCo=ramen*700;
	}
	void printt() {
		CoCo();
		System.out.println("팀명은 "+teamName+"이고 고기 "+meat+"kg에 "+mCo+
				"원, 라면 "+ramen+"개에 "+rCo+"원 총 "+cir(mCo,rCo)+"원입니다.");
	}
	
}
public class TripExample {

	public static void main(String[] args) {
		Trip team1=new Trip();
		Trip team2=new Trip();
		Trip team3=new Trip();
		team1.setting("강진성", 1, 3);
		team2.setting("약진성", 4, 2);
		team3.setting("강이긴성", 6, 1);
		team1.printt();
		team2.printt();
		team3.printt();
	}

}
