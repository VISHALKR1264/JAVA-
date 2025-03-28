
import java.util.Scanner;

class PolynomialADD {
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
    public void join()
    {
        System.out.println();
        System.out.println("Both LL are joined :------------");
        if(head1==null)
        {
            head1=head2;
        }
        else
        {
            node ptr;
            for(ptr=head1;ptr.next!=null;ptr=ptr.next)
            {
                //for bringing ptr at last to join
            }
            ptr.next=head2;
        }
    }
    public void simplify()
    {
        System.out.println("Now simplify part");
        node ptr,prv,ptr1;
        ptr=head1;
        while(ptr!=null)
        {
            prv=ptr;//for remembring to stat next time 
            ptr1=ptr.next;//ptr1 is just  the next one of ptr
            while(ptr1!=null)
            {
                if(ptr1.exp==ptr.exp)
                {
                    ptr.cof=ptr.cof+ptr1.cof;
                    prv.next=ptr1.next;//deleted
                    ptr1=prv;
                }
                prv=ptr1;//after deleting start again form just one start prev
                ptr1=ptr1.next;//for jumping one step
            }
            ptr=ptr.next;//for jumping one step
        }
    }

    public static void main(String[] args) {
        PolynomialADD list = new PolynomialADD();
        list.create1();
        list.display1();
        list.create2();
        list.display2();
        list.join();
        list.display1();
        list.simplify();
        list.display1();

    }
}