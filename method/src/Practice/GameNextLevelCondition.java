package Practice;

public class GameNextLevelCondition {
	public static boolean isAllowedToGetDiamond(int finalLevel, int threshold) {
		int score=0,rewards=0;
		for(int level=0; level<finalLevel; level++) {
			score+=10;
			rewards+=5;
			
			if((score+rewards)>=threshold) {
				System.out.println(level);
				return true;
			}
		}
		return false;
	}
		public static void main(String[] args) {
			boolean isGettingDiamond=isAllowedToGetDiamond(10, 50);
		if(isGettingDiamond) {
			System.out.println("Congratulations you are getting diamond at level of ");
		}
	}

}
