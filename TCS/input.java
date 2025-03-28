import java.util.ArrayList;
import java.util.List;

public class input {
    public static void main(String[] args) {

        List <Float> f =new ArrayList<>();
        List <String> s =new ArrayList<>();
        List <Integer> l =new ArrayList<>();
        String input_data="3.14,vishal,11; 5.5,aryan,90;7.8,khushi,77";
        String[] split = input_data.split(";");
        for(int i=0;i<split.length;i++)
        {

            System.out.println(split[i].trim());
        }

        for(String each : split)
        {
            String part[] = each.split(",");

            for (String value : part) {
                System.out.println(value.trim()); //sara String m ho gya islye before add in list we had to convert
            }
            f.add(Float.parseFloat(part[0]));
            s.add(part[1]);
            l.add(Integer.parseInt(part[2]));

         
        }


        for(int v=0;v<l.size();v++)
        {
            System.out.println("Float "+ f.get(v) +" String "+s.get(v) + " Integer "+l.get(v));
        }
        
    }
}
