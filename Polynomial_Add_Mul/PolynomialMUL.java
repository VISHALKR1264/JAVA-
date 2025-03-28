
import java.util.Scanner;

class PolynomialMUL {
    node head;
    node head1;
    node head2;

    class node {
        int cof;
        int exp;
        node next;
        node ptr;

        node(int cof, int exp) {
            this.cof = cof;
            this.exp = exp;
            this.next = null;
        }
    }

    public void create1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Node");
        int n = sc.nextInt();
        node ptr = head1;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the cof value");
            int cof = sc.nextInt();
            System.out.println("Enter the exp value");
            int exp = sc.nextInt();
            node curr = new node(cof, exp);

            if (head1 == null) {
                head1 = curr;
                ptr = curr;
            } else {
                ptr.next = curr;
                ptr = curr;
            }
        }
    }

    public void create2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Node");
        int n = sc.nextInt();
        node ptr = head2;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the cof value");
            int cof = sc.nextInt();
            System.out.println("Enter the exp value");
            int exp = sc.nextInt();
            node curr = new node(cof, exp);

            if (head2 == null) {
                head2 = curr;
                ptr = curr;
            } else {
                ptr.next = curr;
                ptr = curr;
            }
        }
    }

    public void display1() {
        if (head1 == null) {
            System.out.println("List is Empty");
        }
        node ptr = head1;
        while (ptr != null) {
            System.out.println(" cof :- " + ptr.cof + "&" + " exp:- " + ptr.exp);
            ptr = ptr.next;
        }
    }

    public void display2() {
        if (head2 == null) {
            System.out.println("List is Empty");
        }
        node ptr = head2;
        while (ptr != null) {
            System.out.println(" cof :- " + ptr.cof + "&" + " exp:- " + ptr.exp);
            ptr = ptr.next;
        }
    }
       public void display()//fully multipliated LL
        {
        if (head == null) {
            System.out.println("List is Empty");
        }
        node ptr = head;
        while (ptr != null) {
            System.out.println(" cof :- " + ptr.cof + "&" + " exp:- " + ptr.exp);
            ptr = ptr.next;
        }
    }

    public void multiply() {
        System.out.println();
        System.out.println("Both LL are Multiplied :------------");
        node ptr1, ptr2, ptr;
        ptr=head;
        for (ptr1 = head1; ptr1 != null; ptr1 = ptr1.next) {
            for (ptr2 = head2; ptr2 != null; ptr2 = ptr2.next) {
                int coff = ptr1.cof * ptr2.cof;
                int expp = ptr1.exp + ptr2.exp;
                node newnode = new node(coff, expp);

                if (head == null) {
                    head = newnode;
                    ptr = newnode;
                } else {
                    ptr.next = newnode;
                    ptr = newnode;
                }
            }
        }
    }

    public static void main(String[] args) {
        PolynomialMUL list = new PolynomialMUL();
        list.create1();
        list.display1();
        list.create2();
        list.display2();
        list.multiply();
        list.display();
        

    }
}