public class string_constructor {
        public string_constructor()
        { 
            System.out.println("CONSTRUCTOR");
        }
        
        public string_constructor(char[] ch)
        { 
            System.out.println("char CONSTRUCTOR");
        }

        public string_constructor(byte[] b)
        { 
            System.out.println("byte CONSTRUCTOR");
        }
        public string_constructor(StringBuffer sb)
        { 
            System.out.println("CONSTRUCTOR buffer");
        }
        public string_constructor(StringBuilder sh)
        { 
            System.out.println("CONSTRUCTOR builder");
        }
        public static void main(String[] args) {
            string_constructor s=new string_constructor();
        }
}

