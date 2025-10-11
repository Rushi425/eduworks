
public class CelebrityProblem {

	public static void main(String[] args) {
		int[][] arr = {
			{0,1,1,0},
			{0,0,1,0},
			{0,1,0,0},
			{1,1,0,0}
		};
		for(int i = 0; i < arr.length; i++) {
			boolean isHeDontKnowAnyone = true;
			for(int j = 0; j < arr.length; j++) {
				if(arr[i][j] == 1) {
					isHeDontKnowAnyone = false;
				}
			}
			if(isHeDontKnowAnyone) {
				boolean isHeKnowByEvryone = true;
				for(int r = 0; r < arr.length; r++) {
					if(arr[r][i] == 0) {
						if(i == r) continue;
						isHeKnowByEvryone = false;  
					}
				}
				if(isHeKnowByEvryone) {
					System.out.println("CelebrityProblem is:" +i);
					return;
				}
			}
		}
		System.out.println("No celebrity found");
	}

}
