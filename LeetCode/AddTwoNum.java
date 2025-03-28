class AddTwoNum {
    
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode head = l3;
        int carry = 0;

        while (l1 != null && l2 != null) {
            int value = l1.val + l2.val + carry;
            carry = value / 10;
            l3.next = new ListNode(value % 10);
            l3 = l3.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int value = l1.val + carry;
            carry = value / 10;
            l3.next = new ListNode(value % 10);
            l3 = l3.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            int value = l2.val + carry;
            carry = value / 10;
            l3.next = new ListNode(value % 10);
            l3 = l3.next;
            l2 = l2.next;
        }
        if (carry != 0) {
            l3.next = new ListNode(carry);
        }

        return head.next;
    }
    public static void main(String[] args) {
        AddTwoNum solution = new AddTwoNum();

        // Example usage
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the result
        while (result != null) {
            System.out.print(result.val);
            
            // Check if it's not the last node
            if (result.next != null) {
                System.out.print("-->");
            }
            
            result = result.next;
        }
    }
}