
public class CelebrityUsingTwoPointer {

	public static void main(String[] args) {
		int[][] arr = {
				{0,1,1,0},
				{0,0,0,0},
				{0,1,0,0},
				{1,1,0,0}
			};
		int n = arr.length;
		
		int low = 0, high = n - 1;
		while(low < high) {
			if(arr[low][high] == 1) {
				low++;
			}
			else if(arr[high][low] == 1) {
				high--;
			}
			else {
				low++;
				high--;
			}
		}
		if(low != high) {
			System.out.println("No celeb");
			return;
		}
		else {
			for(int i = 0; i < n; i++) {
				if(i == low) continue;
				if(arr[low][i] != 0 || arr[i][low] != 1) {
					System.out.println("No celeb");
					return;
				}
			}
			System.out.println("Celebrity Found: " + low);
		}
		

	}

}
