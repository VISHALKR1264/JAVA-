public class dataType_size {
    public static void main(String[] args) {

        System.out.println("Size of byte: " + Byte.SIZE + " bits");
        System.out.println("Size of short: " + Short.SIZE + " bits");
        System.out.println("Size of int: " + Integer.SIZE + " bits");
        System.out.println("Size of long: " + Long.SIZE + " bits");
        System.out.println("Size of float: " + Float.SIZE + " bits");
        System.out.println("Size of double: " + Double.SIZE + " bits");
        System.out.println("Size of char: " + Character.SIZE + " bits");
        

        // Boolean size is not defined in bits, but typically can be considered 1 byte
        // for storage
        System.out.println("Size of boolean: Approximately 1 byte (8 bits)");

    }
}
