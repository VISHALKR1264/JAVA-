
// import java.util.Vector;

// class zigzag {
//     public String convert(String s, int numRows) {
//         if (numRows == 1) {
//             return s;
//         }
//         Vector<String> rows = new Vector<>();
//         for (int i = 0; i < Math.min(numRows, s.length()); i++) {
//             rows.add("");// Empty vector is created
//         }

//         boolean flag = false;
//         int i = 0;
//         for (int j = 0; j < s.length(); j++) {
//             char ch = s.charAt(j); // String to char
//             rows.set(i, rows.get(i) + ch);
//             if (i == 0 || i == numRows - 1) {
//                 flag = !flag;
//             }
//             if (flag == true) {
//                 i = i + 1;
//             } else {
//                 i = i - 1;
//             }

//         }
//         StringBuilder zigzag = new StringBuilder();
//         for (String row : rows) {
//             zigzag.append(row);
//         }

//         return zigzag.toString();
//     }

//     public static void main(String[] args) {
//         zigzag solution = new zigzag();

//         // Test cases
//         String s = "PAYPALISHIRING";
//         int numRows = 3;
//         System.out.println("Input: " + s);
//         System.out.println("Output: " + solution.convert(s, numRows)); // Output: "PAHNAPLSIIGYIR"

//         numRows = 4;
//         System.out.println("Input: " + s);
//         System.out.println("Output: " + solution.convert(s, numRows)); // Output: "PINALSIGYAHRPI"

//         // Additional test cases can be added here
//     }

// }
////////////////////////////////////////////////////////////////////////////////////////////////////

// import java.util.Vector;
// class Solution {
//     public String convert(String s, int numRows) {
//          if(numRows==1)
//         {
//             return s;
//         }
//         Vector <StringBuilder> rows=new Vector<>();
//        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
//            rows.add(new StringBuilder());
//         }
       
//         boolean flag=false;
//         int i=0;
    
//             for (int j = 0; j < s.length(); j++) {
//             char ch = s.charAt(j);
//             rows.get(i).append(ch);
//             if(i == 0 || i == numRows-1)
//             {
//                 flag=!flag;
//             }
//             if(flag==true)
//             {
//                 i=i+1;
//             }
//             else
//             {
//                 i=i-1;
//             }
        
//         }
       
//         StringBuilder zigzag = new StringBuilder();
//         for (StringBuilder row : rows) {
//             zigzag.append(row);
//         }

//         return zigzag.toString();
        
    
//     }
// }
import java.util.Vector;
class zigzag {
    public String convert(String s, int numRows) {
         if(numRows==1)
        {
            return s;
        }
        StringBuilder sb=new StringBuilder();
       
            for (int i = 0; i < numRows; i++) {
            int index=i;
            int South=2*(numRows-1-i);
            int North=2*i;
            boolean goingsouth=true;
            while(index<s.length()){
              sb.append(s.charAt(index));  
              if(i == 0)
              {
                index +=South;
              }
              else if(i==numRows -1)
             {
                index +=North;
             }
             else
             {
                if(goingsouth)
                {
                    index +=South;
                }
                else

                {
                    index +=North;
                }
                goingsouth =!goingsouth;
             }

            }
        
        }
        return sb.toString();     
    
    }
    public static void main(String[] args) {
        zigzag solution = new zigzag();

        // Test cases
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println("Input: " + s);
        System.out.println("Output: " + solution.convert(s, numRows)); // Output: "PAHNAPLSIIGYIR"

        numRows = 4;
        System.out.println("Input: " + s);
        System.out.println("Output: " + solution.convert(s, numRows)); // Output: "PINALSIGYAHRPI"

        // Additional test cases can be added here
    }
}
// 