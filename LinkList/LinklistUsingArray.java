
// //----------------------------->
// //Linklist  using array
// class LinklistUsingArray
//  {
//      public static final int max=10;

//      int cne = 0;

//     public void insert(int arr[], int val, int pos) {
//         if (cne == max) {
//             System.out.println("Not possibe to insert bcz array is full");
//         }
//         if (pos >= cne) {
//             arr[cne] = val;
//             cne++;
//         } else {
//             for (int i = cne - 1; i >= pos; i--) {
//                 arr[i + 1] = arr[i];
//                 arr[pos] = val;
//                 cne++;
//             }
//         }
//     }

//     void display(int arr[]) {
//         for (int i = 0; i < cne; i++) {
//             System.out.println(arr[i]);
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = new int[max];
//         LinklistUsingArray list = new LinklistUsingArray();
//         list.insert(arr, 14, 2);
//         list.insert(arr, 11, 0);
//         list.insert(arr, 12, 1);
//         list.display(arr);
//     }
// }

// //-------------------->
// //delete the array list by pos

// class LinklistUsingArray {
//     public static final int max = 10;

//     int cne = 0;

//     public void insert(int arr[], int val, int pos) {
//         if (cne == max) {
//             System.out.println("Not possibe to insert bcz array is full");
//         }
//         if (pos >= cne) {
//             arr[cne] = val;
//             cne++;
//         } else {
//             for (int i = cne - 1; i >= pos; i--) {
//                 arr[i + 1] = arr[i];
//                 arr[pos] = val;
//                 cne++;
//             }
//         }
//     }

//     void deletebypos(int arr[], int pos) {
//         if ((cne == 0) || (pos >= cne)) {
//             System.out.println("list is empty at that pos");
//         } else {
//             for (int i = pos + 1; i <= cne - 1; i++) {

//                 arr[i - 1] = arr[i];

//             }
//             cne--;
//         }
//     }

//     void display(int arr[]) {
//         for (int i = 0; i < cne; i++) {
//             System.out.println(arr[i]);
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = new int[max];
//         LinklistUsingArray list = new LinklistUsingArray();
//         list.insert(arr, 14, 2);
//         list.insert(arr, 11, 0);
//         list.insert(arr, 12, 1);
//         list.display(arr);
//         System.out.println("Deleting the value by pos");
//         list.deletebypos(arr, 2);
//         list.display(arr);
//     }
// }

//-------------------->
//delete the array list by val

class  LinklistUsingArray {
    public static final int max = 10;

    int cne = 0;

    public void insert(int arr[], int val, int pos) {
        if (cne == max) {
            System.out.println("Not possibe to insert bcz array is full");
        }
        if (pos >= cne) {
            arr[cne] = val;
            cne++;
        } else {
            for (int i = cne - 1; i >= pos; i--) {
                arr[i + 1] = arr[i];
                arr[pos] = val;
                cne++;
            }
        }
    }

    void deletebyval(int arr[], int val) {
        for (int i = 0; i <= cne; i++) {
            if (arr[i] == val) {
                for (int j = i; j <= cne; j++) {
                    arr[j] = arr[j + 1];
                }
                cne--;
            }
        }
    }

    void deletebyval2(int arr[], int val) {
        int flag=0;
        for (int i = 0; i <= cne-1; i++) {
            if (arr[i] == val) {
                flag=1;
                for(int j=i+1;j<=cne-1;j++)
                {
                    arr[j-1]=arr[j];
                }
                break;
            }
        }
        if(flag==1)
        {
            cne--;
        }
        else
        {
            System.out.println("Not found");
        }
    }

    void display(int arr[]) {
        for (int i = 0; i < cne; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[max];
        LinklistUsingArray list = new LinklistUsingArray();
        list.insert(arr, 14, 2);
        list.insert(arr, 11, 0);
        list.insert(arr, 12, 1);
        list.display(arr);
        System.out.println("Deleting the value by value");
        list.deletebyval2(arr, 12);
        list.deletebyval(arr, 11);
        list.display(arr);
    }
}
