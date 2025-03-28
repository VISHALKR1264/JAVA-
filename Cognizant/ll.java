public class ll {
    node head;

    public class node {

        String data;
        node next;

        node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public  void addFirst(String data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public  void addLast(String data) {
        node newnode = new node(data);
        node ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = newnode;
    }

    void display() {
        if (head == null) {
            System.out.print("node is empty");
        }
        node current = head;
        while (current != null) {
            System.out.print(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        ll st=new ll();
        st.addFirst("vishal");
        st.addLast("kumar");
        st.display();
    }
}