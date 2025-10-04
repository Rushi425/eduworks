import java.util.HashMap;
import java.util.Map;

public class MColouringGraph {
	
	public static boolean isSafe(int[][] edges, Map<Integer, Integer> assignedColors, int color, int node) {
		for (int[] edge : edges) {
			if (edge[0] == node && assignedColors.get(edge[1]) == color) return false;
			if (edge[1] == node && assignedColors.get(edge[0]) == color) return false;
		}
		return true;
	}

	public static boolean solve(Map<Integer, Integer> assignedColor, int[][] edges, int node, int m, int n) {
		if (node > n) return true;
		
		for (int color = 1; color <= m; color++) {
			if (isSafe(edges, assignedColor, color, node)) {
				assignedColor.put(node, color);
				
				if (solve(assignedColor, edges, node + 1, m, n))
					return true;
				
				assignedColor.put(node, 0); // backtrack
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[][] edges = {{1, 2}, {2, 3}, {3, 4}, {4, 1}, {1, 3}};
		int m = 3, n = 4;
		Map<Integer, Integer> assignedColor = new HashMap<>();
		
		for (int i = 1; i <= n; i++) {
			assignedColor.put(i, 0);
		}

		if (solve(assignedColor, edges, 1, m, n)) {
			System.out.println("✅ Possible with " + m + " colors for given graph");
			System.out.println("Color assignment: " + assignedColor);
		} else {
			System.out.println("❌ Not possible with " + m + " colors for given graph");
		}
	}
}
