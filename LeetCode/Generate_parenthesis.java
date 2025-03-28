// import java.util.ArrayList;
// import java.util.List;
// public class Generate_parenthesis {
//     private boolean isValid(String str) {
//         int sum = 0;
//           for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (ch == '(')
//                 sum++;
//             else
//                 sum--;
//             if (sum < 0)
//                 return false;
//         }
//         return sum == 0;
//     }

//     void function(List<String> result,String curr_str,int n)
//     {
//         if(curr_str.length()==(n*2))
//         {
//             if(isValid(curr_str))
//             {
//                 result.add(curr_str);
//             }
//             return;
//         }

//         curr_str+= '(';
//         function(result,curr_str,n);
//         curr_str=curr_str.substring(0,curr_str.length()-1);
//         curr_str+= ')';
//        function(result,curr_str,n);
//     }
//     public List<String> generateParenthesis(int n) {

//         List<String> result = new ArrayList<>();
//         function(result,"",n);
//         return result;
//     }




//     public static void main(String[] args) {
//         Generate_parenthesis gp = new Generate_parenthesis();
//         int n = 3; // Example input
//         List<String> combinations = gp.generateParenthesis(n);

//         System.out.println("All valid combinations of " + n + " pairs of parentheses:");
//         for (String combination : combinations) {
//             System.out.println(combination);
//         }
//     }
// }




import java.util.ArrayList;
import java.util.List;

public class Generate_parenthesis {

    void function(List<String> ans, int n, int open, int close, String curr_str) {
        if (curr_str.length() == (n * 2)) {
            ans.add(curr_str);
            return;
        }
        if (open < n) {
            function(ans, n, open + 1, close, curr_str + "(");
        }
        if (close < open) {
            function(ans, n, open, close + 1, curr_str + ")");
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        function(ans, n, 0, 0, "");
        return ans;
    }

    public static void main(String[] args) {
        Generate_parenthesis gp = new Generate_parenthesis();
        int n = 3; // Example input
        List<String> combinations = gp.generateParenthesis(n);

        System.out.println("All valid combinations of " + n + " pairs of parentheses:");
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }
}
