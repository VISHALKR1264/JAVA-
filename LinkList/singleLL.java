// // SINGLE LINKLIST INSERTION FROM FRONT AND END
// package LinkList;
// class singleLL {
//     node head;

//     class node {
//         String data;
//         node next;

//         node(String data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public void addfirst(String data) {
//     node newnode = new node(data);
//     if (head == null) {
//     head = newnode;
//     return;
//     } else {
//     newnode.next = head;
//     head = newnode;
//     }

//     }

//     public void addlast(String data) {
//         node newnode = new node(data);

//         if (head == null) {
//             head = newnode;
//             return;
//         }
//         node ptr = head;

//         while (ptr.next != null) {
//             ptr = ptr.next;
//         }
//         ptr.next = newnode;

//     }

//     public void display() {
//         if (head == null) {
//             System.out.print("node is empty");
//         }
//         node currnode = head;
//         while (currnode != null) {
//             System.out.print(currnode.data);
//             currnode = currnode.next;
//         }
//         System.out.print("NULL");

//     }

//     public static void main(String[] args) {

//        singleLL list = new singleLL();
//         list.addlast("vishal");
//         list.addlast("is ");
//         list.addlast("a ");
//         list.addlast("boy ");
//         list.addlast("no ");
//         list.display();
//     }
// }




//-------------------------->>
//Add last by pos in mid also , Dlt function and find function using user input at run time 

import java.util.Scanner;

class singleLL {
    node head;

    class node {
        String data;
        node next;
        // int pos;

        node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addfirst(String data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            return;
        } else {
            newnode.next = head;
            head = newnode;
        }

    }

    public void addlast() {

        System.out.println("Enter the value u want");
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        System.out.println("Enter the position");
        int pos=sc.nextInt();
        node newnode = new node(data);

        if (head == null) {
            head = newnode;
            return;
        }
        else
        {
            if(pos == 0)
            {
                newnode.next=head;
                head=newnode;
            }
            else
            {
                node ptr=head;
                int i=0;
                while(i<pos-1 && ptr.next!=null)
                {
                    ptr=ptr.next;
                    i++;
                }
                newnode.next=ptr.next;
                ptr.next=newnode;
            }
        }

    }

    public void dltfun(String val) {
        node ptr=head;
        node prv=null;
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            ptr = head;
            while (ptr != null) {
                if (ptr.data.equals(val)) {
                    break;
                } else {
                    prv = ptr;
                    ptr = ptr.next;
                }
            }
            if (ptr == null) {
                System.out.println("Data not Found to Dlt");
            } else {
                // prv = ptr;

                if (ptr == head) {
                    head = ptr.next;
                } else {
                    // prv = ptr;
                    prv.next = ptr.next;
                }
            }
        }
    }

    public void findfunction() {
        node ptr = head;
        for (ptr = head; ptr != null; ptr = ptr.next) {
            System.out.println("Values of the node are " + ptr.data);
            if (ptr.data.equals("vishal")) {
                System.out.println("FOUND");
                break;
            } else {
                System.out.println("NOT FOUND");
            }
        }
    }

    public void display() {
        if (head == null) {
            System.out.print("node is empty");
        }
        node currnode = head;
        while (currnode != null) {
            System.out.print(currnode.data);
            currnode = currnode.next;
        }
        System.out.println("NULL");

    }

    public static void main(String[] args) {

        singleLL list = new singleLL();
        System.out.println("Enter the number of value u want to enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.addlast();
        }
        list.display();
        list.findfunction();
        list.display();
        System.out.println("Deleting the element from the LL");
        list.dltfun("rahul");
        list.display();
    }
}





// //without using static Node class by chatgpt
// package LinkList;

// public class SingleLinkedList {
//     String data;
//     SingleLinkedList next;

//     public SingleLinkedList(String data) {
//         this.data = data;
//         this.next = null;
//     }

//     public void addFirst(String data) {
//         SingleLinkedList newNode = new SingleLinkedList(data);
//         newNode.next = this;
//         this = newNode;
//     }

//     public void addLast(String data) {
//         SingleLinkedList newNode = new SingleLinkedList(data);
//         SingleLinkedList last = this;

//         while (last.next != null) {
//             last = last.next;
//         }

//         last.next = newNode;
//     }

//     public void display() {
//         SingleLinkedList current = this;

//         while (current != null) {
//             System.out.print(current.data + " ");
//             current = current.next;
//         }
//         System.out.println("NULL");
//     }

//     public static void main(String[] args) {
//         SingleLinkedList list = new SingleLinkedList("vishal");
//         list.addLast("is");
//         list.addLast("a");
//         list.addLast("boy");
//         list.addLast("no");
//         list.display();
//     }
// }
