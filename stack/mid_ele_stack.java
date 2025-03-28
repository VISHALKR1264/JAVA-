//finding the mid using stack so,
//if we use array it take O(n/2) so not good
//agr mid point bich me rakhe LL k to sirf age jaa skta h piche nhi 
//so,DLL is used for O(1)

import org.w3c.dom.Node;

public class mid_ele_stack {
    Node head;
    Node mid;
    int count;

    class Node {
        int value;
        Node next;
        Node prev;

        public Node(int data) {
            this.value = data;
            this.prev = null;
            this.next = null;
        }
    }

    public mid_ele_stack() {
        head = null;
        mid = null;
        count = 0;
    }

    public void push(int value) {
        Node curr = new Node(value);
        if (head == null) {
            head = curr;
            mid = curr;
        } else {
            curr.prev = null;
            curr.next = head;
            count++;
            head.prev = curr;
            head = curr;
            if (count == 1) {
                mid = curr;
            } else if (count % 2 != 0) {
                mid = mid.prev;
            }
        }
    }

    public int pop() {
        if (count == 0) {
            System.out.println("Empty");
            return -1;
        }
        int val = head.value;
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        count--;
        if (count % 2 == 0 && mid != null) {
            mid = mid.next;
        }
        return val;
    }

    int middle() {
        if (count == 0) {
            return -1;
        }
        return mid.value;
    }

    public static void main(String[] args) {
        mid_ele_stack stack = new mid_ele_stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.pop();
        stack.pop();
        System.out.println("Middle element: " + stack.middle());
    }
}
