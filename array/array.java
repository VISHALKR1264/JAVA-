// ------------------------------------------------------------------------------------------------->
// // A Java program to find a peak element
// public class array {
// public static int peak_its_neighbours(int arr[], int n) {
// if (n == 1) {
// return 0;
// }

// if (arr[0] >= arr[1]) {
// return arr[0];
// }
// System.out.println("In first condition :- fails");
// if (arr[n - 1] >= arr[n - 2]) {
// return arr[n - 1];
// }
// System.out.println("In Second condition :- fails");
// for (int i = 1; i < n - 1; i++) {
// if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {

// return arr[i];
// }
// }
// return arr[0];

// }

// public static void main(String[] args) {
// // int [] a;
// // a=new int [12];
// int[] a = { 1, 3, 20, 4, 1, 0};
// int n = a.length;
// System.out.println("Total no. of terms in an array is :- " + n);
// System.out.println(" Peak value is " + peak_its_neighbours(a, n));

// }
// }

// ------------------------------------------->
// import java.util.Scanner;

// public class array
// {
// public static void main(String[] args) {
// int [] arr = new int [6];
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the size of the array");
// int n=sc.nextInt();
// System.out.println("ENTER THE ARRAY NUMBERS");
// for(int i=0;i<n;i++){
// arr[i]=sc.nextInt();
// }
// if(n==1)
// {
// System.out.println("Peak array index is "+ "0" + " and value is "+arr[0]);
// }
// else if(arr[0]>=arr[1]){
// System.out.println("Peak array index is "+ "0" + " and value is "+arr[0]);

// }
// else if(arr[n-1]>=arr[n-2]){
// System.out.println("Peak array index is "+ (n-1) + " and value is
// "+arr[n-1]);
// }
// else
// {
// for(int i=0;i<n-1;i++){
// if(arr[i] >= arr[i+1] && arr[i] >= arr[i-1])
// {
// System.out.println("Peak array index is "+ i + " and value is "+arr[i]);
// }
// }
// }
// }
// }

// ----------------------------------------------------------------------------------------------------------->
// finding peak element
// Uisng binary search and by recursion

// class peakelement {
// static int findpeakutil(int arr[],int low,int high,int n) {
// int mid=low+(high - low)/2;//find mid
// if((mid==0 || arr[mid-1]<=arr[mid]) && (mid==n-1 || arr[mid+1]<=arr[mid]))
// {
// return mid; //if mid is peak then it return mid
// }
// else if(mid>0 && arr[mid-1]>arr[mid])
// {
// return findpeakutil(arr,low,(mid-1),n); //if mid id not peak and its left
// neighbour is greater than it,
// //then left half must have a peak element
// }
// else
// //if mid is not peak and its right neighbour is greater than it
// //then right half must have a peak element
// return findpeakutil(arr,low,(mid+1),n);
// }

// static int findpeak(int arr[],int n)
// {

// return findpeakutil(arr, 0,n-1,n);
// }
// }

// public class array {
// public static void main(String[] args) {
// int arr[] = { 1, 2, 30, 42, 42, 32, 4 };
// int n = arr.length;
// System.out.println("Peak value is "+ peakelement.findpeak(arr,n));

// }
// }

// ----------------------------------------------------------------------->
// peak value by binary search
// class array
// {
// static int findpeak(int arr[],int n)
// {
// int l=0;
// int r=n-1;
// int mid=0;

// while(l<=r){
// //find mid by right shift
// mid=(l+r) >> 1;
// //if mid is the ans
// if((mid == 0 || arr[mid-1] <= arr[mid]) && (mid == n-1 || arr[mid+1] <=
// arr[mid]))
// break;
// //move the right pointer
// if(mid>0 && arr[mid - 1]>arr[mid])
// r=mid-1;
// else
// //move the left pointer
// l=mid+1;
// }
// return mid;

// }
// public static void main(String[] args) {
// int arr[] = { 1, 2, 30, 42, 42, 32, 4 };
// int n = arr.length;
// System.out.println("Peak value is "+ findpeak(arr,n));

// }
// }

// ----------------------------------------------------------------------------------------------->
// Find max and min from an array

// import java.util.*;

// class array
// {
// public static void main(String[] args) {
// int a[]={21,23,54,1,32,76,54};
// Arrays.sort(a);
// for(int i=0;i<a.length;i++)
// System.out.println("Shorted array will be:-- "+ a[i]);
// System.out.println("Shorted min array :-"+a[0]+" max will be
// "+a[a.length-1]);

// }
// }

// //----------------------------------------------------------------->
// //Arrange it in descending order
// class array {
// public static void main(String[] args) {
// int a[] = { 21, 23, 54, 1, 32, 76, 54 };
// int temp = 0;
// for (int i = 0; i < a.length; i++) {
// for (int j = i + 1; j < a.length; j++) {
// if (a[i] < a[j]) {
// temp = a[i];
// a[i] = a[j];
// a[j] = temp;
// }
// }
// }
// for(int i=0;i<a.length-1;i++)
// {
// System.out.println(a[i]);
// }
// System.out.println(a[a.length-1]);
// }
// }

