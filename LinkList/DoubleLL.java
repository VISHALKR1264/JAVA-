
/////////////////------------------------------->
//Double Linklist insertlast

import java.util.Scanner;

class DoubleLL {
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

    public void insertbegning() {
        System.out.println("Enter the value to the node");
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        node curr = new node(data);
        if (head == null) {
            head = curr;
            return;
        } else {
            curr.next = head;
            head.prv = curr;
            head = curr;
        }
    }

    public void insertlast() {
        System.out.println("Enter the value to the node");
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        node curr = new node(data);
        if (head == null) {
            head = curr;
            return;
        }
        node ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;

        }
        curr.prv = ptr;
        curr.prv.next = curr;
        ptr = curr;

    }

    public void insertmid() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data");
        String data = sc.nextLine();
        System.out.println("Enter position");
        int pos = sc.nextInt();
        node curr = new node(data);
        if (head == null) {
            head = curr;
            return;
        } else {
            if (pos == 0) {
                curr.next = head;
                head.prv = curr;
                head=curr;
            } else {
                node ptr = head;
                int i = 0;
                while (i < pos - 1 && ptr.next != null) {
                    ptr = ptr.next;
                    i++;
                }
                if (ptr.next == null) {
                    curr.prv = ptr;
                    ptr.next = curr;
                } else {
                    curr.next = ptr.next;
                    curr.prv = ptr;
                    ptr.next = curr;
                    curr.next.prv=curr;
                }
            }
        }
    }

    public void display() {
        node curr = head;
        for (curr = head; curr != null; curr = curr.next)
            System.out.println("The node data is :-" + curr.data);
    }

    public static void main(String[] args) {
        DoubleLL list = new DoubleLL();
        System.out.println("ENTER THE NO. OF NODES U WANT");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("ENTER THE OPTION 1 FOR INSERT IN BEGNING or 2 FOR INSERT AT LAST or 3 FOR ANY POSITION");
        int opt = sc.nextInt();
        if (opt == 1) {
            for (int i = 0; i < n; i++) {
                list.insertbegning();
            }
            list.display();

        }
        if (opt == 2) {
            for (int i = 0; i < n; i++) {
                list.insertlast();
            }
            list.display();
        }

        if (opt == 3) {
            for (int i = 0; i < n; i++) {
                list.insertmid();
            }
            list.display();
        }

        else {
            System.out.println("ERROR IN OPTION SELECTION");
        }
    }
}



////////////////////////////_--------------------->
//INSERT NODE AT ANY POS AND DLT THE NODE IN DOUBLE LL
// import java.util.Scanner;

// class DoubleLL {
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

//     public void insertmid() {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter data");
//         String data = sc.nextLine();
//         System.out.println("Enter position");
//         int pos = sc.nextInt();
//         node curr = new node(data);
//         if (head == null) {
//             head = curr;
//             return;
//         } else {
//             if (pos == 0) {
//                 curr.next = head;
//                 head.prv = curr;
//                 head = curr;
//             } else {
//                 node ptr = head;
//                 int i = 0;
//                 while (i < pos - 1 && ptr.next != null) {
//                     ptr = ptr.next;
//                     i++;
//                 }
//                 if (ptr.next == null) {
//                     curr.prv = ptr;
//                     ptr.next = curr;
//                 } else {
//                     curr.next = ptr.next;
//                     curr.prv = ptr;
//                     ptr.next = curr;
//                     curr.next.prv = curr;
//                 }
//             }
//         }
//     }

//     void dltpos() {
//         System.out.println("Enter the value to delete");
//         Scanner sc = new Scanner(System.in);
//         String val = sc.nextLine();
//         node ptr=head;
//         if( head == null)
//         {
//             System.out.print("List is Empty");
//         }
//         else
//         {
//             while(ptr!=null)
//             {
//                 if(ptr.data.equals(val))
//                 {
//                     break;
//                 }
//                 ptr=ptr.next;
//             }
//             if(ptr==null)
//             {
//                 System.out.println("DATA NOT FOUND");
//             }
//             else
//             {
//                 if( head == ptr && ptr.next == null) //only one node present and want to dlt that
//                 {
//                     head = null;
//                 }
//                 else
//                 {
//                     if(head == ptr) //dlt the first node and other node also present
//                     {
//                         head = ptr.next;
//                         head.prv=null;
//                     }
//                     else
//                     {
//                         if(ptr.next == null) //dlt the last node
//                         {
//                             ptr.prv.next = null;
//                         }
//                         else //dlt mid node 
//                         {
//                             ptr.prv.next = ptr.next;
//                             ptr.next.prv=ptr.prv;
//                         }
//                     }
//                 }
//             }
//         }

//     }

//     public void display() {
//         node curr = head;
//         for (curr = head; curr != null; curr = curr.next)
//             System.out.println("The node data is :-" + curr.data);
//     }

//     public static void main(String[] args) {
//         DoubleLL list = new DoubleLL();
//         System.out.println("ENTER THE NO. OF NODES U WANT");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for (int i = 0; i < n; i++) {
//             list.insertmid();
//         }
//         list.display();
//         list.dltpos();
//         System.out.println("REMANING ITEM AFTER DELETING");
//         list.display();9
//     }
// }
