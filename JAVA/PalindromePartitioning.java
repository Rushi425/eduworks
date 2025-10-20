import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
	
	public static boolean isPalindrome (String s) {
			for(int i = 0; i < s.length() / 2; i++){
				if(s.charAt(i) != s.charAt(s.length() - i - 1)) {
					return false;
				}
			}
		return true;
	}
	
	public static void function(String str,List<List<String>> res, List<String> currList, int leftPos, int rightPos){
		if(rightPos == str.length()) {
			if(leftPos == str.length()) {
				res.add(new ArrayList<>(currList));
			}
			return;
		}
		String subString = str.substring(leftPos, rightPos + 1);
		
		if(isPalindrome(subString)) {
			currList.add(subString);
			function(str, res, currList, rightPos + 1, rightPos + 1);
			currList.remove(currList.size() - 1);
		}
		
		function(str, res, currList, leftPos, rightPos + 1);
	}
	public static void main(String[] args) {
		String str = "abbb";
		List<List<String>> res = new ArrayList<>();
		function(str, res, new ArrayList<>(), 0, 0);
		System.out.println(res);

	}

}
