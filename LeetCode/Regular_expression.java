public class Regular_expression {
    public boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        int mr = dp.length - 1;
        int mc = dp[0].length - 1;
        for (int i = 0; i <= mr; i++) {
            for (int j = 0; j <= mc; j++) {
                if (i == 0 && j == 0)// First cell
                {
                    dp[i][j] = true;// Blank source match blank patttern
                } else if (i == 0)// First row
                {
                    // It contain true false both
                    // If char come or . come ,so false as Source is blank
                    char chp = p.charAt(j - 1);// j start after leaving blank so -1;
                    if (chp == '*') // agr * hai to 2 back jaa kr uthaa lenge
                    {
                        dp[i][j] = dp[i][j - 2];
                    } else {
                        dp[i][j] = false;
                    }
                } else if (j == 0)// First col
                {
                    dp[i][j] = false;// first col me string hai pr pattern - blank hai
                } else// Baaki k area
                {
                    char chp = p.charAt(j - 1);
                    char chs = s.charAt(i - 1);
                    if (chp == '*') {
                        dp[i][j] = dp[i][j - 2];
                        char chp_1 = p.charAt(j - 2);
                        if (chp_1 == '.' || chp_1 == chs) {
                            dp[i][j] |= dp[i - 1][j];
                        }
                    } else if (chp == chs || chp == '.') {
                        dp[i][j] = dp[i - 1][j - 1];// diagonaly upr ja kr uthaa lo
                    } else {
                        dp[i][j] = false;
                    }

                }
            }
        }
        return dp[mr][mc];
    }

    public static void main(String[] args) {

    }
}
