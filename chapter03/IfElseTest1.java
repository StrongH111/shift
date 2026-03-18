class IfElseTest1{
	public static void main(String[] args){
		int score = 94;
		if(score>=60 && score<=80){
			System.out.println("奖励环球影城一日游");
		}else if(score>80 && score<=99){
			System.out.println("奖励一辆山地自行车");
		}else if( score == 100){
			System.out.println("奖励一辆跑车");
		}else{
			System.out.println("胖揍一顿");
		}
	} 
}