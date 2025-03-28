//Given a string consist of *,# .the length of the string is variable .the task is to find the min number of * & # to make the string Valid.
//the string is valid if no.of *== no of #;

public class valid_string {
    public static void valid(String str) {
        int count_star = 0, count_hash = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                count_star++;
            } else {
                count_hash++;
            }
        }

        int diff = Math.abs(count_star - count_hash);
        if (diff == 0) {
            System.out.println("Number of * & # are VALID!!!");
        } else {
            char lessChar = count_star > count_hash ? '#' : '*';
            System.out.println(
                    "Number of * & # for becaming the String " + str + " Valid " + diff + " i.e. --->" + lessChar);
        }

    }

    public static void main(String[] args) {
        String str = "**###*###*";
        valid(str);

    }
}
