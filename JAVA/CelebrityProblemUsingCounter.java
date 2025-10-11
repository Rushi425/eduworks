
public class CelebrityProblemUsingCounter {

	public static void main(String[] args) {
		int[][] arr = {
			{0,1,1,0},
			{0,0,0,0},
			{0,1,0,0},
			{1,1,0,0}
		};
		int n = arr.length;

		for (int i = 0; i < n; i++) {
		    boolean heKnowsSomeone = false;

		    // Check if i knows someone
		    for (int j = 0; j < n; j++) {
		        if (arr[i][j] == 1) {
		            heKnowsSomeone = true;
		            break; // i knows someone → cannot be celebrity
		        }
		    }

		    if (heKnowsSomeone) continue; // skip to next i

		    // Count how many know i
		    int countKnownBy = 0;
		    for (int j = 0; j < n; j++) {
		        if (i != j && arr[j][i] == 1) countKnownBy++;
		    }

		    if (countKnownBy == n - 1) {
		        System.out.println("Celebrity is: " + i);
		        return;
		    }
		}

		System.out.println("No celebrity found");

	}

}
