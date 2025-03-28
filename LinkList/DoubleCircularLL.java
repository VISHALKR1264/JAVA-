// //------------------------------------>
// //Double circular Link list insert at last

// import java.util.Scanner;

// class DoubleCircularLL {
//     node head;

//     class node {
//         String data;
//         node next;
//         node prv;

//         node(String data) {
//             this.data = data;
//             this.next = null;
//             this.prv = null;
//         }
//     }

//     public void insertlast() {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the data");
//         String data = sc.nextLine();
//         node curr = new node(data);
//         if (head == null) {
//             head = curr.next = curr.prv = curr;
//         } else {
//             curr.prv = head.prv;
//             curr.next = head;
//             curr.prv.next = curr;
//             head.prv = curr;
//         }
//     }

//     void display() {
//         node ptr = head;
//         if (head != null) {
//             System.out.println("Data are displaying");
//             do {
//                 System.out.println(ptr.data);
//                 ptr = ptr.next;
//             } while (ptr != head);
//         }
//     }

//     public static void main(String[] args) {
//         DoubleCircularLL list = new DoubleCircularLL();
//         list.insertlast();
//         list.insertlast();
//         list.insertlast();

//         list.display();
//     }
// }

// //---------------------------->
// //Double Circular LinkList insert at begning

// import java.util.Scanner;

// class DoubleCircularLL {
//     node head;

//     class node {
//         String data;
//         node next;
//         node prv;

//         node(String data) {
//             this.data = data;
//             this.next = null;
//             this.prv = null;
//         }
//     }

//     public void insertbeg() {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the data");
//         String data = sc.nextLine();
//         node curr = new node(data);
//         if (head == null) {
//             head = curr.next = curr.prv = curr;
//         } else {
//            curr.next=head;
//            curr.prv=head.prv;
//            head.prv=curr;
//            curr.prv.next=curr;
//            head=curr;

//         }
//     }

//     void display() {
//         node ptr = head;
//         if (head != null) {
//             System.out.println("Data are displaying");
//             do {
//                 System.out.println(ptr.data);
//                 ptr = ptr.next;
//             } while (ptr != head);
//         }
//     }

//     public static void main(String[] args) {
//         DoubleCircularLL list = new DoubleCircularLL();
//         list.insertbeg();
//         list.insertbeg();
//         list.insertbeg();
//         list.display();
//     }
// }

//---------------------------------->
//DoubleCircular LL insert at any position

import java.util.Scanner;

class DoubleCircularLL {
    node head;

    class node {
        String data;
        node next;
        node prv;

        node(String data) {
            this.data = data;
            this.next = null;
            this.prv = null;
        }
    }

    public void insertbeg() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data");
        String data = sc.nextLine();
        System.out.println("Enter the pos");
        int pos = sc.nextInt();
        node curr = new node(data);
        if (head == null) {
            head = curr.next = curr.prv = curr;
        } else {
            if (pos == 0) {
                curr.next = head;
                curr.prv = head.prv;
                head.prv = curr;
                curr.prv.next = curr;
                head = curr;
            } else {
                node ptr = head;
                int i = 0;
                while (i < pos - 1 && ptr.next != head) {
                    ptr = ptr.next;
                    i++;
                }
                if (ptr.next == head) {
                    curr.prv = head.prv;
                    curr.next = head;
                    curr.prv.next = curr;
                    head.prv = curr;
                } else {
                    curr.prv = head.next;
                    curr.next = ptr.next;
                    ptr.next = curr;
                    curr.next.prv = curr;
                }
            }
        }
    }

    void display() {
        node ptr = head;
        if (head != null) {
            System.out.println("Data are displaying");
            do {
                System.out.println(ptr.data);
                ptr = ptr.next;
            } while (ptr != head);
        }
    }

    public static void main(String[] args) {
        DoubleCircularLL list = new DoubleCircularLL();
        list.insertbeg();
        list.insertbeg();
        list.insertbeg();
        list.display();
    }
}


