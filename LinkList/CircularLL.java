
//////////// --------------------------------------->
//Circular linklist insert at last

// import java.util.Scanner;

// class CircularLL {
//     node head;

//     class node {
//         String data;
//         node next;
//         node(String data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     void addlast() {
//         System.out.println("Enter the data");
//         Scanner sc = new Scanner(System.in);
//         String data = sc.nextLine();
//         node curr = new node(data);
//         node ptr = head;
//         if (head == null) {
//             head = curr;
//             curr.next = head;
//             ptr=curr;
//         } else {
// curr.next = ptr.next;
// ptr.next = curr;
// ptr= curr;
//         }

//     }

//     void display() {
//         node ptr = head;
//         if (head!= null) {
//             System.out.println("Data are displaying");
//             do{
//             System.out.println(ptr.data);
//             ptr = ptr.next;
//             }while(ptr!=head);
//         }
//     }

//     public static void main(String[] args) {
//         CircularLL list = new CircularLL();
//         list.addlast();
//         list.addlast();
//         list.addlast();
//         list.addlast();
//         list.display();
//     }
// }

// [----------------------------------Insert at begining in CLL]
// import java.util.Scanner;

// class CircularLL {
//     node head;

//     class node {
//         String data;
//         node next;
//         node(String data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     void addbegin() {
//         System.out.println("Enter the data");
//         Scanner sc = new Scanner(System.in);
//         String data = sc.nextLine();
//         node curr = new node(data);
//         node ptr = head;
//         if (head == null) {
//             head = curr;
//             curr.next = head;
//             ptr=curr;
//         } else {
//             while(ptr.next != head)
//             {
//                 ptr=ptr.next;
//             }
//             curr.next = head;
//             head = curr;
//             ptr.next= curr;
//         }

//     }

// void display() {
//     node ptr = head;
//     if (head!= null) {
//         System.out.println("Data are displaying");
//         do{
//         System.out.println(ptr.data);
//         ptr = ptr.next;
//         }while(ptr!=head);
//     }
// }

//     public static void main(String[] args) {
//         CircularLL list = new CircularLL();
//         list.addbegin();
//         list.addbegin();
//         list.addbegin();
//         list.addbegin();
//         list.display();
//     }
// }

//--------------------------------[ Insert at any position in CLL ]

import java.util.Scanner;
class CircularLL {
    node head;

    class node {
        String data;

        node next;

        node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    void insert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data");
        String data = sc.nextLine();
        System.out.println("Enter the pos");
        int pos = sc.nextInt();
        node curr = new node(data);
        node ptr = head;
        if (head == null)// for first node if there is nothing
        {
            head = curr;
            curr.next = head;
            ptr = curr;
        } else {
            if (pos == 0) // for insert at begning
            {
                ptr = head;
                while (ptr.next != head)// for changing the last calue for making circular
                {
                    ptr = ptr.next;
                }
                curr.next = head;
                head = curr;
                ptr.next = curr;

            } else {
                ptr = head;
                int i = 0;
                while (i < pos - 1) {
                    ptr = ptr.next;
                    i++;
                }
                curr.next = ptr.next;
                ptr.next = curr;
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
        CircularLL list = new CircularLL();
        System.out.println("Enter the number of node");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.insert();
        }
        list.display();
    }
}
