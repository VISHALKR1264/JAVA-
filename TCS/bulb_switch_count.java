//N light bulb are connected via an wire.Each bulb has a switch associated with it,However due to faulty wiring ,a switch also change the state of all the bulbs to the right of the current bulb. i have to turn on all the bulb ,return the minimum number of switch count;

public class bulb_switch_count {
    public static void main(String[] args) {
        int count = 0;
        int arr[] = new int[] { 0, 1, 0, 0, 1, 0, 0 };
        for (int i = 0; i < arr.length; i++) {
            if (count % 2 == 0) {
                if (arr[i] == 0) {
                    //AGR EVEN HAI OR 0 V HAI MTLB OFF HAI SO TO ON IT COUNT IS ++;
                    count++;
                }
            }
            else
            {
                //EVEN NHI HAI OR agr 1 HAI MTLB WO REAL ME INVERSE HAI I.E. '0' SO TO ON IT COUNT++
                if(arr[i]==1)
                {
                    count++;
                }
                

                
            }

        }
        System.out.println(count);
    }
}
