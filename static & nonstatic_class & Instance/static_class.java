class OuterClass {
    int outerData;

    OuterClass(int data) {
        this.outerData = data;
    }

     static class NonStaticInnerClass {
        int innerData;

        NonStaticInnerClass(int data) {
        this.innerData = data;
    }
        void display() {
            System.out.println("Inner Data: " + innerData);
            // System.out.println("Outer Data: " + outerData);//as it is independent it cant acess
        }
    }
}

public class static_class {
    public static void main(String[] args) {
        // Create an instance of the outer class
        // OuterClass outerInstance = new OuterClass(42);

        // Create an instance of the non-static inner class using the outer class instance
        OuterClass.NonStaticInnerClass nonStaticInnerInstance = new OuterClass.NonStaticInnerClass(10);

        // Call a method of the non-static inner class
        nonStaticInnerInstance.display();
    }
}
