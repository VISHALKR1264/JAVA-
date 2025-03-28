
// Write a function that accepts three parameters: two positive integers r and unit, and a positive integer array arr of size n.

// ⚫r represents the number of rats present in an area.

// unit is the amount of food each rat consumes.

// •

// Each element of the array arr represents the amount of food present in each house, where the index of the array corresponds to the house number.

// The function should determine the minimum number of houses required to provide enough food for all the rats.

// Constraints:

// Return -1 if the array is null.

// Return O if the total amount of food from all houses is not sufficient for all the rats Computed values lie within the integer range.

// Example:

// • Input:

// unit: 2

// n: 8

// arr: [2, 8, 3, 5, 7, 4, 1, 2]

// • Output: 4

public class Rat_food {
    public static int minFoodHouse(int rat,int unit,int arr[])
    {
        if(arr == null)
        {
            return -1;
        }
        int Total_require_food= rat*unit;


        int total_food=0;
        for(int food:arr)
        {
            total_food+=food;
        }

        if(total_food < Total_require_food)
        {
            return 0;
        }





        //
        int total_food_eaten=0;
        int House_count=0;
        for(int food:arr)
        {
            total_food_eaten += food;
            House_count++;
            if( total_food_eaten >= Total_require_food)
            {
                return House_count;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int rats=7;
        int unit=2;
        int arr[]=new int[]{2, 8, 3, 5, 7, 4, 1, 2};
        int result=minFoodHouse(rats,unit,arr);
        System.out.println("Min no. of House require to complete all 'Rats' meal is :-" +result);

    }
}
