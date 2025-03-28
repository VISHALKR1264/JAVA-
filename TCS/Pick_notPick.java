
// //You are given an array of size 'N', you have to find the length of longest subsequence, In which the difference of every consecutive element is divisible by 'k';
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pick_notPick {
    public static int maxi = 0;

    public static void solve(int idx, int arr[], List<Integer> temp, int k) {
        if (idx == arr.length) {
            if (maxi < temp.size()) {
                maxi = temp.size();
            }
            return;
        }

        if (temp.size() == 0 || (arr[idx] - temp.get(temp.size() - 1)) % k == 0) // pick
        {
            temp.add(arr[idx]);
            solve(idx + 1, arr, temp, k);
            temp.remove(temp.size() - 1);// backtrack;
        }
        solve(idx + 1, arr, temp, k); // not pick
    }

    public static void main(String[] args) {
        int n, k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of 'N' and 'K'..~!!!");
        n = sc.nextInt();
        k = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> temp = new ArrayList<>();
        int idx = 0;

        solve(idx, arr, temp, k);
        System.out.println("Maximum size of valid subset: " + maxi);
    }
}

// //You are given an array of size 'N', you have to find the length of longest
// subsequence, such that each element in the sequence is triple of its
// previous;

// public class Pick_notPick {
// public static int maxi = 0;

// public static void solve(int idx, int arr[], List<Integer> temp) {
// if (idx == arr.length) {
// if (maxi < temp.size()) {
// maxi = temp.size();
// }
// return;
// }

// if (temp.size() == 0 || (temp.get(temp.size()-1))*3 == arr[idx]) // pick
// {
// temp.add(arr[idx]);
// solve(idx + 1, arr, temp);
// temp.remove(temp.size() - 1);// backtrack;
// }
// solve(idx + 1, arr, temp); // not pick
// }

// public static void main(String[] args) {
// int n, k;
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the value of 'N'");
// n = sc.nextInt();
// int arr[] = new int[n];

// System.out.println("Enter the elements of the array:");
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }

// List<Integer> temp = new ArrayList<>();
// int idx = 0;

// solve(idx, arr, temp);
// System.out.println("Maximum size of valid subset: " + maxi);
// }
// }
