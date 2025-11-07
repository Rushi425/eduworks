package accenture;

public class TossAndScore {
	static public int findScore(String tosses) {
		int score = 0;
		int n = tosses.length();
		int continous = 0;
		
		for(int i = 0; i < n; i++) {
//			System.out.print("i: " +i);
			char c = tosses.charAt(i);
			if(c == 'H') score += 2;
			else score -= 1;
			
//			System.out.println(" score: "+score );

			if(c == 'H')continous++;
			else continous = 0;
		
			
			if(continous == 3) return score;
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		// head = 2 tail = -1
		// end = if continue 3 in row head
		// tosses length of s
		String tosses = "HTHHTTHTHHTHT";
		System.out.println("Score: " + findScore(tosses));
	}

}
