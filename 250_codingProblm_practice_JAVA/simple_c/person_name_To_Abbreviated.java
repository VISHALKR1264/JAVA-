/**
 * person_name_To_Abbreviated
 */
public class person_name_To_Abbreviated {

    public static void main(String[] args) {
        String name="vishal Kumar Agnihotri";
        String[] split_name = name.split(" ");
        StringBuilder Abbreviated=new StringBuilder();
        for(int i=0;i<split_name.length - 1;i++)
        {
            Abbreviated.append(Character.toUpperCase(split_name[i].charAt(0))).append(". ");
        }
        Abbreviated.append(split_name[split_name.length - 1].toUpperCase());

        System.out.println(Abbreviated.toString());


        
    }
}