class Queue {
    
    int arr[];
    int size;
    int rear = -1;
    int front = -1;

    Queue(int n) {
        this.arr = new int[n];
        this.size = n;
    }

    public Boolean isEmpty() {
        return rear == -1;
    }

    public void enque(int data) {
        if (rear == size - 1) {
            System.out.println("Queue is Full");
            return;
        }

        if (rear == -1) {
            front = rear = 0;
            arr[rear] = data;
        }

        else {
            rear++;
            arr[rear] = data;
        }
    }

    public void dqueue() {
        System.out.println("Dqueue process");
        if (isEmpty()) {
            System.out.println("Queue is Empty");

        }
        if (front == rear) {
            System.out.println("Queue Having 1 element only That was deleted now Nothing present");
            front = rear = -1;
        } else {
            for (int i = front + 1; i <= rear; i++) {
                arr[i - 1] = arr[i];
            }
            rear--;
        }
    }

    public void peek() {
        System.out.println("PEEK ELEMENT");
        if (isEmpty()) {
            System.out.println("Queue is Empty");

        }
        System.out.println(arr[0]);

    }

    public void display() {
        for (int i = 0; i <= rear; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(10);
        q.enque(20);
        q.enque(10);
        q.enque(30);
        q.enque(40);
        q.enque(50);
        q.display();
        q.dqueue();
        q.display();
        q.peek();
    }
}