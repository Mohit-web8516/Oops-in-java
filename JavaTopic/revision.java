// 💻 Example Program: Control Statements in Action

public class revision {
    public static void main(String[] args) {
        int num = 10;

        // 1. Decision Making
        if (num > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is not positive");
        }

        // if-else-if ladder
        if (num == 0) {
            System.out.println("Number is zero");
        } else if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        // switch statement
        int day = 3;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            default: System.out.println("Other day");
        }

        // 2. Looping
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("While loop:");
        int j = 1;
        while (j <= 3) {
            System.out.println("j = " + j);
            j++;
        }

        System.out.println("Do-while loop:");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 2);

        // 3. Jump Statements
        System.out.println("Break and Continue:");
        for (int x = 1; x <= 5; x++) {
            if (x == 3) continue; // skip 3
            if (x == 5) break;    // stop loop at 5
            System.out.println("x = " + x);
        }
    }
}
