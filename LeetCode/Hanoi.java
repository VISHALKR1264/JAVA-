// Tower of Hanoi is a mathematical puzzle where we have three rods (A, B, and C) and N disks. Initially, all the disks are stacked in decreasing value of diameter i.e., the smallest disk is placed on the top and they are on rod A. The objective of the puzzle is to move the entire stack to another rod (here considered C), obeying the following simple rules: 

// Only one disk can be moved at a time.
// Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack i.e. a disk can only be moved if it is the uppermost disk on a stack.
// No disk may be placed on top of a smaller disk.
class Hanoi {

    public long toh(int n, int from, int to, int aux) {
        if (n == 1) {
            System.out.println("Move disk " + n + " from rod " + from + " to rod " + to);
            return 1;
        }
        
        long count = toh(n - 1, from, aux, to); // Move n-1 disks from source to auxiliary
        System.out.println("Move disk " + n + " from rod " + from + " to rod " + to); // Move nth disk
        count++; // Count the move of the nth disk
        count += toh(n - 1, aux, to, from); // Move n-1 disks from auxiliary to destination

        return count;
    }
    
    public static void main(String[] args) {
        Hanoi hanoi = new Hanoi();
        int n = 3; // Number of disks
        long moves = hanoi.toh(n, 1, 3, 2); // Move disks from rod 1 to rod 3 using rod 2 as auxiliary
        System.out.println("Total moves: " + moves);
    }
}