// //Arrange it in ascending order
// class array {
// public static void main(String[] args) {
// int a[] = { 21, 23, 54, 1, 32, 76, 54 };
// int temp = 0;
// for (int i = 0; i < a.length; i++) {
// for (int j = 0; j < a.length-1; j++) {
// if (a[i] < a[j]) {
// temp = a[i];
// a[i] = a[j];
// a[j] = temp;
// }
// }
// }
// for (int i = 0; i < a.length - 1; i++) {
// System.out.println(a[i]);
// }
// System.out.println(a[a.length - 1]);
// }
// }

// -------------------------------------------------------------->
// Arrange in ascending order by using selection sort;
// insertion sort
// bubble sort
// quick sort

// //------------------------------------------------------------------->
// //Find the k'th smallest number
// import java.util.*;
// class array
// {
// public static int kthsmallest(int []arr,int k)
// {
// Arrays.sort(arr);

// return arr[k-1];
// }
// public static void main(String[] args) {
// int arr[]={12,3,5,7,39};
// int k=2;
// System.out.println("K'th smallest element is "+kthsmallest(arr,k));
// }
// }

// ------------------------------------------------------------->
// // Reverse an array by swaping
// public class array
// {

// static void reversearray(int arr[],int start,int end)
// {
// int temp;
// while(start<end)
// {
// temp=arr[start];
// arr[start]=arr[end];
// arr[end]=temp;
// start++;
// end--;
// }

// for(int i=0;i<6;i++)
// {
// System.out.print(arr[i]+" ");
// }

// }
// public static void main(String[] args) {
// int a[]={1,2,3,4,5,6};
// int n=5;
// reversearray(a, 0, n);
// }
// }

// //----------------------------------->
//// reverse an array
// public class array
// {

// static void reversearray(int arr[],int start,int end)
// {
// int temp;
// while(start<end)
// {
// temp=arr[start];
// arr[start]=arr[end];
// arr[end]=temp;
// start++;
// end--;
// }
// }
// static void printarray(int arr[],int size)
// {

// for(int i=0;i<size;i++)
// {
// System.out.print(arr[i]+" ");
// }
// System.out.println();
// }
// public static void main(String[] args) {
// int a[]={1,2,3,4,5,6};
// printarray(a, 6);
// reversearray(a, 0, 5);
// printarray(a, 6);

// }
// }

// -------------------------------------->
// Reverse an string
// class array
// {
// // Complete the function
// // str: input string
// public static String reverseWord(String str)
// {

// char ch;
// String nstr="";
// for(int i=0;i<str.length();i++)
// {
// ch=str.charAt(i);
// nstr=ch+nstr;
// }

// return nstr;
// }
// public static void main(String args[])
// {
// String str="Geeks";
// System.out.println(reverseWord(str));
// }
// }

// ---------------------------------------------------------------------------->
// Sort an array is 0's 1's and 2's order;
// class array {
// public static void sort(int arr[], int n) {
// int lo = 0, mid = 0, hi = n - 1;
// int temp, tem;
// while (mid <= hi) {
// if (arr[mid] == 0) {
// temp = arr[lo];
// arr[lo] = arr[mid];
// arr[mid] = temp;

// mid++;
// lo++;
// } else if (arr[mid] == 1) {
// // arr[mid] = 1;
// mid = mid + 1;

// } else if (arr[mid] == 2) {

// tem = arr[mid];
// arr[mid] = arr[hi];
// arr[hi] = tem;
// hi = hi - 1;

// }

// }

// }

// static void printArray(int arr[], int arr_size) {
// int i;
// for (i = 0; i < arr_size; i++)
// System.out.print(arr[i] + " ");
// System.out.println("");
// }

// public static void main(String[] args) {
// int arr[] = { 2, 2, 1, 0, 0, 2, 2 };
// int n = arr.length;
// sort(arr, n);
// printArray(arr, n);
// }
// }

// //--------------------------------------------------------------------->
// //subarray
// class array {
// public static void subarray(int arr[], int n, int sum) {
// int current=0;
// for (int i = 0; i < n; i++) {
// current = arr[i];

// if (current == sum) {
// System.out.println("This index is substring "+i);
// }

// else
// {
// for(int j=i+1;j<n;j++)
// {
// current+=arr[j];

// if(current==sum)
// {
// System.out.println("sum found b/w indexes "+ i +" and "+j);
// }
// }
// }
// }
// System.out.println("No subarray found");

// }

// public static void main(String[] args) {
// int arr[] = { 15, 2, 4, 8, 9, 5, 12 };
// int n = arr.length;
// int sum = 12;
// subarray(arr, n, sum);

// }
// }


// //--------------------------------------------------------------------->
// //insertion in array
// class array
// {
//     public static void main(String[] args) {
//         int []arr={10,21,32,20};
//         int pos=3;
//         int element=9;
//         for(int i=arr.length-1;i>=pos-1;i--)
//         {
//             arr[i]=arr[i-1];
//         }
//         arr[pos-1]=element;
//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.println(arr[i]+" ");
//         }

//     }
// }


// //----------------------------------------->

// //--------------------------------------------------------------------->
// //deletion in array
// class array
// {
//     public static void main(String[] args) {
//         int []arr={10,21,32,20};
//         int del_element=32;
//         for(int i=0;i<=arr.length;i++)

//         {
//             if(del_element==arr[i])
//             {
//                 for(int j=i;j<arr.length-1;j++)
//                 {
//                     arr[j]=arr[j+1];
//                 }
//                 break;
//             }
//         }
//                for(int i=0;i<arr.length-1;i++)
//         {
//             System.out.println(arr[i]+" ");
//         }

//     }
// }



