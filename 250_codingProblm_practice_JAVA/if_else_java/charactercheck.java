public class charactercheck {
    public static void method2(String str)
    {
        boolean hasUppercase=str.matches(".*[A-Z].*");
        boolean hasLowercase=str.matches(".*[a-z].*");
        boolean hasDigit=str.matches(".*\\d.*");              //(".*[0-9].*")
        boolean hasSpecialChar=str.matches(".*[^a-zA-Z0-9].*");  //(".*[!@#$%^&*()].*")
        System.out.println("Contains Uppercase: " + hasUppercase);
        System.out.println("Contains Lowercase: " + hasLowercase);
        System.out.println("Contains Digit: " + hasDigit);
        System.out.println("Contains Special Character: " + hasSpecialChar);
    }
    public static void method1(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            if(Character.isLowerCase(str.charAt(i) ))
            {
                System.out.println("Index "+i+" i.e. "+str.charAt(i) + " is a LowerCase " );
            }
            else if(Character.isUpperCase(str.charAt(i)))
            {
                System.out.println("Index "+i+" i.e. "+str.charAt(i) + " is a UpperCase " );
            }
            else if(Character.isDigit(str.charAt(i))){
                System.out.println("Index "+i+" i.e. "+str.charAt(i) + " is a  Digit");
            }
            else
            {
                System.out.println("Index "+i+" i.e. "+str.charAt(i) + " is a Special Case " );
            }
        }
    }
    public static void main(String[] args) {
        String str="Wlwmrnt123@#";
        method1(str);
        method2(str);
    }
}
