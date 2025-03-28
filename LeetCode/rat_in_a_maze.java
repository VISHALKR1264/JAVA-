
// class rat_in_a_maze {
//     public ArrayList<String> findPath(int[][] mat) {
//         // Your code here
//          int n = mat.length;
//         if (mat[0][0] == 0 || mat[n - 1][n - 1] == 0) {
//             return result; // If starting or ending point is blocked
//         }
        
//         StringBuilder temp = new StringBuilder();
//         solve(0, 0, mat, n, temp);
//         return result;
//     }
    
    
//     private ArrayList<String> result = new ArrayList<>();

//     private boolean isSafe(int i, int j, int n) {
//         return i >= 0 && i < n && j >= 0 && j < n;
//     }

//     private void solve(int i, int j, int[][] mat, int n, StringBuilder temp) {
//         if (!isSafe(i, j, n) || mat[i][j] == 0) {
//             return;
//         }
//         if (i == n - 1 && j == n - 1) {
//             result.add(temp.toString());
//             return;
//         }

//         mat[i][j] = 0; // Mark as visited

//         // Move Down
//         temp.append('D');
//         solve(i + 1, j, mat, n, temp);
//         temp.deleteCharAt(temp.length() - 1);

//         // Move Right
//         temp.append('R');
//         solve(i, j + 1, mat, n, temp);
//         temp.deleteCharAt(temp.length() - 1);

//         // Move Up
//         temp.append('U');
//         solve(i - 1, j, mat, n, temp);
//         temp.deleteCharAt(temp.length() - 1);

//         // Move Left
//         temp.append('L');
//         solve(i, j - 1, mat, n, temp);
//         temp.deleteCharAt(temp.length() - 1);

//         mat[i][j] = 1; // Unmark as visited
//     }
// }


//Without StringBuilder

// import java.util.*;

// class Solution {
//     private List<String> result = new ArrayList<>();

//     private boolean isSafe(int i, int j, int n) {
//         return i >= 0 && i < n && j >= 0 && j < n;
//     }

//     private void solve(int i, int j, int[][] m, int n, String temp) {
//         if (!isSafe(i, j, n) || m[i][j] == 0) {
//             return;
//         }
//         if (i == n - 1 && j == n - 1) {
//             result.add(temp);
//             return;
//         }

//         m[i][j] = 0; // Mark as visited

//         // Move Down
//         solve(i + 1, j, m, n, temp + 'D');

//         // Move Right
//         solve(i, j + 1, m, n, temp + 'R');

//         // Move Up
//         solve(i - 1, j, m, n, temp + 'U');

//         // Move Left
//         solve(i, j - 1, m, n, temp + 'L');

//         m[i][j] = 1; // Unmark as visited
//         // In the String version of the solve method, you don't explicitly "pop back" elements because each recursive call to solve is given a new String object
//         //Immutable Strings: In Java, String objects are immutable. This means that once you create a String, you cannot modify it. When you perform an operation like temp + 'D', a new String is created, and the old String remains unchanged. Each recursive call gets its own String instance, representing the path at that point in the recursion.

//     }

//     public List<String> findPath(int[][] m, int n) {
//         String temp = "";
//         solve(0, 0, m, n, temp);
//         return result;
//     }
// }

// public class rat_in_a_maze {
//     public static void main(String[] args) {
//         Solution solution = new Solution();
//         int[][] mat = {
//             {1, 0, 0, 0},
//             {1, 1, 0, 1},
//             {1, 1, 0, 0},
//             {0, 1, 1, 1}
//         };
//         int n = mat.length;

//         List<String> paths = solution.findPath(mat, n);
//         System.out.println("Possible Paths:");
//         for (String path : paths) {
//             System.out.println(path);
//         }
//     }
// }



//Using StringBuilder
import java.util.*;

class Solution {
    private List<String> result = new ArrayList<>();

    private boolean isSafe(int i, int j, int n) {
        return i >= 0 && i < n && j >= 0 && j < n;
    }

    private void solve(int i, int j, int[][] m, int n, StringBuilder temp) {
        if (!isSafe(i, j, n) || m[i][j] == 0) {
            return;
        }
        if (i == n - 1 && j == n - 1) {
            result.add(temp.toString());
            return;
        }

        m[i][j] = 0;

        temp.append('D');
        solve(i + 1, j, m, n, temp);
        temp.deleteCharAt(temp.length() - 1);

        temp.append('R');
        solve(i, j + 1, m, n, temp);
        temp.deleteCharAt(temp.length() - 1);

        temp.append('U');
        solve(i - 1, j, m, n, temp);
        temp.deleteCharAt(temp.length() - 1);

        temp.append('L');
        solve(i, j - 1, m, n, temp);
        temp.deleteCharAt(temp.length() - 1);

        m[i][j] = 1;
    }

    public List<String> findPath(int[][] m, int n) {
        StringBuilder temp = new StringBuilder();
        solve(0, 0, m, n, temp);
        return result;
    }

}
public class rat_in_a_maze {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] mat = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };
        int n = mat.length;
        
        List<String> paths = solution.findPath(mat, n);
        System.out.println("Possible Paths:");
        for (String path : paths) {
            System.out.println(path);
        }
    }
}