//string is non premetive data(define by user) type,(size not fixed)
//it is in sequence of character(array of char)
import java.util.*;

public class string {
    public static void main(String[] args) {

        immutable s = new immutable();// obj of another class;
        s.DEMO();// calling function;
        scp_explict_assign_newobj p = new scp_explict_assign_newobj();// constructor is called
        scp s2 = new scp();
        specialcase s3 = new specialcase();
        s3.method();
        change_obj s4 = new change_obj();
        s4.change();
        string_buffer_final s5 = new string_buffer_final();
        s5.final_break();
        equal_operator s6 = new equal_operator();
        s6.operator();
        s6.equal_method();
        

    }

}

class immutable {
    void DEMO() {
        char c[] = { 'a', 'd', 'f', 'g', 'j' };
        String s = new String(c);// In both String constant pool and in heap;
        for (int i = 0; i <= 10; i++) {
            System.out.println(s);
            // these String are immutable

        }
        String f = "vishal";
        System.out.println(f);
        f.concat("kumar");//it will not override it bcz immutability but a new obj created of vishal kumar which can be explicetly assign
        System.out.println(f);// No concatation take place bcz String are immutable
        // a new obj is created in heap of name vishal kumar;
        // and only vishal is also present there
        //kumar is created in scp
        // sop(f)==>print-->"vishal";
        // s=f.concat("kumar");==>sop(s);-->print-->"Vishal kumar"
    }
}

class scp_explict_assign_newobj {
    scp_explict_assign_newobj() {
        String f = new String("vishal");// created in heap and in scp both;
        String s = f.concat(" kumar");
        System.out.println(s);// we can explicetly assign to that object i.e. concated;
    }
}

class scp {
    scp() {
        String s2 = "aryan"; // only created in SCP
        String s = s2.concat(" kumar");
        System.out.println(s2);
        System.out.println(s);
    }
}

class specialcase {
    void method() {
        String s1 = new String("AGNIHOTRI");// 2 obj created in heap and in stack
        String s2 = new String("BABA");// 2 obj created in heap and in stack
        String s3 = new String("AGNIHOTRI");// only one will create in heap only / litteral will use the older one;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        String s4 = "Amit";// create 1 obj in scp;
        String s5 = "AGNIHOTRI";// created 0 obj in scp;/bcz it is already present in scp;
        // purana litteral ko pehle JVM point kr rha thaa pr ab usi purane litteral ko
        // s5 point kre g ..
        String s6 = "AGNIHOTRI";// 0 obj //s6 v purane wale ko point kre g;
    }
}

class change_obj {
    void change() {
        String city1 = "BACHRA";// only 1 onj
        String city2 = "BACHRA";// point to to same obj
        String city3 = "BACHRA";// point to to same obj again
        // HERE NO OF OBJECT WILL BE LESS SO EXECUTION WILL BE FAST;
        // String city3="DELHI";//it will not makes changes to previous place it just
        // make a new object
        // and that city3 will now point to the new obj i.e. Delhi;
        // if it change the previous value then it will affect to other city1 and city2;
        String city4 = "DELHI";// just point to the same obj no more obj it will create;
        System.out.println(city1 + "+" + "+" + city2);
        System.out.println(city3 + "+" + "+" + city4);
    }
}
// WHY STRING CLASS ARE FINAL ?

// final class extend -------->you can't inherit a final class
// {

// }
// class test extends extend
// {

// }

// -------------------------------------------------------------------------------------->

// class extend{
// final void show()
// {

// }
// }
// class test extends extend
// {
// void show(){ ------->you can't override a final method

// }
// }

// ---------------------------------------------------------------------------------------->
class string_buffer_final {
    void final_break() {
        final StringBuffer s = new StringBuffer("JAVA");
        // s=s.append("CORE"); //-----> We can't do this,we will not change the
        // reference of obj here but in string yes it can
        s.append(" CORE"); // Altho it is final then also here we make changes direct to the main object;
        System.out.println(s);// Here IMMUTABILITY_BREAKES;
        StringBuffer sb = new StringBuffer("SUPU");
        sb.append(" CHUREL");
        System.out.println(sb);// -->It will make changes to that obj only no another obj it will create;
        //Therfore it is muttable
    }
}

// ------------------------------------------------------------------------->
// '= = OPERATOR'
class equal_operator {
    equal_operator() {
        String s1 = new String("VISHAL");
        String s2 = new String("VISHAL");
        boolean s = s1 == s2;// Both have different obj and adress are also different so FALSE
        System.out.println(s);

    }

    void operator() {
        String s3 = "ARYAN";// only 1 obj
        String s4 = "ARYAN";// ref to same obj
        boolean s = s3 == s4;// --->only 1 adress so both are equal so TRUE
        System.out.println(s);

    }

    // 'EQUAL METHOD'
    void equal_method() {
        String s1 = new String("VISHAL");
        String s2 = new String("VISHAL");
        boolean s = s1.equals(s2);// Both have different obj and adress are also different so but Value is same so
                                  // TRUE;
        System.out.println(s);
    }

}