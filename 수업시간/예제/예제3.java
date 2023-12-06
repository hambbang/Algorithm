package Bye;
class Trip {
	String teamName;
	double meat;
	int ramen;
	public int hi() {
		return rramen()+mmeat();
	}
	public int rramen() {
		return ramen*700;
	}
	public int mmeat() {
		return (int)(meat*13340);
	}
	
}
public class TripExample {
	public static void main(String[] args) {
		Trip team1=new Trip();
		Trip team2=new Trip();
		Trip team3=new Trip();
		team1.teamName="강진성";
		team1.meat=3.5;
		team1.ramen=3;
		team2.teamName="강이긴성";
		team2.meat=0;
		team2.ramen=3;
		team3.teamName="약진성";
		team3.meat=7.2;
		team3.ramen=0;
		
		System.out.println("team1의 팀명은 "+team1.teamName+
				"팀이고 고기"+team1.meat+"kg에 "+team1.mmeat()+
				"원, 라면 "+team1.ramen+"개에 "+team1.rramen()+
				"원 총"+team1.hi()+"원 입니다.");
		
		System.out.println("team2의 팀명은 "+team2.teamName+
				"팀이고 고기"+team2.meat+"kg에 "+team2.mmeat()+
				"원, 라면 "+team2.ramen+"개에 "+team2.rramen()+
				"원 총"+team2.hi()+"원 입니다.");
		
		System.out.println("team3의 팀명은 "+team3.teamName+
				"팀이고 고기"+team3.meat+"kg에 "+team3.mmeat()+
				"원, 라면 "+team3.ramen+"개에 "+team3.rramen()+
				"원 총"+team3.hi()+"원 입니다.");
		
		
	}
}

