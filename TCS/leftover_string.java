//given two string string A and B your task is to find the leftover string A after deleting all the letter that are prensent in B 
//ex I/P->AABBCC & BC so,O/P->AA

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class leftover_string {
    public static void main(String[] args) {
        String A,B;
        Scanner sc=new Scanner(System.in);
        A=sc.nextLine();
        B=sc.nextLine();

        Set<Character> removeset = new HashSet<>();
        for(int i=0;i<B.length();i++)
        {
            removeset.add(B.charAt(i));
        }

        StringBuilder sp=new StringBuilder();
        for(int j=0;j<A.length();j++)
        {
            if(!removeset.contains(A.charAt(j)))
            {
                sp.append(A.charAt(j));
            }
        }
        System.out.println(sp.toString());
    }
    
}
