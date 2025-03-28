//a ship need to transport people from point A to point B .if ship has capacity of c and there are N people , your task is to return the number of rounds it has to make to ship all the people 
//ex- 30  75   o/p->3
public class ship {
    public static void main(String[] args) {
        int people=75;
        int cap=30;
        int total_round = people / cap;
        double val= people % cap;
        if(val != 0)
        {
            total_round++;
        }
        System.out.println(total_round);
    }
}
