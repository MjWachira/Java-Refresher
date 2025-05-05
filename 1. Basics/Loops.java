// Loops repeat blocks of code.
// for: known iteration count
// while: repeats while condition is true
// do-while: executes at least once

public class Loops {
    public static void main(String[] args) {
        // For loop: repeats 5 times
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop i = " + i);
        }

        // While loop: checks condition before running
        int j = 0;
        while (j < 3) {
            System.out.println("While loop j = " + j);
            j++;
        }

        // Do-while loop: runs at least once
        int k = 0;
        do {
            System.out.println("Do-While loop k = " + k);
            k++;
        } while (k < 2);
    }
}
